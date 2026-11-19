package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzco extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzco(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        super(AbstractC1456a.m2450q(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
