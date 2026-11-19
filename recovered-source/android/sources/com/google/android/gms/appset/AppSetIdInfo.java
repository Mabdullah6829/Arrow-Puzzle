package com.google.android.gms.appset;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class AppSetIdInfo {

    /* JADX INFO: renamed from: a */
    public final String f4034a;

    /* JADX INFO: renamed from: b */
    public final int f4035b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(String str, int i2) {
        this.f4034a = str;
        this.f4035b = i2;
    }
}
