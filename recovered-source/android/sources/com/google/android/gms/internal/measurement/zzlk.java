package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import p001B.AbstractC0076b;
import p001B.AbstractC0088n;
import p001B.InterfaceC0097w;
import p011H.ExecutorServiceC0267c0;
import p011H.InterfaceScheduledExecutorServiceC0260Y;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlk {

    /* JADX INFO: renamed from: j */
    public static final Object f22614j = new Object();

    /* JADX INFO: renamed from: k */
    public static final AtomicReference f22615k = new AtomicReference();

    /* JADX INFO: renamed from: l */
    public static volatile zzlk f22616l = null;

    /* JADX INFO: renamed from: m */
    public static final InterfaceC0097w f22617m = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzlp
        @Override // p001B.InterfaceC0097w
        public final Object get() {
            Object obj = zzlk.f22614j;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.measurement.zzlo
                @Override // java.util.concurrent.ThreadFactory
                public final /* synthetic */ Thread newThread(Runnable runnable) {
                    Object obj2 = zzlk.f22614j;
                    return new Thread(runnable, "ProcessStablePhenotypeFlag");
                }
            });
            return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof InterfaceScheduledExecutorServiceC0260Y ? (InterfaceScheduledExecutorServiceC0260Y) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new ExecutorServiceC0267c0(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        }
    });

    /* JADX INFO: renamed from: a */
    public final zzol f22618a = new zzol();

    /* JADX INFO: renamed from: b */
    public final Context f22619b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0097w f22620c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0097w f22621d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0097w f22622e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0097w f22623f;

    /* JADX INFO: renamed from: g */
    public final zzrf f22624g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0097w f22625h;

    /* JADX INFO: renamed from: i */
    public final zzqe f22626i;

    public interface zza {
        AbstractC0088n zza();
    }

    public zzlk(Context context, InterfaceC0097w interfaceC0097w, InterfaceC0097w interfaceC0097w2, final InterfaceC0097w interfaceC0097w3, InterfaceC0097w interfaceC0097w4, InterfaceC0097w interfaceC0097w5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        interfaceC0097w.getClass();
        interfaceC0097w2.getClass();
        interfaceC0097w3.getClass();
        interfaceC0097w4.getClass();
        interfaceC0097w5.getClass();
        InterfaceC0097w interfaceC0097wM142r = AbstractC0076b.m142r(interfaceC0097w);
        InterfaceC0097w interfaceC0097wM142r2 = AbstractC0076b.m142r(interfaceC0097w2);
        InterfaceC0097w interfaceC0097wM142r3 = AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzlq
            @Override // p001B.InterfaceC0097w
            public final /* synthetic */ Object get() {
                Object obj = zzlk.f22614j;
                return (zzqm) ((AbstractC0088n) interfaceC0097w3.get()).mo125d();
            }
        });
        InterfaceC0097w interfaceC0097wM142r4 = AbstractC0076b.m142r(interfaceC0097w4);
        InterfaceC0097w interfaceC0097wM142r5 = AbstractC0076b.m142r(interfaceC0097w5);
        this.f22619b = applicationContext;
        this.f22620c = interfaceC0097wM142r;
        this.f22621d = interfaceC0097wM142r2;
        this.f22622e = interfaceC0097wM142r3;
        this.f22623f = interfaceC0097wM142r4;
        this.f22624g = new zzrf(applicationContext, interfaceC0097wM142r, interfaceC0097wM142r4, interfaceC0097wM142r2);
        this.f22625h = interfaceC0097wM142r5;
        this.f22626i = new zzqe(applicationContext, interfaceC0097wM142r, interfaceC0097wM142r3, interfaceC0097wM142r2);
    }

    /* JADX INFO: renamed from: b */
    public static void m10470b() {
        synchronized (zzls.f22633a) {
        }
        if (f22615k.get() == null && zzls.f22634b == null) {
            zzls.f22634b = new zzlr();
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceScheduledExecutorServiceC0260Y m10471a() {
        return (InterfaceScheduledExecutorServiceC0260Y) this.f22620c.get();
    }
}
