package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
final class zzbts implements zzcgh {
    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final void mo5135b(Object obj) {
        com.google.android.gms.ads.internal.util.zze.m3150k("Ending javascript session.");
        zzbud zzbudVar = (zzbud) ((zzbuc) obj);
        HashSet<AbstractMap.SimpleEntry> hashSet = zzbudVar.f9392t;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Unregistering eventhandler: ".concat(String.valueOf(((zzbpx) simpleEntry.getValue()).toString())));
            zzbudVar.f9391s.mo5133n((String) simpleEntry.getKey(), (zzbpx) simpleEntry.getValue());
        }
        hashSet.clear();
    }
}
