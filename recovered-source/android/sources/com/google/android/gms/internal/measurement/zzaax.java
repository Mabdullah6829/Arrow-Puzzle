package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzaax implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzabd zzabdVarM9325b = zzabd.m9325b(obj);
        zzabd zzabdVarM9325b2 = zzabd.m9325b(obj2);
        if (zzabdVarM9325b != zzabdVarM9325b2) {
            return zzabdVarM9325b.compareTo(zzabdVarM9325b2);
        }
        int iOrdinal = zzabdVarM9325b.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
