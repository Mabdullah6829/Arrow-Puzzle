package com.google.android.gms.internal.measurement;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzma {

    /* JADX INFO: renamed from: a */
    public static final ArrayMap f22647a = new ArrayMap();

    /* JADX INFO: renamed from: a */
    public static synchronized void m10474a() {
        ArrayMap arrayMap = f22647a;
        Iterator it = arrayMap.values().iterator();
        if (it.hasNext()) {
            ((zzma) it.next()).getClass();
            throw null;
        }
        arrayMap.clear();
    }
}
