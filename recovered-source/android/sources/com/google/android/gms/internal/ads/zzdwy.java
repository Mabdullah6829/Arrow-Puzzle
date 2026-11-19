package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwy implements zzddu {

    /* JADX INFO: renamed from: s */
    public final zzclb f13234s;

    public zzdwy(zzclb zzclbVar) {
        this.f13234s = zzclbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: d */
    public final void mo5818d(Context context) {
        zzclb zzclbVar = this.f13234s;
        if (zzclbVar != null) {
            zzclbVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: j */
    public final void mo5819j(Context context) {
        zzclb zzclbVar = this.f13234s;
        if (zzclbVar != null) {
            zzclbVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: m */
    public final void mo5820m(Context context) {
        zzclb zzclbVar = this.f13234s;
        if (zzclbVar != null) {
            zzclbVar.onResume();
        }
    }
}
