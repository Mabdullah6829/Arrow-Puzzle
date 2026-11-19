package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzimq extends AbstractList {

    /* JADX INFO: renamed from: u */
    public static final zzimr f19982u = zzimr.m8544b(zzimq.class);

    /* JADX INFO: renamed from: s */
    public final List f19983s;

    /* JADX INFO: renamed from: t */
    public final zzimk f19984t;

    public zzimq(ArrayList arrayList, zzimk zzimkVar) {
        this.f19983s = arrayList;
        this.f19984t = zzimkVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.f19983s;
        if (list.size() > i2) {
            return list.get(i2);
        }
        zzimk zzimkVar = this.f19984t;
        if (!zzimkVar.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(zzimkVar.next());
        return get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzimp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzimr zzimrVar = f19982u;
        zzimrVar.mo8542a("potentially expensive size() call");
        zzimrVar.mo8542a("blowup running");
        while (true) {
            zzimk zzimkVar = this.f19984t;
            boolean zHasNext = zzimkVar.hasNext();
            List list = this.f19983s;
            if (!zHasNext) {
                return list.size();
            }
            list.add(zzimkVar.next());
        }
    }
}
