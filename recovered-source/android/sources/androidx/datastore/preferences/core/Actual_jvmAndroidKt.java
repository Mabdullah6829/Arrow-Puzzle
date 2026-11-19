package androidx.datastore.preferences.core;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0063t;
import p012H0.C0302e;
import p012H0.ExecutorC0301d;
import p058e0.AbstractC6305m;

/* JADX INFO: loaded from: classes.dex */
public final class Actual_jvmAndroidKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        AbstractC6452k.m12181e(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC6305m.m12114J(set));
        AbstractC6452k.m12180d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        AbstractC6452k.m12181e(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC6452k.m12180d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final AbstractC0063t ioDispatcher() {
        C0302e c0302e = AbstractC0007H.f4a;
        return ExecutorC0301d.f608s;
    }
}
