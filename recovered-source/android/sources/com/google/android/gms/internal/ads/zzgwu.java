package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwu {

    /* JADX INFO: renamed from: a */
    public final Object f18304a;

    /* JADX INFO: renamed from: b */
    public final Object f18305b;

    /* JADX INFO: renamed from: c */
    public final Object f18306c;

    public zzgwu(Object obj, Object obj2, Object obj3) {
        this.f18304a = obj;
        this.f18305b = obj2;
        this.f18306c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m7224a() {
        Object obj = this.f18304a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f18305b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f18306c);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 33, length2, 5, length3) + 1 + strValueOf4.length());
        AbstractC0271e0.m413u(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(AbstractC1456a.m2451r(sb, " and ", strValueOf3, "=", strValueOf4));
    }
}
