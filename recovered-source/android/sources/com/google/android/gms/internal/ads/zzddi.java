package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzddi extends zzdix implements zzddd {
    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: a */
    public final void mo5901a() {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddg
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzddp) obj).mo5837j(zzfmi.m6535d(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l */
    public final void mo5902l(final zzdnv zzdnvVar) {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddf
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                zzddp zzddpVar = (zzddp) obj;
                String message = zzdnvVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzddpVar.mo5837j(zzfmi.m6535d(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    /* JADX INFO: renamed from: l0 */
    public final void mo5903l0(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddh
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((zzddp) obj).mo5837j(zzeVar);
            }
        });
    }
}
