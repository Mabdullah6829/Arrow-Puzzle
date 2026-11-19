package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.D */
/* JADX INFO: loaded from: classes.dex */
public final class C6167D {

    /* JADX INFO: renamed from: a */
    public final C6182K0 f24058a = new C6182K0(16);

    /* JADX INFO: renamed from: b */
    public boolean f24059b;

    static {
        new C6167D(0);
    }

    public C6167D() {
    }

    /* JADX INFO: renamed from: a */
    public static int m11707a(EnumC6247l1 enumC6247l1, int i2, Object obj) {
        int serializedSize;
        int iM12070E;
        int iM12069D = AbstractC6269w.m12069D(i2);
        if (enumC6247l1 == EnumC6247l1.f24200v) {
            iM12069D *= 2;
        }
        int iM12071F = 1;
        switch (enumC6247l1.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = AbstractC6269w.f24289d;
                iM12071F = 8;
                return iM12071F + iM12069D;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = AbstractC6269w.f24289d;
                iM12071F = 4;
                return iM12071F + iM12069D;
            case 2:
                iM12071F = AbstractC6269w.m12071F(((Long) obj).longValue());
                return iM12071F + iM12069D;
            case 3:
                iM12071F = AbstractC6269w.m12071F(((Long) obj).longValue());
                return iM12071F + iM12069D;
            case 4:
                iM12071F = AbstractC6269w.m12067B(((Integer) obj).intValue());
                return iM12071F + iM12069D;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = AbstractC6269w.f24289d;
                iM12071F = 8;
                return iM12071F + iM12069D;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = AbstractC6269w.f24289d;
                iM12071F = 4;
                return iM12071F + iM12069D;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = AbstractC6269w.f24289d;
                return iM12071F + iM12069D;
            case 8:
                iM12071F = obj instanceof AbstractC6251n ? AbstractC6269w.m12066A((AbstractC6251n) obj) : AbstractC6269w.m12068C((String) obj);
                return iM12071F + iM12069D;
            case 9:
                Logger logger6 = AbstractC6269w.f24289d;
                iM12071F = ((InterfaceC6262s0) obj).getSerializedSize();
                return iM12071F + iM12069D;
            case 10:
                Logger logger7 = AbstractC6269w.f24289d;
                serializedSize = ((InterfaceC6262s0) obj).getSerializedSize();
                iM12070E = AbstractC6269w.m12070E(serializedSize);
                iM12071F = iM12070E + serializedSize;
                return iM12071F + iM12069D;
            case 11:
                if (obj instanceof AbstractC6251n) {
                    iM12071F = AbstractC6269w.m12066A((AbstractC6251n) obj);
                } else {
                    Logger logger8 = AbstractC6269w.f24289d;
                    serializedSize = ((byte[]) obj).length;
                    iM12070E = AbstractC6269w.m12070E(serializedSize);
                    iM12071F = iM12070E + serializedSize;
                }
                return iM12071F + iM12069D;
            case 12:
                iM12071F = AbstractC6269w.m12070E(((Integer) obj).intValue());
                return iM12071F + iM12069D;
            case 13:
                iM12071F = obj instanceof InterfaceC6200U ? AbstractC6269w.m12067B(((InterfaceC6200U) obj).getNumber()) : AbstractC6269w.m12067B(((Integer) obj).intValue());
                return iM12071F + iM12069D;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = AbstractC6269w.f24289d;
                iM12071F = 4;
                return iM12071F + iM12069D;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = AbstractC6269w.f24289d;
                iM12071F = 8;
                return iM12071F + iM12069D;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iM12071F = AbstractC6269w.m12070E((iIntValue >> 31) ^ (iIntValue << 1));
                return iM12071F + iM12069D;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM12071F = AbstractC6269w.m12071F((jLongValue >> 63) ^ (jLongValue << 1));
                return iM12071F + iM12069D;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m11708d(C6179J c6179j, Object obj) {
        EnumC6247l1 enumC6247l1 = c6179j.f24090t;
        Charset charset = AbstractC6213a0.f24134a;
        obj.getClass();
        boolean z = true;
        switch (enumC6247l1.f24203s) {
            case INT:
                z = obj instanceof Integer;
                break;
            case LONG:
                z = obj instanceof Long;
                break;
            case FLOAT:
                z = obj instanceof Float;
                break;
            case DOUBLE:
                z = obj instanceof Double;
                break;
            case BOOLEAN:
                z = obj instanceof Boolean;
                break;
            case STRING:
                z = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC6251n) && !(obj instanceof byte[])) {
                    z = false;
                }
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof InterfaceC6200U)) {
                    z = false;
                }
                break;
            case MESSAGE:
                if (!(obj instanceof InterfaceC6262s0)) {
                    z = false;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c6179j.f24089s), c6179j.f24090t.f24203s, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11709e(AbstractC6269w abstractC6269w, EnumC6247l1 enumC6247l1, int i2, Object obj) {
        if (enumC6247l1 == EnumC6247l1.f24200v) {
            abstractC6269w.mo12011W(i2, 3);
            ((InterfaceC6262s0) obj).writeTo(abstractC6269w);
            abstractC6269w.mo12011W(i2, 4);
        }
        abstractC6269w.mo12011W(i2, enumC6247l1.f24204t);
        switch (enumC6247l1.ordinal()) {
            case 0:
                abstractC6269w.mo12004P(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                abstractC6269w.mo12002N(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                abstractC6269w.mo12015a0(((Long) obj).longValue());
                break;
            case 3:
                abstractC6269w.mo12015a0(((Long) obj).longValue());
                break;
            case 4:
                abstractC6269w.mo12006R(((Integer) obj).intValue());
                break;
            case 5:
                abstractC6269w.mo12004P(((Long) obj).longValue());
                break;
            case 6:
                abstractC6269w.mo12002N(((Integer) obj).intValue());
                break;
            case 7:
                abstractC6269w.mo11996H(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof AbstractC6251n)) {
                    abstractC6269w.mo12010V((String) obj);
                } else {
                    abstractC6269w.mo12000L((AbstractC6251n) obj);
                }
                break;
            case 9:
                ((InterfaceC6262s0) obj).writeTo(abstractC6269w);
                break;
            case 10:
                abstractC6269w.mo12008T((InterfaceC6262s0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC6251n)) {
                    byte[] bArr = (byte[]) obj;
                    abstractC6269w.mo11998J(bArr.length, bArr);
                } else {
                    abstractC6269w.mo12000L((AbstractC6251n) obj);
                }
                break;
            case 12:
                abstractC6269w.mo12013Y(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC6200U)) {
                    abstractC6269w.mo12006R(((Integer) obj).intValue());
                } else {
                    abstractC6269w.mo12006R(((InterfaceC6200U) obj).getNumber());
                }
                break;
            case 14:
                abstractC6269w.mo12002N(((Integer) obj).intValue());
                break;
            case 15:
                abstractC6269w.mo12004P(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                abstractC6269w.mo12013Y((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                abstractC6269w.mo12015a0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11710b() {
        C6182K0 c6182k0;
        if (this.f24059b) {
            return;
        }
        int i2 = 0;
        while (true) {
            c6182k0 = this.f24058a;
            if (i2 >= c6182k0.f24098t.size()) {
                break;
            }
            Map.Entry entryM11772c = c6182k0.m11772c(i2);
            if (entryM11772c.getValue() instanceof AbstractC6185M) {
                ((AbstractC6185M) entryM11772c.getValue()).makeImmutable();
            }
            i2++;
        }
        if (!c6182k0.f24100v) {
            for (int i3 = 0; i3 < c6182k0.f24098t.size(); i3++) {
                Map.Entry entryM11772c2 = c6182k0.m11772c(i3);
                if (((C6179J) entryM11772c2.getKey()).f24091u) {
                    entryM11772c2.setValue(Collections.unmodifiableList((List) entryM11772c2.getValue()));
                }
            }
            for (Map.Entry entry : c6182k0.m11773d()) {
                if (((C6179J) entry.getKey()).f24091u) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c6182k0.f24100v) {
            c6182k0.f24099u = c6182k0.f24099u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c6182k0.f24099u);
            c6182k0.f24102x = c6182k0.f24102x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c6182k0.f24102x);
            c6182k0.f24100v = true;
        }
        this.f24059b = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m11711c(C6179J c6179j, Object obj) {
        if (!c6179j.f24091u) {
            m11708d(c6179j, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                m11708d(c6179j, obj2);
            }
            obj = arrayList;
        }
        this.f24058a.put(c6179j, obj);
    }

    public final Object clone() {
        C6182K0 c6182k0;
        C6167D c6167d = new C6167D();
        int i2 = 0;
        while (true) {
            c6182k0 = this.f24058a;
            if (i2 >= c6182k0.f24098t.size()) {
                break;
            }
            Map.Entry entryM11772c = c6182k0.m11772c(i2);
            c6167d.m11711c((C6179J) entryM11772c.getKey(), entryM11772c.getValue());
            i2++;
        }
        for (Map.Entry entry : c6182k0.m11773d()) {
            c6167d.m11711c((C6179J) entry.getKey(), entry.getValue());
        }
        return c6167d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6167D) {
            return this.f24058a.equals(((C6167D) obj).f24058a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24058a.hashCode();
    }

    public C6167D(int i2) {
        m11710b();
        m11710b();
    }
}
