package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzigj {

    /* JADX INFO: renamed from: c */
    public static final zzigj f19860c = new zzigj();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f19862b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final zzifq f19861a = new zzifq();

    private zzigj() {
    }

    /* JADX INFO: renamed from: a */
    public final zzigr m8411a(Class cls) {
        zzigr zzigdVar;
        ConcurrentHashMap concurrentHashMap = this.f19862b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (zzigr) obj;
        }
        zzifq zzifqVar = this.f19861a;
        zzifqVar.getClass();
        zzihf zzihfVar = zzigs.f19881a;
        if (!zziep.class.isAssignableFrom(cls)) {
            int i2 = zzicy.f19697a;
        }
        zzifw zzifwVarMo8323b = zzifqVar.f19831a.mo8323b(cls);
        if (zzifwVarMo8323b.zza()) {
            int i3 = zzicy.f19697a;
            zzigdVar = new zzigd(zzigs.f19881a, zziec.f19765a, zzifwVarMo8323b.zzb());
        } else {
            int i4 = zzicy.f19697a;
            int i5 = zzigg.f19859a;
            int i6 = zzifm.f19824a;
            zzihf zzihfVar2 = zzigs.f19881a;
            zzieb zziebVar = zzifwVarMo8323b.zzc() + (-1) != 1 ? zziec.f19765a : null;
            int i7 = zzifv.f19838a;
            zzigdVar = zzigc.m8381z(zzifwVarMo8323b, zzihfVar2, zziebVar);
        }
        zzigr zzigrVar = (zzigr) concurrentHashMap.putIfAbsent(cls, zzigdVar);
        return zzigrVar != null ? zzigrVar : zzigdVar;
    }
}
