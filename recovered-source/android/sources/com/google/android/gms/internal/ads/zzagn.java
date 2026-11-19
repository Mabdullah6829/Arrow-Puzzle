package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagn {

    /* JADX INFO: renamed from: a */
    public final int f5250a;

    /* JADX INFO: renamed from: b */
    public final int f5251b;

    /* JADX INFO: renamed from: c */
    public final int f5252c;

    /* JADX INFO: renamed from: d */
    public final int f5253d;

    /* JADX INFO: renamed from: e */
    public final int f5254e;

    /* JADX INFO: renamed from: f */
    public final int f5255f;

    /* JADX INFO: renamed from: g */
    public final int f5256g;

    /* JADX INFO: renamed from: h */
    public final int f5257h;

    /* JADX INFO: renamed from: i */
    public final int f5258i;

    /* JADX INFO: renamed from: j */
    public final long f5259j;

    /* JADX INFO: renamed from: k */
    public final zzagm f5260k;

    /* JADX INFO: renamed from: l */
    public final zzap f5261l;

    public zzagn(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, zzagm zzagmVar, zzap zzapVar) {
        this.f5250a = i2;
        this.f5251b = i3;
        this.f5252c = i4;
        this.f5253d = i5;
        this.f5254e = i6;
        this.f5255f = m4117c(i6);
        this.f5256g = i7;
        this.f5257h = i8;
        this.f5258i = m4118d(i8);
        this.f5259j = j2;
        this.f5260k = zzagmVar;
        this.f5261l = zzapVar;
    }

    /* JADX INFO: renamed from: c */
    public static int m4117c(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m4118d(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 20) {
            return 5;
        }
        if (i2 != 24) {
            return i2 != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: a */
    public final long m4119a() {
        long j2 = this.f5259j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / ((long) this.f5254e);
    }

    /* JADX INFO: renamed from: b */
    public final zzv m4120b(byte[] bArr, zzap zzapVar) {
        bArr[4] = -128;
        zzap zzapVar2 = this.f5261l;
        if (zzapVar2 != null) {
            zzapVar = zzapVar2.m4288c(zzapVar);
        }
        zzt zztVar = new zzt();
        zztVar.m8853e("audio/flac");
        int i2 = this.f5253d;
        if (i2 <= 0) {
            i2 = -1;
        }
        zztVar.f20803o = i2;
        zztVar.f20780F = this.f5256g;
        zztVar.f20782H = this.f5254e;
        zztVar.f20783I = zzfm.m6500b(this.f5257h, ByteOrder.LITTLE_ENDIAN);
        zztVar.f20805q = Collections.singletonList(bArr);
        zztVar.f20799k = zzapVar;
        return new zzv(zztVar);
    }

    public zzagn(byte[] bArr, int i2) {
        zzet zzetVar = new zzet(bArr, bArr.length);
        zzetVar.m6341d(i2 * 8);
        this.f5250a = zzetVar.m6345h(16);
        this.f5251b = zzetVar.m6345h(16);
        this.f5252c = zzetVar.m6345h(24);
        this.f5253d = zzetVar.m6345h(24);
        int iM6345h = zzetVar.m6345h(20);
        this.f5254e = iM6345h;
        this.f5255f = m4117c(iM6345h);
        this.f5256g = zzetVar.m6345h(3) + 1;
        int iM6345h2 = zzetVar.m6345h(5) + 1;
        this.f5257h = iM6345h2;
        this.f5258i = m4118d(iM6345h2);
        this.f5259j = zzetVar.m6346i(36);
        this.f5260k = null;
        this.f5261l = null;
    }
}
