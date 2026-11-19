package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;
import java.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
final class zzgmk {

    /* JADX INFO: renamed from: a */
    public final zzavi f17792a;

    /* JADX INFO: renamed from: b */
    public final long f17793b;

    /* JADX INFO: renamed from: c */
    public final long f17794c;

    /* JADX INFO: renamed from: d */
    public final String f17795d;

    public zzgmk(zzavi zzaviVar, long j2, long j3, String str) {
        this.f17792a = zzaviVar;
        this.f17793b = j2;
        this.f17794c = j3;
        this.f17795d = str;
    }

    /* JADX INFO: renamed from: a */
    public static zzgmk m7032a(zzavi zzaviVar, byte[] bArr, boolean z) throws zzavg, zzavc {
        zzaviVar.m4436a();
        zzaviVar.f7021a.f7181d.f7165b = zzavx.m4445e(bArr);
        List list = (List) zzaviVar.m4437b(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzaviVar.m4438c(jLongValue, Optional.empty());
        byte[] bArrM4435a = zzavh.m4435a();
        String strM7282g = zzgzo.f18401a.m7282g(bArrM4435a.length, bArrM4435a);
        int length = strM7282g.length();
        String str = true != z ? "" : "-s";
        return new zzgmk(zzaviVar, jLongValue2, jLongValue3, AbstractC1456a.m2450q(new StringBuilder(str.length() + length + 12), "3.893135394.", strM7282g, str));
    }
}
