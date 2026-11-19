package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxv {

    /* JADX INFO: renamed from: a */
    public final zzxl f21304a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f21305b;

    public zzxv(CopyOnWriteArrayList copyOnWriteArrayList, zzxl zzxlVar) {
        this.f21305b = copyOnWriteArrayList;
        this.f21304a = zzxlVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzxw, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m9029a(final zzdu zzduVar) {
        for (zzxo zzxoVar : this.f21305b) {
            final ?? r2 = zzxoVar.f21284b;
            Handler handler = zzxoVar.f21283a;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzduVar.mo3942b(r2);
                }
            };
            String str = zzfm.f16091a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public zzxv() {
        this(new CopyOnWriteArrayList(), null);
    }
}
