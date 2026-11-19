package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbud implements zzbsu, zzbuc {

    /* JADX INFO: renamed from: s */
    public final zzbte f9391s;

    /* JADX INFO: renamed from: t */
    public final HashSet f9392t = new HashSet();

    public zzbud(zzbte zzbteVar) {
        this.f9391s = zzbteVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    /* JADX INFO: renamed from: n */
    public final void mo5133n(String str, zzbpx zzbpxVar) {
        this.f9391s.mo5133n(str, zzbpxVar);
        this.f9392t.remove(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    /* JADX INFO: renamed from: r */
    public final void mo5134r(String str, zzbpx zzbpxVar) {
        this.f9391s.mo5134r(str, zzbpxVar);
        this.f9392t.add(new AbstractMap.SimpleEntry(str, zzbpxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsu, com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        this.f9391s.zza(str);
    }
}
