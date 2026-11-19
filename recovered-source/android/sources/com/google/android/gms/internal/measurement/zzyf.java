package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzyf {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f23096a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public abstract Object mo10705a();

    /* JADX INFO: renamed from: b */
    public final Object m10732b(zzyd zzydVar, zzzj zzzjVar) {
        ConcurrentHashMap concurrentHashMap = this.f23096a;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object objMo10705a = mo10705a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, objMo10705a);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iMo10713a = zzzjVar.mo10713a();
        zzye zzyeVar = null;
        for (int i2 = 0; i2 < iMo10713a; i2++) {
            if (zzxx.f23075f.equals(zzzjVar.mo10714b(i2))) {
                Object objMo10715c = zzzjVar.mo10715c(i2);
                if (objMo10715c instanceof zzyj) {
                    if (zzyeVar == null) {
                        zzyeVar = new zzye(this, zzydVar);
                    }
                    ((zzyj) objMo10715c).m10733a();
                }
            }
        }
        return objMo10705a;
    }
}
