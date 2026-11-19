package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zziat {

    /* JADX INFO: renamed from: s */
    public static final zziat f19579s;

    /* JADX INFO: renamed from: t */
    public static final zziat f19580t;

    /* JADX INFO: renamed from: u */
    public static final zziat f19581u;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ zziat[] f19582v;

    /* JADX INFO: Fake field, exist only in values array */
    zziat EF0;

    static {
        zziat zziatVar = new zziat("SHA1", 0);
        zziat zziatVar2 = new zziat("SHA224", 1);
        zziat zziatVar3 = new zziat("SHA256", 2);
        f19579s = zziatVar3;
        zziat zziatVar4 = new zziat("SHA384", 3);
        f19580t = zziatVar4;
        zziat zziatVar5 = new zziat("SHA512", 4);
        f19581u = zziatVar5;
        f19582v = new zziat[]{zziatVar, zziatVar2, zziatVar3, zziatVar4, zziatVar5};
    }

    public static zziat[] values() {
        return (zziat[]) f19582v.clone();
    }
}
