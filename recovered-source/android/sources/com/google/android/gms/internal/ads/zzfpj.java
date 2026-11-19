package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpj {

    /* JADX INFO: renamed from: a */
    public final Object f16235a;

    /* JADX INFO: renamed from: b */
    public final String f16236b;

    /* JADX INFO: renamed from: c */
    public final ListenableFuture f16237c;

    /* JADX INFO: renamed from: d */
    public final List f16238d;

    /* JADX INFO: renamed from: e */
    public final ListenableFuture f16239e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zzfpk f16240f;

    public zzfpj(zzfpk zzfpkVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfpkVar);
        this.f16240f = zzfpkVar;
        this.f16235a = obj;
        this.f16236b = str;
        this.f16237c = listenableFuture;
        this.f16238d = list;
        this.f16239e = listenableFuture2;
    }

    /* JADX INFO: renamed from: a */
    public final zzfpj m6552a(final zzfos zzfosVar) {
        return m6553b(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfpi
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return zzhcf.m7367a(zzfosVar.mo5874b(obj));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final zzfpj m6553b(zzhbn zzhbnVar) {
        zzfpk zzfpkVar = this.f16240f;
        zzhcp zzhcpVar = zzfpkVar.f16242a;
        return new zzfpj(zzfpkVar, this.f16235a, this.f16236b, this.f16237c, this.f16238d, zzhcf.m7374h(this.f16239e, zzhbnVar, zzhcpVar));
    }

    /* JADX INFO: renamed from: c */
    public final zzfpj m6554c(long j2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zzfpk zzfpkVar = this.f16240f;
        ScheduledExecutorService scheduledExecutorService = zzfpkVar.f16243b;
        return new zzfpj(zzfpkVar, this.f16235a, this.f16236b, this.f16237c, this.f16238d, zzhcf.m7373g(this.f16239e, j2, timeUnit, scheduledExecutorService));
    }

    /* JADX INFO: renamed from: d */
    public final zzfoz m6555d() {
        zzfpk zzfpkVar = this.f16240f;
        Object obj = this.f16235a;
        String strMo6557b = this.f16236b;
        if (strMo6557b == null) {
            strMo6557b = zzfpkVar.mo6557b(obj);
        }
        final zzfoz zzfozVar = new zzfoz(obj, strMo6557b, this.f16239e);
        ((zzfpr) zzfpkVar.f16244c).m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzfpq
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final void mo5900b(Object obj2) {
                zzfoz zzfozVar2 = zzfozVar;
                ((zzfpt) obj2).mo6091g(zzfozVar2.f16220t);
            }
        });
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfph
            @Override // java.lang.Runnable
            public final void run() {
                zzfpr zzfprVar = (zzfpr) this.f16232s.f16240f.f16244c;
                final zzfoz zzfozVar2 = zzfozVar;
                zzfprVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzfpn
                    @Override // com.google.android.gms.internal.ads.zzdiw
                    /* JADX INFO: renamed from: b */
                    public final void mo5900b(Object obj2) {
                        zzfoz zzfozVar3 = zzfozVar2;
                        ((zzfpt) obj2).mo6092r((zzfpm) zzfozVar3.f16219s, zzfozVar3.f16220t);
                    }
                });
            }
        };
        zzhcp zzhcpVar = zzcfy.f9953h;
        this.f16237c.addListener(runnable, zzhcpVar);
        zzfozVar.addListener(new zzhcd(zzfozVar, new zzfpe(this, zzfozVar)), zzhcpVar);
        return zzfozVar;
    }
}
