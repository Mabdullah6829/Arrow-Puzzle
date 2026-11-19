package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzdpl implements zzbex {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f12537s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzdpw f12538t;

    public zzdpl(zzdpw zzdpwVar, String str) {
        this.f12537s = str;
        this.f12538t = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    /* JADX INFO: renamed from: t */
    public final void mo4826t(zzbew zzbewVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8710q2)).booleanValue()) {
            if (zzbewVar.f7707j) {
                zzdpw zzdpwVar = this.f12538t;
                if (zzdpwVar.f12578w != null) {
                    zzdpwVar.f12565H.put(this.f12537s, Boolean.TRUE);
                    zzdry zzdryVar = zzdpwVar.f12578w;
                    if (zzdryVar == null) {
                        return;
                    }
                    zzdpwVar.m5994u(zzdryVar.mo6021D0(), zzdryVar.zzi(), zzdryVar.zzj(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzbewVar.f7707j) {
                    zzdpw zzdpwVar2 = this.f12538t;
                    if (zzdpwVar2.f12578w != null) {
                        zzdpwVar2.f12565H.put(this.f12537s, Boolean.TRUE);
                        zzdry zzdryVar2 = zzdpwVar2.f12578w;
                        if (zzdryVar2 == null) {
                        } else {
                            zzdpwVar2.m5994u(zzdryVar2.mo6021D0(), zzdpwVar2.f12578w.zzi(), zzdpwVar2.f12578w.zzj(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
