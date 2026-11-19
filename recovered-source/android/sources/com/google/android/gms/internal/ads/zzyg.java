package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class zzyg {

    /* JADX INFO: renamed from: s */
    public static final zzyg f21328s;

    /* JADX INFO: renamed from: t */
    public static final zzyg f21329t;

    /* JADX INFO: renamed from: u */
    public static final zzyg f21330u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ zzyg[] f21331v;

    static {
        zzyg zzygVar = new zzyg("PASS_THROUGH", 0);
        f21328s = zzygVar;
        zzyg zzygVar2 = new zzyg("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f21329t = zzygVar2;
        zzyg zzygVar3 = new zzyg("DISCARDING", 2);
        f21330u = zzygVar3;
        f21331v = new zzyg[]{zzygVar, zzygVar2, zzygVar3};
    }

    public static zzyg[] values() {
        return (zzyg[]) f21331v.clone();
    }
}
