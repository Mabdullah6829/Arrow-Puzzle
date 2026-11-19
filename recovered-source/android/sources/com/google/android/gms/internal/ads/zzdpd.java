package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12524a;

    /* JADX INFO: renamed from: b */
    public final zzcyr f12525b;

    public zzdpd(zzcyr zzcyrVar, zzimy zzimyVar) {
        this.f12524a = zzimyVar;
        this.f12525b = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdla((Context) this.f12524a.zzb(), new HashSet(), this.f12525b.m5872a());
    }
}
