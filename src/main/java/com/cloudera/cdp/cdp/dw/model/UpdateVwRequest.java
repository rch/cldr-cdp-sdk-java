/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.cdp.dw.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.dw.model.AutoscalingOptionsUpdateRequest;
import com.cloudera.cdp.dw.model.QueryIsolationOptionsRequest;
import com.cloudera.cdp.dw.model.ServiceConfigReq;

/**
 * Request object for the updateVw method.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-29T14:06:16.656-08:00")
public class UpdateVwRequest  {

  /**
   * ID of the Virtual Warehouse's cluster.
   **/
  private String clusterId = null;

  /**
   * ID of the Virtual Warehouse.
   **/
  private String vwId = null;

  /**
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there's no need to list configurations that stay the same.
   **/
  private ServiceConfigReq config = null;

  /**
   * Autoscaling settings for the Virtual Warehouse.
   **/
  private AutoscalingOptionsUpdateRequest autoscaling = null;

  /**
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  private QueryIsolationOptionsRequest queryIsolationOptions = null;

  /**
   * Getter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  @JsonProperty("clusterId")
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Setter for clusterId.
   * ID of the Virtual Warehouse&#39;s cluster.
   **/
  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  /**
   * Getter for vwId.
   * ID of the Virtual Warehouse.
   **/
  @JsonProperty("vwId")
  public String getVwId() {
    return vwId;
  }

  /**
   * Setter for vwId.
   * ID of the Virtual Warehouse.
   **/
  public void setVwId(String vwId) {
    this.vwId = vwId;
  }

  /**
   * Getter for config.
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  @JsonProperty("config")
  public ServiceConfigReq getConfig() {
    return config;
  }

  /**
   * Setter for config.
   * The service configuration to update the VW with. This will be applied on top of the existing configuration so there&#39;s no need to list configurations that stay the same.
   **/
  public void setConfig(ServiceConfigReq config) {
    this.config = config;
  }

  /**
   * Getter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  @JsonProperty("autoscaling")
  public AutoscalingOptionsUpdateRequest getAutoscaling() {
    return autoscaling;
  }

  /**
   * Setter for autoscaling.
   * Autoscaling settings for the Virtual Warehouse.
   **/
  public void setAutoscaling(AutoscalingOptionsUpdateRequest autoscaling) {
    this.autoscaling = autoscaling;
  }

  /**
   * Getter for queryIsolationOptions.
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  @JsonProperty("queryIsolationOptions")
  public QueryIsolationOptionsRequest getQueryIsolationOptions() {
    return queryIsolationOptions;
  }

  /**
   * Setter for queryIsolationOptions.
   * Query isolation settings for Hive Virtual Warehouses.
   **/
  public void setQueryIsolationOptions(QueryIsolationOptionsRequest queryIsolationOptions) {
    this.queryIsolationOptions = queryIsolationOptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVwRequest updateVwRequest = (UpdateVwRequest) o;
    if (!Objects.equals(this.clusterId, updateVwRequest.clusterId)) {
      return false;
    }
    if (!Objects.equals(this.vwId, updateVwRequest.vwId)) {
      return false;
    }
    if (!Objects.equals(this.config, updateVwRequest.config)) {
      return false;
    }
    if (!Objects.equals(this.autoscaling, updateVwRequest.autoscaling)) {
      return false;
    }
    if (!Objects.equals(this.queryIsolationOptions, updateVwRequest.queryIsolationOptions)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, vwId, config, autoscaling, queryIsolationOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVwRequest {\n");
    sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
    sb.append("    vwId: ").append(toIndentedString(vwId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
    sb.append("    queryIsolationOptions: ").append(toIndentedString(queryIsolationOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

