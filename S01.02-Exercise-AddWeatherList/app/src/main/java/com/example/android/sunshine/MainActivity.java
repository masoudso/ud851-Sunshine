/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // (1) Create a field to store the weather display TextView
    // initializing weatherTextView to reference from the layout's Text view
    private TextView weatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // (2) Use findViewById to get a reference to the weather display TextView
        //referenced from the layout
        weatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // (3) Create an array of Strings that contain fake weather data

        String[] TehranWeather = {
                "Today, Nov 18 - Clear - 20 C / 15 C",
                "Tomorrow, Nov 19 - Cloudy - 21 C / 18 C",
                "Monday, Nov 20 - Rainy - 18 C / 14 C",
                "Tuesday, Nov 21 - Cloudy - 20 C / 15C",
                "Wednesday, Nov 22 - Sunny - 20 C / 18C",
                "Thursday, Nov 23 - Rainy - 19 C / 16C",
                "Friday, Nov 24 - Clear - 20 C / 15C",
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        weatherTextView.append("Tehran Wather\n\n");
        for (String TehranWeatherData : TehranWeather){
        weatherTextView.append(TehranWeatherData + "\n\n\n");
        }
    }
}