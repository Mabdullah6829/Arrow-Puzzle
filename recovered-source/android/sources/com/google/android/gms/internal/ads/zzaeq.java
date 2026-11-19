package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeq {

    /* JADX INFO: renamed from: a */
    public final Handler f5132a;

    /* JADX INFO: renamed from: b */
    public final zzaer f5133b;

    public zzaeq(Handler handler, zzaer zzaerVar) {
        if (zzaerVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f5132a = handler;
        this.f5133b = zzaerVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m4047a(final zzbv zzbvVar) {
        Handler handler = this.f5132a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaej
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    String str = zzfm.f16091a;
                    this.f5120s.f5133b.mo4051d(zzbvVar);
                }
            });
        }
    }
}
