package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzzs implements zzzo {
    @Override // com.google.android.gms.internal.measurement.zzzo
    /* JADX INFO: renamed from: a */
    public final void mo10750a(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        if (!zzylVar.f23099c) {
            throw new IllegalStateException("non repeating key");
        }
        if (!zzylVar.f23100d || ((zzabt) zzabt.f21924t.get()).f21925s <= 20) {
            zzylVar.mo10711a(it, zzzcVar);
            return;
        }
        while (it.hasNext()) {
            zzzcVar.mo10735a(it.next(), zzylVar.f23097a);
        }
    }
}
