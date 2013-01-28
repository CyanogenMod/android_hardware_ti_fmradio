/*
 * Copyright (C) 2012-2013 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.ti.fmapp.utils;

import android.util.Log;

/**
 * User: Pedro Veloso
 * Date: 8/20/12
 * Time: 5:04 PM
 */
public class Utils {

    private final static String LOG_TAG = "FmRxApp";

    /**
     * @param message     Message to display
     * @param type        [Log.Error, Log.Warn, ...]
     * @param shouldPrint value that comes from Preferences which allows the user to decide if debug info should be printed to logcat. Error info will ALWAYS be displayed despite this value
     */
    public static void debugFunc(String message, int type, boolean shouldPrint) {
        // errors must always be displayed
        if (type == Log.ERROR) {
            Log.e(LOG_TAG, message);
        } else if (shouldPrint) {
            switch (type) {
                case Log.DEBUG:
                    Log.d(LOG_TAG, message);
                    break;
                case Log.INFO:
                    Log.i(LOG_TAG, message);
                    break;
                case Log.VERBOSE:
                    Log.v(LOG_TAG, message);
                    break;
                case Log.WARN:
                    Log.w(LOG_TAG, message);
                    break;
                default:
                    Log.v(LOG_TAG, message);
                    break;
            }
        }
    }
}
