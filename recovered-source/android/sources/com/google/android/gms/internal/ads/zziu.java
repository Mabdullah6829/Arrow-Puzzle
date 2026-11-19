package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
public final class zziu {

    /* JADX INFO: renamed from: a */
    public byte[] f20036a;

    /* JADX INFO: renamed from: b */
    public byte[] f20037b;

    /* JADX INFO: renamed from: c */
    public int f20038c;

    /* JADX INFO: renamed from: d */
    public int[] f20039d;

    /* JADX INFO: renamed from: e */
    public int[] f20040e;

    /* JADX INFO: renamed from: f */
    public int f20041f;

    /* JADX INFO: renamed from: g */
    public int f20042g;

    /* JADX INFO: renamed from: h */
    public int f20043h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f20044i;

    /* JADX INFO: renamed from: j */
    public final zzit f20045j;

    public zziu() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f20044i = cryptoInfo;
        this.f20045j = new zzit(cryptoInfo);
    }

    /* JADX INFO: renamed from: a */
    public final void m8565a(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f20039d == null) {
            int[] iArr = new int[1];
            this.f20039d = iArr;
            this.f20044i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f20039d;
        iArr2[0] = iArr2[0] + i2;
    }
}
