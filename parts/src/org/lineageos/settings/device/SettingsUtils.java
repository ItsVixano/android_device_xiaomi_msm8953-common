/*
 * Copyright (c) 2018 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.device;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import android.text.TextUtils;

public class SettingsUtils {
    private static final String CAMERA_HAL3_ENABLE_PROPERTY = "persist.camera.HAL3.enabled";

    public static void writeCameraHAL3Prop(boolean enable) {
        SystemProperties.set(CAMERA_HAL3_ENABLE_PROPERTY, enable ? "1" : "0");
    }

    public static boolean cameraHAL3Enable() {
        String enable = SystemProperties.get(CAMERA_HAL3_ENABLE_PROPERTY, "1");
        return "1".equals(enable);
    }

    public static boolean supportCamHalLevelSwitch() {
        return true;
    }
}
