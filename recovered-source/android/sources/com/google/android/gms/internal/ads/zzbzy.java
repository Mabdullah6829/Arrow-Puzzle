package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzbzy extends zzcep {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ QueryInfoGenerationCallback f9569s;

    public zzbzy(zzbzz zzbzzVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f9569s = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    /* JADX INFO: renamed from: m */
    public final void mo5282m(String str) {
        this.f9569s.mo3330a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzceq
    /* JADX INFO: renamed from: p1 */
    public final void mo5283p1(String str, String str2, Bundle bundle) {
        this.f9569s.mo3331b(new QueryInfo(new com.google.android.gms.ads.internal.client.zzex(str)));
    }
}
