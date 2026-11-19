package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtz implements zzcgh {
    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5135b(Object obj) {
        final zzbsw zzbswVar = (zzbsw) obj;
        ((zzcfx) zzcfy.f9951f).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbty
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zze.m3150k("maybeDestroy > Destroying engine.");
                zzbqo zzbqoVar = zzbpw.f9235o;
                zzbsw zzbswVar2 = zzbswVar;
                zzbswVar2.mo5133n("/result", zzbqoVar);
                zzbswVar2.zzj();
            }
        });
    }
}
