package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzafl {

    /* JADX INFO: renamed from: c */
    public static final zzafl f22093c = new zzafl();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f22095b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final zzaet f22094a = new zzaet();

    private zzafl() {
    }

    /* JADX INFO: renamed from: a */
    public final zzafp m9649a(Class cls) {
        zzafp zzafgVar;
        ConcurrentHashMap concurrentHashMap = this.f22095b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzafp) obj;
        }
        zzaet zzaetVar = this.f22094a;
        zzaetVar.getClass();
        zzagb zzagbVar = zzafq.f22104a;
        if (!zzadu.class.isAssignableFrom(cls)) {
            int i2 = zzacf.f21956a;
        }
        zzaez zzaezVarMo9551b = zzaetVar.f22064a.mo9551b(cls);
        if (zzaezVarMo9551b.zza()) {
            int i3 = zzacf.f21956a;
            zzafgVar = new zzafg(zzafq.f22104a, zzadi.f22015a, zzaezVarMo9551b.zzb());
        } else {
            int i4 = zzacf.f21956a;
            int i5 = zzafi.f22092a;
            int i6 = zzaep.f22057a;
            zzagb zzagbVar2 = zzafq.f22104a;
            zzadh zzadhVar = zzaezVarMo9551b.zzc() + (-1) != 1 ? zzadi.f22015a : null;
            int i7 = zzaey.f22071a;
            zzafgVar = zzaff.m9619z(zzaezVarMo9551b, zzagbVar2, zzadhVar);
        }
        zzafp zzafpVar = (zzafp) concurrentHashMap.putIfAbsent(cls, zzafgVar);
        return zzafpVar != null ? zzafpVar : zzafgVar;
    }
}
