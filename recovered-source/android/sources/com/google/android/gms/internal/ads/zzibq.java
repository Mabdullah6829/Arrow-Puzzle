package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibq extends zzibr implements Iterable {

    /* JADX INFO: renamed from: s */
    public final ArrayList f19621s = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzibr
    /* JADX INFO: renamed from: a */
    public final String mo8053a() {
        ArrayList arrayList = this.f19621s;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzibr) arrayList.get(0)).mo8053a();
        }
        throw new IllegalStateException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(size).length() + 37), "Array must have size 1, but has size ", size));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzibq) && ((zzibq) obj).f19621s.equals(this.f19621s);
        }
        return true;
    }

    public final int hashCode() {
        return this.f19621s.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f19621s.iterator();
    }
}
