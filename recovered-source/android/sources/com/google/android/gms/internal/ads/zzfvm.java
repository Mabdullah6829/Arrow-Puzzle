package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvm implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ float f16655s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzfvn f16656t;

    public zzfvm(zzfvn zzfvnVar, float f2) {
        this.f16655s = f2;
        this.f16656t = zzfvnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwa zzfwaVar = this.f16656t.f16657s.f16664g;
        float f2 = this.f16655s;
        zzfwaVar.f16690a = f2;
        if (zzfwaVar.f16692c == null) {
            zzfwaVar.f16692c = zzfvs.f16671c;
        }
        Iterator it = Collections.unmodifiableCollection(zzfwaVar.f16692c.f16673b).iterator();
        while (it.hasNext()) {
            zzfwi zzfwiVar = ((zzfuy) it.next()).f16616d;
            zzfwiVar.getClass();
            zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setDeviceVolume", Float.valueOf(f2), zzfwiVar.f16702a);
        }
    }
}
