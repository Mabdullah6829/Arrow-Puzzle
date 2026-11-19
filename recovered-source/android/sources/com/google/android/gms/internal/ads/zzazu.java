package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
final class zzazu implements Runnable {
    private zzazu() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzazv.f7220b = MessageDigest.getInstance("MD5");
            countDownLatch = zzazv.f7223e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzazv.f7223e;
        } catch (Throwable th) {
            zzazv.f7223e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
