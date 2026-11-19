package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzad implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f22002s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzae f22003t;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.f22003t = zzaeVar;
        this.f22002s = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22002s < this.f22003t.m9589s();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.f22002s;
        zzae zzaeVar = this.f22003t;
        if (i2 >= zzaeVar.m9589s()) {
            int i3 = this.f22002s;
            throw new NoSuchElementException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i3).length() + 21), "Out of bounds index: ", i3));
        }
        int i4 = this.f22002s;
        this.f22002s = i4 + 1;
        return zzaeVar.m9590t(i4);
    }
}
