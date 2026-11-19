package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdzx implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f13434a;

    /* JADX INFO: renamed from: b */
    public final zzinl f13435b;

    /* JADX INFO: renamed from: c */
    public final zzini f13436c;

    public zzdzx(zzimy zzimyVar, zzinl zzinlVar, zzimy zzimyVar2) {
        this.f13434a = zzimyVar;
        this.f13435b = zzinlVar;
        this.f13436c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdzw((zzdzo) this.f13434a.zzb(), this.f13435b.zzb(), (Clock) this.f13436c.zzb());
    }
}
