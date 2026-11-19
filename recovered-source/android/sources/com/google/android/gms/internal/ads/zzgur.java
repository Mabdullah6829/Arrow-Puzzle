package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgur extends zzgzh {

    /* JADX INFO: renamed from: s */
    public Object f18212s;

    /* JADX INFO: renamed from: t */
    public int f18213t = 2;

    /* JADX INFO: renamed from: a */
    public abstract Object mo7153a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzgtr.m7133f(this.f18213t != 4);
        int i2 = this.f18213t;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            return true;
        }
        if (i3 != 2) {
            this.f18213t = 4;
            this.f18212s = mo7153a();
            if (this.f18213t != 3) {
                this.f18213t = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18213t = 2;
        Object obj = this.f18212s;
        this.f18212s = null;
        return obj;
    }
}
