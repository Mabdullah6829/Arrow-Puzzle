package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzimr {
    /* JADX INFO: renamed from: b */
    public static zzimr m8544b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzimm(cls.getSimpleName()) : new zzimo(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo8542a(String str);
}
