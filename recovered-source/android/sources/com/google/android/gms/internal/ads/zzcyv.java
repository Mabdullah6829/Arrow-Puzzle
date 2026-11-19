package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcyv implements com.google.android.gms.ads.internal.overlay.zzr {

    /* JADX INFO: renamed from: s */
    public final zzdeg f11795s;

    /* JADX INFO: renamed from: t */
    public final AtomicBoolean f11796t = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u */
    public final AtomicBoolean f11797u = new AtomicBoolean(false);

    public zzcyv(zzdeg zzdegVar) {
        this.f11795s = zzdegVar;
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
        AtomicBoolean atomicBoolean = this.f11797u;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        zzdeg zzdegVar = this.f11795s;
        zzdegVar.getClass();
        zzdegVar.m5923J0(zzdef.f12097a);
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
        this.f11796t.set(true);
        AtomicBoolean atomicBoolean = this.f11797u;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        zzdeg zzdegVar = this.f11795s;
        zzdegVar.getClass();
        zzdegVar.m5923J0(zzdef.f12097a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    /* JADX INFO: renamed from: d2 */
    public final void mo3022d2() {
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
        zzdeg zzdegVar = this.f11795s;
        zzdegVar.getClass();
        zzdegVar.m5923J0(zzdeb.f12091a);
    }
}
