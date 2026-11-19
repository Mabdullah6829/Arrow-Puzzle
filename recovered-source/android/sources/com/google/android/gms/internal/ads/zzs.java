package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f20733a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            return this.f20733a.equals(((zzs) obj).f20733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20733a.hashCode();
    }
}
