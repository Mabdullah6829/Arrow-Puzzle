package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzeo implements Runnable {

    /* JADX INFO: renamed from: s */
    public final long f22452s;

    /* JADX INFO: renamed from: t */
    public final long f22453t;

    /* JADX INFO: renamed from: u */
    public final boolean f22454u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzez f22455v;

    public zzeo(zzez zzezVar, boolean z) {
        Objects.requireNonNull(zzezVar);
        this.f22455v = zzezVar;
        zzezVar.f22476a.getClass();
        this.f22452s = System.currentTimeMillis();
        this.f22453t = SystemClock.elapsedRealtime();
        this.f22454u = z;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9837a();

    /* JADX INFO: renamed from: b */
    public void mo9838b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.f22455v;
        if (zzezVar.f22481f) {
            mo9838b();
            return;
        }
        try {
            mo9837a();
        } catch (Exception e) {
            zzezVar.m9861m(e, false, this.f22454u);
            mo9838b();
        }
    }
}
