package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class zzask implements zzasl {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f6835a;

    public zzask(ByteBuffer byteBuffer) {
        this.f6835a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    /* JADX INFO: renamed from: a */
    public final void mo4366a(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.f6835a;
        synchronized (byteBuffer) {
            int i3 = (int) j2;
            byteBuffer.position(i3);
            byteBuffer.limit(i3 + i2);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final long zza() {
        return this.f6835a.capacity();
    }
}
