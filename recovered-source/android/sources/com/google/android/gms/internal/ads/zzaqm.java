package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqm implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzeu f6633a;

    /* JADX INFO: renamed from: b */
    public final zzagx f6634b;

    /* JADX INFO: renamed from: c */
    public final String f6635c;

    /* JADX INFO: renamed from: d */
    public final int f6636d;

    /* JADX INFO: renamed from: e */
    public final String f6637e;

    /* JADX INFO: renamed from: f */
    public zzahm f6638f;

    /* JADX INFO: renamed from: g */
    public String f6639g;

    /* JADX INFO: renamed from: h */
    public int f6640h = 0;

    /* JADX INFO: renamed from: i */
    public int f6641i;

    /* JADX INFO: renamed from: j */
    public boolean f6642j;

    /* JADX INFO: renamed from: k */
    public boolean f6643k;

    /* JADX INFO: renamed from: l */
    public long f6644l;

    /* JADX INFO: renamed from: m */
    public int f6645m;

    /* JADX INFO: renamed from: n */
    public long f6646n;

    public zzaqm(String str, int i2, String str2) {
        zzeu zzeuVar = new zzeu(4);
        this.f6633a = zzeuVar;
        zzeuVar.f14887a[0] = -1;
        this.f6634b = new zzagx();
        this.f6646n = -9223372036854775807L;
        this.f6635c = str;
        this.f6636d = i2;
        this.f6637e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        this.f6638f.getClass();
        while (zzeuVar.m6360B() > 0) {
            int i2 = this.f6640h;
            zzeu zzeuVar2 = this.f6633a;
            if (i2 == 0) {
                byte[] bArr = zzeuVar.f14887a;
                int i3 = zzeuVar.f14888b;
                int i4 = zzeuVar.f14889c;
                while (true) {
                    if (i3 >= i4) {
                        zzeuVar.m6363E(i4);
                        break;
                    }
                    int i5 = i3 + 1;
                    byte b = bArr[i3];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f6643k && (b & 224) == 224;
                    this.f6643k = z;
                    if (z2) {
                        zzeuVar.m6363E(i5);
                        this.f6643k = false;
                        zzeuVar2.f14887a[1] = bArr[i3];
                        this.f6641i = 2;
                        this.f6640h = 1;
                        break;
                    }
                    i3 = i5;
                }
            } else if (i2 != 1) {
                int iMin = Math.min(zzeuVar.m6360B(), this.f6645m - this.f6641i);
                this.f6638f.mo4121a(iMin, zzeuVar);
                int i6 = this.f6641i + iMin;
                this.f6641i = i6;
                if (i6 >= this.f6645m) {
                    zzgtr.m7133f(this.f6646n != -9223372036854775807L);
                    this.f6638f.mo4095b(this.f6646n, 1, this.f6645m, 0, null);
                    this.f6646n += this.f6644l;
                    this.f6641i = 0;
                    this.f6640h = 0;
                }
            } else {
                int iMin2 = Math.min(zzeuVar.m6360B(), 4 - this.f6641i);
                zzeuVar.m6366H(zzeuVar2.f14887a, this.f6641i, iMin2);
                int i7 = this.f6641i + iMin2;
                this.f6641i = i7;
                if (i7 >= 4) {
                    zzeuVar2.m6363E(0);
                    int iM6376b = zzeuVar2.m6376b();
                    zzagx zzagxVar = this.f6634b;
                    if (zzagxVar.m4127a(iM6376b)) {
                        this.f6645m = zzagxVar.f5291c;
                        if (!this.f6642j) {
                            this.f6644l = (((long) zzagxVar.f5295g) * 1000000) / ((long) zzagxVar.f5292d);
                            zzt zztVar = new zzt();
                            zztVar.f20789a = this.f6639g;
                            zztVar.m8852d(this.f6637e);
                            zztVar.m8853e(zzagxVar.f5290b);
                            zztVar.f20803o = 4096;
                            zztVar.f20780F = zzagxVar.f5293e;
                            zztVar.f20782H = zzagxVar.f5292d;
                            zztVar.f20792d = this.f6635c;
                            zztVar.f20794f = this.f6636d;
                            this.f6638f.mo4097e(new zzv(zztVar));
                            this.f6642j = true;
                        }
                        zzeuVar2.m6363E(0);
                        this.f6638f.mo4121a(4, zzeuVar2);
                        this.f6640h = 2;
                    } else {
                        this.f6641i = 0;
                        this.f6640h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6646n = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6639g = zzaroVar.f6773e;
        zzaroVar.m4340b();
        this.f6638f = zzagdVar.mo4109f(zzaroVar.f6772d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6640h = 0;
        this.f6641i = 0;
        this.f6643k = false;
        this.f6646n = -9223372036854775807L;
    }
}
