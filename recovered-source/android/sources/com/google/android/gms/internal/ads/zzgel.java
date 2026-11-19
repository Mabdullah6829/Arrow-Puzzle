package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgel {
    /* JADX INFO: renamed from: a */
    public static byte[] m6965a(String str, boolean z) {
        zzgzo zzgzoVarMo7276i;
        zzgzn zzgznVar;
        if (z) {
            zzgznVar = (zzgzn) zzgzo.f18402b;
            if (zzgznVar.f18399e != null) {
                zzgzoVarMo7276i = zzgznVar;
                zzgzoVarMo7276i = zzgznVar.mo7276i(zzgznVar.f18398d, null);
            }
        } else {
            zzgzoVarMo7276i = zzgzo.f18401a;
        }
        zzgzoVarMo7276i = zzgznVar;
        byte[] bArrM7283h = zzgzoVarMo7276i.m7283h(str);
        if (bArrM7283h.length != 0 || str.length() <= 0) {
            return bArrM7283h;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
