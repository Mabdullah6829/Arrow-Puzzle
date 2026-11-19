package com.google.android.gms.internal.measurement;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6462u;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwz implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C6462u f23057s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzws f23058t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Runnable f23059u;

    public zzwz(C6462u c6462u, zzws zzwsVar, Runnable runnable) {
        this.f23057s = c6462u;
        this.f23058t = zzwsVar;
        this.f23059u = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.f23057s.f24636s) != null) {
            throw null;
        }
        zzws zzwsVar = this.f23058t;
        AbstractC6452k.m12179c(zzwsVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.f23059u;
        zzwq zzwqVarM10686c = zzvy.m10686c();
        zzws zzwsVarM10685b = zzvy.m10685b(zzwqVarM10686c, zzwsVar);
        try {
            runnable.run();
            zzvy.m10685b(zzwqVarM10686c, zzwsVarM10685b);
        } catch (Throwable th) {
            try {
                zzvu.m10683a(th);
                throw th;
            } catch (Throwable th2) {
                zzvy.m10685b(zzwqVarM10686c, zzwsVarM10685b);
                throw th2;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.f23059u;
        StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }
}
