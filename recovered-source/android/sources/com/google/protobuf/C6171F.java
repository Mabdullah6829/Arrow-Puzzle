package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.F */
/* JADX INFO: loaded from: classes.dex */
public final class C6171F extends AbstractC6221d implements InterfaceC6204W, RandomAccess, InterfaceC6164B0 {

    /* JADX INFO: renamed from: v */
    public static final C6171F f24072v = new C6171F(new float[0], 0, false);

    /* JADX INFO: renamed from: t */
    public float[] f24073t;

    /* JADX INFO: renamed from: u */
    public int f24074u;

    public C6171F(float[] fArr, int i2, boolean z) {
        super(z);
        this.f24073t = fArr;
        this.f24074u = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        m11859a();
        if (i2 < 0 || i2 > (i3 = this.f24074u)) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24074u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
        float[] fArr = this.f24073t;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[AbstractC1456a.m2436c(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f24073t, i2, fArr2, i2 + 1, this.f24074u - i2);
            this.f24073t = fArr2;
        }
        this.f24073t[i2] = fFloatValue;
        this.f24074u++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11859a();
        Charset charset = AbstractC6213a0.f24134a;
        collection.getClass();
        if (!(collection instanceof C6171F)) {
            return super.addAll(collection);
        }
        C6171F c6171f = (C6171F) collection;
        int i2 = c6171f.f24074u;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f24074u;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f24073t;
        if (i4 > fArr.length) {
            this.f24073t = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(c6171f.f24073t, 0, this.f24073t, this.f24074u, c6171f.f24074u);
        this.f24074u = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f2) {
        m11859a();
        int i2 = this.f24074u;
        float[] fArr = this.f24073t;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[AbstractC1456a.m2436c(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f24073t = fArr2;
        }
        float[] fArr3 = this.f24073t;
        int i3 = this.f24074u;
        this.f24074u = i3 + 1;
        fArr3[i3] = f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m11714b(int i2) {
        if (i2 < 0 || i2 >= this.f24074u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24074u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6171F)) {
            return super.equals(obj);
        }
        C6171F c6171f = (C6171F) obj;
        if (this.f24074u != c6171f.f24074u) {
            return false;
        }
        float[] fArr = c6171f.f24073t;
        for (int i2 = 0; i2 < this.f24074u; i2++) {
            if (Float.floatToIntBits(this.f24073t[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m11714b(i2);
        return Float.valueOf(this.f24073t[i2]);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f24074u; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f24073t[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f24074u;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f24073t[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24074u) {
            return new C6171F(Arrays.copyOf(this.f24073t, i2), this.f24074u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m11714b(i2);
        float[] fArr = this.f24073t;
        float f2 = fArr[i2];
        int i3 = this.f24074u;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f24074u--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        m11859a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f24073t;
        System.arraycopy(fArr, i3, fArr, i2, this.f24074u - i3);
        this.f24074u -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m11859a();
        m11714b(i2);
        float[] fArr = this.f24073t;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24074u;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
