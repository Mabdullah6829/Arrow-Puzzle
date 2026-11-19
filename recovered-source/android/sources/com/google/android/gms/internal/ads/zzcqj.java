package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcqj implements com.google.android.gms.ads.nonagon.signalgeneration.zzw {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11237a;

    /* JADX INFO: renamed from: b */
    public zzdcj f11238b;

    /* JADX INFO: renamed from: c */
    public com.google.android.gms.ads.nonagon.signalgeneration.zzat f11239c;

    public /* synthetic */ zzcqj(zzcpe zzcpeVar) {
        this.f11237a = zzcpeVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw mo3350a(zzdcj zzdcjVar) {
        this.f11238b = zzdcjVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzw mo3351b(com.google.android.gms.ads.nonagon.signalgeneration.zzat zzatVar) {
        this.f11239c = zzatVar;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzw
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzx zza() {
        zzinh.m8555b(zzdcj.class, this.f11238b);
        zzinh.m8555b(com.google.android.gms.ads.nonagon.signalgeneration.zzat.class, this.f11239c);
        com.google.android.gms.ads.nonagon.signalgeneration.zzat zzatVar = this.f11239c;
        new zzczg();
        new zzdbi();
        new zzeai();
        return new zzcqk(this.f11237a, zzatVar, this.f11238b);
    }
}
