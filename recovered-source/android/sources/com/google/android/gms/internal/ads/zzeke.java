package com.google.android.gms.internal.ads;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
final class zzeke extends zzela {

    /* JADX INFO: renamed from: a */
    public Activity f14074a;

    /* JADX INFO: renamed from: b */
    public com.google.android.gms.ads.internal.overlay.zzm f14075b;

    /* JADX INFO: renamed from: c */
    public String f14076c;

    /* JADX INFO: renamed from: d */
    public String f14077d;

    @Override // com.google.android.gms.internal.ads.zzela
    /* JADX INFO: renamed from: a */
    public final zzela mo6248a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f14074a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* JADX INFO: renamed from: b */
    public final zzela mo6249b(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.f14075b = zzmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* JADX INFO: renamed from: c */
    public final zzela mo6250c(String str) {
        this.f14076c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* JADX INFO: renamed from: d */
    public final zzela mo6251d(String str) {
        this.f14077d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    /* JADX INFO: renamed from: e */
    public final zzelb mo6252e() {
        Activity activity = this.f14074a;
        if (activity != null) {
            return new zzekf(activity, this.f14075b, this.f14076c, this.f14077d);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
