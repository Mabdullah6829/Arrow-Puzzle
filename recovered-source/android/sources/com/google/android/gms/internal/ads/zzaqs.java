package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqs implements zzara {

    /* JADX INFO: renamed from: a */
    public zzv f6676a;

    /* JADX INFO: renamed from: b */
    public zzfj f6677b;

    /* JADX INFO: renamed from: c */
    public zzahm f6678c;

    public zzaqs(String str) {
        zzt zztVar = new zzt();
        zztVar.m8852d("video/mp2t");
        zztVar.m8853e(str);
        this.f6676a = new zzv(zztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: b */
    public final void mo4327b(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.f6677b = zzfjVar;
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 5);
        this.f6678c = zzahmVarMo4109f;
        zzahmVarMo4109f.mo4097e(this.f6676a);
    }

    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: c */
    public final void mo4328c(zzeu zzeuVar) {
        long jM6464a;
        long j2;
        this.f6677b.getClass();
        String str = zzfm.f16091a;
        zzfj zzfjVar = this.f6677b;
        synchronized (zzfjVar) {
            try {
                long j3 = zzfjVar.f15788c;
                jM6464a = j3 != -9223372036854775807L ? j3 + zzfjVar.f15787b : zzfjVar.m6464a();
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfj zzfjVar2 = this.f6677b;
        synchronized (zzfjVar2) {
            j2 = zzfjVar2.f15787b;
        }
        if (jM6464a == -9223372036854775807L || j2 == -9223372036854775807L) {
            return;
        }
        zzv zzvVar = this.f6676a;
        if (j2 != zzvVar.f21066t) {
            zzt zztVar = new zzt(zzvVar);
            zztVar.f20807s = j2;
            zzv zzvVar2 = new zzv(zztVar);
            this.f6676a = zzvVar2;
            this.f6678c.mo4097e(zzvVar2);
        }
        int iM6360B = zzeuVar.m6360B();
        this.f6678c.mo4121a(iM6360B, zzeuVar);
        this.f6678c.mo4095b(jM6464a, 1, iM6360B, 0, null);
    }
}
