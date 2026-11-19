package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyv extends zzwm implements zzyj {

    /* JADX INFO: renamed from: i */
    public final zzhq f21408i;

    /* JADX INFO: renamed from: j */
    public final zzyd f21409j;

    /* JADX INFO: renamed from: k */
    public final zzuq f21410k;

    /* JADX INFO: renamed from: l */
    public final int f21411l;

    /* JADX INFO: renamed from: m */
    public boolean f21412m = true;

    /* JADX INFO: renamed from: n */
    public long f21413n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public boolean f21414o;

    /* JADX INFO: renamed from: p */
    public boolean f21415p;

    /* JADX INFO: renamed from: q */
    public boolean f21416q;

    /* JADX INFO: renamed from: r */
    public zzip f21417r;

    /* JADX INFO: renamed from: s */
    public zzak f21418s;

    public /* synthetic */ zzyv(zzak zzakVar, zzhq zzhqVar, zzyd zzydVar, zzuq zzuqVar, zzabw zzabwVar, int i2) {
        this.f21418s = zzakVar;
        this.f21408i = zzhqVar;
        this.f21409j = zzydVar;
        this.f21410k = zzuqVar;
        this.f21411l = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: J */
    public final synchronized zzak mo9026J() {
        return this.f21418s;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: b */
    public final void mo8986b(zzip zzipVar) {
        this.f21417r = zzipVar;
        Looper.myLooper().getClass();
        this.f21222g.getClass();
        m9048g();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: d */
    public final void mo8988d() {
    }

    /* JADX INFO: renamed from: f */
    public final void m9047f(long j2, zzahd zzahdVar, boolean z) {
        if (this.f21416q && zzahdVar.zzj()) {
            return;
        }
        this.f21416q = !zzahdVar.zzj();
        if (j2 == -9223372036854775807L) {
            j2 = this.f21413n;
        }
        boolean zZzb = zzahdVar.zzb();
        if (!this.f21412m && this.f21413n == j2 && this.f21414o == zZzb && this.f21415p == z) {
            return;
        }
        this.f21413n = j2;
        this.f21414o = zZzb;
        this.f21415p = z;
        this.f21412m = false;
        m9048g();
    }

    /* JADX INFO: renamed from: g */
    public final void m9048g() {
        long j2 = this.f21413n;
        boolean z = this.f21414o;
        boolean z2 = this.f21415p;
        zzak zzakVarMo9026J = mo9026J();
        zzbf zzzhVar = new zzzh(j2, j2, z, zzakVarMo9026J, z2 ? zzakVarMo9026J.f5575c : null);
        if (this.f21412m) {
            zzzhVar = new zzys(zzzhVar);
        }
        m8989e(zzzhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: k */
    public final void mo9003k() {
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: x */
    public final synchronized void mo9021x(zzak zzakVar) {
        this.f21418s = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: y */
    public final zzxj mo9022y(zzxl zzxlVar, zzabm zzabmVar, long j2) {
        zzhr zzhrVarZza = this.f21408i.zza();
        zzip zzipVar = this.f21417r;
        if (zzipVar != null) {
            zzhrVarZza.mo5493a(zzipVar);
        }
        zzag zzagVar = mo9026J().f5574b;
        zzagVar.getClass();
        Uri uri = zzagVar.f5240a;
        this.f21222g.getClass();
        return new zzyr(uri, zzhrVarZza, new zzwp(((zzyt) this.f21409j).f21403a), this.f21410k, new zzul(this.f21219d.f21007b, zzxlVar), new zzxv(this.f21218c.f21305b, zzxlVar), this, zzabmVar, this.f21411l, zzfm.m6519u(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: z */
    public final void mo9023z(zzxj zzxjVar) {
        zzyr zzyrVar = (zzyr) zzxjVar;
        if (zzyrVar.f21376N) {
            for (zzzc zzzcVar : zzyrVar.f21373K) {
                zzzcVar.m9063o();
                if (zzzcVar.f21450g != null) {
                    zzzcVar.f21450g = null;
                    zzzcVar.f21449f = null;
                }
            }
        }
        zzacf zzacfVar = zzyrVar.f21364B;
        zzaca zzacaVar = zzacfVar.f4898b;
        if (zzacaVar != null) {
            zzacaVar.m3943a(true);
        }
        zzack zzackVar = (zzack) zzacfVar.f4897a;
        zzackVar.execute(new zzacd(zzyrVar));
        zzackVar.f4914t.mo3942b(zzackVar.f4913s);
        zzyrVar.f21369G.removeCallbacksAndMessages(null);
        zzyrVar.f21370H = null;
        zzyrVar.f21394f0 = true;
    }
}
