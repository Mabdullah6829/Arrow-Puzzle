package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzidf extends zzidi {

    /* JADX INFO: renamed from: u */
    public final byte[] f19709u;

    /* JADX INFO: renamed from: v */
    public final int f19710v;

    /* JADX INFO: renamed from: w */
    public final int f19711w;

    public zzidf(byte[] bArr, int i2, int i3) {
        zzidl.m8146b(i2, i2 + i3, bArr.length);
        this.f19709u = bArr;
        this.f19710v = i2;
        this.f19711w = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    /* JADX INFO: renamed from: C */
    public final boolean mo8130C(zzidl zzidlVar, int i2, int i3) {
        if (i3 > zzidlVar.mo8132h()) {
            int length = String.valueOf(i3).length();
            int i4 = this.f19711w;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(i4).length());
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = i2 + i3;
        if (i5 > zzidlVar.mo8132h()) {
            int iMo8132h = zzidlVar.mo8132h();
            int length2 = String.valueOf(i2).length();
            StringBuilder sb2 = new StringBuilder(length2 + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iMo8132h).length());
            AbstractC1456a.m2455v(sb2, "Ran off end of other: ", i2, ", ", i3);
            throw new IllegalArgumentException(AbstractC1456a.m2447n(sb2, ", ", iMo8132h));
        }
        boolean z = zzidlVar instanceof zzidj;
        byte[] bArr = this.f19709u;
        int i6 = this.f19710v;
        if (z) {
            return zzidl.m8147d(bArr, i6, ((zzidj) zzidlVar).f19712u, i2, i3);
        }
        if (!(zzidlVar instanceof zzidf)) {
            return zzidlVar.mo8134k(i2, i5).equals(mo8134k(i6, i3 + i6));
        }
        zzidf zzidfVar = (zzidf) zzidlVar;
        return zzidl.m8147d(bArr, i6, zzidfVar.f19709u, zzidfVar.f19710v + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: g */
    public final byte mo8131g(int i2) {
        return this.f19709u[this.f19710v + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: h */
    public final int mo8132h() {
        return this.f19711w;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: j */
    public final zzidl mo8133j(int i2, int i3) {
        int iM8146b = zzidl.m8146b(i2, i3, this.f19711w);
        if (iM8146b == 0) {
            return zzidl.f19719t;
        }
        return new zzidf(this.f19709u, this.f19710v + i2, iM8146b);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: k */
    public final zzidl mo8134k(int i2, int i3) {
        int iM8146b = zzidl.m8146b(i2, i3, this.f19711w);
        if (iM8146b == 0) {
            return zzidl.f19719t;
        }
        return new zzidf(this.f19709u, this.f19710v + i2, iM8146b);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: m */
    public final void mo8135m(int i2, byte[] bArr, int i3, int i4) {
        System.arraycopy(this.f19709u, this.f19710v + i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo8136n() {
        return ByteBuffer.wrap(this.f19709u, this.f19710v, this.f19711w).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: q */
    public final void mo8137q(zzidu zziduVar) {
        zziduVar.mo8129a(this.f19709u, this.f19710v, this.f19711w);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: r */
    public final boolean mo8138r(zzidl zzidlVar) {
        return ((zzidlVar instanceof zzidj) || (zzidlVar instanceof zzidf)) ? mo8130C(zzidlVar, 0, this.f19711w) : zzidlVar.mo8138r(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: t */
    public final int mo8139t(int i2, int i3, int i4) {
        return zzifc.m8356b(i2, this.f19709u, this.f19710v + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: u */
    public final zzidp mo8140u() {
        return zzidp.m8199f(this.f19709u, this.f19710v, this.f19711w);
    }
}
