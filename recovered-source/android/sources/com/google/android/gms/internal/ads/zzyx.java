package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzyx {

    /* JADX INFO: renamed from: a */
    public final zzabm f21423a;

    /* JADX INFO: renamed from: b */
    public final zzeu f21424b = new zzeu(32);

    /* JADX INFO: renamed from: c */
    public zzyw f21425c;

    /* JADX INFO: renamed from: d */
    public zzyw f21426d;

    /* JADX INFO: renamed from: e */
    public zzyw f21427e;

    /* JADX INFO: renamed from: f */
    public long f21428f;

    public zzyx(zzabm zzabmVar) {
        this.f21423a = zzabmVar;
        zzyw zzywVar = new zzyw(0L);
        this.f21425c = zzywVar;
        this.f21426d = zzywVar;
        this.f21427e = zzywVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzyw m9049c(zzyw zzywVar, zzix zzixVar, zzyy zzyyVar, zzeu zzeuVar) {
        if (zzixVar.m8564b(BasicMeasure.EXACTLY)) {
            long j2 = zzyyVar.f21430b;
            int iM6370L = 1;
            zzeuVar.m6396y(1);
            zzyw zzywVarM9051e = m9051e(zzywVar, j2, zzeuVar.f14887a, 1);
            long j3 = j2 + 1;
            byte b = zzeuVar.f14887a[0];
            int i2 = b & 128;
            int i3 = b & 127;
            zziu zziuVar = zzixVar.f20047c;
            byte[] bArr = zziuVar.f20036a;
            if (bArr == null) {
                zziuVar.f20036a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            zzywVar = m9051e(zzywVarM9051e, j3, zziuVar.f20036a, i3);
            long j4 = j3 + ((long) i3);
            if (z) {
                zzeuVar.m6396y(2);
                zzywVar = m9051e(zzywVar, j4, zzeuVar.f14887a, 2);
                j4 += 2;
                iM6370L = zzeuVar.m6370L();
            }
            int[] iArr = zziuVar.f20039d;
            if (iArr == null || iArr.length < iM6370L) {
                iArr = new int[iM6370L];
            }
            int[] iArr2 = zziuVar.f20040e;
            if (iArr2 == null || iArr2.length < iM6370L) {
                iArr2 = new int[iM6370L];
            }
            if (z) {
                int i4 = iM6370L * 6;
                zzeuVar.m6396y(i4);
                zzywVar = m9051e(zzywVar, j4, zzeuVar.f14887a, i4);
                j4 += (long) i4;
                zzeuVar.m6363E(0);
                for (int i5 = 0; i5 < iM6370L; i5++) {
                    iArr[i5] = zzeuVar.m6370L();
                    iArr2[i5] = zzeuVar.m6382h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = zzyyVar.f21429a - ((int) (j4 - zzyyVar.f21430b));
            }
            zzahl zzahlVar = zzyyVar.f21431c;
            String str = zzfm.f16091a;
            byte[] bArr2 = zzahlVar.f5324b;
            byte[] bArr3 = zziuVar.f20036a;
            int i6 = zzahlVar.f5323a;
            int i7 = zzahlVar.f5325c;
            int i8 = zzahlVar.f5326d;
            zziuVar.f20041f = iM6370L;
            zziuVar.f20039d = iArr;
            zziuVar.f20040e = iArr2;
            zziuVar.f20037b = bArr2;
            zziuVar.f20036a = bArr3;
            zziuVar.f20038c = i6;
            zziuVar.f20042g = i7;
            zziuVar.f20043h = i8;
            MediaCodec.CryptoInfo cryptoInfo = zziuVar.f20044i;
            cryptoInfo.numSubSamples = iM6370L;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i6;
            zzit zzitVar = zziuVar.f20045j;
            zzitVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = zzitVar.f20035b;
            pattern.set(i7, i8);
            zzitVar.f20034a.setPattern(pattern);
            long j5 = zzyyVar.f21430b;
            int i9 = (int) (j4 - j5);
            zzyyVar.f21430b = j5 + ((long) i9);
            zzyyVar.f21429a -= i9;
        }
        if (!zzixVar.m8564b(268435456)) {
            zzixVar.m8567d(zzyyVar.f21429a);
            return m9050d(zzywVar, zzyyVar.f21430b, zzixVar.f20048d, zzyyVar.f21429a);
        }
        zzeuVar.m6396y(4);
        zzyw zzywVarM9051e2 = m9051e(zzywVar, zzyyVar.f21430b, zzeuVar.f14887a, 4);
        int iM6382h = zzeuVar.m6382h();
        zzyyVar.f21430b += 4;
        zzyyVar.f21429a -= 4;
        zzixVar.m8567d(iM6382h);
        zzyw zzywVarM9050d = m9050d(zzywVarM9051e2, zzyyVar.f21430b, zzixVar.f20048d, iM6382h);
        zzyyVar.f21430b += (long) iM6382h;
        int i10 = zzyyVar.f21429a - iM6382h;
        zzyyVar.f21429a = i10;
        ByteBuffer byteBuffer = zzixVar.f20050f;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            zzixVar.f20050f = ByteBuffer.allocate(i10);
        } else {
            zzixVar.f20050f.clear();
        }
        return m9050d(zzywVarM9050d, zzyyVar.f21430b, zzixVar.f20050f, zzyyVar.f21429a);
    }

    /* JADX INFO: renamed from: d */
    public static zzyw m9050d(zzyw zzywVar, long j2, ByteBuffer byteBuffer, int i2) {
        while (j2 >= zzywVar.f21420b) {
            zzywVar = zzywVar.f21422d;
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzywVar.f21420b - j2));
            zzabk zzabkVar = zzywVar.f21421c;
            byte[] bArr = zzabkVar.f4849a;
            long j3 = j2 - zzywVar.f21419a;
            zzabkVar.getClass();
            byteBuffer.put(bArr, (int) j3, iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == zzywVar.f21420b) {
                zzywVar = zzywVar.f21422d;
            }
        }
        return zzywVar;
    }

    /* JADX INFO: renamed from: e */
    public static zzyw m9051e(zzyw zzywVar, long j2, byte[] bArr, int i2) {
        while (j2 >= zzywVar.f21420b) {
            zzywVar = zzywVar.f21422d;
        }
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (zzywVar.f21420b - j2));
            zzabk zzabkVar = zzywVar.f21421c;
            byte[] bArr2 = zzabkVar.f4849a;
            long j3 = j2 - zzywVar.f21419a;
            zzabkVar.getClass();
            System.arraycopy(bArr2, (int) j3, bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == zzywVar.f21420b) {
                zzywVar = zzywVar.f21422d;
            }
        }
        return zzywVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9052a(long j2) {
        zzyw zzywVar;
        if (j2 != -1) {
            while (true) {
                zzywVar = this.f21425c;
                if (j2 < zzywVar.f21420b) {
                    break;
                }
                this.f21423a.mo3929b(zzywVar.f21421c);
                zzyw zzywVar2 = this.f21425c;
                zzywVar2.f21421c = null;
                zzyw zzywVar3 = zzywVar2.f21422d;
                zzywVar2.f21422d = null;
                this.f21425c = zzywVar3;
            }
            if (this.f21426d.f21419a < zzywVar.f21419a) {
                this.f21426d = zzywVar;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m9053b(int i2) {
        zzyw zzywVar = this.f21427e;
        if (zzywVar.f21421c == null) {
            zzabk zzabkVarZza = this.f21423a.zza();
            zzyw zzywVar2 = new zzyw(this.f21427e.f21420b);
            zzywVar.f21421c = zzabkVarZza;
            zzywVar.f21422d = zzywVar2;
        }
        return Math.min(i2, (int) (this.f21427e.f21420b - this.f21428f));
    }
}
