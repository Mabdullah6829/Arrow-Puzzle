package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes2.dex */
final class zzer extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzes f14683a;

    public /* synthetic */ zzer(zzes zzesVar) {
        this.f14683a = zzesVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.f14683a.f14755a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeq
            /* JADX WARN: Code duplicated, block: B:20:0x003f  */
            /* JADX WARN: Code duplicated, block: B:21:0x0041  */
            /* JADX WARN: Code duplicated, block: B:22:0x0043  */
            /* JADX WARN: Code duplicated, block: B:24:0x004a  */
            /* JADX WARN: Code duplicated, block: B:25:0x004c  */
            /* JADX WARN: Code duplicated, block: B:27:0x0052  */
            /* JADX WARN: Code duplicated, block: B:28:0x0054  */
            /* JADX WARN: Code duplicated, block: B:29:0x0056  */
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzes zzesVar = this.f14593s.f14683a;
                zzesVar.getClass();
                Context context2 = context;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                int i2 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i2 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i2 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i2 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i2 = type != 9 ? 8 : 7;
                            } else {
                                i2 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
                    zzesVar.m6322c(i2);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    zzel zzelVar = new zzel(zzesVar);
                    telephonyManager.registerTelephonyCallback(zzesVar.f14755a, zzelVar);
                    telephonyManager.unregisterTelephonyCallback(zzelVar);
                } catch (RuntimeException unused2) {
                    zzesVar.m6322c(5);
                }
            }
        });
    }
}
