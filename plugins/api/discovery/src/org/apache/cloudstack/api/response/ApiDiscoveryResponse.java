// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.api.response;

import com.cloud.user.Account;
import org.apache.cloudstack.api.ApiConstants;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;
import org.apache.cloudstack.api.BaseResponse;
import org.apache.cloudstack.api.EntityReference;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
@EntityReference(value = Account.class)
public class ApiDiscoveryResponse extends BaseResponse {
    @SerializedName(ApiConstants.NAME) @Param(description="the name of the api command")
    private String name;

    @SerializedName(ApiConstants.DESCRIPTION) @Param(description="description of the api")
    private String description;

    @SerializedName(ApiConstants.SINCE) @Param(description="version of CloudStack the api was introduced in")
    private String since;

    @SerializedName(ApiConstants.IS_ASYNC) @Param(description="true if api is asynchronous")
    private Boolean isAsync;

    @SerializedName(ApiConstants.PARAMS)  @Param(description="the list params the api accepts", responseObject = ApiParameterResponse.class)
    private Set<ApiParameterResponse> params;

    public ApiDiscoveryResponse(){
        params = new HashSet<ApiParameterResponse>();
        isAsync = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public void setAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    public void setParams(Set<ApiParameterResponse> params) {
        this.params = params;
    }

    public void addParam(ApiParameterResponse param) {
        this.params.add(param);
    }
}