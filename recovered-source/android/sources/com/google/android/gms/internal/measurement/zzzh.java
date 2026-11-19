package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzh {

    /* JADX INFO: renamed from: a */
    public static final Locale f23146a = Locale.ROOT;

    /* JADX INFO: renamed from: a */
    public static String m10746a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                String string = obj.toString();
                return string != null ? string : m10748c(obj, "toString() returned null");
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            return obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            return m10748c(obj, simpleName);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10747b(StringBuilder sb, long j2, boolean z) {
        if (j2 == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j2)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j2 >>> iNumberOfLeadingZeros) & 15)));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10748c(Object obj, String str) {
        String name = obj.getClass().getName();
        int iIdentityHashCode = System.identityHashCode(obj);
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(name.length(), 2, String.valueOf(iIdentityHashCode).length(), 2, String.valueOf(str).length()) + 1);
        sb.append("{");
        sb.append(name);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return AbstractC1456a.m2450q(sb, ": ", str, "}");
    }
}
