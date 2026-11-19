package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.protobuf.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6213a0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f24134a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f24135b;

    /* JADX INFO: renamed from: c */
    public static final ByteBuffer f24136c;

    static {
        Charset.forName("US-ASCII");
        f24134a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f24135b = bArr;
        f24136c = ByteBuffer.wrap(bArr);
        AbstractC6261s.m11966f(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m11832a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m11833b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
