package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjb {

    /* JADX INFO: renamed from: b */
    public static final zzjb f20074b = new zzjb(new zzja().f20073a);

    /* JADX INFO: renamed from: a */
    public final Map f20075a;

    public /* synthetic */ zzjb(HashMap map) {
        this.f20075a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjb) {
            return this.f20075a.equals(((zzjb) obj).f20075a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20075a.hashCode();
    }
}
