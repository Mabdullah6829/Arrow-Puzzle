package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
final class zzgph implements zzgpe {

    /* JADX INFO: renamed from: a */
    public final zzgqo f17975a;

    /* JADX INFO: renamed from: b */
    public final long f17976b;

    public zzgph(zzgqo zzgqoVar, long j2) {
        this.f17975a = zzgqoVar;
        this.f17976b = j2;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m7046c(zzggb zzggbVar) {
        int iM4807D = zzggbVar.m6990E().m4789D().m4807D();
        int iM4808E = zzggbVar.m6990E().m4789D().m4808E();
        byte[] versionArray = zzavh.m4435a();
        AbstractC6452k.m12181e(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        AbstractC6452k.m12180d(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iM4807D);
        byteBufferAllocate.putInt(iM4808E);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC6452k.m12180d(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    /* JADX INFO: renamed from: a */
    public final boolean mo7044a(zzggb zzggbVar) {
        zzgqo zzgqoVar = this.f17975a;
        if (zzggbVar == null || zzggbVar.equals(zzggb.m6988J())) {
            zzgqoVar.m7061b(20204);
            return false;
        }
        if (m7046c(zzggbVar)) {
            return true;
        }
        zzgqoVar.m7061b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    /* JADX INFO: renamed from: b */
    public final boolean mo7045b(zzggb zzggbVar) {
        zzgqo zzgqoVar = this.f17975a;
        if (zzggbVar == null || zzggbVar.equals(zzggb.m6988J())) {
            zzgqoVar.m7061b(20202);
            return true;
        }
        if (!m7046c(zzggbVar)) {
            zzgqoVar.m7061b(20205);
            return true;
        }
        boolean z = zzggbVar.m6990E().m4791F() - System.currentTimeMillis() <= this.f17976b;
        if (z) {
            zzgqoVar.m7061b(20203);
        }
        return z;
    }
}
