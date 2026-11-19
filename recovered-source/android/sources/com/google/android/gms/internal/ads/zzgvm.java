package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgvm<K, V> implements zzgyb<K, V> {

    /* JADX INFO: renamed from: s */
    public transient Set f18259s;

    /* JADX INFO: renamed from: t */
    public transient Collection f18260t;

    /* JADX INFO: renamed from: u */
    public transient Map f18261u;

    /* JADX INFO: renamed from: a */
    public abstract Map mo7169a();

    /* JADX INFO: renamed from: b */
    public boolean mo7172b(Object obj) {
        Iterator<V> it = mo7173k().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgyb) {
            return mo7173k().equals(((zzgyb) obj).mo7173k());
        }
        return false;
    }

    public final int hashCode() {
        return mo7173k().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgyb
    /* JADX INFO: renamed from: k */
    public Map mo7173k() {
        Map map = this.f18261u;
        if (map != null) {
            return map;
        }
        Map mapMo7169a = mo7169a();
        this.f18261u = mapMo7169a;
        return mapMo7169a;
    }

    public final String toString() {
        return mo7173k().toString();
    }
}
