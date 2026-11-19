package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuo extends zzgwl {

    /* JADX INFO: renamed from: s */
    public final LinkedList f16591s = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        zzftw zzftwVar = (zzftw) obj;
        int i2 = zzftwVar.f16528f;
        LinkedList linkedList = this.f16591s;
        if (i2 != 3) {
            linkedList.add(zzftwVar);
            return true;
        }
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzftw zzftwVar2 = (zzftw) listIterator.next();
            if (zzftwVar2.f16528f == 3) {
                double d = zzftwVar2.f16527e;
                double d2 = zzftwVar.f16527e;
                if (d < d2 || (d == d2 && zzftwVar2.m6695a() > zzftwVar.m6695a())) {
                    listIterator.set(zzftwVar);
                    zzftwVar = zzftwVar2;
                }
            }
        }
        linkedList.add(zzftwVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, com.google.android.gms.internal.ads.zzgwk
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo6718b() {
        return this.f16591s;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl, com.google.android.gms.internal.ads.zzgwi
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Collection mo6719g() {
        return this.f16591s;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    /* JADX INFO: renamed from: h */
    public final LinkedList mo6720h() {
        return this.f16591s;
    }
}
