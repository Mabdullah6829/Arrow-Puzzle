package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzcfb implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Context f9857s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzcgd f9858t;

    public zzcfb(zzcfc zzcfcVar, Context context, zzcgd zzcgdVar) {
        this.f9857s = context;
        this.f9858t = zzcgdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgd zzcgdVar = this.f9858t;
        try {
            zzcgdVar.m5397a(AdvertisingIdClient.m2775a(this.f9857s));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzcgdVar.m5398b(e);
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Exception while getting advertising Id info", e);
        }
    }
}
