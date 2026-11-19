package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzfdd implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15472a;

    /* JADX INFO: renamed from: b */
    public final Context f15473b;

    /* JADX INFO: renamed from: c */
    public final zzeej f15474c;

    /* JADX INFO: renamed from: d */
    public final String f15475d;

    public zzfdd(zzhcp zzhcpVar, Context context, zzeej zzeejVar, String str) {
        this.f15472a = zzhcpVar;
        this.f15473b = context;
        this.f15474c = zzeejVar;
        this.f15475d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15472a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdc
            /* JADX WARN: Code duplicated, block: B:28:0x011f  */
            /* JADX WARN: Code duplicated, block: B:29:0x012c  */
            /* JADX WARN: Code duplicated, block: B:31:0x013c  */
            /* JADX WARN: Code duplicated, block: B:43:0x018d A[EDGE_INSN: B:43:0x018d->B:44:0x018f BREAK  A[LOOP:1: B:37:0x0161->B:42:0x018a]] */
            /* JADX WARN: Code duplicated, block: B:49:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:52:0x01d3  */
            /* JADX WARN: Code duplicated, block: B:54:0x01e1  */
            /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
            /* JADX WARN: Code duplicated, block: B:57:0x01eb  */
            /* JADX WARN: Code duplicated, block: B:59:0x01f0  */
            /* JADX WARN: Code duplicated, block: B:60:0x01f3  */
            /* JADX WARN: Code duplicated, block: B:63:0x01f7  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ActivityInfo activityInfo;
                boolean z;
                String string;
                String str;
                String string2;
                String language;
                zzbio zzbioVar;
                com.google.android.gms.ads.internal.client.zzba zzbaVar;
                String str2;
                String str3;
                List<ResolveInfo> listQueryIntentActivities;
                boolean zEquals;
                zzbio zzbioVar2;
                zzbiv zzbivVar;
                boolean z2;
                String strM3038k;
                boolean z3;
                zzfdd zzfddVar = this.f15471a;
                Context context = zzfddVar.f15473b;
                PackageManager packageManager = context.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
                ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), 65536);
                String country = locale.getCountry();
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                boolean zM3042s = com.google.android.gms.ads.internal.util.client.zzf.m3042s();
                boolean zM3643a = DeviceProperties.m3643a(context);
                boolean zM3646d = DeviceProperties.m3646d(context);
                String language2 = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i2 = 0; i2 < localeList.size(); i2++) {
                    arrayList.add(localeList.get(i2).getLanguage());
                }
                ResolveInfo resolveInfoResolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), 65536);
                if (resolveInfoResolveActivity3 == null || (activityInfo = resolveInfoResolveActivity3.activityInfo) == null) {
                    string = null;
                    z = true;
                } else {
                    z = true;
                    try {
                        PackageInfo packageInfoM3663b = Wrappers.m3665a(context).m3663b(0, activityInfo.packageName);
                        if (packageInfoM3663b != null) {
                            int i3 = packageInfoM3663b.versionCode;
                            String str4 = activityInfo.packageName;
                            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str4).length());
                            sb.append(i3);
                            sb.append(".");
                            sb.append(str4);
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                try {
                    PackageInfo packageInfoM3663b2 = Wrappers.m3665a(context).m3663b(128, "com.android.vending");
                    if (packageInfoM3663b2 != null) {
                        int i4 = packageInfoM3663b2.versionCode;
                        String str5 = packageInfoM3663b2.packageName;
                        str = string;
                        try {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(str5).length());
                            sb2.append(i4);
                            sb2.append(".");
                            sb2.append(str5);
                            string2 = sb2.toString();
                        } catch (Exception unused2) {
                            string2 = null;
                        }
                        String str6 = Build.FINGERPRINT;
                        language = Locale.getDefault().getLanguage();
                        zzbioVar = zzbix.f8355Ue;
                        zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                            com.google.android.gms.ads.internal.util.zzq zzqVarM3193K = com.google.android.gms.ads.internal.util.zzs.m3193K(context);
                            String str7 = zzqVarM3193K.f3623a;
                            str3 = zzqVarM3193K.f3624b;
                            str2 = str7;
                        } else {
                            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8339Te)).booleanValue()) {
                                language = com.google.android.gms.ads.internal.util.zzs.m3193K(context).f3623a;
                            }
                            str2 = language;
                            str3 = null;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveInfoResolveActivity4 = packageManager.resolveActivity(intent, 0);
                        listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (listQueryIntentActivities == null || resolveInfoResolveActivity4 == null) {
                            zEquals = false;
                            break;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= listQueryIntentActivities.size()) {
                                zEquals = false;
                                break;
                            }
                            if (resolveInfoResolveActivity4.activityInfo.name.equals(listQueryIntentActivities.get(i5).activityInfo.name)) {
                                zEquals = resolveInfoResolveActivity4.activityInfo.packageName.equals(zzinp.m8562a(context));
                                break;
                            }
                            i5++;
                        }
                        com.google.android.gms.ads.internal.util.zzs zzsVar2 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                        long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        zzbioVar2 = zzbix.f8202Lc;
                        zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                        if (((Boolean) zzbivVar.m5030a(zzbioVar2)).booleanValue() || !com.google.android.gms.ads.internal.util.zzs.m3205d(context)) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if (((Boolean) zzbivVar.m5030a(zzbix.f8270Pc)).booleanValue()) {
                            strM3038k = "";
                        } else if (((Boolean) zzbivVar.m5030a(zzbix.f8304Rc)).booleanValue()) {
                            strM3038k = zzfddVar.f15475d;
                        } else {
                            strM3038k = com.google.android.gms.ads.internal.util.client.zzf.m3038k(context);
                        }
                        String str8 = strM3038k;
                        if (resolveInfoResolveActivity2 != null) {
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        if (resolveInfoResolveActivity == null) {
                            z = false;
                        }
                        zzeej zzeejVar = zzfddVar.f15474c;
                        String str9 = Build.MODEL;
                        return new zzfdb(z, z3, country, zM3042s, zM3643a, zM3646d, language2, arrayList, str, string2, zEquals, availableBytes, z2, str8, Build.VERSION.SDK_INT, str2, str3, zzeejVar.m6189a());
                    }
                    str = string;
                } catch (Exception unused3) {
                }
                string2 = null;
                String str10 = Build.FINGERPRINT;
                language = Locale.getDefault().getLanguage();
                zzbioVar = zzbix.f8355Ue;
                zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzq zzqVarM3193K2 = com.google.android.gms.ads.internal.util.zzs.m3193K(context);
                    String str11 = zzqVarM3193K2.f3623a;
                    str3 = zzqVarM3193K2.f3624b;
                    str2 = str11;
                } else {
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8339Te)).booleanValue()) {
                        language = com.google.android.gms.ads.internal.util.zzs.m3193K(context).f3623a;
                    }
                    str2 = language;
                    str3 = null;
                }
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveInfoResolveActivity5 = packageManager.resolveActivity(intent2, 0);
                listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
                if (listQueryIntentActivities == null) {
                    zEquals = false;
                    break;
                }
                zEquals = false;
                break;
                com.google.android.gms.ads.internal.util.zzs zzsVar3 = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                zzbioVar2 = zzbix.f8202Lc;
                zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (((Boolean) zzbivVar.m5030a(zzbioVar2)).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (((Boolean) zzbivVar.m5030a(zzbix.f8270Pc)).booleanValue()) {
                    strM3038k = "";
                } else if (((Boolean) zzbivVar.m5030a(zzbix.f8304Rc)).booleanValue()) {
                    strM3038k = zzfddVar.f15475d;
                } else {
                    strM3038k = com.google.android.gms.ads.internal.util.client.zzf.m3038k(context);
                }
                String str12 = strM3038k;
                if (resolveInfoResolveActivity2 != null) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                if (resolveInfoResolveActivity == null) {
                    z = false;
                }
                zzeej zzeejVar2 = zzfddVar.f15474c;
                String str13 = Build.MODEL;
                return new zzfdb(z, z3, country, zM3042s, zM3643a, zM3646d, language2, arrayList, str, string2, zEquals, availableBytes2, z2, str12, Build.VERSION.SDK_INT, str2, str3, zzeejVar2.m6189a());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 38;
    }
}
