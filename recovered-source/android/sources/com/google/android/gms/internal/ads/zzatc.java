package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatc {

    /* JADX INFO: renamed from: a */
    public final Executor f6871a;

    public zzatc(Handler handler) {
        this.f6871a = new zzata(this, handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m4385a(zzatl zzatlVar, zzatr zzatrVar, Runnable runnable) {
        synchronized (zzatlVar.f6895w) {
            zzatlVar.f6887A = true;
        }
        zzatlVar.m4390b("post-response");
        ((zzata) this.f6871a).f6867s.post(new zzatb(zzatlVar, zzatrVar, runnable));
    }
}
