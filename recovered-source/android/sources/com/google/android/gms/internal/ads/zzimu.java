package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class zzimu {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f19998a;

    public zzimu(int i2) {
        this.f19998a = new LinkedHashMap(i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m8545a(Object obj, zzini zziniVar) {
        if (zziniVar == null) {
            throw new NullPointerException("provider");
        }
        this.f19998a.put(obj, zziniVar);
    }

    /* JADX INFO: renamed from: b */
    public void m8546b(String str, zzini zziniVar) {
        m8545a(str, zziniVar);
    }
}
