package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzarh implements zzara {

    /* JADX INFO: renamed from: a */
    public final zzet f6740a = new zzet(new byte[4], 4);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzark f6741b;

    public zzarh(zzark zzarkVar) {
        this.f6741b = zzarkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: b */
    public final void mo4327b(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzara
    /* JADX INFO: renamed from: c */
    public final void mo4328c(zzeu zzeuVar) {
        if (zzeuVar.m6369K() != 0 || (zzeuVar.m6369K() & 128) == 0) {
            return;
        }
        zzeuVar.m6365G(6);
        int iM6360B = zzeuVar.m6360B() / 4;
        int i2 = 0;
        while (true) {
            zzark zzarkVar = this.f6741b;
            if (i2 >= iM6360B) {
                zzarkVar.f6754g.remove(0);
                return;
            }
            zzet zzetVar = this.f6740a;
            zzeuVar.m6366H(zzetVar.f14823a, 0, 4);
            zzetVar.m6341d(0);
            int iM6345h = zzetVar.m6345h(16);
            zzetVar.m6343f(3);
            if (iM6345h == 0) {
                zzetVar.m6343f(13);
            } else {
                int iM6345h2 = zzetVar.m6345h(13);
                if (zzarkVar.f6754g.get(iM6345h2) == null) {
                    zzarkVar.f6754g.put(iM6345h2, new zzarb(new zzari(zzarkVar, iM6345h2)));
                }
            }
            i2++;
        }
    }
}
