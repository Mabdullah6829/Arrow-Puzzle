package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbog extends zzbnl {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzboi f9192s;

    @Override // com.google.android.gms.internal.ads.zzbnm
    /* JADX INFO: renamed from: y1 */
    public final void mo5074y1(zzbnc zzbncVar, String str) {
        zzbnd zzbndVar;
        zzboi zzboiVar = this.f9192s;
        if (zzboiVar.f9195b == null) {
            return;
        }
        synchronized (zzboiVar) {
            zzbndVar = zzboiVar.f9196c;
            if (zzbndVar == null) {
                zzbndVar = new zzbnd(zzbncVar);
                zzboiVar.f9196c = zzbndVar;
            }
        }
        zzboiVar.f9195b.mo2738a(zzbndVar, str);
    }
}
