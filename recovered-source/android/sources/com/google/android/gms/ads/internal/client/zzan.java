package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
final class zzan extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f3056c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f3057d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzbvf f3058e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzaw f3059f;

    public zzan(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvf zzbvfVar) {
        this.f3055b = context;
        this.f3056c = zzrVar;
        this.f3057d = str;
        this.f3058e = zzbvfVar;
        this.f3059f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3055b, "interstitial");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo2797b() {
        return this.f3059f.f3077a.m2975c(this.f3055b, this.f3056c, this.f3057d, this.f3058e, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2793i1(new ObjectWrapper(this.f3055b), this.f3056c, this.f3057d, this.f3058e, 261710000);
    }
}
