package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzwk implements zzvn {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f21215a;

    public zzwk(MediaCodec mediaCodec) {
        this.f21215a = mediaCodec;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: a */
    public final void mo8930a() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: b */
    public final void mo8931b() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: c */
    public final void mo8932c() {
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: d */
    public final void mo8933d(Bundle bundle) {
        this.f21215a.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: e */
    public final void mo8934e(int i2, zziu zziuVar, long j2, int i3) {
        this.f21215a.queueSecureInputBuffer(i2, 0, zziuVar.f20044i, j2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    /* JADX INFO: renamed from: f */
    public final void mo8935f(int i2, int i3, int i4, long j2) {
        this.f21215a.queueInputBuffer(i2, 0, i3, j2, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza() {
    }
}
