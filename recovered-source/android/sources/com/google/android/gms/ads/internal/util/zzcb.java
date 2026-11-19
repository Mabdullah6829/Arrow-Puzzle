package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzcb {
    /* JADX INFO: renamed from: a */
    public static Object m3142a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unexpected exception.", th);
            zzcaf.m5286c(context).mo5291a("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }
}
