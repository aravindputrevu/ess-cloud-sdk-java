/*
 * Elastic Cloud API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BasicFailedReply;
import io.swagger.client.model.DeploymentTemplateInfo;
import io.swagger.client.model.EmptyResponse;
import io.swagger.client.model.IdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatformConfigurationTemplatesApi
 */
@Ignore
public class PlatformConfigurationTemplatesApiTest {

    private final PlatformConfigurationTemplatesApi api = new PlatformConfigurationTemplatesApi();

    /**
     * Create deployment template
     *
     * Creates a deployment template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeploymentTemplateTest() throws ApiException {
        DeploymentTemplateInfo body = null;
        IdResponse response = api.createDeploymentTemplate(body);

        // TODO: test validations
    }
    /**
     * Delete deployment template
     *
     * Deletes a deployment template by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeploymentTemplateTest() throws ApiException {
        String templateId = null;
        EmptyResponse response = api.deleteDeploymentTemplate(templateId);

        // TODO: test validations
    }
    /**
     * Get deployment template
     *
     * Retrieves a deployment template by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentTemplateTest() throws ApiException {
        String templateId = null;
        Boolean showInstanceConfigurations = null;
        String stackVersion = null;
        DeploymentTemplateInfo response = api.getDeploymentTemplate(templateId, showInstanceConfigurations, stackVersion);

        // TODO: test validations
    }
    /**
     * Get deployment templates
     *
     * Retrieves all deployment templates.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentTemplatesTest() throws ApiException {
        String metadata = null;
        Boolean showInstanceConfigurations = null;
        String stackVersion = null;
        Boolean showHidden = null;
        List<DeploymentTemplateInfo> response = api.getDeploymentTemplates(metadata, showInstanceConfigurations, stackVersion, showHidden);

        // TODO: test validations
    }
    /**
     * Set deployment template
     *
     * Creates or updates a deployment template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setDeploymentTemplateTest() throws ApiException {
        DeploymentTemplateInfo body = null;
        String templateId = null;
        Integer version = null;
        Boolean createOnly = null;
        IdResponse response = api.setDeploymentTemplate(body, templateId, version, createOnly);

        // TODO: test validations
    }
}
