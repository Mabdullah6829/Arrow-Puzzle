package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzij {

    /* JADX INFO: renamed from: a */
    public final HashMap f19940a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map f19941b;

    /* JADX INFO: renamed from: a */
    public final synchronized Map m8501a() {
        try {
            if (this.f19941b == null) {
                this.f19941b = Collections.unmodifiableMap(new HashMap(this.f19940a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19941b;
    }
}
