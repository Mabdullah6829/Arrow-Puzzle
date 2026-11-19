package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwa extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: B */
    public static final Object f18279B = new Object();

    /* JADX INFO: renamed from: A */
    public transient Collection f18280A;

    /* JADX INFO: renamed from: s */
    public transient Object f18281s;

    /* JADX INFO: renamed from: t */
    public transient int[] f18282t;

    /* JADX INFO: renamed from: u */
    public transient Object[] f18283u;

    /* JADX INFO: renamed from: v */
    public transient Object[] f18284v;

    /* JADX INFO: renamed from: w */
    public transient int f18285w = Math.min(Math.max(3, 1), 1073741823);

    /* JADX INFO: renamed from: x */
    public transient int f18286x;

    /* JADX INFO: renamed from: y */
    public transient Set f18287y;

    /* JADX INFO: renamed from: z */
    public transient Set f18288z;

    public zzgwa() {
    }

    /* JADX INFO: renamed from: a */
    public final int[] m7179a() {
        int[] iArr = this.f18282t;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m7180b() {
        Object[] objArr = this.f18283u;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object[] m7181c() {
        Object[] objArr = this.f18284v;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m7182d()) {
            return;
        }
        this.f18285w += 32;
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            this.f18285w = Math.min(Math.max(size(), 3), 1073741823);
            mapM7183e.clear();
            this.f18281s = null;
            this.f18286x = 0;
            return;
        }
        Arrays.fill(m7180b(), 0, this.f18286x, (Object) null);
        Arrays.fill(m7181c(), 0, this.f18286x, (Object) null);
        Object obj = this.f18281s;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m7179a(), 0, this.f18286x, 0);
        this.f18286x = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            return mapM7183e.containsKey(obj);
        }
        return m7187i(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            return mapM7183e.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f18286x; i2++) {
            if (Objects.equals(obj, m7181c()[i2])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7182d() {
        return this.f18281s == null;
    }

    /* JADX INFO: renamed from: e */
    public final Map m7183e() {
        Object obj = this.f18281s;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f18288z;
        if (set != null) {
            return set;
        }
        zzgvv zzgvvVar = new zzgvv(this);
        this.f18288z = zzgvvVar;
        return zzgvvVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m7184f(int i2, int i3) {
        Object obj = this.f18281s;
        Objects.requireNonNull(obj);
        int[] iArrM7179a = m7179a();
        Object[] objArrM7180b = m7180b();
        Object[] objArrM7181c = m7181c();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            objArrM7180b[i2] = null;
            objArrM7181c[i2] = null;
            iArrM7179a[i2] = 0;
            return;
        }
        int i5 = i2 + 1;
        Object obj2 = objArrM7180b[i4];
        objArrM7180b[i2] = obj2;
        objArrM7181c[i2] = objArrM7181c[i4];
        objArrM7180b[i4] = null;
        objArrM7181c[i4] = null;
        iArrM7179a[i2] = iArrM7179a[i4];
        iArrM7179a[i4] = 0;
        int iM7201b = zzgwm.m7201b(obj2) & i3;
        int iM7190b = zzgwb.m7190b(iM7201b, obj);
        if (iM7190b == size) {
            zzgwb.m7191c(iM7201b, i5, obj);
            return;
        }
        while (true) {
            int i6 = iM7190b - 1;
            int i7 = iArrM7179a[i6];
            int i8 = i7 & i3;
            if (i8 == size) {
                iArrM7179a[i6] = (i7 & (~i3)) | (i3 & i5);
                return;
            }
            iM7190b = i8;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m7185g() {
        return (1 << (this.f18285w & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            return mapM7183e.get(obj);
        }
        int iM7187i = m7187i(obj);
        if (iM7187i == -1) {
            return null;
        }
        return m7181c()[iM7187i];
    }

    /* JADX INFO: renamed from: h */
    public final int m7186h(int i2, int i3, int i4, int i5) {
        int i6 = i3 - 1;
        Object objM7189a = zzgwb.m7189a(i3);
        if (i5 != 0) {
            zzgwb.m7191c(i4 & i6, i5 + 1, objM7189a);
        }
        Object obj = this.f18281s;
        Objects.requireNonNull(obj);
        int[] iArrM7179a = m7179a();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iM7190b = zzgwb.m7190b(i7, obj);
            while (iM7190b != 0) {
                int i8 = iM7190b - 1;
                int i9 = iArrM7179a[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int iM7190b2 = zzgwb.m7190b(i11, objM7189a);
                zzgwb.m7191c(i11, iM7190b, objM7189a);
                iArrM7179a[i8] = ((~i6) & i10) | (iM7190b2 & i6);
                iM7190b = i9 & i2;
            }
        }
        this.f18281s = objM7189a;
        this.f18285w = ((32 - Integer.numberOfLeadingZeros(i6)) & 31) | (this.f18285w & (-32));
        return i6;
    }

    /* JADX INFO: renamed from: i */
    public final int m7187i(Object obj) {
        if (m7182d()) {
            return -1;
        }
        int iM7201b = zzgwm.m7201b(obj);
        int iM7185g = m7185g();
        Object obj2 = this.f18281s;
        Objects.requireNonNull(obj2);
        int iM7190b = zzgwb.m7190b(iM7201b & iM7185g, obj2);
        if (iM7190b != 0) {
            int i2 = ~iM7185g;
            int i3 = iM7201b & i2;
            do {
                int i4 = iM7190b - 1;
                int i5 = m7179a()[i4];
                if ((i5 & i2) == i3 && Objects.equals(obj, m7180b()[i4])) {
                    return i4;
                }
                iM7190b = i5 & iM7185g;
            } while (iM7190b != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7188j(Object obj) {
        if (!m7182d()) {
            int iM7185g = m7185g();
            Object obj2 = this.f18281s;
            Objects.requireNonNull(obj2);
            int iM7192d = zzgwb.m7192d(obj, null, iM7185g, obj2, m7179a(), m7180b(), null);
            if (iM7192d != -1) {
                Object obj3 = m7181c()[iM7192d];
                m7184f(iM7192d, iM7185g);
                this.f18286x--;
                this.f18285w += 32;
                return obj3;
            }
        }
        return f18279B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f18287y;
        if (set != null) {
            return set;
        }
        zzgvx zzgvxVar = new zzgvx(this);
        this.f18287y = zzgvxVar;
        return zzgvxVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        int i3 = 32;
        if (m7182d()) {
            zzgtr.m7134g("Arrays already allocated", m7182d());
            int i4 = this.f18285w;
            int iMax = Math.max(i4 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = BasicMeasure.EXACTLY;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f18281s = zzgwb.m7189a(iMax2);
            this.f18285w = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f18285w & (-32));
            this.f18282t = new int[i4];
            this.f18283u = new Object[i4];
            this.f18284v = new Object[i4];
        }
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            return mapM7183e.put(obj, obj2);
        }
        int[] iArrM7179a = m7179a();
        Object[] objArrM7180b = m7180b();
        Object[] objArrM7181c = m7181c();
        int i5 = this.f18286x;
        int i6 = i5 + 1;
        int iM7201b = zzgwm.m7201b(obj);
        int iM7185g = m7185g();
        int i7 = iM7201b & iM7185g;
        Object obj3 = this.f18281s;
        Objects.requireNonNull(obj3);
        int iM7190b = zzgwb.m7190b(i7, obj3);
        if (iM7190b == 0) {
            if (i6 > iM7185g) {
                iM7185g = m7186h(iM7185g, (iM7185g + 1) * (iM7185g < 32 ? 4 : 2), iM7201b, i5);
            } else {
                Object obj4 = this.f18281s;
                Objects.requireNonNull(obj4);
                zzgwb.m7191c(i7, i6, obj4);
            }
            i2 = 1;
        } else {
            int i8 = ~iM7185g;
            int i9 = iM7201b & i8;
            int i10 = 0;
            while (true) {
                int i11 = iM7190b - 1;
                int i12 = iArrM7179a[i11];
                i2 = 1;
                int i13 = i12 & i8;
                int i14 = i3;
                if (i13 == i9 && Objects.equals(obj, objArrM7180b[i11])) {
                    Object obj5 = objArrM7181c[i11];
                    objArrM7181c[i11] = obj2;
                    return obj5;
                }
                int i15 = i12 & iM7185g;
                int i16 = i10 + 1;
                if (i15 == 0) {
                    if (i16 < 9) {
                        if (i6 <= iM7185g) {
                            iArrM7179a[i11] = (i6 & iM7185g) | i13;
                            break;
                        }
                        iM7185g = m7186h(iM7185g, (iM7185g + 1) * (iM7185g < i14 ? 4 : 2), iM7201b, i5);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m7185g() + 1, 1.0f);
                    int i17 = isEmpty() ? -1 : 0;
                    while (i17 >= 0) {
                        linkedHashMap.put(m7180b()[i17], m7181c()[i17]);
                        int i18 = i17 + 1;
                        i17 = i18 < this.f18286x ? i18 : -1;
                    }
                    this.f18281s = linkedHashMap;
                    this.f18282t = null;
                    this.f18283u = null;
                    this.f18284v = null;
                    this.f18285w += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                i10 = i16;
                iM7190b = i15;
                i3 = i14;
            }
        }
        int length = m7179a().length;
        if (i6 > length) {
            int i19 = i2;
            int iMin = Math.min(1073741823, (Math.max(i19, length >>> 1) + length) | i19);
            if (iMin != length) {
                this.f18282t = Arrays.copyOf(m7179a(), iMin);
                this.f18283u = Arrays.copyOf(m7180b(), iMin);
                this.f18284v = Arrays.copyOf(m7181c(), iMin);
            }
        }
        m7179a()[i5] = (~iM7185g) & iM7201b;
        m7180b()[i5] = obj;
        m7181c()[i5] = obj2;
        this.f18286x = i6;
        this.f18285w += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapM7183e = m7183e();
        if (mapM7183e != null) {
            return mapM7183e.remove(obj);
        }
        Object objM7188j = m7188j(obj);
        if (objM7188j == f18279B) {
            return null;
        }
        return objM7188j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapM7183e = m7183e();
        return mapM7183e != null ? mapM7183e.size() : this.f18286x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f18280A;
        if (collection != null) {
            return collection;
        }
        zzgvz zzgvzVar = new zzgvz(this);
        this.f18280A = zzgvzVar;
        return zzgvzVar;
    }

    public zzgwa(int i2) {
    }
}
