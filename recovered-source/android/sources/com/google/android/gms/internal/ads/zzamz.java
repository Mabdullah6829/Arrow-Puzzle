package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamz implements zzaga {

    /* JADX INFO: renamed from: a */
    public zzagd f6064a;

    /* JADX INFO: renamed from: b */
    public zzang f6065b;

    /* JADX INFO: renamed from: c */
    public boolean f6066c;

    /* JADX INFO: renamed from: a */
    public final boolean m4232a(zzagb zzagbVar) {
        zzanb zzanbVar = new zzanb();
        if (zzanbVar.m4237b(zzagbVar, true) && (zzanbVar.f6100a & 2) == 2) {
            int iMin = Math.min(zzanbVar.f6104e, 8);
            zzeu zzeuVar = new zzeu(iMin);
            zzagbVar.mo4078H(zzeuVar.f14887a, 0, iMin);
            zzeuVar.m6363E(0);
            if (zzeuVar.m6360B() >= 5 && zzeuVar.m6369K() == 127 && zzeuVar.m6374P() == 1179402563) {
                this.f6065b = new zzamx();
                return true;
            }
            zzeuVar.m6363E(0);
            try {
                if (zzhg.m7444c(1, zzeuVar, true)) {
                    this.f6065b = new zzani();
                    return true;
                }
            } catch (zzat unused) {
            }
            zzeuVar.m6363E(0);
            if (zzand.m4238e(zzeuVar, zzand.f6107o)) {
                this.f6065b = new zzand();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        zzang zzangVar = this.f6065b;
        if (zzangVar != null) {
            zzana zzanaVar = zzangVar.f6112a;
            zzanb zzanbVar = zzanaVar.f6095a;
            zzanbVar.f6100a = 0;
            zzanbVar.f6101b = 0L;
            zzanbVar.f6102c = 0;
            zzanbVar.f6103d = 0;
            zzanbVar.f6104e = 0;
            zzanaVar.f6096b.m6396y(0);
            zzanaVar.f6097c = -1;
            zzanaVar.f6099e = false;
            if (j2 == 0) {
                zzangVar.mo4229a(!zzangVar.f6123l);
                return;
            }
            if (zzangVar.f6119h != 0) {
                long j4 = (((long) zzangVar.f6120i) * j3) / 1000000;
                zzangVar.f6116e = j4;
                zzanc zzancVar = zzangVar.f6115d;
                String str = zzfm.f16091a;
                zzancVar.mo4227a(j4);
                zzangVar.f6119h = 2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        try {
            return m4232a(zzagbVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f6064a = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        byte[] bArr;
        this.f6064a.getClass();
        if (this.f6065b == null) {
            if (!m4232a(zzagbVar)) {
                throw zzat.m4383a(null, "Failed to determine bitstream type");
            }
            zzagbVar.zzl();
        }
        if (!this.f6066c) {
            zzahm zzahmVarMo4109f = this.f6064a.mo4109f(0, 1);
            this.f6064a.mo4110v();
            zzang zzangVar = this.f6065b;
            zzangVar.f6114c = this.f6064a;
            zzangVar.f6113b = zzahmVarMo4109f;
            zzangVar.mo4229a(true);
            this.f6066c = true;
        }
        zzang zzangVar2 = this.f6065b;
        zzana zzanaVar = zzangVar2.f6112a;
        zzangVar2.f6113b.getClass();
        String str = zzfm.f16091a;
        int i2 = zzangVar2.f6119h;
        int i3 = 3;
        int i4 = -1;
        if (i2 != 0) {
            if (i2 == 1) {
                zzagbVar.mo4091o((int) zzangVar2.f6117f);
                zzangVar2.f6119h = 2;
                return 0;
            }
            if (i2 != 2) {
                return -1;
            }
            long jMo4228h = zzangVar2.f6115d.mo4228h(zzagbVar);
            if (jMo4228h >= 0) {
                zzahaVar.f5303a = jMo4228h;
                return 1;
            }
            if (jMo4228h < -1) {
                zzangVar2.mo4239d(-(jMo4228h + 2));
            }
            if (!zzangVar2.f6123l) {
                zzahd zzahdVarZzc = zzangVar2.f6115d.zzc();
                zzahdVarZzc.getClass();
                zzangVar2.f6114c.mo4108d(zzahdVarZzc);
                zzahm zzahmVar = zzangVar2.f6113b;
                zzahdVarZzc.zza();
                zzahmVar.getClass();
                zzangVar2.f6123l = true;
            }
            if (zzangVar2.f6122k <= 0 && !zzanaVar.m4234a(zzagbVar)) {
                zzangVar2.f6119h = 3;
                return -1;
            }
            zzangVar2.f6122k = 0L;
            zzeu zzeuVar = zzanaVar.f6096b;
            long jMo4230b = zzangVar2.mo4230b(zzeuVar);
            if (jMo4230b >= 0) {
                long j2 = zzangVar2.f6118g;
                if (j2 + jMo4230b >= zzangVar2.f6116e) {
                    long j3 = (j2 * 1000000) / ((long) zzangVar2.f6120i);
                    zzangVar2.f6113b.mo4121a(zzeuVar.f14889c, zzeuVar);
                    zzangVar2.f6113b.mo4095b(j3, 1, zzeuVar.f14889c, 0, null);
                    zzangVar2.f6116e = -1L;
                }
            }
            zzangVar2.f6118g += jMo4230b;
            return 0;
        }
        while (true) {
            boolean zM4234a = zzanaVar.m4234a(zzagbVar);
            zzeu zzeuVar2 = zzanaVar.f6096b;
            if (!zM4234a) {
                zzangVar2.f6119h = i3;
                return i4;
            }
            long jMo4086g = zzagbVar.mo4086g();
            long j4 = zzangVar2.f6117f;
            zzangVar2.f6122k = jMo4086g - j4;
            if (!zzangVar2.mo4231c(zzeuVar2, j4, zzangVar2.f6121j)) {
                zzv zzvVar = zzangVar2.f6121j.f6110a;
                zzangVar2.f6120i = zzvVar.f21039I;
                if (!zzangVar2.f6124m) {
                    zzangVar2.f6113b.mo4097e(zzvVar);
                    zzangVar2.f6124m = true;
                }
                zzamw zzamwVar = zzangVar2.f6121j.f6111b;
                if (zzamwVar == null) {
                    if (zzagbVar.mo4089j() == -1) {
                        zzangVar2.f6115d = new zzanf();
                    } else {
                        zzanb zzanbVar = zzanaVar.f6095a;
                        zzangVar2.f6115d = new zzamv(zzangVar2, zzangVar2.f6117f, zzagbVar.mo4089j(), zzanbVar.f6103d + zzanbVar.f6104e, zzanbVar.f6101b, (zzanbVar.f6100a & 4) != 0);
                    }
                    zzangVar2.f6119h = 2;
                    bArr = zzeuVar2.f14887a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    zzeuVar2.m6397z(zzeuVar2.f14889c, Arrays.copyOf(bArr, Math.max(65025, zzeuVar2.f14889c)));
                    return 0;
                }
                zzangVar2.f6115d = zzamwVar;
                zzangVar2.f6119h = 2;
                bArr = zzeuVar2.f14887a;
                if (bArr.length == 65025) {
                    return 0;
                }
                zzeuVar2.m6397z(zzeuVar2.f14889c, Arrays.copyOf(bArr, Math.max(65025, zzeuVar2.f14889c)));
                return 0;
            }
            zzangVar2.f6117f = zzagbVar.mo4086g();
            i3 = 3;
            i4 = -1;
        }
    }
}
