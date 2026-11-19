package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbf implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final ApplicationInfo f15312a;

    /* JADX INFO: renamed from: b */
    public final PackageInfo f15313b;

    /* JADX INFO: renamed from: c */
    public final Context f15314c;

    public zzfbf(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f15312a = applicationInfo;
        this.f15313b = packageInfo;
        this.f15314c = context;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        String strValueOf;
        String str;
        String str2;
        String installingPackageName;
        Context context = this.f15314c;
        String str3 = this.f15312a.packageName;
        String str4 = null;
        PackageInfo packageInfo = this.f15313b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str5 = packageInfo == null ? null : packageInfo.versionName;
        try {
            com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
            Context context2 = Wrappers.m3665a(context).f4662a;
            strValueOf = String.valueOf(context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(str3, 0)));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8620ke)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = context.getPackageManager().getInstallSourceInfo(str3);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.m3150k("No installing package name found");
                                installingPackageName = null;
                            }
                            String initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    com.google.android.gms.ads.internal.util.zze.m3150k("No initiating package name found");
                                    str2 = str4;
                                } else {
                                    str2 = initiatingPackageName;
                                }
                            } catch (PackageManager.NameNotFoundException e) {
                                e = e;
                                str4 = initiatingPackageName;
                                com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("PackageInfoSignalSource.getInstallSourceInfo", e);
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            e = e2;
                        }
                        str = installingPackageName;
                    } else {
                        str = null;
                        str2 = null;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    e = e3;
                    installingPackageName = null;
                }
            } else {
                str = null;
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        return zzhcf.m7367a(new zzfbg(str3, numValueOf, str5, strValueOf, str, str2));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 29;
    }
}
