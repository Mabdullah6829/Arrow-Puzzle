package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzfkj implements OnAdMetadataChangedListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzby f15866s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzfkk f15867t;

    public zzfkj(zzfkk zzfkkVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.f15866s = zzbyVar;
        Objects.requireNonNull(zzfkkVar);
        this.f15867t = zzfkkVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    /* JADX INFO: renamed from: g */
    public final void mo3359g() {
        if (this.f15867t.f15871v != null) {
            try {
                this.f15866s.mo2881a();
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
    }
}
