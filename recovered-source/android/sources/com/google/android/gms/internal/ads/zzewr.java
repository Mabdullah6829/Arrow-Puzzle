package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewr implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final int f15054a;

    /* JADX INFO: renamed from: b */
    public final boolean f15055b;

    /* JADX INFO: renamed from: c */
    public final boolean f15056c;

    /* JADX INFO: renamed from: d */
    public final int f15057d;

    /* JADX INFO: renamed from: e */
    public final int f15058e;

    /* JADX INFO: renamed from: f */
    public final int f15059f;

    /* JADX INFO: renamed from: g */
    public final int f15060g;

    /* JADX INFO: renamed from: h */
    public final int f15061h;

    /* JADX INFO: renamed from: i */
    public final float f15062i;

    /* JADX INFO: renamed from: j */
    public final boolean f15063j;

    /* JADX INFO: renamed from: k */
    public final boolean f15064k;

    public zzewr(int i2, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z3, boolean z4) {
        this.f15054a = i2;
        this.f15055b = z;
        this.f15056c = z2;
        this.f15057d = i3;
        this.f15058e = i4;
        this.f15059f = i5;
        this.f15060g = i6;
        this.f15061h = i7;
        this.f15062i = f2;
        this.f15063j = z3;
        this.f15064k = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8754sc)).booleanValue()) {
            bundle.putInt("muv_min", this.f15058e);
            bundle.putInt("muv_max", this.f15059f);
        }
        bundle.putFloat("android_app_volume", this.f15062i);
        bundle.putBoolean("android_app_muted", this.f15063j);
        if (this.f15064k) {
            return;
        }
        bundle.putInt("am", this.f15054a);
        bundle.putBoolean("ma", this.f15055b);
        bundle.putBoolean("sp", this.f15056c);
        bundle.putInt("muv", this.f15057d);
        bundle.putInt("rm", this.f15060g);
        bundle.putInt("riv", this.f15061h);
    }
}
