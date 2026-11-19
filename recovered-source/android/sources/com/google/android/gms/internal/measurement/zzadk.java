package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzadk {

    /* JADX INFO: renamed from: d */
    public static final zzadk f22016d = new zzadk(0);

    /* JADX INFO: renamed from: a */
    public final zzafr f22017a = new zzafr();

    /* JADX INFO: renamed from: b */
    public boolean f22018b;

    /* JADX INFO: renamed from: c */
    public boolean f22019c;

    private zzadk() {
    }

    /* JADX INFO: renamed from: d */
    public static void m9538d(zzada zzadaVar, zzagm zzagmVar, int i2, Object obj) {
        if (zzagmVar == zzagm.f22135v) {
            zzadaVar.mo9481e(i2, 3);
            ((zzafc) obj).mo9349g(zzadaVar);
            zzadaVar.mo9481e(i2, 4);
            return;
        }
        zzadaVar.mo9481e(i2, zzagmVar.f22139t);
        zzagn zzagnVar = zzagn.f22142s;
        switch (zzagmVar.ordinal()) {
            case 0:
                zzadaVar.mo9500x(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzadaVar.mo9498v(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzadaVar.mo9499w(((Long) obj).longValue());
                break;
            case 3:
                zzadaVar.mo9499w(((Long) obj).longValue());
                break;
            case 4:
                zzadaVar.mo9496t(((Integer) obj).intValue());
                break;
            case 5:
                zzadaVar.mo9500x(((Long) obj).longValue());
                break;
            case 6:
                zzadaVar.mo9498v(((Integer) obj).intValue());
                break;
            case 7:
                zzadaVar.mo9495s(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzacr)) {
                    zzadaVar.mo9501y((String) obj);
                } else {
                    zzadaVar.mo9490n((zzacr) obj);
                }
                break;
            case 9:
                ((zzafc) obj).mo9349g(zzadaVar);
                break;
            case 10:
                zzadaVar.mo9494r((zzafc) obj);
                break;
            case 11:
                if (!(obj instanceof zzacr)) {
                    byte[] bArr = (byte[]) obj;
                    zzadaVar.mo9491o(bArr.length, bArr);
                } else {
                    zzadaVar.mo9490n((zzacr) obj);
                }
                break;
            case 12:
                zzadaVar.mo9497u(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzady)) {
                    zzadaVar.mo9496t(((Integer) obj).intValue());
                } else {
                    zzadaVar.mo9496t(((zzady) obj).zza());
                }
                break;
            case 14:
                zzadaVar.mo9498v(((Integer) obj).intValue());
                break;
            case 15:
                zzadaVar.mo9500x(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzadaVar.mo9497u((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzadaVar.mo9499w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m9539e(zzagm zzagmVar, int i2, Object obj) {
        int iM9717b;
        int iM9510b;
        int iM9510b2 = zzada.m9510b(i2 << 3);
        if (zzagmVar == zzagm.f22135v) {
            iM9510b2 += iM9510b2;
        }
        zzagm zzagmVar2 = zzagm.f22134u;
        zzagn zzagnVar = zzagn.f22142s;
        int iM9511c = 4;
        switch (zzagmVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = zzada.f22004b;
                iM9511c = 8;
                return iM9510b2 + iM9511c;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = zzada.f22004b;
                return iM9510b2 + iM9511c;
            case 2:
                iM9511c = zzada.m9511c(((Long) obj).longValue());
                return iM9510b2 + iM9511c;
            case 3:
                iM9511c = zzada.m9511c(((Long) obj).longValue());
                return iM9510b2 + iM9511c;
            case 4:
                iM9511c = zzada.m9511c(((Integer) obj).intValue());
                return iM9510b2 + iM9511c;
            case 5:
                ((Long) obj).getClass();
                boolean z3 = zzada.f22004b;
                iM9511c = 8;
                return iM9510b2 + iM9511c;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = zzada.f22004b;
                return iM9510b2 + iM9511c;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = zzada.f22004b;
                iM9511c = 1;
                return iM9510b2 + iM9511c;
            case 8:
                if (obj instanceof zzacr) {
                    boolean z6 = zzada.f22004b;
                    iM9717b = ((zzacr) obj).mo9373b();
                    iM9510b = zzada.m9510b(iM9717b);
                } else {
                    boolean z7 = zzada.f22004b;
                    iM9717b = zzagl.m9717b((String) obj);
                    iM9510b = zzada.m9510b(iM9717b);
                }
                iM9511c = iM9510b + iM9717b;
                return iM9510b2 + iM9511c;
            case 9:
                iM9511c = ((zzafc) obj).mo9567f();
                return iM9510b2 + iM9511c;
            case 10:
                if (obj instanceof zzael) {
                    iM9717b = ((zzael) obj).m9598a();
                    iM9510b = zzada.m9510b(iM9717b);
                } else {
                    boolean z8 = zzada.f22004b;
                    iM9717b = ((zzafc) obj).mo9567f();
                    iM9510b = zzada.m9510b(iM9717b);
                }
                iM9511c = iM9510b + iM9717b;
                return iM9510b2 + iM9511c;
            case 11:
                if (obj instanceof zzacr) {
                    boolean z9 = zzada.f22004b;
                    iM9717b = ((zzacr) obj).mo9373b();
                    iM9510b = zzada.m9510b(iM9717b);
                } else {
                    boolean z10 = zzada.f22004b;
                    iM9717b = ((byte[]) obj).length;
                    iM9510b = zzada.m9510b(iM9717b);
                }
                iM9511c = iM9510b + iM9717b;
                return iM9510b2 + iM9511c;
            case 12:
                iM9511c = zzada.m9510b(((Integer) obj).intValue());
                return iM9510b2 + iM9511c;
            case 13:
                iM9511c = obj instanceof zzady ? zzada.m9511c(((zzady) obj).zza()) : zzada.m9511c(((Integer) obj).intValue());
                return iM9510b2 + iM9511c;
            case 14:
                ((Integer) obj).getClass();
                boolean z11 = zzada.f22004b;
                return iM9510b2 + iM9511c;
            case 15:
                ((Long) obj).getClass();
                boolean z12 = zzada.f22004b;
                iM9511c = 8;
                return iM9510b2 + iM9511c;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM9511c = zzada.m9510b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iM9510b2 + iM9511c;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM9511c = zzada.m9511c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iM9510b2 + iM9511c;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9540f(Map.Entry entry) {
        ((zzadj) entry.getKey()).zzc();
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static final int m9541g(Map.Entry entry) {
        zzadj zzadjVar = (zzadj) entry.getKey();
        entry.getValue();
        zzadjVar.zzc();
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final void m9542a() {
        if (this.f22018b) {
            return;
        }
        zzafr zzafrVar = this.f22017a;
        int i2 = zzafrVar.f22114t;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((zzafs) zzafrVar.m9666b(i3)).f22106t;
            if (obj instanceof zzadu) {
                zzadu zzaduVar = (zzadu) obj;
                zzaduVar.getClass();
                zzafl.f22093c.m9649a(zzaduVar.getClass()).mo9633c(zzaduVar);
                zzaduVar.m9569o();
            }
        }
        Iterator it = zzafrVar.m9667c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof zzadu) {
                zzadu zzaduVar2 = (zzadu) value;
                zzaduVar2.getClass();
                zzafl.f22093c.m9649a(zzaduVar2.getClass()).mo9633c(zzaduVar2);
                zzaduVar2.m9569o();
            }
        }
        zzafrVar.mo9664a();
        this.f22018b = true;
    }

    /* JADX INFO: renamed from: b */
    public final Iterator m9543b() {
        zzafr zzafrVar = this.f22017a;
        if (zzafrVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.f22019c ? new zzaek(((zzafu) zzafrVar.entrySet()).iterator()) : ((zzafu) zzafrVar.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9544c() {
        zzafr zzafrVar = this.f22017a;
        if (zzafrVar.f22114t > 0) {
            m9540f(zzafrVar.m9666b(0));
            throw null;
        }
        Iterator it = zzafrVar.m9667c().iterator();
        if (!it.hasNext()) {
            return true;
        }
        m9540f((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        zzadk zzadkVar = new zzadk();
        zzafr zzafrVar = this.f22017a;
        if (zzafrVar.f22114t > 0) {
            Map.Entry entryM9666b = zzafrVar.m9666b(0);
            zzadj zzadjVar = (zzadj) ((zzafs) entryM9666b).f22105s;
            Object obj = ((zzafs) entryM9666b).f22106t;
            zzadjVar.mo9537d();
            throw null;
        }
        Iterator it = zzafrVar.m9667c().iterator();
        if (!it.hasNext()) {
            zzadkVar.f22019c = this.f22019c;
            return zzadkVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        zzadj zzadjVar2 = (zzadj) entry.getKey();
        entry.getValue();
        zzadjVar2.mo9537d();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzadk) {
            return this.f22017a.equals(((zzadk) obj).f22017a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22017a.hashCode();
    }

    public zzadk(int i2) {
        m9542a();
        m9542a();
    }
}
