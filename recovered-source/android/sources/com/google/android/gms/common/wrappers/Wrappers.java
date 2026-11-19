package com.google.android.gms.common.wrappers;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Wrappers {

    /* JADX INFO: renamed from: b */
    public static final Wrappers f4663b = new Wrappers();

    /* JADX INFO: renamed from: a */
    public PackageManagerWrapper f4664a = null;

    /* JADX INFO: renamed from: a */
    public static PackageManagerWrapper m3665a(Context context) {
        PackageManagerWrapper packageManagerWrapper;
        Wrappers wrappers = f4663b;
        synchronized (wrappers) {
            try {
                if (wrappers.f4664a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    wrappers.f4664a = new PackageManagerWrapper(context);
                }
                packageManagerWrapper = wrappers.f4664a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageManagerWrapper;
    }
}
