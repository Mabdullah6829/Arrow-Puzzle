package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzchr extends zzgba {

    /* JADX INFO: renamed from: a */
    public final SensorManager f10044a;

    /* JADX INFO: renamed from: c */
    public final Display f10046c;

    /* JADX INFO: renamed from: f */
    public float[] f10049f;

    /* JADX INFO: renamed from: g */
    public zzgax f10050g;

    /* JADX INFO: renamed from: h */
    public zzchs f10051h;

    /* JADX INFO: renamed from: d */
    public final float[] f10047d = new float[9];

    /* JADX INFO: renamed from: e */
    public final float[] f10048e = new float[9];

    /* JADX INFO: renamed from: b */
    public final Object f10045b = new Object();

    public zzchr(Context context) {
        this.f10044a = (SensorManager) context.getSystemService("sensor");
        this.f10046c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    /* JADX INFO: renamed from: a */
    public final void mo5453a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f10045b) {
            try {
                if (this.f10049f == null) {
                    this.f10049f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f10047d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f10046c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.f10048e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.f10048e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f10048e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 130, 1, this.f10048e);
        }
        float[] fArr3 = this.f10048e;
        float f2 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f2;
        float f3 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f3;
        float f4 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f4;
        synchronized (this.f10045b) {
            System.arraycopy(fArr3, 0, this.f10049f, 0, 9);
        }
        zzchs zzchsVar = this.f10051h;
        if (zzchsVar != null) {
            Object obj = zzchsVar.f10065M;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5454b() {
        if (this.f10050g == null) {
            return;
        }
        this.f10044a.unregisterListener(this);
        this.f10050g.post(new zzchp());
        this.f10050g = null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5455c(float[] fArr) {
        synchronized (this.f10045b) {
            try {
                float[] fArr2 = this.f10049f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
