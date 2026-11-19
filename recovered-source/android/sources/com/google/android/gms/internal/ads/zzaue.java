package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzaue {

    /* JADX INFO: renamed from: a */
    public long f6935a;

    /* JADX INFO: renamed from: b */
    public final String f6936b;

    /* JADX INFO: renamed from: c */
    public final String f6937c;

    /* JADX INFO: renamed from: d */
    public final long f6938d;

    /* JADX INFO: renamed from: e */
    public final long f6939e;

    /* JADX INFO: renamed from: f */
    public final long f6940f;

    /* JADX INFO: renamed from: g */
    public final long f6941g;

    /* JADX INFO: renamed from: h */
    public final List f6942h;

    public zzaue(String str, String str2, long j2, long j3, long j4, long j5, List list) {
        this.f6936b = str;
        this.f6937c = true == "".equals(str2) ? null : str2;
        this.f6938d = j2;
        this.f6939e = j3;
        this.f6940f = j4;
        this.f6941g = j5;
        this.f6942h = list;
    }

    /* JADX INFO: renamed from: a */
    public static zzaue m4410a(zzauf zzaufVar) throws IOException {
        if (zzauh.m4413d(zzaufVar) != 538247942) {
            throw new IOException();
        }
        String strM4417h = zzauh.m4417h(zzaufVar);
        String strM4417h2 = zzauh.m4417h(zzaufVar);
        long jM4415f = zzauh.m4415f(zzaufVar);
        long jM4415f2 = zzauh.m4415f(zzaufVar);
        long jM4415f3 = zzauh.m4415f(zzaufVar);
        long jM4415f4 = zzauh.m4415f(zzaufVar);
        int iM4413d = zzauh.m4413d(zzaufVar);
        if (iM4413d < 0) {
            throw new IOException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(iM4413d).length() + 20), "readHeaderList size=", iM4413d));
        }
        List arrayList = iM4413d == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i2 = 0; i2 < iM4413d; i2++) {
            arrayList.add(new zzatd(zzauh.m4417h(zzaufVar).intern(), zzauh.m4417h(zzaufVar).intern()));
        }
        return new zzaue(strM4417h, strM4417h2, jM4415f, jM4415f2, jM4415f3, jM4415f4, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzaue(String str, zzasu zzasuVar) {
        String str2 = zzasuVar.f6847b;
        long j2 = zzasuVar.f6848c;
        long j3 = zzasuVar.f6849d;
        long j4 = zzasuVar.f6850e;
        long j5 = zzasuVar.f6851f;
        ?? arrayList = zzasuVar.f6853h;
        if (arrayList == 0) {
            Map map = zzasuVar.f6852g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j2, j3, j4, j5, arrayList);
    }
}
