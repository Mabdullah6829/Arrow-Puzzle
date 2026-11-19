package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzidj extends zzidi {

    /* JADX INFO: renamed from: u */
    public final byte[] f19712u;

    public zzidj(byte[] bArr) {
        bArr.getClass();
        this.f19712u = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzidi
    /* JADX INFO: renamed from: C */
    public final boolean mo8130C(zzidl zzidlVar, int i2, int i3) {
        int iMo8132h = zzidlVar.mo8132h();
        byte[] bArr = this.f19712u;
        if (i3 > iMo8132h) {
            int length = String.valueOf(i3).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i2 + i3;
        if (i4 <= zzidlVar.mo8132h()) {
            if (zzidlVar instanceof zzidj) {
                return zzidl.m8147d(bArr, 0, ((zzidj) zzidlVar).f19712u, i2, i3);
            }
            if (!(zzidlVar instanceof zzidf)) {
                return zzidlVar.mo8134k(i2, i4).equals(mo8134k(0, i3));
            }
            zzidf zzidfVar = (zzidf) zzidlVar;
            return zzidl.m8147d(bArr, 0, zzidfVar.f19709u, zzidfVar.f19710v + i2, i3);
        }
        int iMo8132h2 = zzidlVar.mo8132h();
        int length3 = String.valueOf(i2).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i3).length() + 2 + String.valueOf(iMo8132h2).length());
        AbstractC1456a.m2455v(sb2, "Ran off end of other: ", i2, ", ", i3);
        throw new IllegalArgumentException(AbstractC1456a.m2447n(sb2, ", ", iMo8132h2));
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: g */
    public final byte mo8131g(int i2) {
        return this.f19712u[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: h */
    public final int mo8132h() {
        return this.f19712u.length;
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: j */
    public final zzidl mo8133j(int i2, int i3) {
        byte[] bArr = this.f19712u;
        int iM8146b = zzidl.m8146b(i2, i3, bArr.length);
        return iM8146b == 0 ? zzidl.f19719t : new zzidf(bArr, i2, iM8146b);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: k */
    public final zzidl mo8134k(int i2, int i3) {
        byte[] bArr = this.f19712u;
        int iM8146b = zzidl.m8146b(i2, i3, bArr.length);
        return iM8146b == 0 ? zzidl.f19719t : new zzidf(bArr, i2, iM8146b);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: m */
    public final void mo8135m(int i2, byte[] bArr, int i3, int i4) {
        System.arraycopy(this.f19712u, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo8136n() {
        return ByteBuffer.wrap(this.f19712u).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: q */
    public final void mo8137q(zzidu zziduVar) {
        byte[] bArr = this.f19712u;
        zziduVar.mo8129a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: r */
    public final boolean mo8138r(zzidl zzidlVar) {
        boolean z = zzidlVar instanceof zzidj;
        byte[] bArr = this.f19712u;
        if (z) {
            return Arrays.equals(bArr, ((zzidj) zzidlVar).f19712u);
        }
        return zzidlVar instanceof zzidf ? mo8130C(zzidlVar, 0, bArr.length) : zzidlVar.mo8138r(this);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: t */
    public final int mo8139t(int i2, int i3, int i4) {
        return zzifc.m8356b(i2, this.f19712u, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzidl
    /* JADX INFO: renamed from: u */
    public final zzidp mo8140u() {
        byte[] bArr = this.f19712u;
        return zzidp.m8199f(bArr, 0, bArr.length);
    }
}
