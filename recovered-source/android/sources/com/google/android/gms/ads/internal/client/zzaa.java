package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcdb;

/* JADX INFO: loaded from: classes.dex */
final class zzaa extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3029b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3030c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbvf f3031d;

    public zzaa(zzaw zzawVar, Context context, String str, zzbvf zzbvfVar) {
        this.f3029b = context;
        this.f3030c = str;
        this.f3031d = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3029b, "rewarded");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2797b() {
        return zzcdb.m5347a(this.f3029b, this.f3030c, this.f3031d);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2784J1(new ObjectWrapper(this.f3029b), this.f3030c, this.f3031d, 261710000);
    }
}
