package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzdpm implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdpw f12539a;

    public zzdpm(zzdpw zzdpwVar) {
        this.f12539a = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzcgd zzcgdVar;
        zzdpw zzdpwVar = this.f12539a;
        zzdqb zzdqbVar = zzdpwVar.f12568m;
        zzclb zzclbVar = (zzclb) obj;
        synchronized (zzdqbVar) {
            zzdqbVar.f12620k = zzclbVar;
        }
        zzdqb zzdqbVar2 = zzdpwVar.f12568m;
        synchronized (zzdqbVar2) {
            zzcgdVar = zzdqbVar2.f12623n;
        }
        zzelv zzelvVarM5979f = zzdpwVar.m5979f("Google", true);
        if (zzelvVarM5979f != null && zzcgdVar != null) {
            zzcgdVar.m5397a(zzelvVarM5979f);
        } else if (zzcgdVar != null) {
            zzcgdVar.cancel(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8697p6)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("omid native display exp", th);
        }
    }
}
