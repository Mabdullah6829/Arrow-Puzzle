package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends Thread {

    /* JADX INFO: renamed from: s */
    public final WeakReference f3024s;

    /* JADX INFO: renamed from: t */
    public final long f3025t;

    /* JADX INFO: renamed from: u */
    public final CountDownLatch f3026u = new CountDownLatch(1);

    /* JADX INFO: renamed from: v */
    public boolean f3027v = false;

    public zzb(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f3024s = new WeakReference(advertisingIdClient);
        this.f3025t = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f3024s;
        try {
            if (this.f3026u.await(this.f3025t, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.m2778c();
            this.f3027v = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.m2778c();
                this.f3027v = true;
            }
        }
    }
}
