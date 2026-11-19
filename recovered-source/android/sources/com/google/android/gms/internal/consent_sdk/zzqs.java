package com.google.android.gms.internal.consent_sdk;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqs {

    /* JADX INFO: renamed from: a */
    public static final Charset f21747a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f21748b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f21748b = bArr;
        ByteBuffer.wrap(bArr);
        zzpn zzpnVar = new zzpn();
        try {
            int i2 = zzpnVar.f21715a;
            if (i2 > 0) {
                zzpnVar.f21715a = i2;
            } else {
                zzpnVar.f21715a = 0;
            }
        } catch (zzqu e) {
            throw new IllegalArgumentException(e);
        }
    }
}
