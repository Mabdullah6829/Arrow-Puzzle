package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecl extends zzgba {

    /* JADX INFO: renamed from: a */
    public final SensorManager f13573a;

    /* JADX INFO: renamed from: b */
    public final Sensor f13574b;

    /* JADX INFO: renamed from: c */
    public float f13575c = 0.0f;

    /* JADX INFO: renamed from: d */
    public Float f13576d = Float.valueOf(0.0f);

    /* JADX INFO: renamed from: e */
    public long f13577e;

    /* JADX INFO: renamed from: f */
    public int f13578f;

    /* JADX INFO: renamed from: g */
    public boolean f13579g;

    /* JADX INFO: renamed from: h */
    public boolean f13580h;

    /* JADX INFO: renamed from: i */
    public zzecz f13581i;

    /* JADX INFO: renamed from: j */
    public boolean f13582j;

    public zzecl(Context context) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f13577e = System.currentTimeMillis();
        this.f13578f = 0;
        this.f13579g = false;
        this.f13580h = false;
        this.f13581i = null;
        this.f13582j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f13573a = sensorManager;
        if (sensorManager != null) {
            this.f13574b = sensorManager.getDefaultSensor(4);
        } else {
            this.f13574b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    /* JADX INFO: renamed from: a */
    public final void mo5453a(SensorEvent sensorEvent) {
        zzbio zzbioVar = zzbix.f8769ta;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f13577e + ((long) ((Integer) zzbivVar2.m5030a(zzbix.f8803va)).intValue()) < jCurrentTimeMillis) {
                this.f13578f = 0;
                this.f13577e = jCurrentTimeMillis;
                this.f13579g = false;
                this.f13580h = false;
                this.f13575c = this.f13576d.floatValue();
            }
            float fFloatValue = this.f13576d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f13576d = Float.valueOf(fFloatValue);
            float f2 = this.f13575c;
            zzbio zzbioVar2 = zzbix.f8786ua;
            if (fFloatValue > ((Float) zzbivVar2.m5030a(zzbioVar2)).floatValue() + f2) {
                this.f13575c = this.f13576d.floatValue();
                this.f13580h = true;
            } else if (this.f13576d.floatValue() < this.f13575c - ((Float) zzbivVar2.m5030a(zzbioVar2)).floatValue()) {
                this.f13575c = this.f13576d.floatValue();
                this.f13579g = true;
            }
            if (this.f13576d.isInfinite()) {
                this.f13576d = Float.valueOf(0.0f);
                this.f13575c = 0.0f;
            }
            if (this.f13579g && this.f13580h) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Flick detected.");
                this.f13577e = jCurrentTimeMillis;
                int i2 = this.f13578f + 1;
                this.f13578f = i2;
                this.f13579g = false;
                this.f13580h = false;
                zzecz zzeczVar = this.f13581i;
                if (zzeczVar == null || i2 != ((Integer) zzbivVar2.m5030a(zzbix.f8820wa)).intValue()) {
                    return;
                }
                zzeczVar.m6166e(new zzecx(), zzecy.f13627u);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6155b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8769ta)).booleanValue()) {
                    if (!this.f13582j && (sensorManager = this.f13573a) != null && (sensor = this.f13574b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f13582j = true;
                        com.google.android.gms.ads.internal.util.zze.m3150k("Listening for flick gestures.");
                    }
                    if (this.f13573a == null || this.f13574b == null) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
