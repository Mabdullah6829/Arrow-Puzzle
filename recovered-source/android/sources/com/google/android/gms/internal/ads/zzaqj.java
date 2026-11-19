package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqj implements zzaqa {

    /* JADX INFO: renamed from: a */
    public final zzard f6591a;

    /* JADX INFO: renamed from: b */
    public String f6592b;

    /* JADX INFO: renamed from: c */
    public zzahm f6593c;

    /* JADX INFO: renamed from: d */
    public zzaqi f6594d;

    /* JADX INFO: renamed from: e */
    public boolean f6595e;

    /* JADX INFO: renamed from: l */
    public long f6602l;

    /* JADX INFO: renamed from: f */
    public final boolean[] f6596f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final zzaqr f6597g = new zzaqr(32);

    /* JADX INFO: renamed from: h */
    public final zzaqr f6598h = new zzaqr(33);

    /* JADX INFO: renamed from: i */
    public final zzaqr f6599i = new zzaqr(34);

    /* JADX INFO: renamed from: j */
    public final zzaqr f6600j = new zzaqr(39);

    /* JADX INFO: renamed from: k */
    public final zzaqr f6601k = new zzaqr(40);

    /* JADX INFO: renamed from: m */
    public long f6603m = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public final zzeu f6604n = new zzeu();

    public zzaqj(zzard zzardVar) {
        this.f6591a = zzardVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: a */
    public final void mo4303a(boolean z) {
        this.f6593c.getClass();
        String str = zzfm.f16091a;
        if (z) {
            this.f6591a.f6728c.m7338c(0);
            m4319g(0, 0, this.f6602l, this.f6603m);
            m4317e(0, 48, this.f6602l, this.f6603m);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: b */
    public final void mo4304b(zzeu zzeuVar) {
        this.f6593c.getClass();
        String str = zzfm.f16091a;
        while (zzeuVar.m6360B() > 0) {
            int i2 = zzeuVar.f14888b;
            int i3 = zzeuVar.f14889c;
            byte[] bArr = zzeuVar.f14887a;
            this.f6602l += (long) zzeuVar.m6360B();
            this.f6593c.mo4121a(zzeuVar.m6360B(), zzeuVar);
            while (i2 < i3) {
                int iM7086g = zzgr.m7086g(bArr, i2, i3, this.f6596f);
                if (iM7086g == i3) {
                    m4318f(bArr, i2, i3);
                    return;
                }
                int i4 = bArr[iM7086g + 3] & 126;
                int i5 = 3;
                if (iM7086g > 0) {
                    int i6 = iM7086g - 1;
                    if (bArr[i6] == 0) {
                        i5 = 4;
                        iM7086g = i6;
                    }
                }
                int i7 = iM7086g - i2;
                if (i7 > 0) {
                    m4318f(bArr, i2, iM7086g);
                }
                int i8 = i3 - iM7086g;
                long j2 = this.f6602l - ((long) i8);
                m4319g(i8, i7 < 0 ? -i7 : 0, j2, this.f6603m);
                m4317e(i8, i4 >> 1, j2, this.f6603m);
                i2 = iM7086g + i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: c */
    public final void mo4305c(int i2, long j2) {
        this.f6603m = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    /* JADX INFO: renamed from: d */
    public final void mo4306d(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.m4339a();
        zzaroVar.m4340b();
        this.f6592b = zzaroVar.f6773e;
        zzaroVar.m4340b();
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(zzaroVar.f6772d, 2);
        this.f6593c = zzahmVarMo4109f;
        this.f6594d = new zzaqi(zzahmVarMo4109f);
        this.f6591a.m4336a(zzagdVar, zzaroVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m4317e(int i2, int i3, long j2, long j3) {
        zzaqi zzaqiVar = this.f6594d;
        boolean z = this.f6595e;
        zzaqiVar.f6584g = false;
        zzaqiVar.f6585h = false;
        zzaqiVar.f6582e = j3;
        zzaqiVar.f6581d = 0;
        zzaqiVar.f6579b = j2;
        if (i3 >= 32 && i3 != 40) {
            if (zzaqiVar.f6586i && !zzaqiVar.f6587j) {
                if (z) {
                    zzaqiVar.m4316a(i2);
                }
                zzaqiVar.f6586i = false;
            }
            if (i3 <= 35 || i3 == 39) {
                zzaqiVar.f6585h = !zzaqiVar.f6587j;
                zzaqiVar.f6587j = true;
            }
        }
        boolean z2 = i3 >= 16 && i3 <= 21;
        zzaqiVar.f6580c = z2;
        zzaqiVar.f6583f = z2 || i3 <= 9;
        if (!this.f6595e) {
            this.f6597g.m4324b(i3);
            this.f6598h.m4324b(i3);
            this.f6599i.m4324b(i3);
        }
        this.f6600j.m4324b(i3);
        this.f6601k.m4324b(i3);
    }

    /* JADX INFO: renamed from: f */
    public final void m4318f(byte[] bArr, int i2, int i3) {
        zzaqi zzaqiVar = this.f6594d;
        if (zzaqiVar.f6583f) {
            int i4 = zzaqiVar.f6581d;
            int i5 = (i2 + 2) - i4;
            if (i5 < i3) {
                zzaqiVar.f6584g = (bArr[i5] & 128) != 0;
                zzaqiVar.f6583f = false;
            } else {
                zzaqiVar.f6581d = (i3 - i2) + i4;
            }
        }
        if (!this.f6595e) {
            this.f6597g.m4325c(bArr, i2, i3);
            this.f6598h.m4325c(bArr, i2, i3);
            this.f6599i.m4325c(bArr, i2, i3);
        }
        this.f6600j.m4325c(bArr, i2, i3);
        this.f6601k.m4325c(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public final void m4319g(int i2, int i3, long j2, long j3) {
        zzhb zzhbVar = this.f6591a.f6728c;
        zzaqi zzaqiVar = this.f6594d;
        boolean z = this.f6595e;
        if (zzaqiVar.f6587j && zzaqiVar.f6584g) {
            zzaqiVar.f6590m = zzaqiVar.f6580c;
            zzaqiVar.f6587j = false;
        } else if (zzaqiVar.f6585h || zzaqiVar.f6584g) {
            if (z && zzaqiVar.f6586i) {
                zzaqiVar.m4316a(i2 + ((int) (j2 - zzaqiVar.f6579b)));
            }
            zzaqiVar.f6588k = zzaqiVar.f6579b;
            zzaqiVar.f6589l = zzaqiVar.f6582e;
            zzaqiVar.f6590m = zzaqiVar.f6580c;
            zzaqiVar.f6586i = true;
        }
        if (!this.f6595e) {
            zzaqr zzaqrVar = this.f6597g;
            zzaqrVar.m4326d(i3);
            zzaqr zzaqrVar2 = this.f6598h;
            zzaqrVar2.m4326d(i3);
            zzaqr zzaqrVar3 = this.f6599i;
            zzaqrVar3.m4326d(i3);
            if (zzaqrVar.f6673c && zzaqrVar2.f6673c && zzaqrVar3.f6673c) {
                String str = this.f6592b;
                int i4 = zzaqrVar.f6675e;
                byte[] bArr = new byte[zzaqrVar2.f6675e + i4 + zzaqrVar3.f6675e];
                System.arraycopy(zzaqrVar.f6674d, 0, bArr, 0, i4);
                System.arraycopy(zzaqrVar2.f6674d, 0, bArr, zzaqrVar.f6675e, zzaqrVar2.f6675e);
                System.arraycopy(zzaqrVar3.f6674d, 0, bArr, zzaqrVar.f6675e + zzaqrVar2.f6675e, zzaqrVar3.f6675e);
                String strM6032a = null;
                zzgl zzglVarM7085f = zzgr.m7085f(zzaqrVar2.f6674d, 3, zzaqrVar2.f6675e, null);
                zzgg zzggVar = zzglVarM7085f.f17687b;
                if (zzggVar != null) {
                    int i5 = zzggVar.f17189f;
                    int[] iArr = zzggVar.f17188e;
                    int i6 = zzggVar.f17187d;
                    strM6032a = zzdr.m6032a(zzggVar.f17184a, zzggVar.f17185b, zzggVar.f17186c, i6, iArr, i5);
                }
                zzt zztVar = new zzt();
                zztVar.f20789a = str;
                zztVar.m8852d("video/mp2t");
                zztVar.m8853e("video/hevc");
                zztVar.f20798j = strM6032a;
                zztVar.f20809u = zzglVarM7085f.f17690e;
                zztVar.f20810v = zzglVarM7085f.f17691f;
                zztVar.f20811w = zzglVarM7085f.f17692g;
                zztVar.f20812x = zzglVarM7085f.f17693h;
                zzh zzhVar = new zzh();
                zzhVar.f18414a = zzglVarM7085f.f17696k;
                zzhVar.f18415b = zzglVarM7085f.f17697l;
                zzhVar.f18416c = zzglVarM7085f.f17698m;
                zzhVar.f18418e = zzglVarM7085f.f17688c + 8;
                zzhVar.f18419f = zzglVarM7085f.f17689d + 8;
                zztVar.f20778D = zzhVar.m7286a();
                zztVar.f20775A = zzglVarM7085f.f17694i;
                zztVar.f20804p = zzglVarM7085f.f17695j;
                zztVar.f20779E = zzglVarM7085f.f17686a + 1;
                zztVar.f20805q = Collections.singletonList(bArr);
                zzv zzvVar = new zzv(zztVar);
                this.f6593c.mo4097e(zzvVar);
                int i7 = zzvVar.f21063q;
                zzgtr.m7133f(i7 != -1);
                zzhbVar.m7336a(i7);
                this.f6595e = true;
            }
        }
        zzaqr zzaqrVar4 = this.f6600j;
        boolean zM4326d = zzaqrVar4.m4326d(i3);
        zzeu zzeuVar = this.f6604n;
        if (zM4326d) {
            zzeuVar.m6397z(zzgr.m7080a(zzaqrVar4.f6675e, zzaqrVar4.f6674d), zzaqrVar4.f6674d);
            zzeuVar.m6365G(5);
            zzhbVar.m7337b(j3, zzeuVar);
        }
        zzaqr zzaqrVar5 = this.f6601k;
        if (zzaqrVar5.m4326d(i3)) {
            zzeuVar.m6397z(zzgr.m7080a(zzaqrVar5.f6675e, zzaqrVar5.f6674d), zzaqrVar5.f6674d);
            zzeuVar.m6365G(5);
            zzhbVar.m7337b(j3, zzeuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.f6602l = 0L;
        this.f6603m = -9223372036854775807L;
        zzgr.m7087h(this.f6596f);
        this.f6597g.m4323a();
        this.f6598h.m4323a();
        this.f6599i.m4323a();
        this.f6600j.m4323a();
        this.f6601k.m4323a();
        this.f6591a.f6728c.m7338c(0);
        zzaqi zzaqiVar = this.f6594d;
        if (zzaqiVar != null) {
            zzaqiVar.f6583f = false;
            zzaqiVar.f6584g = false;
            zzaqiVar.f6585h = false;
            zzaqiVar.f6586i = false;
            zzaqiVar.f6587j = false;
        }
    }
}
