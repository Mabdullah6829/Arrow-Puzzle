package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzdbx implements zzden, zzddu {

    /* JADX INFO: renamed from: s */
    public final zzfkn f11974s;

    public zzdbx(zzfkn zzfknVar) {
        this.f11974s = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    /* JADX INFO: renamed from: c */
    public final void mo5833c() {
        zzbzo zzbzoVar = this.f11974s.f15923d0;
        if (zzbzoVar == null || !zzbzoVar.f9566a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbzoVar.f9567b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: d */
    public final void mo5818d(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: j */
    public final void mo5819j(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: m */
    public final void mo5820m(Context context) {
    }
}
