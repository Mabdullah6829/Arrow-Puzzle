package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzal {

    /* JADX INFO: renamed from: a */
    public static final HashSet f5780a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f5781b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m4188a(String str) {
        if (f5780a.add(str)) {
            String str2 = f5781b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            f5781b = sb.toString();
        }
    }
}
