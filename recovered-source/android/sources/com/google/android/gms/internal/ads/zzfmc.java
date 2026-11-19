package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfmc {

    /* JADX INFO: renamed from: d */
    public static zzfmc f16101d;

    /* JADX INFO: renamed from: a */
    public final Context f16102a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.client.zzcv f16103b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f16104c = new AtomicReference();

    public zzfmc(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.f16102a = context;
        this.f16103b = zzcvVar;
    }

    /* JADX INFO: renamed from: a */
    public static zzfmc m6524a(Context context) {
        synchronized (zzfmc.class) {
            try {
                zzfmc zzfmcVar = f16101d;
                if (zzfmcVar != null) {
                    return zzfmcVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbky.f9076b.m5057c()).longValue();
                com.google.android.gms.ads.internal.client.zzcv zzcvVarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254730000) {
                    try {
                        zzcvVarAsInterface = com.google.android.gms.ads.internal.client.zzcu.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("Failed to retrieve lite SDK info.", e);
                    }
                }
                zzfmc zzfmcVar2 = new zzfmc(applicationContext, zzcvVarAsInterface);
                f16101d = zzfmcVar2;
                return zzfmcVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6525b(zzbvj zzbvjVar) {
        zzbvj adapterCreator;
        boolean zBooleanValue = ((Boolean) zzbky.f9075a.m5057c()).booleanValue();
        AtomicReference atomicReference = this.f16104c;
        if (!zBooleanValue) {
            while (!atomicReference.compareAndSet(null, zzbvjVar) && atomicReference.get() == null) {
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.f16103b;
        if (zzcvVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        if (adapterCreator == null) {
            adapterCreator = zzbvjVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }
}
