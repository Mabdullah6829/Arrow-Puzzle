package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecg implements zzdkh {

    /* JADX INFO: renamed from: s */
    public final Bundle f13566s = new Bundle();

    @VisibleForTesting
    public zzecg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    /* JADX INFO: renamed from: G */
    public final void mo5929G(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    /* JADX INFO: renamed from: a */
    public final void mo5930a() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    /* JADX INFO: renamed from: b */
    public final void mo5931b() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    /* JADX INFO: renamed from: d */
    public final synchronized void mo5932d(String str, String str2) {
        this.f13566s.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    /* JADX INFO: renamed from: m */
    public final synchronized void mo5933m(String str) {
        this.f13566s.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdkh
    public final synchronized void zza(String str) {
        this.f13566s.putInt(str, 1);
    }
}
