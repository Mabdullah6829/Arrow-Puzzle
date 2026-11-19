package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzdix {

    /* JADX INFO: renamed from: s */
    public final HashMap f12222s = new HashMap();

    public zzdix(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                zzdky zzdkyVar = (zzdky) it.next();
                synchronized (this) {
                    m5924Y(zzdkyVar.f12291a, zzdkyVar.f12292b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final synchronized void m5923J0(final zzdiw zzdiwVar) {
        for (Map.Entry entry : this.f12222s.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiv
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdiwVar.mo5900b(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("EventEmitter.notify", th);
                        com.google.android.gms.ads.internal.util.zze.m3151l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized void m5924Y(Object obj, Executor executor) {
        this.f12222s.put(obj, executor);
    }
}
