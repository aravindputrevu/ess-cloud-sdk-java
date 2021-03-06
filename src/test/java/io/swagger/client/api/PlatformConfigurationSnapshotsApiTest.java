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
import io.swagger.client.model.EmptyResponse;
import io.swagger.client.model.RepositoryConfig;
import io.swagger.client.model.RepositoryConfigs;
import io.swagger.client.model.SnapshotRepositoryConfiguration;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlatformConfigurationSnapshotsApi
 */
@Ignore
public class PlatformConfigurationSnapshotsApiTest {

    private final PlatformConfigurationSnapshotsApi api = new PlatformConfigurationSnapshotsApi();

    /**
     * Delete snapshot repository
     *
     * Deletes the snapshot repository configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSnapshotRepositoryTest() throws ApiException {
        String repositoryName = null;
        EmptyResponse response = api.deleteSnapshotRepository(repositoryName);

        // TODO: test validations
    }
    /**
     * Get snapshot repositories
     *
     * Retrieves a list of available snapshot repository configurations. To access the configuration contents, you must have privileged permissions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotRepositoriesTest() throws ApiException {
        RepositoryConfigs response = api.getSnapshotRepositories();

        // TODO: test validations
    }
    /**
     * Get snapshot repository
     *
     * Retrieves the snapshot repository configuration. To access the configuration contents, you must have privileged permissions.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSnapshotRepositoryTest() throws ApiException {
        String repositoryName = null;
        RepositoryConfig response = api.getSnapshotRepository(repositoryName);

        // TODO: test validations
    }
    /**
     * Set snapshot repository
     *
     * Creates or updates the snapshot repository configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setSnapshotRepositoryTest() throws ApiException {
        SnapshotRepositoryConfiguration body = null;
        String repositoryName = null;
        Integer version = null;
        RepositoryConfig response = api.setSnapshotRepository(body, repositoryName, version);

        // TODO: test validations
    }
}
