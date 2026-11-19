package com.google.android.gms.internal.ads;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpa implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17960a;

    public zzgpa(zzimy zzimyVar) {
        this.f17960a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.f17960a.zzb(), "ocs"), "pcbc");
    }
}
