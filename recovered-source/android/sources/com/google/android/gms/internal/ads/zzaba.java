package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaba {

    /* JADX INFO: renamed from: a */
    public final zzbg f4835a;

    /* JADX INFO: renamed from: b */
    public final int[] f4836b;

    public zzaba(zzbg zzbgVar, int[] iArr) {
        if (iArr.length == 0) {
            zzeh.m6214f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f4835a = zzbgVar;
        this.f4836b = iArr;
    }
}
