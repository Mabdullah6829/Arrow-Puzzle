package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzede implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcnz f13671a;

    /* JADX INFO: renamed from: b */
    public final zzcoa f13672b;

    /* JADX INFO: renamed from: c */
    public final zzini f13673c;

    public zzede(zzcnz zzcnzVar, zzcoa zzcoaVar, zzimy zzimyVar) {
        this.f13671a = zzcnzVar;
        this.f13672b = zzcoaVar;
        this.f13673c = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context contextM5709a = this.f13671a.m5709a();
        WeakReference weakReference = this.f13672b.f10632a.f10622d;
        zzinh.m8554a(weakReference);
        zzedk zzedkVar = (zzedk) this.f13673c.zzb();
        new zzedy();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzedw(contextM5709a, weakReference, zzedkVar, zzhcpVar);
    }
}
