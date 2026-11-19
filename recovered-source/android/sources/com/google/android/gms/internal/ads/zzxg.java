package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxg extends zzzq {

    /* JADX INFO: renamed from: l */
    public final boolean f21266l;

    /* JADX INFO: renamed from: m */
    public final zzbe f21267m;

    /* JADX INFO: renamed from: n */
    public final zzbd f21268n;

    /* JADX INFO: renamed from: o */
    public zzxe f21269o;

    /* JADX INFO: renamed from: p */
    public zzxd f21270p;

    /* JADX INFO: renamed from: q */
    public boolean f21271q;

    /* JADX INFO: renamed from: r */
    public boolean f21272r;

    /* JADX INFO: renamed from: s */
    public boolean f21273s;

    public zzxg(zzxn zzxnVar, boolean z) {
        boolean z2;
        super(zzxnVar);
        if (z) {
            zzxnVar.mo9028u();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f21266l = z2;
        this.f21267m = new zzbe();
        this.f21268n = new zzbd();
        zzxnVar.mo9027U();
        this.f21269o = new zzxe(new zzxf(zzxnVar.mo9026J()), zzbe.f7673m, zzxe.f21262e);
    }

    @Override // com.google.android.gms.internal.ads.zzwt, com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: d */
    public final void mo8988d() {
        this.f21272r = false;
        this.f21271q = false;
        super.mo8988d();
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    /* JADX INFO: renamed from: l */
    public final void mo9016l() {
        if (this.f21266l) {
            return;
        }
        this.f21271q = true;
        m8999g(null, this.f21495k);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzzq
    /* JADX INFO: renamed from: m */
    public final void mo9017m(zzbf zzbfVar) {
        long j2;
        zzxe zzxeVar;
        zzxe zzxeVar2;
        zzxl zzxlVarM9024a = null;
        if (this.f21272r) {
            zzxe zzxeVar3 = this.f21269o;
            this.f21269o = new zzxe(zzbfVar, zzxeVar3.f21263c, zzxeVar3.f21264d);
            zzxd zzxdVar = this.f21270p;
            if (zzxdVar != null) {
                m9020p(zzxdVar.f21261y);
            }
        } else if (zzbfVar.m4833g()) {
            if (this.f21273s) {
                zzxe zzxeVar4 = this.f21269o;
                zzxeVar2 = new zzxe(zzbfVar, zzxeVar4.f21263c, zzxeVar4.f21264d);
            } else {
                zzxeVar2 = new zzxe(zzbfVar, zzbe.f7673m, zzxe.f21262e);
            }
            this.f21269o = zzxeVar2;
        } else {
            zzbe zzbeVar = this.f21267m;
            zzbfVar.mo4736b(0, zzbeVar, 0L);
            Object obj = zzbeVar.f7675a;
            zzxd zzxdVar2 = this.f21270p;
            if (zzxdVar2 != null) {
                j2 = zzxdVar2.f21256t;
                this.f21269o.mo4841o(zzxdVar2.f21255s.f21278a, this.f21268n);
                this.f21269o.mo4736b(0, zzbeVar, 0L);
                if (j2 == 0) {
                    j2 = 0;
                }
            } else {
                j2 = 0;
            }
            Pair pairM4839m = zzbfVar.m4839m(zzbeVar, this.f21268n, 0, j2);
            Object obj2 = pairM4839m.first;
            long jLongValue = ((Long) pairM4839m.second).longValue();
            if (this.f21273s) {
                zzxe zzxeVar5 = this.f21269o;
                zzxeVar = new zzxe(zzbfVar, zzxeVar5.f21263c, zzxeVar5.f21264d);
            } else {
                zzxeVar = new zzxe(zzbfVar, obj, obj2);
            }
            this.f21269o = zzxeVar;
            zzxd zzxdVar3 = this.f21270p;
            if (zzxdVar3 != null && m9020p(jLongValue)) {
                zzxl zzxlVar = zzxdVar3.f21255s;
                Object obj3 = zzxlVar.f21278a;
                if (this.f21269o.f21264d != null && obj3.equals(zzxe.f21262e)) {
                    obj3 = this.f21269o.f21264d;
                }
                zzxlVarM9024a = zzxlVar.m9024a(obj3);
            }
        }
        this.f21273s = true;
        this.f21272r = true;
        m8989e(this.f21269o);
        if (zzxlVarM9024a != null) {
            zzxd zzxdVar4 = this.f21270p;
            zzxdVar4.getClass();
            zzxdVar4.m9008f(zzxlVarM9024a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzq
    /* JADX INFO: renamed from: n */
    public final zzxl mo9018n(zzxl zzxlVar) {
        Object obj = this.f21269o.f21264d;
        Object obj2 = zzxlVar.f21278a;
        if (obj != null && obj.equals(obj2)) {
            obj2 = zzxe.f21262e;
        }
        return zzxlVar.m9024a(obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final zzxd mo9022y(zzxl zzxlVar, zzabm zzabmVar, long j2) {
        zzxd zzxdVar = new zzxd(zzxlVar, zzabmVar, j2);
        zzgtr.m7133f(zzxdVar.f21258v == null);
        zzxn zzxnVar = this.f21495k;
        zzxdVar.f21258v = zzxnVar;
        if (!this.f21272r) {
            this.f21270p = zzxdVar;
            if (!this.f21271q) {
                this.f21271q = true;
                m8999g(null, zzxnVar);
            }
            return zzxdVar;
        }
        Object obj = zzxlVar.f21278a;
        if (this.f21269o.f21264d != null && obj.equals(zzxe.f21262e)) {
            obj = this.f21269o.f21264d;
        }
        zzxdVar.m9008f(zzxlVar.m9024a(obj));
        return zzxdVar;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m9020p(long j2) {
        zzxd zzxdVar = this.f21270p;
        int iMo4739e = this.f21269o.mo4739e(zzxdVar.f21255s.f21278a);
        if (iMo4739e == -1) {
            return false;
        }
        zzxe zzxeVar = this.f21269o;
        zzbd zzbdVar = this.f21268n;
        zzxeVar.mo4738d(iMo4739e, zzbdVar, false);
        long j3 = zzbdVar.f7635d;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        zzxdVar.f21261y = j2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: x */
    public final void mo9021x(zzak zzakVar) {
        if (this.f21273s) {
            zzxe zzxeVar = this.f21269o;
            zzbf zzbfVar = zzxeVar.f21246b;
            this.f21269o = new zzxe(zzbfVar instanceof zzzm ? new zzzm(((zzzm) zzbfVar).f21246b, zzakVar) : new zzzm(zzbfVar, zzakVar), zzxeVar.f21263c, zzxeVar.f21264d);
        } else {
            this.f21269o = new zzxe(new zzxf(zzakVar), zzbe.f7673m, zzxe.f21262e);
        }
        this.f21495k.mo9021x(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzq, com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: z */
    public final void mo9023z(zzxj zzxjVar) {
        zzxd zzxdVar = (zzxd) zzxjVar;
        zzxj zzxjVar2 = zzxdVar.f21259w;
        if (zzxjVar2 != null) {
            zzxn zzxnVar = zzxdVar.f21258v;
            zzxnVar.getClass();
            zzxnVar.mo9023z(zzxjVar2);
        }
        if (zzxjVar == this.f21270p) {
            this.f21270p = null;
        }
    }
}
