package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzacl implements zzacn {
    @Override // java.util.Iterator
    public final Object next() {
        zzack zzackVar = (zzack) this;
        int i2 = zzackVar.f21965s;
        if (i2 >= zzackVar.f21966t) {
            throw new NoSuchElementException();
        }
        zzackVar.f21965s = i2 + 1;
        return Byte.valueOf(zzackVar.f21967u.mo9372a(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
