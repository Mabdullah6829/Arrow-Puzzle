package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcaf implements zzcah {

    /* JADX INFO: renamed from: l */
    public static final Object f9585l = new Object();

    /* JADX INFO: renamed from: m */
    public static zzcah f9586m;

    /* JADX INFO: renamed from: n */
    public static zzcah f9587n;

    /* JADX INFO: renamed from: o */
    public static zzcah f9588o;

    /* JADX INFO: renamed from: p */
    public static Boolean f9589p;

    /* JADX INFO: renamed from: b */
    public final Context f9591b;

    /* JADX INFO: renamed from: e */
    public final VersionInfoParcel f9594e;

    /* JADX INFO: renamed from: f */
    public final PackageInfo f9595f;

    /* JADX INFO: renamed from: g */
    public final String f9596g;

    /* JADX INFO: renamed from: h */
    public final String f9597h;

    /* JADX INFO: renamed from: j */
    public boolean f9599j;

    /* JADX INFO: renamed from: k */
    public final HashSet f9600k;

    /* JADX INFO: renamed from: a */
    public final Object f9590a = new Object();

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f9592c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public final ExecutorService f9593d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzgav(0)));

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f9598i = new AtomicBoolean();

    /* JADX WARN: Code duplicated, block: B:11:0x0053  */
    public zzcaf(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfoM3663b;
        String country;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f9591b = context;
        this.f9594e = versionInfoParcel;
        String string = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8317S8)).booleanValue()) {
            zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
            if (context == null || context.getApplicationInfo() == null) {
                packageInfoM3663b = null;
            } else {
                try {
                    packageInfoM3663b = Wrappers.m3665a(context).m3663b(0, context.getApplicationInfo().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfoM3663b = null;
                }
            }
        } else {
            packageInfoM3663b = null;
        }
        this.f9595f = packageInfoM3663b;
        zzbio zzbioVar = zzbix.f8096F8;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            zzgax zzgaxVar2 = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
            country = Locale.getDefault().getCountry();
        } else {
            country = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        this.f9596g = country;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            Context context2 = this.f9591b;
            zzgax zzgaxVar3 = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
            if (context2 != null) {
                try {
                    PackageInfo packageInfoM3663b2 = Wrappers.m3665a(context2).m3663b(128, "com.android.vending");
                    if (packageInfoM3663b2 != null) {
                        string = Integer.toString(packageInfoM3663b2.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        } else {
            string = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        this.f9597h = string;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8028B8)).intValue() > 0) {
            this.f9600k = new HashSet();
        }
    }

    /* JADX INFO: renamed from: c */
    public static zzcah m5286c(Context context) {
        synchronized (f9585l) {
            try {
                if (f9586m == null) {
                    if (m5290h(context)) {
                        f9586m = new zzcaf(context, VersionInfoParcel.m3031w());
                    } else {
                        f9586m = new zzcag();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9586m;
    }

    /* JADX INFO: renamed from: d */
    public static zzcah m5287d(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (f9585l) {
            try {
                if (f9588o == null) {
                    boolean z = false;
                    if (((Boolean) zzbkp.f8999c.m5057c()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8869z8)).booleanValue() || ((Boolean) zzbkp.f8997a.m5057c()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (m5290h(context)) {
                        zzcaf zzcafVar = new zzcaf(context, versionInfoParcel);
                        zzcafVar.m5294i();
                        Thread.setDefaultUncaughtExceptionHandler(new zzcac(zzcafVar, Thread.getDefaultUncaughtExceptionHandler()));
                        f9588o = zzcafVar;
                    } else if (!z || context == null) {
                        f9588o = new zzcag();
                    } else {
                        zzcaf zzcafVar2 = new zzcaf(context, versionInfoParcel);
                        zzcafVar2.f9599j = true;
                        zzcafVar2.m5294i();
                        Thread.setDefaultUncaughtExceptionHandler(new zzcac(zzcafVar2, Thread.getDefaultUncaughtExceptionHandler()));
                        f9588o = zzcafVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9588o;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002b, B:14:0x0039, B:15:0x0040), top: B:20:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public static zzcah m5288e(Context context) {
        synchronized (f9585l) {
            try {
                if (f9587n == null) {
                    zzbio zzbioVar = zzbix.f8011A8;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8869z8)).booleanValue() || context == null) {
                            f9587n = new zzcag();
                        } else {
                            f9587n = new zzcaf(context, VersionInfoParcel.m3031w());
                        }
                    } else {
                        f9587n = new zzcag();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9587n;
    }

    /* JADX INFO: renamed from: f */
    public static String m5289f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m5290h(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (f9585l) {
            try {
                if (f9589p == null) {
                    f9589p = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzay.f3085g.f3090e.nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8570he)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f9589p.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8869z8)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    /* JADX INFO: renamed from: a */
    public final void mo5291a(String str, Throwable th) {
        if (this.f9599j) {
            return;
        }
        mo5292b(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    /* JADX INFO: renamed from: b */
    public final void mo5292b(Throwable th, String str, float f2) {
        Throwable th2;
        String strM3035d;
        boolean zM3664c;
        String packageName;
        PackageInfo packageInfoM3663b;
        ActivityManager.MemoryInfo memoryInfoM3037j;
        Context context = this.f9591b;
        if (this.f9599j) {
            return;
        }
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
        if (((Boolean) zzblg.f9127e.m5057c()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8457b3)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.m3039p(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.m3039p(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strM5289f = m5289f(th);
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8414Y9)).booleanValue() || (strM3035d = com.google.android.gms.ads.internal.util.client.zzf.m3035d(m5289f(th), "SHA-256")) == null) {
                strM3035d = "";
            }
            double d = f2;
            double dRandom = Math.random();
            int i2 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zM3664c = Wrappers.m3665a(context).m3664c();
                } catch (Throwable th4) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3071d("Error fetching instant app info", th4);
                    zM3664c = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f("Cannot obtain package name, proceeding.");
                    packageName = EnvironmentCompat.MEDIA_UNKNOWN;
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zM3664c)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i3 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i3));
                String str2 = Build.MANUFACTURER;
                String strM2450q = Build.MODEL;
                if (!strM2450q.startsWith(str2)) {
                    strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(str2).length() + 1 + strM2450q.length()), str2, " ", strM2450q);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strM2450q);
                VersionInfoParcel versionInfoParcel = this.f9594e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.f3396s).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strM5289f);
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                zzbip zzbipVar = zzbaVar.f3096a;
                zzbiv zzbivVar = zzbaVar.f3098c;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", zzbipVar.m5023a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "910357297").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(zzblg.f9125c.m5057c()));
                GoogleApiAvailabilityLight.f4157b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.m3401a(context))).appendQueryParameter("lite", true != versionInfoParcel.f3400w ? "0" : "1");
                if (!TextUtils.isEmpty(strM3035d)) {
                    builderAppendQueryParameter6.appendQueryParameter("hash", strM3035d);
                }
                if (((Boolean) zzbivVar.m5030a(zzbix.f8113G8)).booleanValue() && (memoryInfoM3037j = com.google.android.gms.ads.internal.util.client.zzf.m3037j(context)) != null) {
                    builderAppendQueryParameter6.appendQueryParameter("available_memory", Long.toString(memoryInfoM3037j.availMem));
                    builderAppendQueryParameter6.appendQueryParameter("total_memory", Long.toString(memoryInfoM3037j.totalMem));
                    builderAppendQueryParameter6.appendQueryParameter("is_low_memory", true != memoryInfoM3037j.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzbivVar.m5030a(zzbix.f8096F8)).booleanValue()) {
                    String str3 = this.f9596g;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter6.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.f9597h;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter6.appendQueryParameter("psv", str4);
                    }
                    if (i3 >= 26) {
                        packageInfoM3663b = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoM3663b = null;
                    } else {
                        try {
                            packageInfoM3663b = Wrappers.m3665a(context).m3663b(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfoM3663b = null;
                        }
                    }
                    if (packageInfoM3663b != null) {
                        builderAppendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfoM3663b.versionCode));
                        builderAppendQueryParameter6.appendQueryParameter("wvvn", packageInfoM3663b.versionName);
                        builderAppendQueryParameter6.appendQueryParameter("wvpn", packageInfoM3663b.packageName);
                    }
                }
                PackageInfo packageInfo = this.f9595f;
                if (packageInfo != null) {
                    builderAppendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8337Tc)).booleanValue()) {
                    String strM3038k = com.google.android.gms.ads.internal.util.client.zzf.m3038k(context);
                    builderAppendQueryParameter6.appendQueryParameter("uev", strM3038k != null ? strM3038k : "");
                }
                arrayList2.add(builderAppendQueryParameter6.toString());
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    final String str5 = (String) obj;
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(context, null);
                    this.f9593d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzuVar.m3081a(null, str5);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5293g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zM3039p = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zM3039p |= com.google.android.gms.ads.internal.util.client.zzf.m3039p(stackTraceElement.getClassName());
                    zEquals |= zzcaf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8028B8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.f9600k;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strM3035d = com.google.android.gms.ads.internal.util.client.zzf.m3035d(m5289f(th), "SHA-256");
                if (strM3035d == null) {
                    strM3035d = "";
                }
                if (hashSet.contains(strM3035d)) {
                    return;
                } else {
                    hashSet.add(strM3035d);
                }
            }
            if (!zM3039p || zEquals) {
                return;
            }
            if (!this.f9599j) {
                mo5291a("", th);
            }
            if (this.f9598i.getAndSet(true) || !((Boolean) zzbkp.f8999c.m5057c()).booleanValue() || (sharedPreferences = (context = this.f9591b).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", zzbii.m5011b(context, "crash_without_write") + 1).commit();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5294i() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f9590a) {
            this.f9592c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzcad(this, thread.getUncaughtExceptionHandler()));
    }
}
