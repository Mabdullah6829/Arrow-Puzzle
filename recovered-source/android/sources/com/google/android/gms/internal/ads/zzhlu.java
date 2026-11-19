package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlu {

    /* JADX INFO: renamed from: a */
    public final HashMap f18956a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f18957b = new HashMap();

    private zzhlu() {
    }

    /* JADX INFO: renamed from: a */
    public final void m7537a(Enum r2, Object obj) {
        this.f18956a.put(r2, obj);
        this.f18957b.put(obj, r2);
    }

    /* JADX INFO: renamed from: b */
    public final zzhlv m7538b() {
        return new zzhlv(Collections.unmodifiableMap(this.f18956a), Collections.unmodifiableMap(this.f18957b));
    }

    public /* synthetic */ zzhlu(int i2) {
    }
}
