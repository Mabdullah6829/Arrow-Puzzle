package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvr extends zzfvu {

    /* JADX INFO: renamed from: v */
    public static final zzfvr f16670v = new zzfvr();

    private zzfvr() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfvu
    /* JADX INFO: renamed from: a */
    public final boolean mo6731a() {
        Iterator it = Collections.unmodifiableCollection(zzfvs.f16671c.f16673b).iterator();
        while (it.hasNext()) {
            View view = (View) ((zzfuy) it.next()).f16615c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    /* JADX INFO: renamed from: b */
    public final void mo6732b(boolean z) {
        Iterator it = Collections.unmodifiableCollection(zzfvs.f16671c.f16672a).iterator();
        while (it.hasNext()) {
            zzfwi zzfwiVar = ((zzfuy) it.next()).f16616d;
            if (zzfwiVar.f16703b.get() != 0) {
                zzfvz.f16687a.m6735a(zzfwiVar.m6743c(), "setState", true != z ? "backgrounded" : "foregrounded", zzfwiVar.f16702a);
            }
        }
    }
}
