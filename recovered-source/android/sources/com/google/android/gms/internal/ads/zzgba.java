package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgba implements SensorEventListener {
    public zzgba() {
        int i2 = zzgaz.f16891a;
        int i3 = zzgay.f16890a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5453a(SensorEvent sensorEvent);

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        mo5453a(sensorEvent);
    }
}
