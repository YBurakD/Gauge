package com.etu.gaugue;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.CheckBox;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // i need a sensor manager to get sensor data
    SensorManager sensorManager;
    Sensor linearAccelSensor;
    Sensor gravitySensor;

    // gravity values, starting with earth gravity
    float[] gravity = {0f, 9.8f, 0f};

    // velocity starts at zero
    float velocity = 0f;
    long lastTimestamp = 0;
    float stopSign = 0f;
    int graceFrames = 0;

    // the gauge view and controls
    GaugeView gaugeView;
    SeekBar seekBar;
    CheckBox checkboxManual;
    boolean manualMode = false;

    // alarm stuff
    ToneGenerator toneGen;
    boolean alarmSounding = false;
    Handler alarmHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}