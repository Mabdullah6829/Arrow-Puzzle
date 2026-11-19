package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgsl implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzgsp f18141s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Runnable f18142t;

    public /* synthetic */ zzgsl(zzgsp zzgspVar, Runnable runnable) {
        this.f18141s = zzgspVar;
        this.f18142t = runnable;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzgsp zzgspVar = this.f18141s;
        Runnable runnable = this.f18142t;
        if (zzgspVar.f18155j != null || zzgspVar.f18151f) {
            if (!zzgspVar.f18151f) {
                runnable.run();
                return;
            }
            zzgspVar.f18148c.m7110a("Waiting to bind to the service.", new Object[0]);
            ArrayList arrayList = zzgspVar.f18150e;
            synchronized (arrayList) {
                arrayList.add(runnable);
            }
            return;
        }
        zzgspVar.f18148c.m7110a("Initiate binding to the service.", new Object[0]);
        ArrayList arrayList2 = zzgspVar.f18150e;
        synchronized (arrayList2) {
            arrayList2.add(runnable);
        }
        zzgsj zzgsjVar = new zzgsj(zzgspVar);
        zzgspVar.f18154i = zzgsjVar;
        zzgspVar.f18151f = true;
        if (zzgspVar.f18147b.bindService(zzgspVar.f18152g, zzgsjVar, 1)) {
            return;
        }
        zzgspVar.f18148c.m7110a("Failed to bind to the service.", new Object[0]);
        zzgspVar.f18151f = false;
        ArrayList arrayList3 = zzgspVar.f18150e;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
    }
}
