package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgoz implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17959a;

    public zzgoz(zzimy zzimyVar) {
        this.f17959a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f17959a.zzb(), "ocs"), "pmtd");
    }
}
