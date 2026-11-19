package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class GoogleApiAvailabilityLight {

    /* JADX INFO: renamed from: a */
    public static final int f4156a;

    /* JADX INFO: renamed from: b */
    public static final GoogleApiAvailabilityLight f4157b;

    static {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
        f4156a = 12451000;
        f4157b = new GoogleApiAvailabilityLight();
    }

    /* JADX INFO: renamed from: a */
    public static int m3401a(Context context) {
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public Intent m3402b(Context context, int i2, String str) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && DeviceProperties.m3645c(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f4156a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(Wrappers.m3665a(context).m3663b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0180  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d6  */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0180, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public int m3403c(Context context, int i2) {
        boolean z;
        PackageInfo packageInfo;
        int i3;
        int i4;
        ApplicationInfo applicationInfo;
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
        try {
            context.getResources().getString(com.arrow.puzzle.escape.maze.free.game.R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !GooglePlayServicesUtilLight.f4164d.get()) {
            synchronized (com.google.android.gms.common.internal.zzae.f4512a) {
                try {
                    if (!com.google.android.gms.common.internal.zzae.f4513b) {
                        com.google.android.gms.common.internal.zzae.f4513b = true;
                        try {
                            Bundle bundle = Wrappers.m3665a(context).m3662a(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                com.google.android.gms.common.internal.zzae.f4514c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i5 = com.google.android.gms.common.internal.zzae.f4514c;
            if (i5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i5 != 12451000) {
                int i6 = f4156a;
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 104 + String.valueOf(i5).length() + 194);
                AbstractC1456a.m2455v(sb, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i6, " but found ", i5);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
            }
        }
        if (DeviceProperties.m3645c(context)) {
            z = false;
        } else {
            if (DeviceProperties.f4640d == null) {
                DeviceProperties.f4640d = Boolean.valueOf(PlatformVersion.m3653a() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
            }
            if (DeviceProperties.f4640d.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        Preconditions.m3537a(i2 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i7 = 9;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            GoogleSignatureVerifier.m3405a(context);
            if (!GoogleSignatureVerifier.m3406c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z) {
                Preconditions.m3544h(packageInfo);
                if (!GoogleSignatureVerifier.m3406c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i3 = packageInfo2.versionCode;
                    if (i3 == -1) {
                        i4 = -1;
                    } else {
                        i4 = i3 / 1000;
                    }
                    if (i4 < (i2 != -1 ? i2 / 1000 : -1)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i2).length() + 11 + String.valueOf(i3).length());
                        sb2.append("Google Play services out of date for ");
                        sb2.append(packageName);
                        sb2.append(".  Requires ");
                        sb2.append(i2);
                        sb2.append(" but found ");
                        sb2.append(i3);
                        Log.w("GooglePlayServicesUtil", sb2.toString());
                        i7 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e2) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                i7 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i7 = 0;
                        } else {
                            i7 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z) {
                i3 = packageInfo2.versionCode;
                if (i3 == -1) {
                    i4 = -1;
                } else {
                    i4 = i3 / 1000;
                }
                if (i4 < (i2 != -1 ? i2 / 1000 : -1)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i2).length() + 11 + String.valueOf(i3).length());
                    sb3.append("Google Play services out of date for ");
                    sb3.append(packageName);
                    sb3.append(".  Requires ");
                    sb3.append(i2);
                    sb3.append(" but found ");
                    sb3.append(i3);
                    Log.w("GooglePlayServicesUtil", sb3.toString());
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            } else {
                i3 = packageInfo2.versionCode;
                if (i3 == -1) {
                    i4 = -1;
                } else {
                    i4 = i3 / 1000;
                }
                if (i4 < (i2 != -1 ? i2 / 1000 : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i2).length() + 11 + String.valueOf(i3).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i2);
                    sb4.append(" but found ");
                    sb4.append(i3);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i7 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i7 = 3;
                    } else {
                        i7 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i7 != 18) {
            if (i7 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return 18;
        }
        return i7;
    }
}
