package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzigo {
    /* JADX INFO: renamed from: a */
    public static final void m8415a(zzidl zzidlVar, ArrayDeque arrayDeque) {
        if (!zzidlVar.mo8142w()) {
            if (!(zzidlVar instanceof zzigq)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzidlVar.getClass())));
            }
            zzigq zzigqVar = (zzigq) zzidlVar;
            m8415a(zzigqVar.f19877v, arrayDeque);
            m8415a(zzigqVar.f19878w, arrayDeque);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(zzigq.f19875z, zzidlVar.mo8132h());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iM8417C = zzigq.m8417C(iBinarySearch + 1);
        if (arrayDeque.isEmpty() || ((zzidl) arrayDeque.peek()).mo8132h() >= iM8417C) {
            arrayDeque.push(zzidlVar);
            return;
        }
        int iM8417C2 = zzigq.m8417C(iBinarySearch);
        zzidl zzigqVar2 = (zzidl) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((zzidl) arrayDeque.peek()).mo8132h() < iM8417C2) {
            zzigqVar2 = new zzigq((zzidl) arrayDeque.pop(), zzigqVar2);
        }
        zzigq zzigqVar3 = new zzigq(zzigqVar2, zzidlVar);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(zzigq.f19875z, zzigqVar3.f19876u);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((zzidl) arrayDeque.peek()).mo8132h() >= zzigq.m8417C(iBinarySearch2 + 1)) {
                break;
            } else {
                zzigqVar3 = new zzigq((zzidl) arrayDeque.pop(), zzigqVar3);
            }
        }
        arrayDeque.push(zzigqVar3);
    }
}
