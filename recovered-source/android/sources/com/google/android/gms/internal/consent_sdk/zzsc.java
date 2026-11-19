package com.google.android.gms.internal.consent_sdk;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzsc {

    /* JADX INFO: renamed from: a */
    public static final zzsr f21802a;

    static {
        int i2 = zzpc.f21705a;
        f21802a = new zzsr();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9257a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m9258b(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iM9185d = 0;
            while (i2 < size) {
                iM9185d += zzpv.m9185d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9185d;
        }
        zzqn zzqnVar = (zzqn) list;
        int iM9185d2 = 0;
        while (i2 < size) {
            iM9185d2 += zzpv.m9185d(zzqnVar.m9228b(i2));
            i2++;
        }
        return iM9185d2;
    }

    /* JADX INFO: renamed from: c */
    public static int m9259c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.m9184c(i2 << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m9260d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzpv.m9184c(i2 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: e */
    public static int m9261e(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iM9185d = 0;
            while (i2 < size) {
                iM9185d += zzpv.m9185d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9185d;
        }
        zzqn zzqnVar = (zzqn) list;
        int iM9185d2 = 0;
        while (i2 < size) {
            iM9185d2 += zzpv.m9185d(zzqnVar.m9228b(i2));
            i2++;
        }
        return iM9185d2;
    }

    /* JADX INFO: renamed from: f */
    public static int m9262f(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iM9185d = 0;
            while (i2 < size) {
                iM9185d += zzpv.m9185d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM9185d;
        }
        zzre zzreVar = (zzre) list;
        int iM9185d2 = 0;
        while (i2 < size) {
            iM9185d2 += zzpv.m9185d(zzreVar.m9232b(i2));
            i2++;
        }
        return iM9185d2;
    }

    /* JADX INFO: renamed from: g */
    public static int m9263g(int i2, Object obj, zzsa zzsaVar) {
        int i3 = i2 << 3;
        if (obj instanceof zzra) {
            int iM9184c = zzpv.m9184c(i3);
            int iM9229a = ((zzra) obj).m9229a();
            return AbstractC1456a.m2435b(iM9229a, iM9229a, iM9184c);
        }
        int iM9184c2 = zzpv.m9184c(i3);
        int iMo9144b = ((zzpa) obj).mo9144b(zzsaVar);
        return AbstractC1456a.m2435b(iMo9144b, iMo9144b, iM9184c2);
    }

    /* JADX INFO: renamed from: h */
    public static int m9264h(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iM9184c = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iM9184c += zzpv.m9184c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return iM9184c;
        }
        zzqn zzqnVar = (zzqn) list;
        int iM9184c2 = 0;
        while (i2 < size) {
            int iM9228b = zzqnVar.m9228b(i2);
            iM9184c2 += zzpv.m9184c((iM9228b >> 31) ^ (iM9228b + iM9228b));
            i2++;
        }
        return iM9184c2;
    }

    /* JADX INFO: renamed from: i */
    public static int m9265i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iM9185d = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iM9185d += zzpv.m9185d((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return iM9185d;
        }
        zzre zzreVar = (zzre) list;
        int iM9185d2 = 0;
        while (i2 < size) {
            long jM9232b = zzreVar.m9232b(i2);
            iM9185d2 += zzpv.m9185d((jM9232b >> 63) ^ (jM9232b + jM9232b));
            i2++;
        }
        return iM9185d2;
    }

    /* JADX INFO: renamed from: j */
    public static int m9266j(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzqn)) {
            int iM9184c = 0;
            while (i2 < size) {
                iM9184c += zzpv.m9184c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9184c;
        }
        zzqn zzqnVar = (zzqn) list;
        int iM9184c2 = 0;
        while (i2 < size) {
            iM9184c2 += zzpv.m9184c(zzqnVar.m9228b(i2));
            i2++;
        }
        return iM9184c2;
    }

    /* JADX INFO: renamed from: k */
    public static int m9267k(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzre)) {
            int iM9185d = 0;
            while (i2 < size) {
                iM9185d += zzpv.m9185d(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM9185d;
        }
        zzre zzreVar = (zzre) list;
        int iM9185d2 = 0;
        while (i2 < size) {
            iM9185d2 += zzpv.m9185d(zzreVar.m9232b(i2));
            i2++;
        }
        return iM9185d2;
    }
}
