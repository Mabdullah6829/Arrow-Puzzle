package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzpg implements zzpi {
    @Override // java.util.Iterator
    public final Object next() {
        zzpf zzpfVar = (zzpf) this;
        int i2 = zzpfVar.f21709s;
        if (i2 >= zzpfVar.f21710t) {
            throw new NoSuchElementException();
        }
        zzpfVar.f21709s = i2 + 1;
        return Byte.valueOf(zzpfVar.f21711u.mo9149b(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
