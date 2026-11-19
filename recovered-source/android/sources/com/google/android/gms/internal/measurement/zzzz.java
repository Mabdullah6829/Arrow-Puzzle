package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzzz extends zzaaa {

    /* JADX INFO: renamed from: b */
    public final Map f23171b;

    public zzzz(zzzj zzzjVar, zzzj zzzjVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m10755d(linkedHashMap, zzzjVar);
        m10755d(linkedHashMap, zzzjVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzyl) entry.getKey()).f23099c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f23171b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public static void m10755d(LinkedHashMap linkedHashMap, zzzj zzzjVar) {
        for (int i2 = 0; i2 < zzzjVar.mo10713a(); i2++) {
            zzyl zzylVarMo10714b = zzzjVar.mo10714b(i2);
            Object obj = linkedHashMap.get(zzylVarMo10714b);
            boolean z = zzylVarMo10714b.f23099c;
            Class cls = zzylVarMo10714b.f23098b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(zzylVarMo10714b, arrayList);
                }
                arrayList.add(cls.cast(zzzjVar.mo10715c(i2)));
            } else {
                linkedHashMap.put(zzylVarMo10714b, cls.cast(zzzjVar.mo10715c(i2)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: a */
    public final void mo9302a(zzzq zzzqVar, zzzc zzzcVar) {
        for (Map.Entry entry : this.f23171b.entrySet()) {
            zzyl zzylVar = (zzyl) entry.getKey();
            Object value = entry.getValue();
            if (zzylVar.f23099c) {
                zzzqVar.mo10752b(zzylVar, ((List) value).iterator(), zzzcVar);
            } else {
                zzzqVar.mo10751a(zzylVar, value, zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: b */
    public final int mo9303b() {
        return this.f23171b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: c */
    public final Set mo9304c() {
        return this.f23171b.keySet();
    }
}
