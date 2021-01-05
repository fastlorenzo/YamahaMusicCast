/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.yamahamusiccast.internal.model;
import com.google.gson.annotations.SerializedName;
import org.eclipse.jdt.annotation.*;
import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * This class represents the DeviceInfo request requested from the Yamaha model/device via the API.
 *
 * @author Lennert Coopman - Initial contribution
 */
@NonNullByDefault
public class DeviceInfo {

    @SerializedName("response_code")
    private @Nullable String responseCode;

    @SerializedName("model_name")
    private @Nullable String modelName;

    @SerializedName("device_id")
    private @Nullable String deviceId;

    public @Nullable String getResponseCode() {
        return responseCode;
    }

    public @Nullable String getModelName() {
        if (modelName==null) {modelName = "";}
        return modelName;
    }

    public @Nullable String getDeviceId() {
        if (deviceId==null) {deviceId = "";}
        return deviceId;
    }
}


