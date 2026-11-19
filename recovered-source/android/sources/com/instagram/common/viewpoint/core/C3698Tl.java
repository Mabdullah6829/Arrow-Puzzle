package com.instagram.common.viewpoint.core;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3698Tl implements SensorEventListener {
    public C3698Tl() {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] unused = C3700Tn.A0A = sensorEvent.values;
        C3700Tn.A06();
    }
}
