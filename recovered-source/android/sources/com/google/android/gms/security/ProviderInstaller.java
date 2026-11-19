package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderInstaller {

    /* JADX INFO: renamed from: a */
    public static final GoogleApiAvailabilityLight f23175a = GoogleApiAvailabilityLight.f4157b;

    /* JADX INFO: renamed from: b */
    public static final Object f23176b = new Object();

    /* JADX INFO: renamed from: c */
    public static Method f23177c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f23178d = false;

    public interface ProviderInstallListener {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007c, B:23:0x0081, B:20:0x0068, B:25:0x0083, B:27:0x0088, B:33:0x0094, B:35:0x0098, B:38:0x00d2, B:41:0x00e2, B:42:0x00e7, B:44:0x00e9, B:45:0x00f7), top: B:48:0x0052, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e9 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:12:0x0052, B:15:0x0059, B:22:0x007c, B:23:0x0081, B:20:0x0068, B:25:0x0083, B:27:0x0088, B:33:0x0094, B:35:0x0098, B:38:0x00d2, B:41:0x00e2, B:42:0x00e7, B:44:0x00e9, B:45:0x00f7), top: B:48:0x0052, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m10756a(Context context) {
        boolean z;
        Context contextCreatePackageContext;
        Context context2;
        Preconditions.m3545i(context, "Context must not be null");
        f23175a.getClass();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
        int iM3403c = googleApiAvailabilityLight.m3403c(context, 11925000);
        if (iM3403c != 0) {
            Intent intentM3402b = googleApiAvailabilityLight.m3402b(context, iM3403c, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iM3403c).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iM3403c);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentM3402b != null) {
                throw new GooglePlayServicesRepairableException(iM3403c);
            }
            throw new GooglePlayServicesNotAvailableException(iM3403c);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f23176b) {
            Context context3 = null;
            if (f23178d) {
                z = f23178d;
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
                if (contextCreatePackageContext != null) {
                    f23178d = true;
                    if (!z) {
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = contextCreatePackageContext.getClassLoader();
                        zzi zziVar = new zzi(Context.class, context);
                        Class cls = Long.TYPE;
                        zzj.m9106a(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zziVar, new zzh(cls, Long.valueOf(jUptimeMillis)), new zzh(cls, Long.valueOf(jUptimeMillis2)));
                    }
                    context3 = contextCreatePackageContext;
                }
                if (context3 != null) {
                    m10757b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                } else {
                    Log.e("ProviderInstaller", "Failed to get remote context");
                    throw new GooglePlayServicesNotAvailableException(8);
                }
            }
            try {
                context2 = DynamiteModule.m3700c(context, DynamiteModule.f4720e, "com.google.android.gms.providerinstaller.dynamite").f4731a;
            } catch (DynamiteModule.LoadingException e) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                m10757b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            z = f23178d;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                f23178d = true;
                if (!z) {
                    try {
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        ClassLoader classLoader2 = contextCreatePackageContext.getClassLoader();
                        zzi zziVar2 = new zzi(Context.class, context);
                        Class cls2 = Long.TYPE;
                        zzj.m9106a(classLoader2.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zziVar2, new zzh(cls2, Long.valueOf(jUptimeMillis)), new zzh(cls2, Long.valueOf(jUptimeMillis3)));
                    } catch (Exception e2) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e2.toString()));
                    }
                }
                context3 = contextCreatePackageContext;
            }
            if (context3 != null) {
                m10757b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
                return;
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10757b(Context context, String str) throws GooglePlayServicesNotAvailableException {
        try {
            if (f23177c == null) {
                f23177c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f23177c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
