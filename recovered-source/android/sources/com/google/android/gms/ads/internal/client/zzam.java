package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
final class zzam extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3050b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f3051c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f3052d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzbvj f3053e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzaw f3054f;

    public zzam(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        this.f3050b = context;
        this.f3051c = zzrVar;
        this.f3052d = str;
        this.f3053e = zzbvjVar;
        this.f3054f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3050b, FirebaseAnalytics.Event.APP_OPEN);
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo2797b() {
        return this.f3054f.f3077a.m2975c(this.f3050b, this.f3051c, this.f3052d, this.f3053e, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2786O3(new ObjectWrapper(this.f3050b), this.f3051c, this.f3052d, this.f3053e, 261710000);
    }
}
