package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

/* JADX INFO: loaded from: classes.dex */
public class InstantApps {

    /* JADX INFO: renamed from: a */
    public static Context f4660a;

    /* JADX INFO: renamed from: b */
    public static Boolean f4661b;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m3661a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f4660a;
        if (context2 != null && (bool = f4661b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f4661b = null;
        if (PlatformVersion.m3653a()) {
            f4661b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f4661b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f4661b = Boolean.FALSE;
            }
        }
        f4660a = applicationContext;
        return f4661b.booleanValue();
    }
}
