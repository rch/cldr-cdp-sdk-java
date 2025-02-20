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

package com.cloudera.cdp.dfworkload.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;

/**
 * Request object that contains the identifier of the Inbound Connection Endpoint to describe
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2022-11-29T14:06:19.393-08:00")
@com.cloudera.cdp.annotation.WorkloadApi
public class DescribeInboundConnectionEndpointRequest  {

  /**
   * The CRN of an environment to execute the command.
   **/
  private String environmentCrn = null;

  /**
   * The identifier of the Inbound Connection Endpoint. Deprecated. Use 'crn' instead
   **/
  private String id = null;

  /**
   * The CRN of the Inbound Connection Endpoint
   **/
  private String crn = null;

  /**
   * Getter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  @JsonProperty("environmentCrn")
  public String getEnvironmentCrn() {
    return environmentCrn;
  }

  /**
   * Setter for environmentCrn.
   * The CRN of an environment to execute the command.
   **/
  public void setEnvironmentCrn(String environmentCrn) {
    this.environmentCrn = environmentCrn;
  }

  /**
   * Getter for id.
   * The identifier of the Inbound Connection Endpoint. Deprecated. Use &#39;crn&#39; instead
   **/
  @Deprecated
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Setter for id.
   * The identifier of the Inbound Connection Endpoint. Deprecated. Use &#39;crn&#39; instead
   **/
  @Deprecated
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Getter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  @JsonProperty("crn")
  public String getCrn() {
    return crn;
  }

  /**
   * Setter for crn.
   * The CRN of the Inbound Connection Endpoint
   **/
  public void setCrn(String crn) {
    this.crn = crn;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DescribeInboundConnectionEndpointRequest describeInboundConnectionEndpointRequest = (DescribeInboundConnectionEndpointRequest) o;
    if (!Objects.equals(this.environmentCrn, describeInboundConnectionEndpointRequest.environmentCrn)) {
      return false;
    }
    if (!Objects.equals(this.id, describeInboundConnectionEndpointRequest.id)) {
      return false;
    }
    if (!Objects.equals(this.crn, describeInboundConnectionEndpointRequest.crn)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentCrn, id, crn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DescribeInboundConnectionEndpointRequest {\n");
    sb.append("    environmentCrn: ").append(toIndentedString(environmentCrn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
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

