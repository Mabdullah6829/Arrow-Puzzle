package com.google.android.gms.internal.measurement;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzwr {
    /* JADX INFO: renamed from: a */
    public static void m10700a(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            m10700a(zzwsVar.zzb());
            m10702c(zzwsVar);
        } else {
            Trace.beginSection(zzwsVar.mo10675d());
            m10702c(zzwsVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10701b(zzws zzwsVar) {
        if (zzwsVar.zza() == Thread.currentThread() && zzwsVar.zzb() != null) {
            Trace.endSection();
            m10701b(zzwsVar.zzb());
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10702c(zzws zzwsVar) {
        String strMo10674a = zzwsVar.mo10674a();
        AtomicReference atomicReference = zzvy.f23008a;
        if (strMo10674a.length() > 127) {
            strMo10674a = strMo10674a.substring(0, 127);
        }
        Trace.beginSection(strMo10674a);
    }
}
