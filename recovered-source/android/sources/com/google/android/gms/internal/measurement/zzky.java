package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p011H.AbstractC0290s;
import p011H.C0268d;
import p011H.C0275g0;
import p011H.C0279i0;
import p011H.EnumC0244H;
import p011H.InterfaceC0237A;
import p011H.RunnableFutureC0281j0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzky {

    /* JADX INFO: renamed from: a */
    public static UserManager f22595a = null;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f22596b = false;

    private zzky() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0290s m10463a(final Context context, final Callable callable, Executor executor) {
        InterfaceC0237A interfaceC0237A = new InterfaceC0237A() { // from class: com.google.android.gms.internal.measurement.zzkx
            @Override // p011H.InterfaceC0237A
            public final ListenableFuture call() {
                RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(callable);
                EnumC0244H.f483s.execute(runnableFutureC0281j0);
                return runnableFutureC0281j0;
            }
        };
        if (m10464b(context)) {
            RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0();
            runnableFutureC0281j0.f553A = new C0279i0(runnableFutureC0281j0, interfaceC0237A);
            executor.execute(runnableFutureC0281j0);
            return runnableFutureC0281j0;
        }
        final C0275g0 c0275g0 = new C0275g0();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final zzkv zzkvVar = new zzkv(atomicBoolean, context, c0275g0, interfaceC0237A, executor);
        context.registerReceiver(zzkvVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!m10464b(context) || !atomicBoolean.compareAndSet(false, true)) {
            c0275g0.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzkw
                @Override // java.lang.Runnable
                public final void run() {
                    C0275g0 c0275g1 = c0275g0;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    Context context2 = context;
                    BroadcastReceiver broadcastReceiver = zzkvVar;
                    if ((c0275g1.f567s instanceof C0268d) && atomicBoolean2.compareAndSet(false, true)) {
                        try {
                            context2.unregisterReceiver(broadcastReceiver);
                        } catch (IllegalArgumentException e) {
                            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
                        }
                    }
                }
            }, EnumC0244H.f483s);
            return c0275g0;
        }
        try {
            context.unregisterReceiver(zzkvVar);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        RunnableFutureC0281j0 runnableFutureC0281j1 = new RunnableFutureC0281j0();
        runnableFutureC0281j1.f553A = new C0279i0(runnableFutureC0281j1, interfaceC0237A);
        executor.execute(runnableFutureC0281j1);
        c0275g0.m439n(runnableFutureC0281j1);
        return c0275g0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    /* JADX INFO: renamed from: b */
    public static boolean m10464b(Context context) {
        if (f22596b) {
            return true;
        }
        synchronized (zzky.class) {
            try {
                if (f22596b) {
                    return true;
                }
                int i2 = 1;
                while (true) {
                    boolean z = false;
                    if (i2 <= 2) {
                        if (f22595a == null) {
                            f22595a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f22595a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                f22595a = null;
                                i2++;
                            }
                        }
                        if (z) {
                            f22596b = true;
                        }
                        return z;
                    }
                    if (z) {
                        f22595a = null;
                    }
                    if (z) {
                        f22596b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
