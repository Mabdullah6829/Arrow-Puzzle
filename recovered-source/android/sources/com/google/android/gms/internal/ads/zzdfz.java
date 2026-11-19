package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
final class zzdfz implements Runnable {

    /* JADX INFO: renamed from: s */
    public final WeakReference f12140s;

    @Override // java.lang.Runnable
    public final void run() {
        zzdga zzdgaVar = (zzdga) this.f12140s.get();
        if (zzdgaVar != null) {
            zzdgaVar.m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfw
                @Override // com.google.android.gms.internal.ads.zzdiw
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo5900b(Object obj) {
                    ((zzdfv) obj).mo5914h2();
                }
            });
        }
    }
}
