package com.google.android.gms.internal.measurement;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzvx extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        zzrn.m10625a(Thread.currentThread());
        zzwq zzwqVar = new zzwq();
        zzwqVar.f23051a = false;
        zzwqVar.f23052b = null;
        Thread threadCurrentThread = Thread.currentThread();
        WeakHashMap weakHashMap = zzvy.f23010c;
        synchronized (weakHashMap) {
            weakHashMap.put(threadCurrentThread, zzwqVar);
        }
        return zzwqVar;
    }
}
