package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzjg implements zzabm {

    /* JADX INFO: renamed from: a */
    public final HashMap f20105a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final zzqh f20106b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzji f20107c;

    public zzjg(zzji zzjiVar, zzqh zzqhVar) {
        this.f20107c = zzjiVar;
        this.f20106b = zzqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: a */
    public final synchronized void mo3928a(zzabl zzablVar) {
        this.f20107c.f20115c.mo3928a(zzablVar);
        while (zzablVar != null) {
            m8613c(zzablVar.mo3927d());
            zzablVar = zzablVar.mo3926a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3929b(zzabk zzabkVar) {
        this.f20107c.f20115c.mo3929b(zzabkVar);
        m8613c(zzabkVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m8613c(zzabk zzabkVar) {
        zzqh zzqhVar = (zzqh) this.f20105a.remove(zzabkVar);
        zzqhVar.getClass();
        zzjh zzjhVar = (zzjh) this.f20107c.f20126n.get(zzqhVar);
        if (zzjhVar != null) {
            synchronized (zzjhVar) {
                zzjhVar.f20111d--;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: d */
    public final synchronized void mo3930d() {
        this.f20107c.f20115c.mo3930d();
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized zzabk zza() {
        zzabk zzabkVarZza;
        zzji zzjiVar = this.f20107c;
        zzabs zzabsVar = zzjiVar.f20115c;
        HashMap map = this.f20105a;
        zzabkVarZza = zzabsVar.zza();
        zzqh zzqhVar = this.f20106b;
        map.put(zzabkVarZza, zzqhVar);
        zzjh zzjhVar = (zzjh) zzjiVar.f20126n.get(zzqhVar);
        if (zzjhVar != null) {
            synchronized (zzjhVar) {
                zzjhVar.f20111d++;
            }
        }
        return zzabkVarZza;
    }
}
