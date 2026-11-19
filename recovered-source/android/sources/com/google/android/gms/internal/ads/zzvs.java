package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvs extends Exception {

    /* JADX INFO: renamed from: s */
    public final String f21124s;

    /* JADX INFO: renamed from: t */
    public final zzvp f21125t;

    /* JADX INFO: renamed from: u */
    public final String f21126u;

    public zzvs(zzv zzvVar, zzwa zzwaVar, int i2) {
        String string = zzvVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 25 + string.length());
        sb.append("Decoder init failed: [");
        sb.append(i2);
        sb.append("], ");
        sb.append(string);
        String string2 = sb.toString();
        String str = zzvVar.f21061o;
        int iAbs = Math.abs(i2);
        this(string2, zzwaVar, str, null, AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iAbs).length() + 60), "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", iAbs));
    }

    public zzvs(String str, Throwable th, String str2, zzvp zzvpVar, String str3) {
        super(str, th);
        this.f21124s = str2;
        this.f21125t = zzvpVar;
        this.f21126u = str3;
    }
}
