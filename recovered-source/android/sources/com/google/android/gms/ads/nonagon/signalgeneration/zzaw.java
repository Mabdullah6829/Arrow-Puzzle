package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzimz;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzat f3893a;

    public zzaw(zzat zzatVar) {
        this.f3893a = zzatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzat zzatVar = this.f3893a;
        zzatVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.add(zzatVar.f3890a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
