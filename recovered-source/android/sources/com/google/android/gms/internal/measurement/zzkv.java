package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p011H.C0275g0;
import p011H.C0279i0;
import p011H.InterfaceC0237A;
import p011H.RunnableFutureC0281j0;

/* JADX INFO: loaded from: classes2.dex */
final class zzkv extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicBoolean f22585a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f22586b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0275g0 f22587c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0237A f22588d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Executor f22589e;

    public zzkv(AtomicBoolean atomicBoolean, Context context, C0275g0 c0275g0, InterfaceC0237A interfaceC0237A, Executor executor) {
        this.f22585a = atomicBoolean;
        this.f22586b = context;
        this.f22587c = c0275g0;
        this.f22588d = interfaceC0237A;
        this.f22589e = executor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f22585a.compareAndSet(false, true)) {
            try {
                this.f22586b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                Log.w("DirectBootUtils", "Failed to unregister receiver", e);
            }
            C0275g0 c0275g0 = this.f22587c;
            InterfaceC0237A interfaceC0237A = this.f22588d;
            Executor executor = this.f22589e;
            RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0();
            runnableFutureC0281j0.f553A = new C0279i0(runnableFutureC0281j0, interfaceC0237A);
            executor.execute(runnableFutureC0281j0);
            c0275g0.m439n(runnableFutureC0281j0);
        }
    }
}
