package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnf {

    /* JADX INFO: renamed from: a */
    public static final zzibk f19007a = zzibk.m8050a(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static final zzibk m7579a(int i2) {
        return zzibk.m8050a(ByteBuffer.allocate(5).put((byte) 0).putInt(i2).array());
    }

    /* JADX INFO: renamed from: b */
    public static final zzibk m7580b(int i2) {
        return zzibk.m8050a(ByteBuffer.allocate(5).put((byte) 1).putInt(i2).array());
    }
}
