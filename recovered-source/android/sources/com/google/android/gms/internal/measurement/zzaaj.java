package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaaj extends zzaad {

    /* JADX INFO: renamed from: b */
    public static final zzaac f21860b;

    final class zza {
    }

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            zza.class.getName().equals(m9310d());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f21860b = new zzaac() { // from class: com.google.android.gms.internal.measurement.zzaaj.1
        };
    }

    /* JADX INFO: renamed from: d */
    public static String m9310d() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    /* JADX INFO: renamed from: a */
    public final zzaac mo9305a() {
        return f21860b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    /* JADX INFO: renamed from: b */
    public final zzzf mo9306b() {
        zzzf zzzfVarZza;
        AtomicReference atomicReference = zzaao.f21868f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            return ((zzaai) atomicReference.get()).zza("Phlogger");
        }
        for (int i2 = 7; i2 >= 0; i2--) {
            char cCharAt = "Phlogger".charAt(i2);
            if (cCharAt == '$') {
                strReplace = "Phlogger".replace('$', '.');
                break;
            }
            if (cCharAt == '.') {
                break;
            }
        }
        zzaao zzaaoVar = new zzaao(strReplace);
        if (zzaao.f21865c || zzaao.f21866d) {
            new zzaah();
            zzaaoVar.f21871b = new zzaar(zzaaoVar.f21859a);
        } else {
            if (zzaao.f21867e) {
                zzaaq zzaaqVar = zzaas.f21882h;
                zzzfVarZza = new zzaaq(Level.OFF, zzaaqVar.f21875b, zzaaqVar.f21876c).zza(zzaaoVar.f21859a);
            } else {
                zzzfVarZza = null;
            }
            zzaaoVar.f21871b = zzzfVarZza;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = zzaam.f21862a;
        concurrentLinkedQueue.offer(zzaaoVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzaao zzaaoVar2 = (zzaao) concurrentLinkedQueue.poll();
                if (zzaaoVar2 == null) {
                    break;
                }
                zzaaoVar2.f21871b = ((zzaai) atomicReference.get()).zza(zzaaoVar2.f21859a);
            }
            zzaao.m9313e();
        }
        return zzaaoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    /* JADX INFO: renamed from: c */
    public final zzaat mo9307c() {
        return zzaap.f21872b;
    }
}
