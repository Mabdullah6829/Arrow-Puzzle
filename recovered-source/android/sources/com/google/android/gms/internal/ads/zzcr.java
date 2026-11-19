package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzcr implements zzcs {

    /* JADX INFO: renamed from: a */
    public final float[] f11296a;

    /* JADX INFO: renamed from: b */
    public float[] f11297b;

    /* JADX INFO: renamed from: c */
    public float[] f11298c;

    /* JADX INFO: renamed from: d */
    public float[] f11299d;

    /* JADX INFO: renamed from: e */
    public double f11300e;

    /* JADX INFO: renamed from: f */
    public double f11301f;

    /* JADX INFO: renamed from: g */
    public double f11302g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zzcu f11303h;

    public zzcr(zzcu zzcuVar) {
        this.f11303h = zzcuVar;
        int i2 = zzcuVar.f11425h;
        this.f11296a = new float[i2];
        int i3 = i2 * zzcuVar.f11419b;
        this.f11297b = new float[i3];
        this.f11298c = new float[i3];
        this.f11299d = new float[i3];
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: E */
    public final void mo5797E(int i2) {
        this.f11298c = m5813o(this.f11298c, this.f11303h.f11428k, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: R */
    public final void mo5798R(int i2) {
        this.f11297b = m5813o(this.f11297b, this.f11303h.f11427j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: a */
    public final int mo5799a(int i2, int i3, int i4) {
        return m5811m(i2, i3, i4, this.f11297b);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: b */
    public final void mo5800b(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            zzcu zzcuVar = this.f11303h;
            int i4 = zzcuVar.f11419b;
            if (i3 >= i4) {
                return;
            }
            float[] fArr = this.f11298c;
            int i5 = zzcuVar.f11428k;
            float[] fArr2 = this.f11299d;
            int i6 = (i2 * i4) + i3;
            float f2 = fArr2[i6];
            float f3 = fArr2[i6 + i4];
            long j4 = ((long) zzcuVar.f11431n) * j2;
            int i7 = zzcuVar.f11430m;
            long j5 = ((long) (i7 + 1)) * j3;
            long j6 = j5 - j4;
            long j7 = j5 - (((long) i7) * j3);
            fArr[(i5 * i4) + i3] = ((j6 * f2) + ((j7 - j6) * f3)) / j7;
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: c */
    public final void mo5801c() {
        this.f11302g = 0.0d;
        this.f11300e = 0.0d;
        this.f11301f = 0.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: d */
    public final void mo5802d(int i2) {
        this.f11299d = m5813o(this.f11299d, this.f11303h.f11429l, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: e */
    public final void mo5803e(int i2, int i3, int i4, int i5, int i6) {
        float[] fArr = this.f11298c;
        float[] fArr2 = this.f11297b;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                fArr[i10] = ((fArr2[i9] * i11) + (fArr2[i8] * (i2 - i11))) / i2;
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo5804f() {
        return this.f11298c;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: g */
    public final void mo5805g(int i2, int i3) {
        int i4;
        int i5 = 0;
        while (true) {
            zzcu zzcuVar = this.f11303h;
            if (i5 >= zzcuVar.f11425h / i3) {
                return;
            }
            double d = 0.0d;
            int i6 = 0;
            while (true) {
                int i7 = zzcuVar.f11419b;
                i4 = i7 * i3;
                if (i6 < i4) {
                    d += (double) this.f11297b[(i4 * i5) + (i7 * i2) + i6];
                    i6++;
                }
            }
            this.f11296a[i5] = (float) (d / ((double) i4));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: h */
    public final void mo5806h(int i2, ByteBuffer byteBuffer) {
        zzcu zzcuVar = this.f11303h;
        byteBuffer.asFloatBuffer().get(this.f11297b, zzcuVar.f11427j * zzcuVar.f11419b, i2 / 4);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object mo5807i() {
        return this.f11299d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: j */
    public final void mo5808j(int i2, int i3) {
        for (int i4 = 0; i4 < this.f11303h.f11419b * i3; i4++) {
            this.f11297b[i2 + i4] = 0.0f;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: k */
    public final int mo5809k(int i2, int i3) {
        return m5811m(0, i2, i3, this.f11296a);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: l */
    public final void mo5810l(int i2, ByteBuffer byteBuffer) {
        zzcu zzcuVar = this.f11303h;
        byteBuffer.asFloatBuffer().put(this.f11298c, 0, zzcuVar.f11419b * i2);
        byteBuffer.position((i2 * 4 * zzcuVar.f11419b) + byteBuffer.position());
    }

    /* JADX INFO: renamed from: m */
    public final int m5811m(int i2, int i3, int i4, float[] fArr) {
        int i5 = 255;
        int i6 = 0;
        double d = 0.0d;
        double d2 = 1.0d;
        int i7 = i3;
        while (true) {
            double d3 = i5;
            double d4 = i6;
            if (i7 > i4) {
                this.f11300e = d2 / d4;
                this.f11301f = d / d3;
                return i6;
            }
            int i8 = 0;
            double dAbs = 0.0d;
            while (i8 < i7) {
                int i9 = this.f11303h.f11419b * i2;
                dAbs += (double) Math.abs(fArr[i9 + i8] - fArr[(i9 + i7) + i8]);
                i8++;
                i5 = i5;
            }
            int i10 = i5;
            double d5 = d4 * dAbs;
            double d6 = i7;
            double d7 = d2 * d6;
            if (d5 < d7) {
                d2 = dAbs;
            }
            if (d5 < d7) {
                i6 = i7;
            }
            double d8 = d3 * dAbs;
            double d9 = d6 * d;
            if (d8 > d9) {
                d = dAbs;
            }
            i5 = d8 > d9 ? i7 : i10;
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object mo5812n() {
        return this.f11297b;
    }

    /* JADX INFO: renamed from: o */
    public final float[] m5813o(float[] fArr, int i2, int i3) {
        int length = fArr.length;
        int i4 = this.f11303h.f11419b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? fArr : Arrays.copyOf(fArr, (((i5 * 3) / 2) + i3) * i4);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final boolean zzc() {
        double d = this.f11300e;
        return d != 0.0d && this.f11303h.f11433p != 0 && this.f11301f <= d * 3.0d && d + d > this.f11302g * 3.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzi() {
        this.f11302g = this.f11300e;
    }
}
