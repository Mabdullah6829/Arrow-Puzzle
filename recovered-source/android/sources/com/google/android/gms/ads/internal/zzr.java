package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class zzr {

    /* JADX INFO: renamed from: a */
    public final Context f3685a;

    /* JADX INFO: renamed from: b */
    public final String f3686b;

    /* JADX INFO: renamed from: c */
    public final TreeMap f3687c = new TreeMap();

    /* JADX INFO: renamed from: d */
    public String f3688d;

    /* JADX INFO: renamed from: e */
    public String f3689e;

    /* JADX INFO: renamed from: f */
    public final String f3690f;

    public zzr(Context context, String str) {
        String strConcat;
        this.f3685a = context.getApplicationContext();
        this.f3686b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = Wrappers.m3665a(context).m3663b(0, context.getPackageName()).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f3690f = strConcat;
    }
}
