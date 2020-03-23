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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Performs inline, rolling configuration changes that mutate existing containers. TIP: This is the fastest way to update a plan, but can fail for complex plan changes, such as topology changes. Also, this is less safe for configuration changes that leave a cluster in a non running state. NOTE: When you perform a major version upgrade, and &#x27;group_by&#x27; is set to &#x27;pass:macros[__all__]&#x27;;, rolling is required.
 */
@Schema(description = "Performs inline, rolling configuration changes that mutate existing containers. TIP: This is the fastest way to update a plan, but can fail for complex plan changes, such as topology changes. Also, this is less safe for configuration changes that leave a cluster in a non running state. NOTE: When you perform a major version upgrade, and 'group_by' is set to 'pass:macros[__all__]';, rolling is required.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-10T16:33:30.970+05:30[Asia/Kolkata]")
public class RollingStrategyConfig {
  @SerializedName("group_by")
  private String groupBy = null;

  @SerializedName("allow_inline_resize")
  private Boolean allowInlineResize = null;

  @SerializedName("skip_synced_flush")
  private Boolean skipSyncedFlush = null;

  @SerializedName("shard_init_wait_time")
  private Long shardInitWaitTime = null;

  public RollingStrategyConfig groupBy(String groupBy) {
    this.groupBy = groupBy;
    return this;
  }

   /**
   * Specifies the grouping attribute to use when rolling several instances. Instances that share the same value for the provided attribute key are rolled together as a unit. Examples that make sense to use are &#x27;\\_\\_all\\_\\_&#x27; (roll all instances as a single unit), &#x27;logical_zone_name&#x27; (roll instances by zone), &#x27;\\_\\_name\\_\\_&#x27; (roll one instance at a time, the default if not specified). Note that &#x27;\\_\\_all\\_\\_&#x27; is required when performing a major version upgrade
   * @return groupBy
  **/
  @Schema(description = "Specifies the grouping attribute to use when rolling several instances. Instances that share the same value for the provided attribute key are rolled together as a unit. Examples that make sense to use are '\\_\\_all\\_\\_' (roll all instances as a single unit), 'logical_zone_name' (roll instances by zone), '\\_\\_name\\_\\_' (roll one instance at a time, the default if not specified). Note that '\\_\\_all\\_\\_' is required when performing a major version upgrade")
  public String getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(String groupBy) {
    this.groupBy = groupBy;
  }

  public RollingStrategyConfig allowInlineResize(Boolean allowInlineResize) {
    this.allowInlineResize = allowInlineResize;
    return this;
  }

   /**
   * Whether we allow changing the capacity of instances (default false). This is currently implemented by stopping, re-creating then starting the affected instance on its associated allocator when performing the changes. NOTES: This requires a round-trip through the allocation infrastructure of the active constructor, as it has to reserve the target capacity without over-committing
   * @return allowInlineResize
  **/
  @Schema(description = "Whether we allow changing the capacity of instances (default false). This is currently implemented by stopping, re-creating then starting the affected instance on its associated allocator when performing the changes. NOTES: This requires a round-trip through the allocation infrastructure of the active constructor, as it has to reserve the target capacity without over-committing")
  public Boolean isAllowInlineResize() {
    return allowInlineResize;
  }

  public void setAllowInlineResize(Boolean allowInlineResize) {
    this.allowInlineResize = allowInlineResize;
  }

  public RollingStrategyConfig skipSyncedFlush(Boolean skipSyncedFlush) {
    this.skipSyncedFlush = skipSyncedFlush;
    return this;
  }

   /**
   * Whether to skip attempting to do a synced flush on the filesystem of the container (default: false), which is less safe but may be required if the container is unhealthy
   * @return skipSyncedFlush
  **/
  @Schema(description = "Whether to skip attempting to do a synced flush on the filesystem of the container (default: false), which is less safe but may be required if the container is unhealthy")
  public Boolean isSkipSyncedFlush() {
    return skipSyncedFlush;
  }

  public void setSkipSyncedFlush(Boolean skipSyncedFlush) {
    this.skipSyncedFlush = skipSyncedFlush;
  }

  public RollingStrategyConfig shardInitWaitTime(Long shardInitWaitTime) {
    this.shardInitWaitTime = shardInitWaitTime;
    return this;
  }

   /**
   * The time, in seconds, to wait for shards that show no progress of initializing before rolling the next group (default: 10 minutes)
   * @return shardInitWaitTime
  **/
  @Schema(description = "The time, in seconds, to wait for shards that show no progress of initializing before rolling the next group (default: 10 minutes)")
  public Long getShardInitWaitTime() {
    return shardInitWaitTime;
  }

  public void setShardInitWaitTime(Long shardInitWaitTime) {
    this.shardInitWaitTime = shardInitWaitTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollingStrategyConfig rollingStrategyConfig = (RollingStrategyConfig) o;
    return Objects.equals(this.groupBy, rollingStrategyConfig.groupBy) &&
        Objects.equals(this.allowInlineResize, rollingStrategyConfig.allowInlineResize) &&
        Objects.equals(this.skipSyncedFlush, rollingStrategyConfig.skipSyncedFlush) &&
        Objects.equals(this.shardInitWaitTime, rollingStrategyConfig.shardInitWaitTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupBy, allowInlineResize, skipSyncedFlush, shardInitWaitTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollingStrategyConfig {\n");
    
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    allowInlineResize: ").append(toIndentedString(allowInlineResize)).append("\n");
    sb.append("    skipSyncedFlush: ").append(toIndentedString(skipSyncedFlush)).append("\n");
    sb.append("    shardInitWaitTime: ").append(toIndentedString(shardInitWaitTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
