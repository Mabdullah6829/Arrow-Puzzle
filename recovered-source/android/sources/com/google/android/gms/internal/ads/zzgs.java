package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgs {

    /* JADX INFO: renamed from: a */
    public final boolean f18135a;

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    public zzgs(zzgv zzgvVar, zzgu zzguVar) throws zzgt {
        int i2 = zzguVar.f18186a;
        ByteBuffer byteBuffer = zzguVar.f18187b;
        boolean z = false;
        zzgtr.m7128a(i2 == 6 || i2 == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iMin);
        if (zzgvVar.f18228a) {
            throw new zzgt();
        }
        if (!zzetVar.m6344g()) {
            int iM6345h = zzetVar.m6345h(2);
            boolean zM6344g = zzetVar.m6344g();
            if (zzgvVar.f18229b) {
                throw new zzgt();
            }
            if (zM6344g) {
                boolean zM6344g2 = (iM6345h == 3 || iM6345h == 0) ? true : zzetVar.m6344g();
                zzetVar.m6342e();
                if (!zzgvVar.f18231d) {
                    throw new zzgt();
                }
                if (zzetVar.m6344g()) {
                    if (!zzgvVar.f18232e) {
                        throw new zzgt();
                    }
                    zzetVar.m6342e();
                }
                if (zzgvVar.f18230c) {
                    throw new zzgt();
                }
                if (iM6345h != 3) {
                    zzetVar.m6342e();
                }
                zzetVar.m6343f(zzgvVar.f18233f);
                if (iM6345h != 2 && iM6345h != 0 && !zM6344g2) {
                    zzetVar.m6343f(3);
                }
                if (iM6345h == 3 || iM6345h == 0 || zzetVar.m6345h(8) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        this.f18135a = z;
    }
}
