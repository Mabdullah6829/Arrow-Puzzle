package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
class zzgus extends zzgvj implements zzgxo {
    @Override // com.google.android.gms.internal.ads.zzgvj
    /* JADX INFO: renamed from: c */
    public final Collection mo7154c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    /* JADX INFO: renamed from: d */
    public final Collection mo7155d(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new zzgvc(this, obj, list, null) : new zzgvi(this, obj, list, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgvj
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ Collection mo7156e() {
        throw null;
    }
}
