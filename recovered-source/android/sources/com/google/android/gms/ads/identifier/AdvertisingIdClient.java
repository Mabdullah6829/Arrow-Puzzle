package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zzd;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a */
    public BlockingServiceConnection f3014a;

    /* JADX INFO: renamed from: b */
    public zzf f3015b;

    /* JADX INFO: renamed from: c */
    public boolean f3016c;

    /* JADX INFO: renamed from: d */
    public final Object f3017d = new Object();

    /* JADX INFO: renamed from: e */
    public zzb f3018e;

    /* JADX INFO: renamed from: f */
    public final Context f3019f;

    /* JADX INFO: renamed from: g */
    public final long f3020g;

    public static final class Info {

        /* JADX INFO: renamed from: a */
        public final String f3021a;

        /* JADX INFO: renamed from: b */
        public final boolean f3022b;

        public Info(String str, boolean z) {
            this.f3021a = str;
            this.f3022b = z;
        }

        public final String toString() {
            String str = this.f3021a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.f3022b);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context, long j2, boolean z) {
        Context applicationContext;
        Preconditions.m3544h(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f3019f = context;
        this.f3016c = false;
        this.f3020g = j2;
    }

    /* JADX INFO: renamed from: a */
    public static Info m2775a(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.m2779d(false);
            Info infoM2780f = advertisingIdClient.m2780f();
            m2777e(infoM2780f, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            advertisingIdClient.m2778c();
            return infoM2780f;
        } catch (Throwable th) {
            try {
                m2777e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.m2778c();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2776b(Context context) {
        boolean zMo9071d;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false);
        try {
            advertisingIdClient.m2779d(false);
            Preconditions.m3543g("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.f3016c) {
                        synchronized (advertisingIdClient.f3017d) {
                            zzb zzbVar = advertisingIdClient.f3018e;
                            if (zzbVar == null || !zzbVar.f3027v) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.m2779d(false);
                            if (!advertisingIdClient.f3016c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    Preconditions.m3544h(advertisingIdClient.f3014a);
                    Preconditions.m3544h(advertisingIdClient.f3015b);
                    try {
                        zMo9071d = advertisingIdClient.f3015b.mo9071d();
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.m2781g();
            advertisingIdClient.m2778c();
            return zMo9071d;
        } catch (Throwable th2) {
            advertisingIdClient.m2778c();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2777e(Info info, long j2, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.f3022b ? "0" : "1");
                String str = info.f3021a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j2));
            new zza(map).start();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2778c() {
        Preconditions.m3543g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3019f == null || this.f3014a == null) {
                    return;
                }
                try {
                    if (this.f3016c) {
                        ConnectionTracker.m3632b().m3634c(this.f3019f, this.f3014a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f3016c = false;
                this.f3015b = null;
                this.f3014a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2779d(boolean z) {
        Preconditions.m3543g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f3016c) {
                    m2778c();
                }
                Context context = this.f3019f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM3403c = GoogleApiAvailabilityLight.f4157b.m3403c(context, 12451000);
                    if (iM3403c != 0 && iM3403c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.m3632b().m3633a(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f3014a = blockingServiceConnection;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderM3391a = blockingServiceConnection.m3391a();
                            int i2 = zze.f21527s;
                            IInterface iInterfaceQueryLocalInterface = iBinderM3391a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f3015b = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinderM3391a);
                            this.f3016c = true;
                            if (z) {
                                m2781g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Info m2780f() {
        Info info;
        Preconditions.m3543g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f3016c) {
                    synchronized (this.f3017d) {
                        zzb zzbVar = this.f3018e;
                        if (zzbVar == null || !zzbVar.f3027v) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m2779d(false);
                        if (!this.f3016c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.m3544h(this.f3014a);
                Preconditions.m3544h(this.f3015b);
                try {
                    info = new Info(this.f3015b.zzc(), this.f3015b.mo9070a());
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m2781g();
        return info;
    }

    public final void finalize() throws Throwable {
        m2778c();
        super.finalize();
    }

    /* JADX INFO: renamed from: g */
    public final void m2781g() {
        synchronized (this.f3017d) {
            zzb zzbVar = this.f3018e;
            if (zzbVar != null) {
                zzbVar.f3026u.countDown();
                try {
                    this.f3018e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j2 = this.f3020g;
            if (j2 > 0) {
                this.f3018e = new zzb(this, j2);
            }
        }
    }
}
