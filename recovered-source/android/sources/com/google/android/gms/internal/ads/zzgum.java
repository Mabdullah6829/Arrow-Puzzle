package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgum {
    /* JADX INFO: renamed from: a */
    public static zzguj m7151a(zzguj zzgujVar) {
        if ((zzgujVar instanceof zzgul) || (zzgujVar instanceof zzguk)) {
            return zzgujVar;
        }
        return zzgujVar instanceof Serializable ? new zzguk(zzgujVar) : new zzgul(zzgujVar);
    }
}
