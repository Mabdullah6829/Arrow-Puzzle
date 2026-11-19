package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzind extends zzimv {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f20012b = 0;

    static {
        zzina.m8549a(Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: a */
    public static zzinc m8552a(int i2) {
        return new zzinc(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.f19999a;
        int size = map.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzini) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
