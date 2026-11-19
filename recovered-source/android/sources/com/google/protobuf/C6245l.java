package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6245l extends C6248m {

    /* JADX INFO: renamed from: w */
    public final int f24194w;

    /* JADX INFO: renamed from: x */
    public final int f24195x;

    public C6245l(byte[] bArr, int i2, int i3) {
        super(bArr);
        AbstractC6251n.m11895h(i2, i2 + i3, bArr.length);
        this.f24194w = i2;
        this.f24195x = i3;
    }

    @Override // com.google.protobuf.C6248m
    /* JADX INFO: renamed from: C */
    public final int mo11891C() {
        return this.f24194w;
    }

    @Override // com.google.protobuf.C6248m, com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: d */
    public final byte mo11719d(int i2) {
        AbstractC6251n.m11894g(i2, this.f24195x);
        return this.f24205v[this.f24194w + i2];
    }

    @Override // com.google.protobuf.C6248m, com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: k */
    public final void mo11720k(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f24205v, this.f24194w + i2, bArr, i3, i4);
    }

    @Override // com.google.protobuf.C6248m, com.google.protobuf.AbstractC6251n
    /* JADX INFO: renamed from: n */
    public final byte mo11722n(int i2) {
        return this.f24205v[this.f24194w + i2];
    }

    @Override // com.google.protobuf.C6248m, com.google.protobuf.AbstractC6251n
    public final int size() {
        return this.f24195x;
    }
}
