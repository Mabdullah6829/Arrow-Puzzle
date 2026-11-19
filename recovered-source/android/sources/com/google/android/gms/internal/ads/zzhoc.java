package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhoc {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f19044a = new zzhob();

    /* JADX INFO: renamed from: a */
    public static byte[] m7590a(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) f19044a.get()).nextBytes(bArr);
        return bArr;
    }
}
