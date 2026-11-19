package com.google.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6168D0 extends AbstractC6221d implements RandomAccess {

    /* JADX INFO: renamed from: v */
    public static final C6168D0 f24060v = new C6168D0(new Object[0], 0, false);

    /* JADX INFO: renamed from: t */
    public Object[] f24061t;

    /* JADX INFO: renamed from: u */
    public int f24062u;

    public C6168D0(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f24061t = objArr;
        this.f24062u = i2;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11859a();
        int i2 = this.f24062u;
        Object[] objArr = this.f24061t;
        if (i2 == objArr.length) {
            this.f24061t = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f24061t;
        int i3 = this.f24062u;
        this.f24062u = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m11712b(int i2) {
        if (i2 < 0 || i2 >= this.f24062u) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
            sbM404l.append(this.f24062u);
            throw new IndexOutOfBoundsException(sbM404l.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        m11712b(i2);
        return this.f24061t[i2];
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        if (i2 >= this.f24062u) {
            return new C6168D0(Arrays.copyOf(this.f24061t, i2), this.f24062u, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        m11712b(i2);
        Object[] objArr = this.f24061t;
        Object obj = objArr[i2];
        int i3 = this.f24062u;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.f24062u--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m11859a();
        m11712b(i2);
        Object[] objArr = this.f24061t;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24062u;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        m11859a();
        if (i2 >= 0 && i2 <= (i3 = this.f24062u)) {
            Object[] objArr = this.f24061t;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[AbstractC1456a.m2436c(i3, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f24061t, i2, objArr2, i2 + 1, this.f24062u - i2);
                this.f24061t = objArr2;
            }
            this.f24061t[i2] = obj;
            this.f24062u++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index:", ", Size:");
        sbM404l.append(this.f24062u);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }
}
