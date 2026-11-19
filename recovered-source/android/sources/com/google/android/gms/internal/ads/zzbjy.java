package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbjy {

    /* JADX INFO: renamed from: a */
    public CustomTabsSession f8917a;

    /* JADX INFO: renamed from: b */
    public CustomTabsClient f8918b;

    /* JADX INFO: renamed from: c */
    public zzinq f8919c;

    /* JADX INFO: renamed from: d */
    public zzbjx f8920d;

    /* JADX INFO: renamed from: a */
    public static boolean m5047a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzinp.m8562a(context));
                    }
                }
            }
        }
        return false;
    }
}
