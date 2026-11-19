package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6236i extends AbstractC6239j {

    /* JADX INFO: renamed from: s */
    public int f24184s = 0;

    /* JADX INFO: renamed from: t */
    public final int f24185t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AbstractC6251n f24186u;

    public C6236i(AbstractC6251n abstractC6251n) {
        this.f24186u = abstractC6251n;
        this.f24185t = abstractC6251n.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24184s < this.f24185t;
    }

    @Override // com.google.protobuf.AbstractC6239j
    public final byte nextByte() {
        int i2 = this.f24184s;
        if (i2 >= this.f24185t) {
            throw new NoSuchElementException();
        }
        this.f24184s = i2 + 1;
        return this.f24186u.mo11722n(i2);
    }
}
