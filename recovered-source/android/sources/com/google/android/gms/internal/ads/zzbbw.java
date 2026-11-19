package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbw implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbbz f7543s;

    public zzbbw(zzbbz zzbbzVar) {
        this.f7543s = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbz zzbbzVar = this.f7543s;
        zzbbzVar.getClass();
        try {
            if (zzbbzVar.f7552f == null && zzbbzVar.f7553g) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(zzbbzVar.f7547a, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, false);
                advertisingIdClient.m2779d(true);
                zzbbzVar.f7552f = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            zzbbzVar.f7552f = null;
        }
    }
}
