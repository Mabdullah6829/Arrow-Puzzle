package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwf implements com.google.android.gms.ads.internal.zzn {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzdwq f13155s;

    public zzdwf(zzdwq zzdwqVar) {
        this.f13155s = zzdwqVar;
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: L */
    public final void mo3269L() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        zzdga zzdgaVar = this.f13155s.f13194g;
        synchronized (zzdgaVar) {
            try {
                if (zzdgaVar.f12143A) {
                    if (zzdgaVar.f12151y > 0 && (scheduledFuture2 = zzdgaVar.f12144B) != null && scheduledFuture2.isCancelled()) {
                        zzdgaVar.m5918M0(zzdgaVar.f12151y);
                    }
                    if (zzdgaVar.f12152z > 0 && (scheduledFuture = zzdgaVar.f12145C) != null && scheduledFuture.isCancelled()) {
                        zzdgaVar.m5919N0(zzdgaVar.f12152z);
                    }
                    zzdgaVar.f12143A = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    /* JADX INFO: renamed from: u0 */
    public final void mo3270u0() {
        zzdga zzdgaVar = this.f13155s.f13194g;
        synchronized (zzdgaVar) {
            try {
                if (zzdgaVar.f12143A) {
                    return;
                }
                ScheduledFuture scheduledFuture = zzdgaVar.f12144B;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    zzdgaVar.f12151y = -1L;
                } else {
                    zzdgaVar.f12144B.cancel(false);
                    zzdgaVar.f12151y = zzdgaVar.f12149w - zzdgaVar.f12147u.mo3639a();
                }
                ScheduledFuture scheduledFuture2 = zzdgaVar.f12145C;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    zzdgaVar.f12152z = -1L;
                } else {
                    zzdgaVar.f12145C.cancel(false);
                    zzdgaVar.f12152z = zzdgaVar.f12150x - zzdgaVar.f12147u.mo3639a();
                }
                zzdgaVar.f12143A = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
