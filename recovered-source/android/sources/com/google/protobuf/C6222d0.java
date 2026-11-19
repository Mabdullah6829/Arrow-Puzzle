package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6222d0 extends AbstractC6221d implements InterfaceC6225e0, RandomAccess {

    /* JADX INFO: renamed from: t */
    public final List f24161t;

    static {
        new C6222d0();
    }

    public C6222d0(ArrayList arrayList) {
        super(true);
        this.f24161t = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        m11859a();
        this.f24161t.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f24161t.size(), collection);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m11859a();
        this.f24161t.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.f24161t;
        Object obj = list.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6251n) {
            AbstractC6251n abstractC6251n = (AbstractC6251n) obj;
            String strM11898y = abstractC6251n.m11898y();
            if (abstractC6251n.mo11724r()) {
                list.set(i2, strM11898y);
            }
            return strM11898y;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, AbstractC6213a0.f24134a);
        if (AbstractC6232g1.f24178a.m11803t(bArr, 0, bArr.length)) {
            list.set(i2, str);
        }
        return str;
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final Object getRaw(int i2) {
        return this.f24161t.get(i2);
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f24161t);
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    public final InterfaceC6225e0 getUnmodifiableView() {
        return this.f24160s ? new C6209Y0(this) : this;
    }

    @Override // com.google.protobuf.InterfaceC6225e0
    /* JADX INFO: renamed from: i */
    public final void mo11830i(AbstractC6251n abstractC6251n) {
        m11859a();
        this.f24161t.add(abstractC6251n);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC6210Z
    public final InterfaceC6210Z mutableCopyWithCapacity(int i2) {
        List list = this.f24161t;
        if (i2 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(list);
        return new C6222d0(arrayList);
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        m11859a();
        Object objRemove = this.f24161t.remove(i2);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof AbstractC6251n ? ((AbstractC6251n) objRemove).m11898y() : new String((byte[]) objRemove, AbstractC6213a0.f24134a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        m11859a();
        Object obj2 = this.f24161t.set(i2, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof AbstractC6251n ? ((AbstractC6251n) obj2).m11898y() : new String((byte[]) obj2, AbstractC6213a0.f24134a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24161t.size();
    }

    public C6222d0() {
        super(false);
        this.f24161t = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC6221d, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        m11859a();
        if (collection instanceof InterfaceC6225e0) {
            collection = ((InterfaceC6225e0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f24161t.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C6222d0(int i2) {
        this(new ArrayList(i2));
    }
}
