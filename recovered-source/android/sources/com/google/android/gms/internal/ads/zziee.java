package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zziee {

    /* JADX INFO: renamed from: d */
    public static final zziee f19766d = new zziee(0);

    /* JADX INFO: renamed from: a */
    public final zzigt f19767a = new zzigt();

    /* JADX INFO: renamed from: b */
    public boolean f19768b;

    /* JADX INFO: renamed from: c */
    public boolean f19769c;

    private zziee() {
    }

    /* JADX INFO: renamed from: e */
    public static void m8307e(zzidu zziduVar, zzihq zzihqVar, int i2, Object obj) {
        if (zzihqVar == zzihq.f19912v) {
            zziduVar.mo8251e(i2, 3);
            ((zzifz) obj).mo8104f(zziduVar);
            zziduVar.mo8251e(i2, 4);
            return;
        }
        zziduVar.mo8251e(i2, zzihqVar.f19916t);
        zzihr zzihrVar = zzihr.f19919s;
        switch (zzihqVar.ordinal()) {
            case 0:
                zziduVar.mo8270x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zziduVar.mo8268v(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zziduVar.mo8269w(((Long) obj).longValue());
                break;
            case 3:
                zziduVar.mo8269w(((Long) obj).longValue());
                break;
            case 4:
                zziduVar.mo8266t(((Integer) obj).intValue());
                break;
            case 5:
                zziduVar.mo8270x(((Long) obj).longValue());
                break;
            case 6:
                zziduVar.mo8268v(((Integer) obj).intValue());
                break;
            case 7:
                zziduVar.mo8265s(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzidl)) {
                    zziduVar.mo8271y((String) obj);
                } else {
                    zziduVar.mo8260n((zzidl) obj);
                }
                break;
            case 9:
                ((zzifz) obj).mo8104f(zziduVar);
                break;
            case 10:
                zziduVar.mo8264r((zzifz) obj);
                break;
            case 11:
                if (!(obj instanceof zzidl)) {
                    byte[] bArr = (byte[]) obj;
                    zziduVar.mo8261o(bArr.length, bArr);
                } else {
                    zziduVar.mo8260n((zzidl) obj);
                }
                break;
            case 12:
                zziduVar.mo8267u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zziet)) {
                    zziduVar.mo8266t(((Integer) obj).intValue());
                } else {
                    zziduVar.mo8266t(((zziet) obj).zza());
                }
                break;
            case 14:
                zziduVar.mo8268v(((Integer) obj).intValue());
                break;
            case 15:
                zziduVar.mo8270x(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zziduVar.mo8267u((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zziduVar.mo8269w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m8308f(zzihq zzihqVar, int i2, Object obj) {
        int iM8487b;
        int iM8280b;
        int iM8280b2 = zzidu.m8280b(i2 << 3);
        if (zzihqVar == zzihq.f19912v) {
            iM8280b2 += iM8280b2;
        }
        zzihq zzihqVar2 = zzihq.f19911u;
        zzihr zzihrVar = zzihr.f19919s;
        int iM8281c = 4;
        switch (zzihqVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = zzidu.f19750b;
                iM8281c = 8;
                return iM8280b2 + iM8281c;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = zzidu.f19750b;
                return iM8280b2 + iM8281c;
            case 2:
                iM8281c = zzidu.m8281c(((Long) obj).longValue());
                return iM8280b2 + iM8281c;
            case 3:
                iM8281c = zzidu.m8281c(((Long) obj).longValue());
                return iM8280b2 + iM8281c;
            case 4:
                iM8281c = zzidu.m8281c(((Integer) obj).intValue());
                return iM8280b2 + iM8281c;
            case 5:
                ((Long) obj).getClass();
                boolean z3 = zzidu.f19750b;
                iM8281c = 8;
                return iM8280b2 + iM8281c;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = zzidu.f19750b;
                return iM8280b2 + iM8281c;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = zzidu.f19750b;
                iM8281c = 1;
                return iM8280b2 + iM8281c;
            case 8:
                if (obj instanceof zzidl) {
                    boolean z6 = zzidu.f19750b;
                    iM8487b = ((zzidl) obj).mo8132h();
                    iM8280b = zzidu.m8280b(iM8487b);
                } else {
                    boolean z7 = zzidu.f19750b;
                    iM8487b = zzihp.m8487b((String) obj);
                    iM8280b = zzidu.m8280b(iM8487b);
                }
                iM8281c = iM8280b + iM8487b;
                return iM8280b2 + iM8281c;
            case 9:
                iM8281c = ((zzifz) obj).mo8339a();
                return iM8280b2 + iM8281c;
            case 10:
                if (obj instanceof zziff) {
                    zziff zziffVar = (zziff) obj;
                    iM8487b = zziffVar.f19800c != null ? zziffVar.f19800c.mo8132h() : zziffVar.f19801d.mo8339a();
                    iM8280b = zzidu.m8280b(iM8487b);
                } else {
                    boolean z8 = zzidu.f19750b;
                    iM8487b = ((zzifz) obj).mo8339a();
                    iM8280b = zzidu.m8280b(iM8487b);
                }
                iM8281c = iM8280b + iM8487b;
                return iM8280b2 + iM8281c;
            case 11:
                if (obj instanceof zzidl) {
                    boolean z9 = zzidu.f19750b;
                    iM8487b = ((zzidl) obj).mo8132h();
                    iM8280b = zzidu.m8280b(iM8487b);
                } else {
                    boolean z10 = zzidu.f19750b;
                    iM8487b = ((byte[]) obj).length;
                    iM8280b = zzidu.m8280b(iM8487b);
                }
                iM8281c = iM8280b + iM8487b;
                return iM8280b2 + iM8281c;
            case 12:
                iM8281c = zzidu.m8280b(((Integer) obj).intValue());
                return iM8280b2 + iM8281c;
            case 13:
                iM8281c = obj instanceof zziet ? zzidu.m8281c(((zziet) obj).zza()) : zzidu.m8281c(((Integer) obj).intValue());
                return iM8280b2 + iM8281c;
            case 14:
                ((Integer) obj).getClass();
                boolean z11 = zzidu.f19750b;
                return iM8280b2 + iM8281c;
            case 15:
                ((Long) obj).getClass();
                boolean z12 = zzidu.f19750b;
                iM8281c = 8;
                return iM8280b2 + iM8281c;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM8281c = zzidu.m8280b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iM8280b2 + iM8281c;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM8281c = zzidu.m8281c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iM8280b2 + iM8281c;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m8309g(zzied zziedVar, Object obj) {
        zziedVar.getClass();
        return m8308f(null, 0, obj);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8310h(Map.Entry entry) {
        ((zzied) entry.getKey()).zzc();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final int m8311i(Map.Entry entry) {
        zzied zziedVar = (zzied) entry.getKey();
        entry.getValue();
        zziedVar.zzc();
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m8312a() {
        if (this.f19768b) {
            return;
        }
        zzigt zzigtVar = this.f19767a;
        int i2 = zzigtVar.f19891t;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((zzigu) zzigtVar.m8435b(i3)).f19883t;
            if (obj instanceof zziep) {
                zziep zziepVar = (zziep) obj;
                zziepVar.getClass();
                zzigj.f19860c.m8411a(zziepVar.getClass()).mo8395c(zziepVar);
                zziepVar.m8344p();
            }
        }
        Iterator it = zzigtVar.m8436c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zziep) {
                zziep zziepVar2 = (zziep) value;
                zziepVar2.getClass();
                zzigj.f19860c.m8411a(zziepVar2.getClass()).mo8395c(zziepVar2);
                zziepVar2.m8344p();
            }
        }
        zzigtVar.mo8433a();
        this.f19768b = true;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m8313b() {
        zzigt zzigtVar = this.f19767a;
        if (zzigtVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f19769c ? new zzife(((zzigw) zzigtVar.entrySet()).iterator()) : ((zzigw) zzigtVar.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: c */
    public final void m8314c(zzied zziedVar, Object obj) {
        zziedVar.getClass();
        zziedVar.getClass();
        obj.getClass();
        zzihq zzihqVar = zzihq.f19911u;
        zzihr zzihrVar = zzihr.f19919s;
        throw null;
    }

    public final Object clone() {
        zziee zzieeVar = new zziee();
        zzigt zzigtVar = this.f19767a;
        if (zzigtVar.f19891t > 0) {
            Map.Entry entryM8435b = zzigtVar.m8435b(0);
            zzieeVar.m8314c((zzied) ((zzigu) entryM8435b).f19882s, ((zzigu) entryM8435b).f19883t);
            throw null;
        }
        Iterator it = zzigtVar.m8436c().iterator();
        if (!it.hasNext()) {
            zzieeVar.f19769c = this.f19769c;
            return zzieeVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzieeVar.m8314c((zzied) entry.getKey(), entry.getValue());
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8315d() {
        zzigt zzigtVar = this.f19767a;
        if (zzigtVar.f19891t > 0) {
            m8310h(zzigtVar.m8435b(0));
            throw null;
        }
        Iterator it = zzigtVar.m8436c().iterator();
        if (!it.hasNext()) {
            return true;
        }
        m8310h((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zziee) {
            return this.f19767a.equals(((zziee) obj).f19767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19767a.hashCode();
    }

    public zziee(int i2) {
        m8312a();
        m8312a();
    }
}
