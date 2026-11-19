package com.google.android.gms.stats;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class WakeLock {

    /* JADX INFO: renamed from: n */
    public static final long f23195n = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: o */
    public static volatile ScheduledExecutorService f23196o = null;

    /* JADX INFO: renamed from: p */
    public static final Object f23197p = new Object();

    /* JADX INFO: renamed from: q */
    public static volatile zzd f23198q;

    /* JADX INFO: renamed from: a */
    public final Object f23199a;

    /* JADX INFO: renamed from: b */
    public final PowerManager.WakeLock f23200b;

    /* JADX INFO: renamed from: c */
    public int f23201c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f23202d;

    /* JADX INFO: renamed from: e */
    public long f23203e;

    /* JADX INFO: renamed from: f */
    public final HashSet f23204f;

    /* JADX INFO: renamed from: g */
    public boolean f23205g;

    /* JADX INFO: renamed from: h */
    public com.google.android.gms.internal.stats.zzb f23206h;

    /* JADX INFO: renamed from: i */
    public final DefaultClock f23207i;

    /* JADX INFO: renamed from: j */
    public final String f23208j;

    /* JADX INFO: renamed from: k */
    public final HashMap f23209k;

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f23210l;

    /* JADX INFO: renamed from: m */
    public final ScheduledExecutorService f23211m;

    static {
        new zzb();
    }

    public WakeLock(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f23199a = new Object();
        this.f23201c = 0;
        this.f23204f = new HashSet();
        this.f23205g = true;
        this.f23207i = DefaultClock.f4636a;
        this.f23209k = new HashMap();
        this.f23210l = new AtomicInteger(0);
        Preconditions.m3542f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f23206h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f23208j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f23208j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        this.f23200b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = WorkSourceUtil.f4649a;
        synchronized (WorkSourceUtil.class) {
            Boolean bool = WorkSourceUtil.f4651c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                WorkSourceUtil.f4651c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            packageName = Strings.m3656a(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoM3662a = Wrappers.m3665a(context).m3662a(0, packageName);
                    if (applicationInfoM3662a == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoM3662a.uid;
                        workSource = new WorkSource();
                        Method method2 = WorkSourceUtil.f4650b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method3 = WorkSourceUtil.f4649a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f23200b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e3) {
                    Log.wtf("WakeLock", e3.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f23196o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f23197p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f23196o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f23196o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f23211m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m10760a(long j2) {
        this.f23210l.incrementAndGet();
        long j3 = f23195n;
        long j4 = LocationRequestCompat.PASSIVE_INTERVAL;
        long jMax = Math.max(Math.min(LocationRequestCompat.PASSIVE_INTERVAL, j3), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.f23199a) {
            try {
                if (!m10761b()) {
                    this.f23206h = com.google.android.gms.internal.stats.zzb.f23172s;
                    this.f23200b.acquire();
                    this.f23207i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f23201c++;
                if (this.f23205g) {
                    TextUtils.isEmpty(null);
                }
                zzc zzcVar = (zzc) this.f23209k.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc();
                    this.f23209k.put(null, zzcVar);
                }
                zzcVar.f23213a++;
                this.f23207i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (LocationRequestCompat.PASSIVE_INTERVAL - jElapsedRealtime > jMax) {
                    j4 = jElapsedRealtime + jMax;
                }
                if (j4 > this.f23203e) {
                    this.f23203e = j4;
                    ScheduledFuture scheduledFuture = this.f23202d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f23202d = this.f23211m.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock wakeLock = this.f23212s;
                            synchronized (wakeLock.f23199a) {
                                try {
                                    if (wakeLock.m10761b()) {
                                        Log.e("WakeLock", String.valueOf(wakeLock.f23208j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                                        wakeLock.m10763d();
                                        if (wakeLock.m10761b()) {
                                            wakeLock.f23201c = 1;
                                            wakeLock.m10764e();
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10761b() {
        boolean z;
        synchronized (this.f23199a) {
            z = this.f23201c > 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m10762c() {
        if (this.f23210l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f23208j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f23199a) {
            try {
                if (this.f23205g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f23209k.containsKey(null)) {
                    zzc zzcVar = (zzc) this.f23209k.get(null);
                    if (zzcVar != null) {
                        int i2 = zzcVar.f23213a - 1;
                        zzcVar.f23213a = i2;
                        if (i2 == 0) {
                            this.f23209k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f23208j).concat(" counter does not exist"));
                }
                m10764e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10763d() {
        HashSet hashSet = this.f23204f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final void m10764e() {
        synchronized (this.f23199a) {
            try {
                if (m10761b()) {
                    if (this.f23205g) {
                        int i2 = this.f23201c - 1;
                        this.f23201c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.f23201c = 0;
                    }
                    m10763d();
                    Iterator it = this.f23209k.values().iterator();
                    while (it.hasNext()) {
                        ((zzc) it.next()).f23213a = 0;
                    }
                    this.f23209k.clear();
                    ScheduledFuture scheduledFuture = this.f23202d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f23202d = null;
                        this.f23203e = 0L;
                    }
                    if (this.f23200b.isHeld()) {
                        try {
                            try {
                                this.f23200b.release();
                                if (this.f23206h != null) {
                                    this.f23206h = null;
                                }
                            } catch (RuntimeException e) {
                                if (!e.getClass().equals(RuntimeException.class)) {
                                    throw e;
                                }
                                Log.e("WakeLock", String.valueOf(this.f23208j).concat(" failed to release!"), e);
                                if (this.f23206h != null) {
                                    this.f23206h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f23206h != null) {
                                this.f23206h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f23208j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
