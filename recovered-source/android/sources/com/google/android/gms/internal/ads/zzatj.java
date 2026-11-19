package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzatj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f6884s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ long f6885t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzatl f6886u;

    public zzatj(zzatl zzatlVar, String str, long j2) {
        this.f6884s = str;
        this.f6885t = j2;
        this.f6886u = zzatlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatl zzatlVar = this.f6886u;
        zzatlVar.f6891s.m4400a(this.f6884s, this.f6885t);
        zzatlVar.f6891s.m4401b(zzatlVar.toString());
    }
}
