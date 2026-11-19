package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTracker {

    /* JADX INFO: renamed from: b */
    public static final Object f4618b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile ConnectionTracker f4619c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f4620a = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    /* JADX INFO: renamed from: b */
    public static ConnectionTracker m3632b() {
        if (f4619c == null) {
            synchronized (f4618b) {
                try {
                    if (f4619c == null) {
                        f4619c = new ConnectionTracker();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ConnectionTracker connectionTracker = f4619c;
        Preconditions.m3544h(connectionTracker);
        return connectionTracker;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3633a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return m3635d(context, context.getClass().getName(), intent, serviceConnection, i2, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m3634c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof zzr)) {
            ConcurrentHashMap concurrentHashMap = this.f4620a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3635d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.m3665a(context).m3662a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof zzr) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
        }
        ConcurrentHashMap concurrentHashMap = this.f4620a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
