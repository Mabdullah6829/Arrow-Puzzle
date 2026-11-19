package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzceg {

    /* JADX INFO: renamed from: e */
    public zzdzt f9832e;

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9828a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final Object f9829b = new Object();

    /* JADX INFO: renamed from: c */
    public String f9830c = null;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f9831d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f9833f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g */
    public final AtomicReference f9834g = new AtomicReference(null);

    /* JADX INFO: renamed from: h */
    public final AtomicReference f9835h = new AtomicReference(null);

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f9836i = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: j */
    public final Object f9837j = new Object();

    /* JADX INFO: renamed from: f */
    public static final Bundle m5359f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m5360g(Context context) {
        zzbio zzbioVar = zzbix.f8325T0;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m3699a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzbaVar.f3098c.m5030a(zzbix.f8341U0)).intValue()) {
            return false;
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8357V0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5361a(Context context) {
        int iM3403c;
        zzbio zzbioVar = zzbix.f8190L0;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && !this.f9831d.get()) {
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8373W0)).booleanValue()) {
                AtomicInteger atomicInteger = this.f9833f;
                if (atomicInteger.get() == -1) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a;
                    zzgax zzgaxVar = com.google.android.gms.ads.internal.util.client.zzf.f3409b;
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f4157b;
                    if (googleApiAvailabilityLight.m3403c(context, 12451000) != 0 && ((iM3403c = googleApiAvailabilityLight.m3403c(context, 12451000)) == 0 || iM3403c == 2)) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final String m5362b(Context context) {
        if (!m5361a(context)) {
            return null;
        }
        synchronized (this.f9829b) {
            try {
                String str = this.f9830c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) m5369k(context, "getGmpAppId");
                this.f9830c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m5363c(final Context context) {
        if (m5361a(context)) {
            zzbio zzbioVar = zzbix.f8292R0;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            zzbiv zzbivVar = zzbaVar.f3098c;
            zzbiv zzbivVar2 = zzbaVar.f3098c;
            long jLongValue = ((Long) zzbivVar.m5030a(zzbioVar)).longValue();
            if (jLongValue < 0) {
                return (String) m5369k(context, "getAppInstanceId");
            }
            AtomicReference atomicReference = this.f9828a;
            if (atomicReference.get() == null) {
                zzbio zzbioVar2 = zzbix.f8309S0;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbivVar2.m5030a(zzbioVar2)).intValue(), ((Integer) zzbivVar2.m5030a(zzbioVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcee(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcef
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return (String) this.m5369k(context, "getAppInstanceId");
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final String m5364d(Context context) {
        Object objM5369k;
        if (m5361a(context) && (objM5369k = m5369k(context, "generateEventId")) != null) {
            return objM5369k.toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m5365e(Context context, String str, String str2, String str3, int i2) {
        if (m5361a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i2);
            m5366h(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i2).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5366h(Context context, String str, String str2, Bundle bundle) {
        if (m5361a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String strValueOf = String.valueOf(str2);
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3071d("Invalid event ID: ".concat(strValueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f9834g;
            if (m5371m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f9836i;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        m5370l("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m5370l("logEventInternal", true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final Method m5367i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f9836i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m5370l(str, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5368j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f9834g;
        if (m5371m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f9836i;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    m5370l(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
            } catch (Exception unused2) {
                m5370l(str2, false);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final Object m5369k(Context context, String str) {
        AtomicReference atomicReference = this.f9834g;
        if (!m5371m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return m5367i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            m5370l(str, true);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m5370l(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.f9831d;
        if (atomicBoolean.get()) {
            return;
        }
        String strM2450q = AbstractC1456a.m2450q(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
        com.google.android.gms.ads.internal.util.client.zzo.m3073f(strM2450q);
        if (z) {
            com.google.android.gms.ads.internal.util.client.zzo.m3073f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.f9832e != null) {
            if (this.f9835h.get() == null && this.f9834g.get() == null) {
                return;
            }
            zzdzs zzdzsVarM6111a = this.f9832e.m6111a();
            zzdzsVarM6111a.m6107b("action", "ga_log_event_error");
            zzdzsVarM6111a.m6107b("method_name", str);
            zzdzsVarM6111a.m6108c();
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m5371m(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, objInvoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            m5370l("getInstance", z);
            return false;
        }
    }
}
