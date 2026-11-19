package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbn {

    /* JADX INFO: renamed from: a */
    public int f9703a;

    /* JADX INFO: renamed from: b */
    public int f9704b;

    /* JADX INFO: renamed from: c */
    public final boolean f9705c;

    /* JADX INFO: renamed from: d */
    public final boolean f9706d;

    /* JADX INFO: renamed from: e */
    public final String f9707e;

    /* JADX INFO: renamed from: f */
    public final boolean f9708f;

    /* JADX INFO: renamed from: g */
    public final boolean f9709g;

    /* JADX INFO: renamed from: h */
    public final boolean f9710h;

    /* JADX INFO: renamed from: i */
    public final String f9711i;

    /* JADX INFO: renamed from: j */
    public final String f9712j;

    /* JADX INFO: renamed from: k */
    public final float f9713k;

    /* JADX INFO: renamed from: l */
    public final int f9714l;

    /* JADX INFO: renamed from: m */
    public final int f9715m;

    /* JADX INFO: renamed from: n */
    public final String f9716n;

    /* JADX WARN: Code duplicated, block: B:12:0x0064  */
    public zzcbn(Context context) {
        ActivityInfo activityInfo;
        String string;
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        zzbix.m5032a(context);
        m5308b(context);
        m5309c(context);
        m5310d(context);
        Locale locale = Locale.getDefault();
        this.f9705c = m5306e(packageManager, "geo:0,0?q=donuts") != null;
        this.f9706d = m5306e(packageManager, "http://www.google.com") != null;
        this.f9707e = locale.getCountry();
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
        this.f9708f = com.google.android.gms.ads.internal.util.client.zzf.m3042s();
        this.f9709g = DeviceProperties.m3643a(context);
        this.f9710h = DeviceProperties.m3646d(context);
        this.f9711i = locale.getLanguage();
        ResolveInfo resolveInfoM5306e = m5306e(packageManager, "market://details?id=com.google.android.gms.ads");
        String string2 = null;
        if (resolveInfoM5306e == null || (activityInfo = resolveInfoM5306e.activityInfo) == null) {
            string = null;
        } else {
            try {
                PackageInfo packageInfoM3663b = Wrappers.m3665a(context).m3663b(0, activityInfo.packageName);
                if (packageInfoM3663b != null) {
                    int i2 = packageInfoM3663b.versionCode;
                    String str = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str).length());
                    sb.append(i2);
                    sb.append(".");
                    sb.append(str);
                    string = sb.toString();
                } else {
                    string = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f9712j = string;
        try {
            PackageInfo packageInfoM3663b2 = Wrappers.m3665a(context).m3663b(128, "com.android.vending");
            if (packageInfoM3663b2 != null) {
                int i3 = packageInfoM3663b2.versionCode;
                String str2 = packageInfoM3663b2.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str2).length());
                sb2.append(i3);
                sb2.append(".");
                sb2.append(str2);
                string2 = sb2.toString();
            }
        } catch (Exception unused2) {
        }
        this.f9716n = string2;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.f9713k = displayMetrics.density;
        this.f9714l = displayMetrics.widthPixels;
        this.f9715m = displayMetrics.heightPixels;
    }

    /* JADX INFO: renamed from: e */
    public static ResolveInfo m5306e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final zzcbo m5307a() {
        return new zzcbo(this.f9705c, this.f9706d, this.f9707e, this.f9708f, this.f9709g, this.f9710h, this.f9711i, this.f9712j, this.f9716n, this.f9703a, this.f9704b, this.f9713k, this.f9714l, this.f9715m);
    }

    /* JADX INFO: renamed from: b */
    public final void m5308b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX INFO: renamed from: c */
    public final void m5309c(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        if (PlatformVersion.m3654b()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8250O9)).booleanValue()) {
                networkType = 0;
            } else {
                networkType = telephonyManager.getNetworkType();
            }
        } else {
            networkType = telephonyManager.getNetworkType();
        }
        this.f9704b = networkType;
        telephonyManager.getPhoneType();
        this.f9703a = -2;
        com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
        if (com.google.android.gms.ads.internal.util.zzs.m3204c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f9703a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f9703a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5310d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8771tc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            intentRegisterReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public zzcbn(Context context, zzcbo zzcboVar) {
        zzbix.m5032a(context);
        m5308b(context);
        m5309c(context);
        m5310d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        zzbjy.m5047a(context);
        this.f9705c = zzcboVar.f9717a;
        this.f9706d = zzcboVar.f9718b;
        this.f9707e = zzcboVar.f9719c;
        this.f9708f = zzcboVar.f9720d;
        this.f9709g = zzcboVar.f9721e;
        this.f9710h = zzcboVar.f9722f;
        this.f9711i = zzcboVar.f9723g;
        this.f9712j = zzcboVar.f9724h;
        this.f9716n = zzcboVar.f9725i;
        this.f9713k = zzcboVar.f9728l;
        this.f9714l = zzcboVar.f9729m;
        this.f9715m = zzcboVar.f9730n;
    }
}
