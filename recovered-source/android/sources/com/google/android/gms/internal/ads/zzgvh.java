package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvh extends zzgvf implements ListIterator {

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgvi f18254v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvh(zzgvi zzgviVar) {
        super(zzgviVar);
        this.f18254v = zzgviVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgvi zzgviVar = this.f18254v;
        boolean zIsEmpty = zzgviVar.isEmpty();
        m7166a();
        ((ListIterator) this.f18246s).add(obj);
        zzgviVar.f18255x.f18257w++;
        if (zIsEmpty) {
            zzgviVar.m7168b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m7166a();
        return ((ListIterator) this.f18246s).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m7166a();
        return ((ListIterator) this.f18246s).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m7166a();
        return ((ListIterator) this.f18246s).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m7166a();
        return ((ListIterator) this.f18246s).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m7166a();
        ((ListIterator) this.f18246s).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvh(zzgvi zzgviVar, int i2) {
        super(zzgviVar, ((List) zzgviVar.f18250t).listIterator(i2));
        this.f18254v = zzgviVar;
    }
}
