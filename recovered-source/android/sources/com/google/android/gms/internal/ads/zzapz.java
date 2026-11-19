package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzapz implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final List f6499a;

    /* JADX INFO: renamed from: b */
    public final zzahm[] f6500b;

    /* JADX INFO: renamed from: c */
    public boolean f6501c;

    /* JADX INFO: renamed from: d */
    public int f6502d;

    /* JADX INFO: renamed from: e */
    public int f6503e;

    /* JADX INFO: renamed from: f */
    public long f6504f = -9223372036854775807L;

    public zzapz(List list) {
        this.f6499a = list;
        this.f6500b = new zzahm[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
        if (!this.f6501c) {
            return;
        }
        zzgtr.m7133f(this.f6504f != -9223372036854775807L);
        int i2 = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.f6500b;
            if (i2 >= zzahmVarArr.length) {
                this.f6501c = false;
                return;
            } else {
                zzahmVarArr[i2].mo4095b(this.f6504f, 1, this.f6503e, 0, null);
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        boolean z;
        boolean z2;
        if (!this.f6501c) {
            return;
        }
        int i2 = 0;
        if (this.f6502d == 2) {
            if (zzeuVar.m6360B() == 0) {
                z2 = false;
            } else {
                if (zzeuVar.m6369K() != 32) {
                    this.f6501c = false;
                }
                this.f6502d--;
                z2 = this.f6501c;
            }
            if (!z2) {
                return;
            }
        }
        if (this.f6502d == 1) {
            if (zzeuVar.m6360B() == 0) {
                z = false;
            } else {
                if (zzeuVar.m6369K() != 0) {
                    this.f6501c = false;
                }
                this.f6502d--;
                z = this.f6501c;
            }
            if (!z) {
                return;
            }
        }
        int i3 = zzeuVar.f14888b;
        int iM6360B = zzeuVar.m6360B();
        while (true) {
            zzahm[] zzahmVarArr = this.f6500b;
            if (i2 >= zzahmVarArr.length) {
                this.f6503e += iM6360B;
                return;
            }
            zzahm zzahmVar = zzahmVarArr[i2];
            zzeuVar.m6363E(i3);
            zzahmVar.mo4121a(iM6360B, zzeuVar);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f6501c = true;
        this.f6504f = j2;
        this.f6503e = 0;
        this.f6502d = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        int i2 = 0;
        while (true) {
            zzahm[] zzahmVarArr = this.f6500b;
            if (i2 >= zzahmVarArr.length) {
                return;
            }
            zzarl zzarlVar = (zzarl) this.f6499a.get(i2);
            zzaroVar.m4339a();
            zzaroVar.m4340b();
            zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 3);
            zzt zztVar = new zzt();
            zzaroVar.m4340b();
            zztVar.f20789a = zzaroVar.f6773e;
            zztVar.m8852d("video/mp2t");
            zztVar.m8853e("application/dvbsubs");
            zztVar.f20805q = Collections.singletonList(zzarlVar.f6765b);
            zztVar.f20792d = zzarlVar.f6764a;
            zzahmVarMo4109f.mo4097e(new zzv(zztVar));
            zzahmVarArr[i2] = zzahmVarMo4109f;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6501c = false;
        this.f6504f = -9223372036854775807L;
    }
}
