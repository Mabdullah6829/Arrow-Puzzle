package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzdzt;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    /* JADX INFO: renamed from: a */
    public static final boolean m2985a(Context context, Intent intent, zzad zzadVar, zzaa zzaaVar, boolean z, zzdzt zzdztVar, String str, Bundle bundle) {
        int iM3236L;
        if (z) {
            try {
                iM3236L = com.google.android.gms.ads.internal.zzt.f3698C.f3703c.m3236L(context, intent.getData(), bundle);
                if (zzadVar != null) {
                    zzadVar.zzl();
                }
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f(message);
                iM3236L = 6;
            }
            if (zzaaVar != null) {
                zzaaVar.mo2987b(iM3236L);
            }
            return iM3236L == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8051Ce)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzs.m3223v(context, intent, zzdztVar, str);
            } else {
                com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzs.m3220s(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.zzl();
            }
            if (zzaaVar != null) {
                zzaaVar.mo2988k0(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            String message2 = e2.getMessage();
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f(message2);
            if (zzaaVar != null) {
                zzaaVar.mo2988k0(false);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m2986b(Context context, zzc zzcVar, zzad zzadVar, zzaa zzaaVar, zzdzt zzdztVar, String str) {
        int i2 = 0;
        if (zzcVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("No intent data for launcher overlay.");
            return false;
        }
        zzbix.m5032a(context);
        Intent intent = zzcVar.f3330z;
        if (intent != null) {
            return m2985a(context, intent, zzadVar, zzaaVar, zzcVar.f3321B, zzdztVar, str, zzcVar.f3322C);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.f3324t;
        if (TextUtils.isEmpty(str2)) {
            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.f3325u;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.f3326v;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.f3327w;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i5 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = zzcVar.f3328x;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i2 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i6 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        zzbio zzbioVar = zzbix.f8815w5;
        zzba zzbaVar = zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8798v5)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.zzs.m3196O(context, intent2);
            }
        }
        return m2985a(context, intent2, zzadVar, zzaaVar, zzcVar.f3321B, zzdztVar, str, zzcVar.f3322C);
    }
}
