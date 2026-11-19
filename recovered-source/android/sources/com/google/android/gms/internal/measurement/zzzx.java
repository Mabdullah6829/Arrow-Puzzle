package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzzx implements Iterator {

    /* JADX INFO: renamed from: s */
    public final zzyl f23163s;

    /* JADX INFO: renamed from: t */
    public int f23164t;

    /* JADX INFO: renamed from: u */
    public int f23165u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzzy f23166v;

    public /* synthetic */ zzzx(zzzy zzzyVar, zzyl zzylVar, int i2) {
        this.f23166v = zzzyVar;
        this.f23163s = zzylVar;
        int i3 = i2 & 31;
        this.f23164t = i3;
        this.f23165u = i2 >>> (i3 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23164t >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f23164t;
        zzzy zzzyVar = this.f23166v;
        zzzj zzzjVar = zzzyVar.f23167b;
        int iMo10713a = zzzjVar.mo10713a();
        Object objCast = this.f23163s.f23098b.cast(i2 >= iMo10713a ? zzzyVar.f23168c.mo10715c(i2 - iMo10713a) : zzzjVar.mo10715c(i2));
        int i3 = this.f23165u;
        if (i3 == 0) {
            this.f23164t = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i3) + 1;
        this.f23165u >>>= iNumberOfTrailingZeros;
        this.f23164t += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
