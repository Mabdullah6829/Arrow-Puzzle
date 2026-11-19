package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzal extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3045b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f3046c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f3047d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzbvj f3048e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzaw f3049f;

    public zzal(zzaw zzawVar, Context context, zzr zzrVar, String str, zzbvj zzbvjVar) {
        this.f3045b = context;
        this.f3046c = zzrVar;
        this.f3047d = str;
        this.f3048e = zzbvjVar;
        Objects.requireNonNull(zzawVar);
        this.f3049f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3045b, "banner");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo2797b() {
        return this.f3049f.f3077a.m2975c(this.f3045b, this.f3046c, this.f3047d, this.f3048e, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2785L1(new ObjectWrapper(this.f3045b), this.f3046c, this.f3047d, this.f3048e, 261710000);
    }
}
