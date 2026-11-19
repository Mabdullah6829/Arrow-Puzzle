package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdca implements com.google.android.gms.ads.internal.overlay.zzr {

    /* JADX INFO: renamed from: t */
    public final zzfky f11980t;

    /* JADX INFO: renamed from: u */
    public final zzfkn f11981u;

    /* JADX INFO: renamed from: v */
    public final Clock f11982v;

    /* JADX INFO: renamed from: w */
    public final zzdzt f11983w;

    /* JADX INFO: renamed from: x */
    public final ScheduledExecutorService f11984x;

    /* JADX INFO: renamed from: s */
    public final Object f11979s = new Object();

    /* JADX INFO: renamed from: y */
    public final zzfrm f11985y = zzfrn.m6631D();

    /* JADX INFO: renamed from: z */
    public boolean f11986z = false;

    /* JADX INFO: renamed from: A */
    public boolean f11978A = false;

    public zzdca(zzfky zzfkyVar, zzfkn zzfknVar, Clock clock, zzdzt zzdztVar, ScheduledExecutorService scheduledExecutorService) {
        this.f11980t = zzfkyVar;
        this.f11981u = zzfknVar;
        this.f11982v = clock;
        this.f11983w = zzdztVar;
        this.f11984x = scheduledExecutorService;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
        m5893b(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
        m5893b(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final void mo3017K1() {
        m5893b(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
        m5893b(5);
    }

    /* JADX INFO: renamed from: a */
    public final void m5892a() {
        synchronized (this.f11979s) {
            try {
                zzdzt zzdztVar = this.f11983w;
                String str = this.f11980t.f16006b.f16002b.f15973b;
                String strEncodeToString = Base64.encodeToString(((zzfrn) this.f11985y.m8328o()).m8099h(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8705pe)).booleanValue()) {
                    zzdzs zzdzsVarM6111a = zzdztVar.m6111a();
                    zzdzsVarM6111a.m6107b("action", "pclma");
                    zzdzsVarM6111a.m6107b("pclmd", strEncodeToString);
                    zzdzsVarM6111a.m6107b("gqi", str);
                    zzdzsVarM6111a.m6110e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final void mo3020a3() {
        m5893b(7);
    }

    /* JADX INFO: renamed from: b */
    public final void m5893b(int i2) {
        synchronized (this.f11979s) {
            try {
                if (!this.f11978A && this.f11986z) {
                    zzfrm zzfrmVar = this.f11985y;
                    zzfqc zzfqcVarM6558D = zzfqd.m6558D();
                    zzfqcVarM6558D.m8326l();
                    ((zzfqd) zzfqcVarM6558D.f19780t).m6560F(i2);
                    long jCurrentTimeMillis = this.f11982v.currentTimeMillis();
                    zzfqcVarM6558D.m8326l();
                    ((zzfqd) zzfqcVarM6558D.f19780t).m6559E(jCurrentTimeMillis);
                    zzfqd zzfqdVar = (zzfqd) zzfqcVarM6558D.m8328o();
                    zzfrmVar.m8326l();
                    ((zzfrn) zzfrmVar.f19780t).m6632E(zzfqdVar);
                    if (i2 == 10) {
                        m5892a();
                        this.f11978A = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final void mo3021c1(int i2) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
        m5893b(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
        m5893b(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
        m5893b(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }
}
