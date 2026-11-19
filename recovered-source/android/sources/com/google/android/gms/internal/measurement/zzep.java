package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzep extends zzcx {

    /* JADX INFO: renamed from: s */
    public final com.google.android.gms.measurement.internal.zzjp f22456s;

    public zzep(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.f22456s = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* JADX INFO: renamed from: b */
    public final int mo9834b() {
        return System.identityHashCode(this.f22456s);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* JADX INFO: renamed from: y0 */
    public final void mo9835y0(String str, String str2, Bundle bundle, long j2) {
        this.f22456s.interceptEvent(str, str2, bundle, j2);
    }
}
