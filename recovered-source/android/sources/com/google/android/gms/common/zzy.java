package com.google.android.gms.common;

/* JADX INFO: loaded from: classes.dex */
public class zzy {

    /* JADX INFO: renamed from: d */
    public static final zzy f4708d = new zzy(true, null, null);

    /* JADX INFO: renamed from: a */
    public final boolean f4709a;

    /* JADX INFO: renamed from: b */
    public final String f4710b;

    /* JADX INFO: renamed from: c */
    public final Throwable f4711c;

    public zzy(boolean z, String str, Exception exc) {
        this.f4709a = z;
        this.f4710b = str;
        this.f4711c = exc;
    }

    /* JADX INFO: renamed from: b */
    public static zzy m3674b(String str) {
        return new zzy(false, str, null);
    }

    /* JADX INFO: renamed from: c */
    public static zzy m3675c(String str, Exception exc) {
        return new zzy(false, str, exc);
    }

    /* JADX INFO: renamed from: a */
    public String mo3673a() {
        return this.f4710b;
    }
}
