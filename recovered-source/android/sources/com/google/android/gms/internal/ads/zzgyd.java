package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyd extends zzgyh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Comparator f18352a;

    public zzgyd(Comparator comparator) {
        this.f18352a = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    /* JADX INFO: renamed from: a */
    public final Map mo7262a() {
        return new TreeMap(this.f18352a);
    }
}
