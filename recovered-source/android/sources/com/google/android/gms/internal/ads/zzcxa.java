package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcxa implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzepe f11665a;

    /* JADX INFO: renamed from: b */
    public final zzerd f11666b;

    public zzcxa(zzepe zzepeVar, zzerd zzerdVar) {
        this.f11665a = zzepeVar;
        this.f11666b = zzerdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8026B6);
        bool.booleanValue();
        return true == bool.booleanValue() ? this.f11665a.zzb() : this.f11666b.zzb();
    }
}
