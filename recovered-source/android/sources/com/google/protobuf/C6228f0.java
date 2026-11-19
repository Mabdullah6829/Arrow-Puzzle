package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6228f0 extends AbstractC6234h0 {

    /* JADX INFO: renamed from: c */
    public static final Class f24173c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* JADX INFO: renamed from: d */
    public static List m11878d(Object obj, int i2, long j2) {
        List listMutableCopyWithCapacity;
        List list = (List) AbstractC6223d1.f24164c.m11854k(obj, j2);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC6225e0) {
                listMutableCopyWithCapacity = new C6222d0(i2);
            } else {
                listMutableCopyWithCapacity = ((list instanceof InterfaceC6164B0) && (list instanceof InterfaceC6210Z)) ? ((InterfaceC6210Z) list).mutableCopyWithCapacity(i2) : new ArrayList(i2);
            }
            AbstractC6223d1.m11875p(obj, j2, listMutableCopyWithCapacity);
            return listMutableCopyWithCapacity;
        }
        if (f24173c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i2);
            arrayList.addAll(list);
            AbstractC6223d1.m11875p(obj, j2, arrayList);
            return arrayList;
        }
        if (list instanceof C6209Y0) {
            C6222d0 c6222d0 = new C6222d0(list.size() + i2);
            c6222d0.addAll((C6209Y0) list);
            AbstractC6223d1.m11875p(obj, j2, c6222d0);
            return c6222d0;
        }
        if ((list instanceof InterfaceC6164B0) && (list instanceof InterfaceC6210Z)) {
            InterfaceC6210Z interfaceC6210Z = (InterfaceC6210Z) list;
            if (!((AbstractC6221d) interfaceC6210Z).f24160s) {
                InterfaceC6210Z interfaceC6210ZMutableCopyWithCapacity = interfaceC6210Z.mutableCopyWithCapacity(list.size() + i2);
                AbstractC6223d1.m11875p(obj, j2, interfaceC6210ZMutableCopyWithCapacity);
                return interfaceC6210ZMutableCopyWithCapacity;
            }
        }
        return list;
    }

    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: a */
    public final void mo11879a(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) AbstractC6223d1.f24164c.m11854k(obj, j2);
        if (list instanceof InterfaceC6225e0) {
            objUnmodifiableList = ((InterfaceC6225e0) list).getUnmodifiableView();
        } else {
            if (f24173c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC6164B0) && (list instanceof InterfaceC6210Z)) {
                AbstractC6221d abstractC6221d = (AbstractC6221d) ((InterfaceC6210Z) list);
                boolean z = abstractC6221d.f24160s;
                if (z && z) {
                    abstractC6221d.f24160s = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC6223d1.m11875p(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: b */
    public final void mo11880b(Object obj, Object obj2, long j2) {
        List list = (List) AbstractC6223d1.f24164c.m11854k(obj2, j2);
        List listM11878d = m11878d(obj, list.size(), j2);
        int size = listM11878d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM11878d.addAll(list);
        }
        if (size > 0) {
            list = listM11878d;
        }
        AbstractC6223d1.m11875p(obj, j2, list);
    }

    @Override // com.google.protobuf.AbstractC6234h0
    /* JADX INFO: renamed from: c */
    public final List mo11881c(Object obj, long j2) {
        return m11878d(obj, 10, j2);
    }
}
