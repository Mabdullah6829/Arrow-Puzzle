package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcm extends zzcr {

    /* JADX INFO: renamed from: s */
    public final AtomicReference f22351s = new AtomicReference();

    /* JADX INFO: renamed from: t */
    public boolean f22352t;

    /* JADX INFO: renamed from: u0 */
    public static final Object m9830u0(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", "Unexpected object type. Expected, Received: " + cls.getCanonicalName() + ", " + obj.getClass().getCanonicalName(), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final Bundle m9831k0(long j2) {
        Bundle bundle;
        AtomicReference atomicReference = this.f22351s;
        synchronized (atomicReference) {
            if (!this.f22352t) {
                try {
                    atomicReference.wait(j2);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f22351s.get();
        }
        return bundle;
    }

    /* JADX INFO: renamed from: u */
    public final String m9832u(long j2) {
        return (String) m9830u0(String.class, m9831k0(j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void zzb(Bundle bundle) {
        AtomicReference atomicReference = this.f22351s;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f22352t = true;
                    this.f22351s.notify();
                } catch (Throwable th) {
                    this.f22351s.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
