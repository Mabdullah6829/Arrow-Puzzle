package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements ServiceConnection {

    /* JADX INFO: renamed from: s */
    public int f4114s = 0;

    /* JADX INFO: renamed from: t */
    public final Messenger f4115t;

    /* JADX INFO: renamed from: u */
    public zzq f4116u;

    /* JADX INFO: renamed from: v */
    public final ArrayDeque f4117v;

    /* JADX INFO: renamed from: w */
    public final SparseArray f4118w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzv f4119x;

    public zzp(zzv zzvVar) {
        this.f4119x = zzvVar;
        com.google.android.gms.internal.cloudmessaging.zzf zzfVar = new com.google.android.gms.internal.cloudmessaging.zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                zzp zzpVar = this.f4111s;
                synchronized (zzpVar) {
                    try {
                        zzs zzsVar = (zzs) zzpVar.f4118w.get(i2);
                        if (zzsVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                            return true;
                        }
                        zzpVar.f4118w.remove(i2);
                        zzpVar.m3379c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            zzsVar.m3383c(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        zzsVar.mo3381a(data);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f4115t = new Messenger(zzfVar);
        this.f4117v = new ArrayDeque();
        this.f4118w = new SparseArray();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3377a(String str) {
        m3378b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3378b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.f4114s;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f4114s = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f4114s = 4;
            ConnectionTracker.m3632b().m3634c(this.f4119x.f4127a, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f4117v.iterator();
            while (it.hasNext()) {
                ((zzs) it.next()).m3383c(zztVar);
            }
            this.f4117v.clear();
            for (int i3 = 0; i3 < this.f4118w.size(); i3++) {
                ((zzs) this.f4118w.valueAt(i3)).m3383c(zztVar);
            }
            this.f4118w.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3379c() {
        try {
            if (this.f4114s == 2 && this.f4117v.isEmpty() && this.f4118w.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f4114s = 3;
                ConnectionTracker.m3632b().m3634c(this.f4119x.f4127a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m3380d(zzs zzsVar) {
        try {
            int i2 = this.f4114s;
            if (i2 != 0) {
                if (i2 == 1) {
                    this.f4117v.add(zzsVar);
                    return true;
                }
                if (i2 != 2) {
                    return false;
                }
                this.f4117v.add(zzsVar);
                this.f4119x.f4128b.execute(new zzj(this));
                return true;
            }
            this.f4117v.add(zzsVar);
            Preconditions.m3546j(this.f4114s == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f4114s = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (ConnectionTracker.m3632b().m3633a(this.f4119x.f4127a, intent, this, 1)) {
                    this.f4119x.f4128b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzp zzpVar = this.f4109s;
                            synchronized (zzpVar) {
                                if (zzpVar.f4114s == 1) {
                                    zzpVar.m3377a("Timed out while binding");
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    m3377a("Unable to bind to service");
                }
            } catch (SecurityException e) {
                m3378b("Unable to bind to service", e);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f4119x.f4128b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzp zzpVar = this.f4106s;
                IBinder iBinder2 = iBinder;
                synchronized (zzpVar) {
                    if (iBinder2 == null) {
                        zzpVar.m3377a("Null service connection");
                        return;
                    }
                    try {
                        zzpVar.f4116u = new zzq(iBinder2);
                        zzpVar.f4114s = 2;
                        zzpVar.f4119x.f4128b.execute(new zzj(zzpVar));
                    } catch (RemoteException e) {
                        zzpVar.m3377a(e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f4119x.f4128b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.f4110s.m3377a("Service disconnected");
            }
        });
    }
}
