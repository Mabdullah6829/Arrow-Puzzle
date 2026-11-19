package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvb {

    /* JADX INFO: renamed from: c */
    public static final zzhvb f19204c = new zzhvb("NIST_P256", zzhlt.f18949a);

    /* JADX INFO: renamed from: d */
    public static final zzhvb f19205d = new zzhvb("NIST_P384", zzhlt.f18950b);

    /* JADX INFO: renamed from: e */
    public static final zzhvb f19206e = new zzhvb("NIST_P521", zzhlt.f18951c);

    /* JADX INFO: renamed from: a */
    public final String f19207a;

    /* JADX INFO: renamed from: b */
    public final ECParameterSpec f19208b;

    public zzhvb(String str, ECParameterSpec eCParameterSpec) {
        this.f19207a = str;
        this.f19208b = eCParameterSpec;
    }

    public final String toString() {
        return this.f19207a;
    }
}
