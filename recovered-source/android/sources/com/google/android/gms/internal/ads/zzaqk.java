package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqk implements zzaqa {

    /* JADX INFO: renamed from: b */
    public zzahm f6606b;

    /* JADX INFO: renamed from: c */
    public boolean f6607c;

    /* JADX INFO: renamed from: e */
    public int f6609e;

    /* JADX INFO: renamed from: f */
    public int f6610f;

    /* JADX INFO: renamed from: a */
    public final zzeu f6605a = new zzeu(10);

    /* JADX INFO: renamed from: d */
    public long f6608d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
        int i2;
        this.f6606b.getClass();
        if (this.f6607c && (i2 = this.f6609e) != 0 && this.f6610f == i2) {
            zzgtr.m7133f(this.f6608d != -9223372036854775807L);
            this.f6606b.mo4095b(this.f6608d, 1, this.f6609e, 0, null);
            this.f6607c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        this.f6606b.getClass();
        if (this.f6607c) {
            int iM6360B = zzeuVar.m6360B();
            int i2 = this.f6610f;
            if (i2 < 10) {
                int iMin = Math.min(iM6360B, 10 - i2);
                byte[] bArr = zzeuVar.f14887a;
                int i3 = zzeuVar.f14888b;
                zzeu zzeuVar2 = this.f6605a;
                System.arraycopy(bArr, i3, zzeuVar2.f14887a, this.f6610f, iMin);
                if (this.f6610f + iMin == 10) {
                    zzeuVar2.m6363E(0);
                    if (zzeuVar2.m6369K() != 73 || zzeuVar2.m6369K() != 68 || zzeuVar2.m6369K() != 51) {
                        zzeh.m6211c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f6607c = false;
                        return;
                    } else {
                        zzeuVar2.m6365G(3);
                        this.f6609e = zzeuVar2.m6381g() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iM6360B, this.f6609e - this.f6610f);
            this.f6606b.mo4121a(iMin2, zzeuVar);
            this.f6610f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f6607c = true;
        this.f6608d = j2;
        this.f6609e = 0;
        this.f6610f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 5);
        this.f6606b = zzahmVarMo4109f;
        zzt zztVar = new zzt();
        zzaroVar.m4340b();
        zztVar.f20789a = zzaroVar.f6773e;
        zztVar.m8852d("video/mp2t");
        zztVar.m8853e("application/id3");
        zzahmVarMo4109f.mo4097e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6607c = false;
        this.f6608d = -9223372036854775807L;
    }
}
