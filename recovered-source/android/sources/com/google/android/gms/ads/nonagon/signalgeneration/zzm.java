package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcnz;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.android.gms.internal.ads.zzimy;
import com.google.android.gms.internal.ads.zzimz;
import com.google.android.gms.internal.ads.zzinh;
import com.google.android.gms.internal.ads.zzini;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f3960a;

    /* JADX INFO: renamed from: b */
    public final zzini f3961b;

    public zzm(zzcnz zzcnzVar, zzimy zzimyVar) {
        this.f3960a = zzcnzVar;
        this.f3961b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f3960a.m5709a();
        zzdzy zzdzyVar = (zzdzy) this.f3961b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzj(contextM5709a, zzdzyVar, zzhcpVar);
    }
}
