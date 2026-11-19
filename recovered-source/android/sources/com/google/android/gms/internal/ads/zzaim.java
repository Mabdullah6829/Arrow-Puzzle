package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzaim extends zzaio {

    /* JADX INFO: renamed from: b */
    public long f5448b;

    /* JADX INFO: renamed from: c */
    public long[] f5449c;

    /* JADX INFO: renamed from: d */
    public long[] f5450d;

    public zzaim() {
        super(new zzafx());
        this.f5448b = -9223372036854775807L;
        this.f5449c = new long[0];
        this.f5450d = new long[0];
    }

    /* JADX INFO: renamed from: a */
    public static String m4142a(zzeu zzeuVar) {
        int iM6370L = zzeuVar.m6370L();
        int i2 = zzeuVar.f14888b;
        zzeuVar.m6365G(iM6370L);
        return new String(zzeuVar.f14887a, i2, iM6370L);
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m4143b(zzeu zzeuVar) {
        int iM6382h = zzeuVar.m6382h();
        HashMap map = new HashMap(iM6382h);
        for (int i2 = 0; i2 < iM6382h; i2++) {
            String strM4142a = m4142a(zzeuVar);
            Serializable serializableM4144c = m4144c(zzeuVar.m6369K(), zzeuVar);
            if (serializableM4144c != null) {
                map.put(strM4142a, serializableM4144c);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static Serializable m4144c(int i2, zzeu zzeuVar) {
        if (i2 == 0) {
            return Double.valueOf(Double.longBitsToDouble(zzeuVar.m6378d()));
        }
        if (i2 == 1) {
            return Boolean.valueOf(zzeuVar.m6369K() == 1);
        }
        if (i2 == 2) {
            return m4142a(zzeuVar);
        }
        if (i2 != 3) {
            if (i2 == 8) {
                return m4143b(zzeuVar);
            }
            if (i2 != 10) {
                if (i2 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zzeuVar.m6378d()));
                zzeuVar.m6365G(2);
                return date;
            }
            int iM6382h = zzeuVar.m6382h();
            ArrayList arrayList = new ArrayList(iM6382h);
            for (int i3 = 0; i3 < iM6382h; i3++) {
                Serializable serializableM4144c = m4144c(zzeuVar.m6369K(), zzeuVar);
                if (serializableM4144c != null) {
                    arrayList.add(serializableM4144c);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM4142a = m4142a(zzeuVar);
            int iM6369K = zzeuVar.m6369K();
            if (iM6369K == 9) {
                return map;
            }
            Serializable serializableM4144c2 = m4144c(iM6369K, zzeuVar);
            if (serializableM4144c2 != null) {
                map.put(strM4142a, serializableM4144c2);
            }
        }
    }
}
