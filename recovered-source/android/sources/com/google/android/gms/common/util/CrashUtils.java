package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class CrashUtils {
    /* JADX INFO: renamed from: a */
    public static void m3642a(Context context, Throwable th) {
        try {
            Preconditions.m3544h(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
