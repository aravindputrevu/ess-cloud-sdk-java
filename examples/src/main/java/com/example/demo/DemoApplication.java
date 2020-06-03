package com.example.demo;

import com.example.demo.util.DeploymentUtil;
import io.swagger.client.ApiException;
import io.swagger.client.model.DeploymentCreateResponse;
import io.swagger.client.model.DeploymentsListResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        try {

             DeploymentsListResponse deploymentsListResponse = DeploymentUtil.listESSDeployments();
             DeploymentCreateResponse deploymentCreateResponse = DeploymentUtil.createESSCluster();
             System.out.println(deploymentsListResponse.getDeployments().size());
             System.out.println(deploymentCreateResponse.isCreated());

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

}
