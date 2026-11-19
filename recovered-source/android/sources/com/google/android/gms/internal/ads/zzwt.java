package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzwt extends zzwm {

    /* JADX INFO: renamed from: i */
    public final HashMap f21237i = new HashMap();

    /* JADX INFO: renamed from: j */
    public Handler f21238j;

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: a */
    public final void mo8985a() {
        for (zzws zzwsVar : this.f21237i.values()) {
            zzwsVar.f21234a.mo8982D(zzwsVar.f21235b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: b */
    public void mo8986b(zzip zzipVar) {
        this.f21238j = zzfm.m6514p();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: c */
    public final void mo8987c() {
        for (zzws zzwsVar : this.f21237i.values()) {
            zzwsVar.f21234a.mo8991w(zzwsVar.f21235b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    /* JADX INFO: renamed from: d */
    public void mo8988d() {
        HashMap map = this.f21237i;
        for (zzws zzwsVar : map.values()) {
            zzxn zzxnVar = zzwsVar.f21234a;
            zzxnVar.mo8990v(zzwsVar.f21235b);
            zzwr zzwrVar = zzwsVar.f21236c;
            zzxnVar.mo8979A(zzwrVar);
            zzxnVar.mo8984F(zzwrVar);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo8998f(Object obj, zzwm zzwmVar, zzbf zzbfVar);

    /* JADX INFO: renamed from: g */
    public final void m8999g(final Integer num, zzxn zzxnVar) {
        HashMap map = this.f21237i;
        zzgtr.m7128a(!map.containsKey(num));
        zzxm zzxmVar = new zzxm() { // from class: com.google.android.gms.internal.ads.zzwq
            @Override // com.google.android.gms.internal.ads.zzxm
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo8742a(zzwm zzwmVar, zzbf zzbfVar) {
                this.f21228a.mo8998f(num, zzwmVar, zzbfVar);
            }
        };
        zzwr zzwrVar = new zzwr(this, num);
        map.put(num, new zzws(zzxnVar, zzxmVar, zzwrVar));
        Handler handler = this.f21238j;
        handler.getClass();
        zzxnVar.mo8983E(handler, zzwrVar);
        Handler handler2 = this.f21238j;
        handler2.getClass();
        zzxnVar.mo8980B(handler2, zzwrVar);
        zzqh zzqhVar = this.f21222g;
        zzqhVar.getClass();
        zzabr zzabrVar = this.f21223h;
        zzabrVar.getClass();
        zzxnVar.mo8981C(zzxmVar, zzqhVar, zzabrVar);
        if (this.f21217b.isEmpty()) {
            zzxnVar.mo8991w(zzxmVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public zzxl mo9001i(Object obj, zzxl zzxlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    /* JADX INFO: renamed from: k */
    public void mo9003k() {
        Iterator it = this.f21237i.values().iterator();
        while (it.hasNext()) {
            ((zzws) it.next()).f21234a.mo9003k();
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo9000h(Object obj) {
    }

    /* JADX INFO: renamed from: j */
    public void mo9002j(long j2, Object obj) {
    }
}
