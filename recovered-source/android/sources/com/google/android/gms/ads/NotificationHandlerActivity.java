package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbzb zzbzbVarM2810j = zzay.f3085g.f3087b.m2810j(this, new zzbvf());
            if (zzbzbVarM2810j == null) {
                zzo.m3070c("OfflineUtils is null");
            } else {
                zzbzbVarM2810j.mo5277q0(getIntent());
            }
        } catch (RemoteException e) {
            zzo.m3070c("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
