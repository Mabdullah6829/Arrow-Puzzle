package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzct implements zzcs {

    /* JADX INFO: renamed from: a */
    public final short[] f11345a;

    /* JADX INFO: renamed from: b */
    public short[] f11346b;

    /* JADX INFO: renamed from: c */
    public short[] f11347c;

    /* JADX INFO: renamed from: d */
    public short[] f11348d;

    /* JADX INFO: renamed from: e */
    public int f11349e;

    /* JADX INFO: renamed from: f */
    public int f11350f;

    /* JADX INFO: renamed from: g */
    public int f11351g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zzcu f11352h;

    public zzct(zzcu zzcuVar) {
        this.f11352h = zzcuVar;
        int i2 = zzcuVar.f11425h;
        this.f11345a = new short[i2];
        int i3 = i2 * zzcuVar.f11419b;
        this.f11346b = new short[i3];
        this.f11347c = new short[i3];
        this.f11348d = new short[i3];
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: E */
    public final void mo5797E(int i2) {
        this.f11347c = m5817o(this.f11347c, this.f11352h.f11428k, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: R */
    public final void mo5798R(int i2) {
        this.f11346b = m5817o(this.f11346b, this.f11352h.f11427j, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: a */
    public final int mo5799a(int i2, int i3, int i4) {
        return m5816m(this.f11346b, i2, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: b */
    public final void mo5800b(int i2, long j2, long j3) {
        int i3 = 0;
        while (true) {
            zzcu zzcuVar = this.f11352h;
            int i4 = zzcuVar.f11419b;
            if (i3 >= i4) {
                return;
            }
            short[] sArr = this.f11347c;
            int i5 = zzcuVar.f11428k;
            short[] sArr2 = this.f11348d;
            int i6 = (i2 * i4) + i3;
            short s2 = sArr2[i6];
            short s3 = sArr2[i6 + i4];
            long j4 = ((long) zzcuVar.f11431n) * j2;
            int i7 = zzcuVar.f11430m;
            long j5 = ((long) i7) * j3;
            long j6 = ((long) (i7 + 1)) * j3;
            int i8 = i3;
            long j7 = j6 - j5;
            long j8 = j6 - j4;
            sArr[(i5 * i4) + i8] = (short) ((((j7 - j8) * ((long) s3)) + (j8 * ((long) s2))) / j7);
            i3 = i8 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: c */
    public final void mo5801c() {
        this.f11351g = 0;
        this.f11349e = 0;
        this.f11350f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: d */
    public final void mo5802d(int i2) {
        this.f11348d = m5817o(this.f11348d, this.f11352h.f11429l, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: e */
    public final void mo5803e(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = this.f11347c;
        short[] sArr2 = this.f11346b;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i8])) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object mo5804f() {
        return this.f11347c;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: g */
    public final void mo5805g(int i2, int i3) {
        int i4;
        short[] sArr = this.f11346b;
        int i5 = 0;
        while (true) {
            zzcu zzcuVar = this.f11352h;
            if (i5 >= zzcuVar.f11425h / i3) {
                return;
            }
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = zzcuVar.f11419b;
                i4 = i8 * i3;
                if (i6 < i4) {
                    i7 += sArr[(i4 * i5) + (i8 * i2) + i6];
                    i6++;
                }
            }
            this.f11345a[i5] = (short) (i7 / i4);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: h */
    public final void mo5806h(int i2, ByteBuffer byteBuffer) {
        zzcu zzcuVar = this.f11352h;
        byteBuffer.asShortBuffer().get(this.f11346b, zzcuVar.f11427j * zzcuVar.f11419b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object mo5807i() {
        return this.f11348d;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: j */
    public final void mo5808j(int i2, int i3) {
        for (int i4 = 0; i4 < this.f11352h.f11419b * i3; i4++) {
            this.f11346b[i2 + i4] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: k */
    public final int mo5809k(int i2, int i3) {
        return m5816m(this.f11345a, 0, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: l */
    public final void mo5810l(int i2, ByteBuffer byteBuffer) {
        zzcu zzcuVar = this.f11352h;
        byteBuffer.asShortBuffer().put(this.f11347c, 0, zzcuVar.f11419b * i2);
        byteBuffer.position(((i2 + i2) * zzcuVar.f11419b) + byteBuffer.position());
    }

    /* JADX INFO: renamed from: m */
    public final int m5816m(short[] sArr, int i2, int i3, int i4) {
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                int i10 = this.f11352h.f11419b * i2;
                iAbs += Math.abs(sArr[i10 + i9] - sArr[(i10 + i3) + i9]);
            }
            int i11 = iAbs * i7;
            int i12 = i5 * i3;
            if (i11 < i12) {
                i5 = iAbs;
            }
            if (i11 < i12) {
                i7 = i3;
            }
            int i13 = iAbs * i6;
            int i14 = i8 * i3;
            if (i13 > i14) {
                i8 = iAbs;
            }
            if (i13 > i14) {
                i6 = i3;
            }
            i3++;
        }
        this.f11349e = i5 / i7;
        this.f11350f = i8 / i6;
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object mo5812n() {
        return this.f11346b;
    }

    /* JADX INFO: renamed from: o */
    public final short[] m5817o(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f11352h.f11419b;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final boolean zzc() {
        int i2 = this.f11349e;
        return i2 != 0 && this.f11352h.f11433p != 0 && this.f11350f <= i2 * 3 && i2 + i2 > this.f11351g * 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcs
    public final void zzi() {
        this.f11351g = this.f11349e;
    }
}
