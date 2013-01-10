/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cloudstack.storage.datastore.configurator.vmware;

import org.apache.cloudstack.storage.datastore.configurator.validator.ISCSIProtocolTransformer;
import org.apache.cloudstack.storage.datastore.configurator.validator.StorageProtocolTransformer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("defaultProvider")
public class VmwareIsciConfigurator extends AbstractVmwareConfigurator {

    public String getSupportedDataStoreType() {
        return "iscsi";
    }

    @Override
    public StorageProtocolTransformer getProtocolTransformer() {
        return new ISCSIProtocolTransformer();
    }

    @Override
    protected boolean isLocalStorageSupported() {
        // TODO Auto-generated method stub
        return false;
    }
    
}