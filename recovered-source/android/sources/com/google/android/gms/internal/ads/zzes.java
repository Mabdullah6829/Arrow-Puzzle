package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes {

    /* JADX INFO: renamed from: f */
    public static zzes f14754f;

    /* JADX INFO: renamed from: a */
    public final Executor f14755a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f14756b;

    /* JADX INFO: renamed from: c */
    public final Object f14757c;

    /* JADX INFO: renamed from: d */
    public int f14758d;

    /* JADX INFO: renamed from: e */
    public boolean f14759e;

    public zzes(final Context context) {
        Executor executorM5922a = zzdi.m5922a();
        this.f14755a = executorM5922a;
        this.f14756b = new CopyOnWriteArrayList();
        this.f14757c = new Object();
        this.f14758d = 0;
        executorM5922a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzep
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzer(this.f14466s), intentFilter);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static synchronized zzes m6320a(Context context) {
        try {
            if (f14754f == null) {
                f14754f = new zzes(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14754f;
    }

    /* JADX INFO: renamed from: b */
    public final int m6321b() {
        int i2;
        synchronized (this.f14757c) {
            i2 = this.f14758d;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public final void m6322c(int i2) {
        CopyOnWriteArrayList<zzeo> copyOnWriteArrayList = this.f14756b;
        for (zzeo zzeoVar : copyOnWriteArrayList) {
            if (zzeoVar.f14361a.get() == null) {
                copyOnWriteArrayList.remove(zzeoVar);
            }
        }
        synchronized (this.f14757c) {
            try {
                if (this.f14759e && this.f14758d == i2) {
                    return;
                }
                this.f14759e = true;
                this.f14758d = i2;
                for (zzeo zzeoVar2 : this.f14756b) {
                    zzeoVar2.getClass();
                    zzeoVar2.f14362b.execute(new zzen(zzeoVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
