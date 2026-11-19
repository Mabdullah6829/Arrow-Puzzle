package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzidd extends zzide {

    /* JADX INFO: renamed from: s */
    public int f19706s = 0;

    /* JADX INFO: renamed from: t */
    public final int f19707t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzidl f19708u;

    public zzidd(zzidl zzidlVar) {
        this.f19708u = zzidlVar;
        this.f19707t = zzidlVar.mo8132h();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19706s < this.f19707t;
    }

    @Override // com.google.android.gms.internal.ads.zzidg
    public final byte zza() {
        int i2 = this.f19706s;
        if (i2 >= this.f19707t) {
            throw new NoSuchElementException();
        }
        this.f19706s = i2 + 1;
        return this.f19708u.mo8131g(i2);
    }
}
