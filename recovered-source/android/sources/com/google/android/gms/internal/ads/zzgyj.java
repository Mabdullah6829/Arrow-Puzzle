package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyj extends zzgus {

    /* JADX INFO: renamed from: x */
    public final transient zzguj f18353x;

    public zzgyj(Map map, zzguj zzgujVar) {
        super(map);
        this.f18353x = zzgujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, com.google.android.gms.internal.ads.zzgvm
    /* JADX INFO: renamed from: a */
    public final Map mo7169a() {
        Map map = this.f18256v;
        if (map instanceof NavigableMap) {
            return new zzgva(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgvd(this, (SortedMap) map) : new zzguw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgvj
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Collection mo7156e() {
        return (List) ((zzgye) this.f18353x).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    /* JADX INFO: renamed from: g */
    public final Set mo7171g() {
        Map map = this.f18256v;
        if (map instanceof NavigableMap) {
            return new zzgvb(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new zzgve(this, (SortedMap) map) : new zzguz(this, map);
    }
}
