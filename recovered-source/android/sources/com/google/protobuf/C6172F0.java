package com.google.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.protobuf.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6172F0 extends AbstractC6239j {

    /* JADX INFO: renamed from: s */
    public final C6174G0 f24075s;

    /* JADX INFO: renamed from: t */
    public AbstractC6239j f24076t = m11715a();

    public C6172F0(C6176H0 c6176h0) {
        this.f24075s = new C6174G0(c6176h0);
    }

    /* JADX INFO: renamed from: a */
    public final C6236i m11715a() {
        C6174G0 c6174g0 = this.f24075s;
        if (c6174g0.hasNext()) {
            return new C6236i(c6174g0.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24076t != null;
    }

    @Override // com.google.protobuf.AbstractC6239j
    public final byte nextByte() {
        AbstractC6239j abstractC6239j = this.f24076t;
        if (abstractC6239j == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = abstractC6239j.nextByte();
        if (!this.f24076t.hasNext()) {
            this.f24076t = m11715a();
        }
        return bNextByte;
    }
}
