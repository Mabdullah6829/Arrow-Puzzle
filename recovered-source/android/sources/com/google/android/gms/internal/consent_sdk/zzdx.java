package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzdx extends zzeb {

    /* JADX INFO: renamed from: s */
    public final Object f21639s;

    /* JADX INFO: renamed from: t */
    public boolean f21640t;

    public zzdx(Object obj) {
        this.f21639s = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f21640t;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21640t) {
            throw new NoSuchElementException();
        }
        this.f21640t = true;
        return this.f21639s;
    }
}
