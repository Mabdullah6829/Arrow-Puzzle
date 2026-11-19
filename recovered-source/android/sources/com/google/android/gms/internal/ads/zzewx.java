package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewx implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15070a;

    /* JADX INFO: renamed from: b */
    public final Context f15071b;

    public zzewx(Context context, zzhcp zzhcpVar) {
        this.f15070a = zzhcpVar;
        this.f15071b = context;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m6408a() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8771tc)).booleanValue();
        Context context = this.f15071b;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15070a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int intExtra;
                boolean zIsCharging;
                int intExtra2;
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8823wd)).booleanValue();
                boolean z = true;
                zzewx zzewxVar = this.f15069a;
                double intExtra3 = -1.0d;
                if (zBooleanValue) {
                    BatteryManager batteryManager = (BatteryManager) zzewxVar.f15071b.getSystemService("batterymanager");
                    intExtra3 = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
                    if (batteryManager != null) {
                        zIsCharging = batteryManager.isCharging();
                    } else {
                        Intent intentM6408a = zzewxVar.m6408a();
                        if (intentM6408a == null || ((intExtra2 = intentM6408a.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) != 2 && intExtra2 != 5)) {
                            z = false;
                        }
                    }
                    return new zzewy(intExtra3, zIsCharging);
                }
                Intent intentM6408a2 = zzewxVar.m6408a();
                if (intentM6408a2 == null || ((intExtra = intentM6408a2.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) != 2 && intExtra != 5)) {
                    z = false;
                }
                if (intentM6408a2 != null) {
                    intExtra3 = ((double) intentM6408a2.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((double) intentM6408a2.getIntExtra("scale", -1));
                }
                zIsCharging = z;
                return new zzewy(intExtra3, zIsCharging);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 14;
    }
}
