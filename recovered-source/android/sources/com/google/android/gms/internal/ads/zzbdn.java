package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdn {

    /* JADX INFO: renamed from: a */
    public final HashMap f7661a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final AtomicReference m4756a(String str) {
        synchronized (this) {
            try {
                HashMap map = this.f7661a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.f7661a.get(str);
    }
}
