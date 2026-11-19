package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdid extends zzdix implements zzbop {
    @Override // com.google.android.gms.internal.ads.zzbop
    /* JADX INFO: renamed from: n0 */
    public final synchronized void mo5097n0(final String str, final String str2) {
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((AppEventListener) obj).mo2729i(str, str2);
            }
        });
    }
}
