package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeec extends zzgba {

    /* JADX INFO: renamed from: a */
    public final Context f13723a;

    /* JADX INFO: renamed from: b */
    public SensorManager f13724b;

    /* JADX INFO: renamed from: c */
    public Sensor f13725c;

    /* JADX INFO: renamed from: d */
    public long f13726d;

    /* JADX INFO: renamed from: e */
    public int f13727e;

    /* JADX INFO: renamed from: f */
    public zzecz f13728f;

    /* JADX INFO: renamed from: g */
    public boolean f13729g;

    public zzeec(Context context) {
        this.f13723a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    /* JADX INFO: renamed from: a */
    public final void mo5453a(SensorEvent sensorEvent) {
        zzbio zzbioVar = zzbix.f8684oa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0] / 9.80665f;
            float f3 = fArr[1] / 9.80665f;
            float f4 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2))) >= ((Float) zzbivVar2.m5030a(zzbix.f8701pa)).floatValue()) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f13726d + ((long) ((Integer) zzbivVar2.m5030a(zzbix.f8718qa)).intValue()) <= jCurrentTimeMillis) {
                    if (this.f13726d + ((long) ((Integer) zzbivVar2.m5030a(zzbix.f8735ra)).intValue()) < jCurrentTimeMillis) {
                        this.f13727e = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.m3150k("Shake detected.");
                    this.f13726d = jCurrentTimeMillis;
                    int i2 = this.f13727e + 1;
                    this.f13727e = i2;
                    zzecz zzeczVar = this.f13728f;
                    if (zzeczVar == null || i2 != ((Integer) zzbivVar2.m5030a(zzbix.f8752sa)).intValue()) {
                        return;
                    }
                    zzeczVar.m6166e(new zzecw(), zzecy.f13627u);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6185b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                zzbio zzbioVar = zzbix.f8684oa;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    if (this.f13724b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f13723a.getSystemService("sensor");
                        this.f13724b = sensorManager2;
                        if (sensorManager2 == null) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f13725c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f13729g && (sensorManager = this.f13724b) != null && (sensor = this.f13725c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                        this.f13726d = System.currentTimeMillis() - ((long) ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8718qa)).intValue());
                        this.f13729g = true;
                        com.google.android.gms.ads.internal.util.zze.m3150k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
