package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbfz {

    /* JADX INFO: renamed from: b */
    public static MessageDigest f7805b;

    /* JADX INFO: renamed from: a */
    public final Object f7806a = new Object();

    /* JADX INFO: renamed from: a */
    public final MessageDigest m4858a() {
        synchronized (this.f7806a) {
            MessageDigest messageDigest = f7805b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    f7805b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f7805b;
        }
    }
}
