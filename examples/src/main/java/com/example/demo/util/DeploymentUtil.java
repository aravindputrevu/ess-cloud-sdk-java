package com.example.demo.util;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.DeploymentsApi;
import io.swagger.client.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeploymentUtil {

    @Value("${elastic.cloud.api_key}")
    private static String apiKey;

    /**
     * @return List of deployments in Elastic Cloud
     * @throws ApiException
     */
    public static DeploymentsListResponse listESSDeployments() throws ApiException {

        ApiClient essClient = new ApiClient();
        essClient.setApiKey(apiKey);

        Configuration configuration = new Configuration();
        configuration.setDefaultApiClient(essClient);

        DeploymentsApi deploymentsApi = new DeploymentsApi();

        return deploymentsApi.listDeployments();
    }

    /**
     * Creates ESS Cluster with the given infrastructure configuration in Elastic Cloud
     * @return Response Object, through which you can verify the deployment specs.
     * @throws ApiException
     */
    public static DeploymentCreateResponse createESSCluster() throws ApiException {

        ApiClient essClient = new ApiClient();
        essClient.setApiKey(apiKey);

        Configuration configuration = new Configuration();
        configuration.setDefaultApiClient(essClient);

        DeploymentsApi deploymentsApi = new DeploymentsApi();

        DeploymentCreateRequest deploymentCreateRequest = new DeploymentCreateRequest();
        deploymentCreateRequest.setName("enterprise-search");
        deploymentCreateRequest.setResources(getDeploymentCreateResources());

        return deploymentsApi.createDeployment(deploymentCreateRequest,"test",true);
    }

    private static DeploymentCreateResources getDeploymentCreateResources() {
        DeploymentCreateResources deploymentCreateResources = new DeploymentCreateResources();

        List<ElasticsearchPayload> esPayLoadList = new ArrayList<>();
        esPayLoadList.add(getElasticsearchPayload());

        List<KibanaPayload> kibPayLoadList = new ArrayList<KibanaPayload>();
        kibPayLoadList.add(getKibanaPayload());

        deploymentCreateResources.setElasticsearch(esPayLoadList);
        deploymentCreateResources.setKibana(kibPayLoadList);
        //deploymentCreateResources.setAppsearch(asPayLoadList);
        return deploymentCreateResources;
    }

    private static KibanaPayload getKibanaPayload() {
        KibanaPayload kibanaPayLoad = new KibanaPayload();
        kibanaPayLoad.setDisplayName("test-kibana");
        kibanaPayLoad.setRegion("us-east-1");
        kibanaPayLoad.setElasticsearchClusterRefId("test-es-ref");
        kibanaPayLoad.setRefId("test-kibana-ref");
        kibanaPayLoad.setPlan(getKibanaClusterPlan());
        return kibanaPayLoad;
    }

    private static KibanaClusterPlan getKibanaClusterPlan() {
        KibanaClusterPlan kibanaClusterPlan = new KibanaClusterPlan();

        KibanaConfiguration kibanaConfiguration = new KibanaConfiguration();
        kibanaConfiguration.setVersion("7.7.0");

        kibanaClusterPlan.setClusterTopology(getKibanaClusterTopologyElement());
        kibanaClusterPlan.setKibana(kibanaConfiguration);

        return kibanaClusterPlan;
    }

    private static List<KibanaClusterTopologyElement> getKibanaClusterTopologyElement() {
        KibanaClusterTopologyElement kcte =  new KibanaClusterTopologyElement();

        TopologySize  size = new TopologySize();
        size.setResource(TopologySize.ResourceEnum.MEMORY);
        size.setValue(1024);

        kcte.setInstanceConfigurationId("aws.kibana.r4");
        kcte.setZoneCount(1);
        kcte.setSize(size);
        List<KibanaClusterTopologyElement> list = new ArrayList<KibanaClusterTopologyElement>(){{add(kcte);}};
        return list;
    }

    private static ElasticsearchPayload getElasticsearchPayload() {
        ElasticsearchPayload esPayLoad = new ElasticsearchPayload();
        esPayLoad.setRefId("test-es-ref");
        esPayLoad.setDisplayName("test-es");
        esPayLoad.setRegion("us-east-1");
        esPayLoad.setPlan(getElasticsearchClusterPlan());
        return esPayLoad;
    }

    private static ElasticsearchClusterPlan getElasticsearchClusterPlan() {
        ElasticsearchClusterPlan elasticsearchClusterPlan = new ElasticsearchClusterPlan();

        ElasticsearchConfiguration  elasticsearchConfiguration  = new ElasticsearchConfiguration();
        elasticsearchConfiguration.setVersion("7.7.0");
        elasticsearchConfiguration.setEnabledBuiltInPlugins(new ArrayList<String>(){});

        DeploymentTemplateReference deploymentTemplateReference = new DeploymentTemplateReference();
        deploymentTemplateReference.setId("aws-io-optimized");

        elasticsearchClusterPlan.setClusterTopology(setESClusterTopologyElement());
        elasticsearchClusterPlan.setElasticsearch(elasticsearchConfiguration);
        elasticsearchClusterPlan.setDeploymentTemplate(deploymentTemplateReference);
        return elasticsearchClusterPlan;
    }

    private static List<ElasticsearchClusterTopologyElement> setESClusterTopologyElement() {

        ElasticsearchClusterTopologyElement ecte = new ElasticsearchClusterTopologyElement();

        ElasticsearchNodeType esNodeType = new ElasticsearchNodeType();
        esNodeType.setData(true);
        esNodeType.setIngest(true);
        esNodeType.setMaster(true);

        TopologySize  size = new TopologySize();
        size.setResource(TopologySize.ResourceEnum.MEMORY);
        size.setValue(8192);

        ElasticsearchConfiguration  elasticsearchConfiguration  = new ElasticsearchConfiguration();
        elasticsearchConfiguration.setVersion("7.7.0");
        elasticsearchConfiguration.setEnabledBuiltInPlugins(new ArrayList<String>(){});

        ecte.setNodeType(esNodeType);
        ecte.setInstanceConfigurationId("aws.data.highio.i3");
        ecte.setZoneCount(2);
        ecte.setSize(size);

        ecte.setElasticsearch(elasticsearchConfiguration);

        List<ElasticsearchClusterTopologyElement> ecteList = new ArrayList<ElasticsearchClusterTopologyElement>();
        ecteList.add(ecte);
        return ecteList;
    }

}
