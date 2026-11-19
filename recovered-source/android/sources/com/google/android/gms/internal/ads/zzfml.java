package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfml {

    /* JADX INFO: renamed from: a */
    public static Task f16111a;

    /* JADX INFO: renamed from: b */
    public static com.google.android.gms.internal.appset.zzr f16112b;

    /* JADX INFO: renamed from: c */
    public static final Object f16113c = new Object();

    /* JADX INFO: renamed from: a */
    public static void m6536a(Context context, boolean z) {
        synchronized (f16113c) {
            try {
                if (f16112b == null) {
                    f16112b = new com.google.android.gms.internal.appset.zzr(context);
                }
                Task task = f16111a;
                if (task == null || ((task.isComplete() && !f16111a.isSuccessful()) || (z && f16111a.isComplete()))) {
                    try {
                        com.google.android.gms.internal.appset.zzr zzrVar = f16112b;
                        Preconditions.m3545i(zzrVar, "the appSetIdClient shouldn't be null");
                        f16111a = zzrVar.mo3367a();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        String message = e.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 31);
                        sb.append("Failed to get app set ID info: ");
                        sb.append(message);
                        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
                        f16111a = Tasks.m10775e(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
