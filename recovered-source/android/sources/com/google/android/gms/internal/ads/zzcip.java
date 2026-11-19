package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class zzcip implements zziml {

    /* JADX INFO: renamed from: s */
    public final ByteBuffer f10172s;

    public zzcip(ByteBuffer byteBuffer) {
        this.f10172s = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zziml
    /* JADX INFO: renamed from: B */
    public final int mo5497B(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.f10172s;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zziml
    /* JADX INFO: renamed from: f */
    public final void mo5498f(long j2) {
        this.f10172s.position((int) j2);
    }

    @Override // com.google.android.gms.internal.ads.zziml
    /* JADX INFO: renamed from: g */
    public final ByteBuffer mo5499g(long j2, long j3) {
        ByteBuffer byteBuffer = this.f10172s;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j2);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j3);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // com.google.android.gms.internal.ads.zziml
    public final long zzb() {
        return this.f10172s.limit();
    }

    @Override // com.google.android.gms.internal.ads.zziml
    public final long zzc() {
        return this.f10172s.position();
    }
}
