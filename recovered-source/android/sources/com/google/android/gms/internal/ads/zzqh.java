package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqh {

    /* JADX INFO: renamed from: c */
    public static final zzqh f20624c;

    /* JADX INFO: renamed from: a */
    public final String f20625a;

    /* JADX INFO: renamed from: b */
    public final zzqg f20626b;

    static {
        new zzqh("");
        f20624c = new zzqh("preload");
    }

    public zzqh(String str) {
        this.f20625a = str;
        this.f20626b = Build.VERSION.SDK_INT >= 31 ? new zzqg() : null;
    }
}
