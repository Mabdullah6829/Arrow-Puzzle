package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdme implements com.google.android.gms.ads.internal.overlay.zzr, com.google.android.gms.ads.internal.client.zza {

    /* JADX INFO: renamed from: s */
    public final zzdxc f12327s;

    /* JADX INFO: renamed from: t */
    public final zzfkq f12328t;

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f12329u = new AtomicBoolean(false);

    public zzdme(zzdxc zzdxcVar, zzfkq zzfkqVar) {
        this.f12327s = zzdxcVar;
        this.f12328t = zzfkqVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: B1 */
    public final void mo3015B1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: G0 */
    public final void mo3016G0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: K1 */
    public final void mo3017K1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: U2 */
    public final void mo3018U2() {
        if (this.f12329u.getAndSet(true)) {
            return;
        }
        zzdxc zzdxcVar = this.f12327s;
        if (zzdxcVar.f13238b.getAndSet(false)) {
            zzgcp zzgcpVar = zzdxcVar.f13237a;
            zzgcpVar.getClass();
            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgch(zzgcpVar, null));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: W1 */
    public final void mo3019W1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: a3 */
    public final void mo3020a3() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: c1 */
    public final void mo3021c1(int i2) {
        if (this.f12329u.getAndSet(true)) {
            return;
        }
        zzdxc zzdxcVar = this.f12327s;
        if (zzdxcVar.f13238b.getAndSet(false)) {
            zzgcp zzgcpVar = zzdxcVar.f13237a;
            zzgcpVar.getClass();
            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgch(zzgcpVar, null));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        zzdxc zzdxcVar = this.f12327s;
        if (zzdxcVar.f13238b.get()) {
            zzgcp zzgcpVar = zzdxcVar.f13237a;
            zzgcpVar.getClass();
            zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgcf(zzgcpVar, null));
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: s1 */
    public final void mo3023s1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: u0 */
    public final void mo3024u0() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        String gwsQueryId = this.f12328t.f15973b;
        boolean zM7127a = zzgtq.m7127a(gwsQueryId);
        zzdxc zzdxcVar = this.f12327s;
        if (zM7127a) {
            zzdxcVar.getClass();
            return;
        }
        if (!zzdxcVar.f13239c.get() || zzdxcVar.f13238b.getAndSet(true)) {
            return;
        }
        zzgcp zzgcpVar = zzdxcVar.f13237a;
        zzgcpVar.getClass();
        AbstractC6452k.m12181e(gwsQueryId, "gwsQueryId");
        zzgsw.m7115a(zzgcpVar.f16975a, zzgcpVar.f16976b, new zzgcd(zzgcpVar, gwsQueryId, null));
    }
}
