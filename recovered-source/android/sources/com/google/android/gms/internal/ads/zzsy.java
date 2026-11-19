package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes2.dex */
final class zzsy extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzta f20773a;

    public zzsy(zzta zztaVar) {
        this.f20773a = zztaVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        zzeg zzegVar = this.f20773a.f20817c.f20829i;
        zzegVar.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsx
            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zzqv) obj).zzb();
            }
        });
        zzegVar.m6198d();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzeg zzegVar = this.f20773a.f20817c.f20829i;
        zzegVar.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsv
            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zzqv) obj).zzc();
            }
        });
        zzegVar.m6198d();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzeg zzegVar = this.f20773a.f20817c.f20829i;
        zzegVar.m6197c(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzsw
            @Override // com.google.android.gms.internal.ads.zzeb
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo6141b(Object obj) {
                ((zzqv) obj).zzb();
            }
        });
        zzegVar.m6198d();
    }
}
