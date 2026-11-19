package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzez {

    /* JADX INFO: renamed from: j */
    public static volatile zzez f22475j;

    /* JADX INFO: renamed from: a */
    public final DefaultClock f22476a = DefaultClock.f4636a;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f22477b;

    /* JADX INFO: renamed from: c */
    public final AppMeasurementSdk f22478c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f22479d;

    /* JADX INFO: renamed from: e */
    public int f22480e;

    /* JADX INFO: renamed from: f */
    public boolean f22481f;

    /* JADX INFO: renamed from: g */
    public final String f22482g;

    /* JADX INFO: renamed from: h */
    public volatile zzcp f22483h;

    /* JADX INFO: renamed from: i */
    public volatile long f22484i;

    public zzez(Context context, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzeb(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f22477b = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f22478c = new AppMeasurementSdk(this);
        this.f22479d = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zzlt.zza(context, "google_app_id", com.google.android.gms.measurement.internal.zzhu.zza(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzez.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f22482g = null;
                    this.f22481f = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f22482g = "fa";
        m9860l(new zzdp(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzey(this));
        }
    }

    /* JADX INFO: renamed from: o */
    public static zzez m9839o(Context context, Bundle bundle) {
        Preconditions.m3544h(context);
        if (f22475j == null) {
            synchronized (zzez.class) {
                try {
                    if (f22475j == null) {
                        f22475j = new zzez(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22475j;
    }

    /* JADX INFO: renamed from: A */
    public final void m9840A(Bundle bundle) {
        m9860l(new zzdm(this, bundle));
    }

    /* JADX INFO: renamed from: B */
    public final void m9841B() {
        m9860l(new zzdn(this));
    }

    /* JADX INFO: renamed from: C */
    public final void m9842C(long j2) {
        m9860l(new zzdo(this, j2));
    }

    /* JADX INFO: renamed from: D */
    public final void m9843D(String str) {
        m9860l(new zzdq(this, str));
    }

    /* JADX INFO: renamed from: E */
    public final void m9844E(String str) {
        m9860l(new zzdr(this, str));
    }

    /* JADX INFO: renamed from: F */
    public final void m9845F(Runnable runnable) {
        m9860l(new zzdt(this, runnable));
    }

    /* JADX INFO: renamed from: G */
    public final String m9846G() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdu(this, zzcmVar));
        return zzcmVar.m9832u(500L);
    }

    /* JADX INFO: renamed from: H */
    public final String m9847H() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdv(this, zzcmVar));
        return zzcmVar.m9832u(50L);
    }

    /* JADX INFO: renamed from: I */
    public final long m9848I() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdw(this, zzcmVar));
        Long l2 = (Long) zzcm.m9830u0(Long.class, zzcmVar.m9831k0(500L));
        if (l2 != null) {
            return l2.longValue();
        }
        long jNanoTime = System.nanoTime();
        this.f22476a.getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i2 = this.f22480e + 1;
        this.f22480e = i2;
        return jNextLong + ((long) i2);
    }

    /* JADX INFO: renamed from: a */
    public final String m9849a() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdx(this, zzcmVar));
        return zzcmVar.m9832u(500L);
    }

    /* JADX INFO: renamed from: b */
    public final String m9850b() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdy(this, zzcmVar));
        return zzcmVar.m9832u(500L);
    }

    /* JADX INFO: renamed from: c */
    public final Map m9851c(String str, String str2, boolean z) {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdz(this, str, str2, z, zzcmVar));
        Bundle bundleM9831k0 = zzcmVar.m9831k0(5000L);
        if (bundleM9831k0 == null || bundleM9831k0.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM9831k0.size());
        for (String str3 : bundleM9831k0.keySet()) {
            Object obj = bundleM9831k0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public final void m9852d(String str, Exception exc) {
        m9860l(new zzea(this, str, exc));
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m9853e(Bundle bundle, boolean z) {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzec(this, bundle, zzcmVar));
        if (z) {
            return zzcmVar.m9831k0(5000L);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final int m9854f(String str) {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzed(this, str, zzcmVar));
        Integer num = (Integer) zzcm.m9830u0(Integer.class, zzcmVar.m9831k0(WorkRequest.MIN_BACKOFF_MILLIS));
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: g */
    public final String m9855g() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzee(this, zzcmVar));
        return zzcmVar.m9832u(120000L);
    }

    /* JADX INFO: renamed from: h */
    public final Long m9856h() {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzef(this, zzcmVar));
        return (Long) zzcm.m9830u0(Long.class, zzcmVar.m9831k0(120000L));
    }

    /* JADX INFO: renamed from: i */
    public final Object m9857i(int i2) {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzeg(this, zzcmVar, i2));
        return zzcm.m9830u0(Object.class, zzcmVar.m9831k0(15000L));
    }

    /* JADX INFO: renamed from: j */
    public final void m9858j(boolean z) {
        m9860l(new zzeh(this, z));
    }

    /* JADX INFO: renamed from: k */
    public final void m9859k(Bundle bundle) {
        m9860l(new zzei(this, bundle));
    }

    /* JADX INFO: renamed from: l */
    public final void m9860l(zzeo zzeoVar) {
        this.f22477b.execute(zzeoVar);
    }

    /* JADX INFO: renamed from: m */
    public final void m9861m(Exception exc, boolean z, boolean z2) {
        this.f22481f |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            m9852d("Error with data collection. Data lost.", exc);
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    /* JADX INFO: renamed from: n */
    public final void m9862n(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2, Long l3) {
        m9860l(new zzen(this, l2, l3, str, str2, bundle, z, z2));
    }

    /* JADX INFO: renamed from: p */
    public final void m9863p(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        zzep zzepVar = new zzep(zzjpVar);
        if (this.f22483h != null) {
            try {
                this.f22483h.setEventInterceptor(zzepVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        m9860l(new zzej(this, zzepVar));
    }

    /* JADX INFO: renamed from: q */
    public final void m9864q(Intent intent) {
        m9860l(new zzek(this, intent));
    }

    /* JADX INFO: renamed from: r */
    public final void m9865r(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Preconditions.m3544h(zzjqVar);
        ArrayList arrayList = this.f22479d;
        synchronized (arrayList) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                try {
                    if (zzjqVar.equals(((Pair) arrayList.get(i2)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzeq zzeqVar = new zzeq(zzjqVar);
            arrayList.add(new Pair(zzjqVar, zzeqVar));
            if (this.f22483h != null) {
                try {
                    this.f22483h.registerOnMeasurementEventListener(zzeqVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m9860l(new zzel(this, zzeqVar));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9866s(com.google.android.gms.measurement.internal.zzjq zzjqVar) {
        Pair pair;
        Preconditions.m3544h(zzjqVar);
        ArrayList arrayList = this.f22479d;
        synchronized (arrayList) {
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= arrayList.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzjqVar.equals(((Pair) arrayList.get(i2)).first)) {
                            pair = (Pair) arrayList.get(i2);
                            break;
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            arrayList.remove(pair);
            zzeq zzeqVar = (zzeq) pair.second;
            if (this.f22483h != null) {
                try {
                    this.f22483h.unregisterOnMeasurementEventListener(zzeqVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m9860l(new zzem(this, zzeqVar));
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m9867t(String str, String str2, Object obj, boolean z) {
        m9860l(new zzdf(this, str, str2, obj, z));
    }

    /* JADX INFO: renamed from: u */
    public final void m9868u(Bundle bundle) {
        m9860l(new zzdg(this, bundle));
    }

    /* JADX INFO: renamed from: v */
    public final void m9869v(String str, String str2, Bundle bundle) {
        m9860l(new zzdh(this, str, str2, bundle));
    }

    /* JADX INFO: renamed from: w */
    public final List m9870w(String str, String str2) {
        zzcm zzcmVar = new zzcm();
        m9860l(new zzdi(this, str, str2, zzcmVar));
        List list = (List) zzcm.m9830u0(List.class, zzcmVar.m9831k0(5000L));
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: x */
    public final void m9871x(String str) {
        m9860l(new zzdj(this, str));
    }

    /* JADX INFO: renamed from: y */
    public final void m9872y(zzdd zzddVar, String str, String str2) {
        m9860l(new zzdk(this, zzddVar, str, str2));
    }

    /* JADX INFO: renamed from: z */
    public final void m9873z(Boolean bool) {
        m9860l(new zzdl(this, bool));
    }
}
