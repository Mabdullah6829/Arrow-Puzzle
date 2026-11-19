package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzwg implements zzwh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f21210a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzv f21211b;

    public /* synthetic */ zzwg(Context context, zzv zzvVar) {
        this.f21210a = context;
        this.f21211b = zzvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    /* JADX INFO: renamed from: b */
    public final int mo8972b(Object obj) {
        zzvp zzvpVar = (zzvp) obj;
        HashMap map = zzwi.f21212a;
        String str = zzvpVar.f21112b;
        zzv zzvVar = this.f21211b;
        return ((str.equals(zzvVar.f21061o) || str.equals(zzwi.m8976d(zzvVar))) && zzvpVar.m8950f(this.f21210a, zzvVar, false) && zzvpVar.m8951g(zzvVar)) ? 1 : 0;
    }
}
