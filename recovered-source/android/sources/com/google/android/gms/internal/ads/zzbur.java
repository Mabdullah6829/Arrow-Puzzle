package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbur implements zzcgf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcgd f9407a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbtv f9408b;

    public zzbur(zzbtv zzbtvVar, zzbut zzbutVar, zzcgd zzcgdVar) {
        this.f9407a = zzcgdVar;
        this.f9408b = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.m3150k("callJs > getEngine: Promise rejected");
        this.f9407a.m5398b(new zzbue("Unable to obtain a JavascriptEngine."));
        this.f9408b.m5136d();
    }
}
