package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzars {

    /* JADX INFO: renamed from: a */
    public final List f6775a;

    /* JADX INFO: renamed from: b */
    public final zzahm[] f6776b;

    /* JADX INFO: renamed from: c */
    public final zzhb f6777c;

    public zzars(List list) {
        this.f6775a = list;
        this.f6776b = new zzahm[list.size()];
        zzhb zzhbVar = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarr
            @Override // com.google.android.gms.internal.ads.zzha
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo4203a(long j2, zzeu zzeuVar) {
                zzafn.m4072b(j2, zzeuVar, this.f6774a.f6776b);
            }
        });
        this.f6777c = zzhbVar;
        zzhbVar.m7336a(3);
    }

    /* JADX INFO: renamed from: a */
    public final void m4342a(zzagd zzagdVar, zzaro zzaroVar) {
        int i2 = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.f6776b;
            if (i2 >= zzahmVarArr.length) {
                return;
            }
            zzaroVar.m4339a();
            zzaroVar.m4340b();
            zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 3);
            zzv zzvVar = (zzv) this.f6775a.get(i2);
            String str = zzvVar.f21061o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgtr.m7132e("Invalid closed caption MIME type provided: %s", z, str);
            zzt zztVar = new zzt();
            zzaroVar.m4340b();
            zztVar.f20789a = zzaroVar.f6773e;
            zztVar.m8852d("video/mp2t");
            zztVar.m8853e(str);
            zztVar.f20793e = zzvVar.f21051e;
            zztVar.f20792d = zzvVar.f21050d;
            zztVar.f20786L = zzvVar.f21043M;
            zztVar.f20805q = zzvVar.f21064r;
            zzahmVarMo4109f.mo4097e(new zzv(zztVar));
            zzahmVarArr[i2] = zzahmVarMo4109f;
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4343b(long j2, zzeu zzeuVar) {
        if (zzeuVar.m6360B() < 9) {
            return;
        }
        int iM6376b = zzeuVar.m6376b();
        int iM6376b2 = zzeuVar.m6376b();
        int iM6369K = zzeuVar.m6369K();
        if (iM6376b == 434 && iM6376b2 == 1195456820 && iM6369K == 3) {
            this.f6777c.m7337b(j2, zzeuVar);
        }
    }
}
