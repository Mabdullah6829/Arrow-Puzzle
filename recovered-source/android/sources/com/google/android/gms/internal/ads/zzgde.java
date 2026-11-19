package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgde implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17012a;

    public zzgde(zzina zzinaVar) {
        this.f17012a = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        File dir = ((Context) this.f17012a.f20011a).getDir("yqzdkcache", 0);
        zzinh.m8554a(dir);
        return dir;
    }
}
