package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzt {

    /* JADX INFO: renamed from: a */
    public static final zzzp f23158a = new zzzr();

    /* JADX INFO: renamed from: b */
    public static final zzzo f23159b = new zzzs();

    /* JADX INFO: renamed from: a */
    public static zzzm m10753a(Set set) {
        zzzm zzzmVar = new zzzm(f23158a);
        zzzmVar.f23153d = f23159b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzyl zzylVar = (zzyl) it.next();
            zzabr.m9334a(zzylVar, "key");
            boolean z = zzylVar.f23099c;
            HashMap map = zzzmVar.f23151b;
            HashMap map2 = zzzmVar.f23150a;
            if (z) {
                zzzo zzzoVar = zzzm.f23149f;
                if (!z) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                map2.remove(zzylVar);
                map.put(zzylVar, zzzoVar);
            } else {
                zzzp zzzpVar = zzzm.f23148e;
                map.remove(zzylVar);
                map2.put(zzylVar, zzzpVar);
            }
        }
        return zzzmVar;
    }
}
