package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdfo extends zzdix implements zzddt, zzdey {

    /* JADX INFO: renamed from: t */
    public final zzfkn f12128t;

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f12129u;

    /* JADX INFO: renamed from: v */
    public final zzfky f12130v;

    public zzdfo(Set set, zzfkn zzfknVar, zzfky zzfkyVar) {
        super(set);
        this.f12129u = new AtomicBoolean();
        this.f12128t = zzfknVar;
        this.f12130v = zzfkyVar;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m5911K0() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8349U8)).booleanValue() && (zztVar = this.f12128t.f15925e0) != null && zztVar.f3265s == 3 && this.f12129u.compareAndSet(false, true)) {
            m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfn
                @Override // com.google.android.gms.internal.ads.zzdiw
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo5900b(Object obj) {
                    ((zzdfq) obj).mo5912e(zztVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    /* JADX INFO: renamed from: n */
    public final void mo5838n() {
        int i2 = this.f12128t.f15918b;
        if (i2 == 2 || i2 == 5 || i2 == 4 || i2 == 6 || i2 == 7) {
            m5911K0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        if (this.f12128t.f15918b == 1) {
            m5911K0();
        }
    }
}
