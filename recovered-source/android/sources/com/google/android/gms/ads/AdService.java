package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.f3085g.f3087b.m2810j(this, new zzbvf()).mo5277q0(intent);
        } catch (RemoteException e) {
            zzo.m3070c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
