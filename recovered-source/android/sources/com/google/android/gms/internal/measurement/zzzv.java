package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzzv implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f23160s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzzw f23161t;

    public zzzv(zzzw zzzwVar) {
        this.f23161t = zzzwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23160s < this.f23161t.f23162s.f23170e;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i2 = this.f23160s;
        this.f23160s = i2 + 1;
        zzzy zzzyVar = this.f23161t.f23162s;
        return zzzyVar.m10754d(zzzyVar.f23169d[i2] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
