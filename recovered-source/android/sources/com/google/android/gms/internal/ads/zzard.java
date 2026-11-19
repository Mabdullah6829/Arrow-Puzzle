package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzard {

    /* JADX INFO: renamed from: a */
    public final List f6726a;

    /* JADX INFO: renamed from: b */
    public final zzahm[] f6727b;

    /* JADX INFO: renamed from: c */
    public final zzhb f6728c = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzarc
        @Override // com.google.android.gms.internal.ads.zzha
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo4203a(long j2, zzeu zzeuVar) {
            zzafn.m4071a(j2, zzeuVar, this.f6725a.f6727b);
        }
    });

    public zzard(List list) {
        this.f6726a = list;
        this.f6727b = new zzahm[list.size()];
    }

    /* JADX INFO: renamed from: a */
    public final void m4336a(zzagd zzagdVar, zzaro zzaroVar) {
        int i2 = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.f6727b;
            if (i2 >= zzahmVarArr.length) {
                return;
            }
            zzaroVar.m4339a();
            zzaroVar.m4340b();
            zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 3);
            zzv zzvVar = (zzv) this.f6726a.get(i2);
            String str = zzvVar.f21061o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzgtr.m7132e("Invalid closed caption MIME type provided: %s", z, str);
            String str2 = zzvVar.f21047a;
            if (str2 == null) {
                zzaroVar.m4340b();
                str2 = zzaroVar.f6773e;
            }
            zzt zztVar = new zzt();
            zztVar.f20789a = str2;
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
}
