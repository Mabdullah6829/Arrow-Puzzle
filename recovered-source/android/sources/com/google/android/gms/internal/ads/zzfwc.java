package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwc {

    /* JADX INFO: renamed from: d */
    public static final zzfwc f16694d = new zzfwc();

    /* JADX INFO: renamed from: a */
    public WeakReference f16695a;

    /* JADX INFO: renamed from: b */
    public boolean f16696b = false;

    /* JADX INFO: renamed from: c */
    public boolean f16697c = false;

    /* JADX INFO: renamed from: a */
    public final void m6738a(boolean z, boolean z2) {
        if ((z2 || z) == (this.f16697c || this.f16696b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(zzfvs.f16671c.f16672a).iterator();
        while (it.hasNext()) {
            zzfwi zzfwiVar = ((zzfuy) it.next()).f16616d;
            boolean z3 = z2 || z;
            if (zzfwiVar.f16703b.get() != 0) {
                zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setDeviceLockState", true != z3 ? "unlocked" : "locked");
            }
        }
    }
}
