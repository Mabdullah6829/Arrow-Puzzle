package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnl {

    /* JADX INFO: renamed from: a */
    public final int f10601a;

    /* JADX INFO: renamed from: b */
    public final int f10602b;

    /* JADX INFO: renamed from: c */
    public final int f10603c;

    public zzcnl(int i2, int i3, int i4) {
        this.f10601a = i2;
        this.f10603c = i3;
        this.f10602b = i4;
    }

    /* JADX INFO: renamed from: a */
    public static zzcnl m5676a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.f3260v) {
            return new zzcnl(3, 0, 0);
        }
        if (zzrVar.f3249A) {
            return new zzcnl(2, 0, 0);
        }
        return zzrVar.f3264z ? new zzcnl(0, 0, 0) : new zzcnl(1, zzrVar.f3262x, zzrVar.f3259u);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5677b() {
        return this.f10601a == 3;
    }
}
