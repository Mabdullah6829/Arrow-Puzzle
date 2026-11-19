package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.Trace;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p003C.AbstractC0120k;
import p003C.C0135z;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvy {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f23008a;

    /* JADX INFO: renamed from: b */
    public static final zzrg f23009b;

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f23010c;

    /* JADX INFO: renamed from: d */
    public static final zzvx f23011d;

    static {
        AbstractC0120k.m204n(5, "androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        f23008a = new AtomicReference(C0135z.f209B);
        f23009b = new zzrg();
        f23010c = new WeakHashMap();
        f23011d = new zzvx();
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public static zzws m10684a() {
        zzwq zzwqVarM10686c = m10686c();
        zzws zzwsVar = zzwqVarM10686c.f23052b;
        if (zzwsVar != null && zzwsVar != zzwg.f23021y) {
            return zzwsVar;
        }
        zzvr zzvrVar = zzwd.f23017y;
        UUID uuidM10688b = zzvz.f23012c.m10688b();
        String strM10673c = zzvn.m10673c(uuidM10688b);
        AbstractC0120k abstractC0120k = (AbstractC0120k) f23008a.get();
        if (!abstractC0120k.isEmpty()) {
            abstractC0120k.forEach(new zzwc());
        }
        return new zzwd(uuidM10688b, strM10673c, zzwd.f23017y, zzwqVarM10686c);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX INFO: renamed from: b */
    public static zzws m10685b(zzwq zzwqVar, zzws zzwsVar) {
        boolean zMo10624a;
        zzwqVar.getClass();
        zzws zzwsVar2 = zzwqVar.f23052b;
        if (zzwsVar2 != zzwsVar) {
            if (zzwsVar2 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    zMo10624a = Trace.isEnabled();
                } else {
                    zMo10624a = zzrj.f22820a.mo10624a(f23009b);
                }
                zzwqVar.f23051a = zMo10624a;
            }
            if (zzwqVar.f23051a) {
                if (zzwsVar2 != null) {
                    if (zzwsVar != null) {
                        if (zzwsVar2.zzb() == zzwsVar && zzwsVar2.zza() == Thread.currentThread()) {
                            Trace.endSection();
                        } else if (zzwsVar2 == zzwsVar.zzb() && zzwsVar.zza() == Thread.currentThread()) {
                            zzwr.m10702c(zzwsVar);
                        }
                    }
                    zzwr.m10701b(zzwsVar2);
                    if (zzwsVar != null) {
                        zzwr.m10700a(zzwsVar);
                    }
                } else if (zzwsVar != null) {
                    zzwr.m10700a(zzwsVar);
                }
            }
            if (zzwsVar2 != zzwsVar) {
                zzwqVar.f23052b = zzwsVar;
                return zzwsVar2;
            }
        }
        return zzwsVar;
    }

    /* JADX INFO: renamed from: c */
    public static zzwq m10686c() {
        return (zzwq) f23011d.get();
    }
}
