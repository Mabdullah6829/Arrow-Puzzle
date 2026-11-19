package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdet extends zzdix implements zzbon {

    /* JADX INFO: renamed from: t */
    public final Bundle f12104t;

    public zzdet(Set set) {
        super(set);
        this.f12104t = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    /* JADX INFO: renamed from: e */
    public final synchronized void mo5096e(Bundle bundle, String str) {
        this.f12104t.putAll(bundle);
        m5923J0(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzdiw
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo5900b(Object obj) {
                ((OnAdMetadataChangedListener) obj).mo3359g();
            }
        });
    }
}
