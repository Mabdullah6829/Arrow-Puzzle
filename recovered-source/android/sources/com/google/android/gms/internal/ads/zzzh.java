package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzh extends zzbf {

    /* JADX INFO: renamed from: g */
    public static final Object f21473g = new Object();

    /* JADX INFO: renamed from: b */
    public final long f21474b;

    /* JADX INFO: renamed from: c */
    public final long f21475c;

    /* JADX INFO: renamed from: d */
    public final boolean f21476d;

    /* JADX INFO: renamed from: e */
    public final zzak f21477e;

    /* JADX INFO: renamed from: f */
    public final zzaf f21478f;

    static {
        zzz zzzVar = new zzz();
        zzzVar.f21433a = "SinglePeriodTimeline";
        zzzVar.f21434b = Uri.EMPTY;
        zzzVar.m9054a();
    }

    public zzzh(long j2, long j3, boolean z, zzak zzakVar, zzaf zzafVar) {
        this.f21474b = j2;
        this.f21475c = j3;
        this.f21476d = z;
        zzakVar.getClass();
        this.f21477e = zzakVar;
        this.f21478f = zzafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: a */
    public final int mo4735a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: b */
    public final zzbe mo4736b(int i2, zzbe zzbeVar, long j2) {
        zzgtr.m7136i(i2, 1);
        Object obj = zzbe.f7673m;
        zzbeVar.m4776a(this.f21477e, this.f21476d, false, this.f21478f, this.f21475c);
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: c */
    public final int mo4737c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: d */
    public final zzbd mo4738d(int i2, zzbd zzbdVar, boolean z) {
        zzgtr.m7136i(i2, 1);
        Object obj = z ? f21473g : null;
        zzc zzcVar = zzc.f9573b;
        zzbdVar.m4753a(null, obj, 0, this.f21474b, false);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: e */
    public final int mo4739e(Object obj) {
        return f21473g.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: f */
    public final Object mo4740f(int i2) {
        zzgtr.m7136i(i2, 1);
        return f21473g;
    }
}
