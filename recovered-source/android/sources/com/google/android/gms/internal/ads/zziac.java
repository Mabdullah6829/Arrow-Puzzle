package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zziac {

    /* JADX INFO: renamed from: s */
    public static final zziac f19558s;

    /* JADX INFO: renamed from: t */
    public static final zziac f19559t;

    /* JADX INFO: renamed from: u */
    public static final zziac f19560u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ zziac[] f19561v;

    static {
        zziac zziacVar = new zziac("NIST_P256", 0);
        f19558s = zziacVar;
        zziac zziacVar2 = new zziac("NIST_P384", 1);
        f19559t = zziacVar2;
        zziac zziacVar3 = new zziac("NIST_P521", 2);
        f19560u = zziacVar3;
        f19561v = new zziac[]{zziacVar, zziacVar2, zziacVar3};
    }

    public static zziac[] values() {
        return (zziac[]) f19561v.clone();
    }
}
