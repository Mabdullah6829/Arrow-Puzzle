package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzang {

    /* JADX INFO: renamed from: b */
    public zzahm f6113b;

    /* JADX INFO: renamed from: c */
    public zzagd f6114c;

    /* JADX INFO: renamed from: d */
    public zzanc f6115d;

    /* JADX INFO: renamed from: e */
    public long f6116e;

    /* JADX INFO: renamed from: f */
    public long f6117f;

    /* JADX INFO: renamed from: g */
    public long f6118g;

    /* JADX INFO: renamed from: h */
    public int f6119h;

    /* JADX INFO: renamed from: i */
    public int f6120i;

    /* JADX INFO: renamed from: k */
    public long f6122k;

    /* JADX INFO: renamed from: l */
    public boolean f6123l;

    /* JADX INFO: renamed from: m */
    public boolean f6124m;

    /* JADX INFO: renamed from: a */
    public final zzana f6112a = new zzana();

    /* JADX INFO: renamed from: j */
    public zzane f6121j = new zzane();

    /* JADX INFO: renamed from: a */
    public void mo4229a(boolean z) {
        int i2;
        if (z) {
            this.f6121j = new zzane();
            this.f6117f = 0L;
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.f6119h = i2;
        this.f6116e = -1L;
        this.f6118g = 0L;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo4230b(zzeu zzeuVar);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4231c(zzeu zzeuVar, long j2, zzane zzaneVar);

    /* JADX INFO: renamed from: d */
    public void mo4239d(long j2) {
        this.f6118g = j2;
    }
}
