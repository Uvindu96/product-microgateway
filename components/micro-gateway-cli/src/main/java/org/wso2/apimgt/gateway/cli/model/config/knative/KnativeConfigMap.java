/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.apimgt.gateway.cli.model.config.knative;

import java.util.ArrayList;
import java.util.List;

/**
 * Knative ConfigMap descriptor.
 */
public class KnativeConfigMap {
    private String ballerinaConf;
    private boolean enable = false;
    private List<KnativeConfigMap> configMaps = new ArrayList<>();

    public String getBallerinaConf() {
        return ballerinaConf;
    }

    public void setBallerinaConf(String ballerinaConf) {
        this.ballerinaConf = ballerinaConf;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<KnativeConfigMap> getConfigMaps() {
        return configMaps;
    }

    public void setConfigMaps(List<KnativeConfigMap> files) {
        this.configMaps = files;
    }
}
