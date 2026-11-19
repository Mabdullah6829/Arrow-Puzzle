package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzctw implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f11409a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcuc f11410b;

    public zzctw(zzcuc zzcucVar, String str) {
        this.f11409a = str;
        this.f11410b = zzcucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo3316a(Object obj) {
        String str = (String) obj;
        zzcuc zzcucVar = this.f11410b;
        zzcucVar.f11455z.m6491a(zzcucVar.f11454y.m6641b(zzcucVar.f11452w, zzcucVar.f11453x, false, this.f11409a, str, zzcucVar.m5834d(), zzcucVar.f11443G, zzcucVar.f11447K), zzcucVar.f11442F);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        zzcuc zzcucVar = this.f11410b;
        zzcucVar.f11455z.m6491a(zzcucVar.f11454y.m6641b(zzcucVar.f11452w, zzcucVar.f11453x, false, this.f11409a, null, zzcucVar.m5834d(), zzcucVar.f11443G, zzcucVar.f11447K), null);
    }
}
