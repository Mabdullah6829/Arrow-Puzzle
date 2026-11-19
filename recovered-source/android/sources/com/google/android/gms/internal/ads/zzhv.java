package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhv {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f19194f = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f19195a;

    /* JADX INFO: renamed from: b */
    public final Map f19196b;

    /* JADX INFO: renamed from: c */
    public final long f19197c;

    /* JADX INFO: renamed from: d */
    public final long f19198d;

    /* JADX INFO: renamed from: e */
    public final int f19199e;

    static {
        zzal.m4188a("media3.datasource");
    }

    public zzhv(Uri uri, long j2, long j3) {
        this(uri, Collections.EMPTY_MAP, j2, j3, 0);
    }

    public final String toString() {
        String string = this.f19195a.toString();
        int length = string.length();
        long j2 = this.f19197c;
        int length2 = String.valueOf(j2).length();
        long j3 = this.f19198d;
        int length3 = String.valueOf(j3).length();
        int i2 = this.f19199e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i2).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(string);
        sb.append(", ");
        sb.append(j2);
        AbstractC1456a.m2456w(sb, ", ", j3, ", null, ");
        return AbstractC0271e0.m402j(sb, "]", i2);
    }

    public zzhv(Uri uri, Map map, long j2, long j3, int i2) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        zzgtr.m7128a(z2);
        zzgtr.m7128a(z2);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzgtr.m7128a(z);
        uri.getClass();
        this.f19195a = uri;
        this.f19196b = Collections.unmodifiableMap(new HashMap(map));
        this.f19197c = j2;
        this.f19198d = j3;
        this.f19199e = i2;
    }
}
