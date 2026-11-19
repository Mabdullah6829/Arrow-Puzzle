package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzja {

    /* JADX INFO: renamed from: a */
    public final HashMap f20073a;

    public zzja() {
        this.f20073a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m8604a(int i2, String str) {
        this.f20073a.put(str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: b */
    public final void m8605b(String str, long j2) {
        this.f20073a.put(str, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: c */
    public final void m8606c(String str, float f2) {
        this.f20073a.put(str, Float.valueOf(f2));
    }

    /* JADX INFO: renamed from: d */
    public final void m8607d(String str, String str2) {
        this.f20073a.put(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final void m8608e(String str, ByteBuffer byteBuffer) {
        HashMap map = this.f20073a;
        if (byteBuffer == null) {
            map.put(str, null);
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        map.put(str, byteBufferAllocate);
    }
}
