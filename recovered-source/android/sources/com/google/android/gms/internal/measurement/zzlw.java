package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p001B.AbstractC0076b;
import p001B.InterfaceC0097w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlw {

    /* JADX INFO: renamed from: a */
    public static final Object f22638a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile zzlc f22639b;

    /* JADX INFO: renamed from: c */
    public static final AtomicInteger f22640c;

    static {
        new AtomicReference();
        AbstractC0076b.m133h(new Object() { // from class: com.google.android.gms.internal.measurement.zzlu
        }, "BuildInfo must be non-null");
        f22640c = new AtomicInteger();
    }

    /* JADX INFO: renamed from: a */
    public static void m10472a(final Context context) {
        if (f22639b != null || context == null) {
            return;
        }
        Object obj = f22638a;
        synchronized (obj) {
            try {
                if (f22639b == null) {
                    synchronized (obj) {
                        try {
                            zzlc zzlcVar = f22639b;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzlcVar == null || zzlcVar.f22600a != context) {
                                if (zzlcVar != null) {
                                    Iterator it = zzld.f22602a.values().iterator();
                                    if (it.hasNext()) {
                                        throw null;
                                    }
                                    zzma.m10474a();
                                }
                                f22639b = new zzlc(context, AbstractC0076b.m142r(new InterfaceC0097w() { // from class: com.google.android.gms.internal.measurement.zzlv
                                    @Override // p001B.InterfaceC0097w
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = zzlw.f22638a;
                                        return zzlf.m10467a(context);
                                    }
                                }));
                                f22640c.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
