package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzzn extends zzzq {

    /* JADX INFO: renamed from: a */
    public final HashMap f23154a;

    /* JADX INFO: renamed from: b */
    public final HashMap f23155b;

    /* JADX INFO: renamed from: c */
    public final zzzp f23156c;

    /* JADX INFO: renamed from: d */
    public final zzzo f23157d;

    public /* synthetic */ zzzn(zzzm zzzmVar) {
        HashMap map = new HashMap();
        this.f23154a = map;
        HashMap map2 = new HashMap();
        this.f23155b = map2;
        map.putAll(zzzmVar.f23150a);
        map2.putAll(zzzmVar.f23151b);
        this.f23156c = zzzmVar.f23152c;
        this.f23157d = zzzmVar.f23153d;
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    /* JADX INFO: renamed from: a */
    public final void mo10751a(zzyl zzylVar, Object obj, zzzc zzzcVar) {
        zzzp zzzpVar = (zzzp) this.f23154a.get(zzylVar);
        if (zzzpVar != null) {
            zzzpVar.mo10749a(zzylVar, obj, zzzcVar);
        } else {
            this.f23156c.mo10749a(zzylVar, obj, zzzcVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzzq
    /* JADX INFO: renamed from: b */
    public final void mo10752b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        zzzo zzzoVar = (zzzo) this.f23155b.get(zzylVar);
        if (zzzoVar != null) {
            zzzoVar.mo10750a(zzylVar, it, zzzcVar);
            return;
        }
        zzzo zzzoVar2 = this.f23157d;
        if (zzzoVar2 != null && !this.f23154a.containsKey(zzylVar)) {
            zzzoVar2.mo10750a(zzylVar, it, zzzcVar);
        } else {
            while (it.hasNext()) {
                mo10751a(zzylVar, it.next(), zzzcVar);
            }
        }
    }
}
