package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzqf {

    /* JADX INFO: renamed from: d */
    public static final zzqf f21728d = new zzqf(0);

    /* JADX INFO: renamed from: a */
    public final zzsd f21729a = new zzsd();

    /* JADX INFO: renamed from: b */
    public boolean f21730b;

    /* JADX INFO: renamed from: c */
    public boolean f21731c;

    private zzqf() {
    }

    /* JADX INFO: renamed from: a */
    public static int m9209a(zzsz zzszVar, int i2, Object obj) {
        int iMo9150d;
        int iM9184c;
        int iM9184c2 = zzpv.m9184c(i2 << 3);
        if (zzszVar == zzsz.f21832v) {
            iM9184c2 += iM9184c2;
        }
        zzsz zzszVar2 = zzsz.f21830t;
        zzta zztaVar = zzta.f21837s;
        int iM9185d = 4;
        switch (zzszVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = zzpv.f21720b;
                iM9185d = 8;
                return iM9184c2 + iM9185d;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = zzpv.f21720b;
                return iM9184c2 + iM9185d;
            case 2:
                iM9185d = zzpv.m9185d(((Long) obj).longValue());
                return iM9184c2 + iM9185d;
            case 3:
                iM9185d = zzpv.m9185d(((Long) obj).longValue());
                return iM9184c2 + iM9185d;
            case 4:
                iM9185d = zzpv.m9185d(((Integer) obj).intValue());
                return iM9184c2 + iM9185d;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = zzpv.f21720b;
                iM9185d = 8;
                return iM9184c2 + iM9185d;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = zzpv.f21720b;
                return iM9184c2 + iM9185d;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = zzpv.f21720b;
                iM9185d = 1;
                return iM9184c2 + iM9185d;
            case 8:
                if (obj instanceof zzpm) {
                    Logger logger6 = zzpv.f21720b;
                    iMo9150d = ((zzpm) obj).mo9150d();
                    iM9184c = zzpv.m9184c(iMo9150d);
                    iM9185d = iM9184c + iMo9150d;
                } else {
                    iM9185d = zzpv.m9183b((String) obj);
                }
                return iM9184c2 + iM9185d;
            case 9:
                iM9185d = ((zzrq) obj).mo9224g();
                return iM9184c2 + iM9185d;
            case 10:
                if (obj instanceof zzqz) {
                    iMo9150d = ((zzqz) obj).m9229a();
                    iM9184c = zzpv.m9184c(iMo9150d);
                } else {
                    Logger logger7 = zzpv.f21720b;
                    iMo9150d = ((zzrq) obj).mo9224g();
                    iM9184c = zzpv.m9184c(iMo9150d);
                }
                iM9185d = iM9184c + iMo9150d;
                return iM9184c2 + iM9185d;
            case 11:
                if (obj instanceof zzpm) {
                    Logger logger8 = zzpv.f21720b;
                    iMo9150d = ((zzpm) obj).mo9150d();
                    iM9184c = zzpv.m9184c(iMo9150d);
                } else {
                    Logger logger9 = zzpv.f21720b;
                    iMo9150d = ((byte[]) obj).length;
                    iM9184c = zzpv.m9184c(iMo9150d);
                }
                iM9185d = iM9184c + iMo9150d;
                return iM9184c2 + iM9185d;
            case 12:
                iM9185d = zzpv.m9184c(((Integer) obj).intValue());
                return iM9184c2 + iM9185d;
            case 13:
                iM9185d = obj instanceof zzqo ? zzpv.m9185d(((zzqo) obj).zza()) : zzpv.m9185d(((Integer) obj).intValue());
                return iM9184c2 + iM9185d;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = zzpv.f21720b;
                return iM9184c2 + iM9185d;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = zzpv.f21720b;
                iM9185d = 8;
                return iM9184c2 + iM9185d;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM9185d = zzpv.m9184c((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iM9184c2 + iM9185d;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM9185d = zzpv.m9185d((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iM9184c2 + iM9185d;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9210d(zzpv zzpvVar, zzsz zzszVar, int i2, Object obj) {
        if (zzszVar == zzsz.f21832v) {
            zzpvVar.mo9174t(i2, 3);
            ((zzrq) obj).mo9221a(zzpvVar);
            zzpvVar.mo9174t(i2, 4);
            return;
        }
        zzpvVar.mo9174t(i2, zzszVar.f21834s);
        zzta zztaVar = zzta.f21837s;
        switch (zzszVar.ordinal()) {
            case 0:
                zzpvVar.mo9168n(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzpvVar.mo9166l(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzpvVar.mo9178x(((Long) obj).longValue());
                break;
            case 3:
                zzpvVar.mo9178x(((Long) obj).longValue());
                break;
            case 4:
                zzpvVar.mo9170p(((Integer) obj).intValue());
                break;
            case 5:
                zzpvVar.mo9168n(((Long) obj).longValue());
                break;
            case 6:
                zzpvVar.mo9166l(((Integer) obj).intValue());
                break;
            case 7:
                zzpvVar.mo9160f(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzpm)) {
                    zzpvVar.mo9173s((String) obj);
                } else {
                    zzpvVar.mo9164j((zzpm) obj);
                }
                break;
            case 9:
                ((zzrq) obj).mo9221a(zzpvVar);
                break;
            case 10:
                zzpvVar.mo9171q((zzrq) obj);
                break;
            case 11:
                if (!(obj instanceof zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.mo9162h(bArr.length, bArr);
                } else {
                    zzpvVar.mo9164j((zzpm) obj);
                }
                break;
            case 12:
                zzpvVar.mo9176v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzqo)) {
                    zzpvVar.mo9170p(((Integer) obj).intValue());
                } else {
                    zzpvVar.mo9170p(((zzqo) obj).zza());
                }
                break;
            case 14:
                zzpvVar.mo9166l(((Integer) obj).intValue());
                break;
            case 15:
                zzpvVar.mo9168n(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzpvVar.mo9176v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzpvVar.mo9178x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m9211e(Map.Entry entry) {
        zzqe zzqeVar = (zzqe) entry.getKey();
        entry.getValue();
        zzqeVar.zzc();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m9212b() {
        zzsd zzsdVar = this.f21729a;
        if (zzsdVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f21731c ? new zzqx(((zzsg) zzsdVar.entrySet()).iterator()) : ((zzsg) zzsdVar.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: c */
    public final void m9213c() {
        if (this.f21730b) {
            return;
        }
        zzsd zzsdVar = this.f21729a;
        int i2 = zzsdVar.f21813t;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((zzse) zzsdVar.m9272d(i3)).f21804t;
            if (obj instanceof zzqm) {
                ((zzqm) obj).m9225i();
            }
        }
        Iterator it = zzsdVar.m9270b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzqm) {
                ((zzqm) value).m9225i();
            }
        }
        zzsdVar.mo9268a();
        this.f21730b = true;
    }

    public final Object clone() {
        zzqf zzqfVar = new zzqf();
        zzsd zzsdVar = this.f21729a;
        if (zzsdVar.f21813t > 0) {
            Map.Entry entryM9272d = zzsdVar.m9272d(0);
            zzqe zzqeVar = (zzqe) ((zzse) entryM9272d).f21803s;
            Object obj = ((zzse) entryM9272d).f21804t;
            zzqeVar.mo9208a();
            throw null;
        }
        Iterator it = zzsdVar.m9270b().iterator();
        if (!it.hasNext()) {
            zzqfVar.f21731c = this.f21731c;
            return zzqfVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzqe zzqeVar2 = (zzqe) entry.getKey();
        entry.getValue();
        zzqeVar2.mo9208a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqf) {
            return this.f21729a.equals(((zzqf) obj).f21729a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21729a.hashCode();
    }

    public zzqf(int i2) {
        m9213c();
        m9213c();
    }
}
