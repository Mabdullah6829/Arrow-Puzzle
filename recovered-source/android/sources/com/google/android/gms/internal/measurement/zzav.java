package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzav {

    /* JADX INFO: renamed from: a */
    public final ArrayList f22252a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public abstract zzao mo9805a(String str, zzg zzgVar, ArrayList arrayList);

    /* JADX INFO: renamed from: b */
    public final void m9806b(String str) {
        if (!this.f22252a.contains(zzh.m10007e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
