package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzqd implements zzpm {

    /* JADX INFO: renamed from: a */
    public final zzqm f22756a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzqe f22757b;

    public zzqd(zzqe zzqeVar, zzqm zzqmVar) {
        Objects.requireNonNull(zzqeVar);
        this.f22757b = zzqeVar;
        this.f22756a = zzqmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    /* JADX INFO: renamed from: a */
    public final void mo10585a(zzpl zzplVar) {
        Iterator it = this.f22757b.f22763f.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((zzqc) it.next()).mo10579a((zzaef) zzplVar.m10584A()) && !z) {
                this.f22756a.zza();
                z = true;
            }
        }
    }
}
