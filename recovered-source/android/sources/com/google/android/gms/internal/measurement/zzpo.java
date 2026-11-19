package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpo {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceArray f22739a;

    /* JADX INFO: renamed from: b */
    public final zzog f22740b;

    public zzpo(zzog zzogVar, int i2) {
        this.f22740b = zzogVar;
        this.f22739a = new AtomicReferenceArray(i2);
    }

    /* JADX INFO: renamed from: a */
    public final zzom m10586a(int i2, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.f22739a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i2);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarM10575a = this.f22740b.m10575a(str, z);
        while (!atomicReferenceArray.compareAndSet(i2, null, zzomVarM10575a)) {
            if (atomicReferenceArray.get(i2) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i2);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzomVarM10575a;
    }

    /* JADX INFO: renamed from: b */
    public final zzom m10587b(String str, int i2, long j2) {
        AtomicReferenceArray atomicReferenceArray = this.f22739a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i2);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzob zzobVar = new zzob(str, this.f22740b.f22690a, j2);
        while (!atomicReferenceArray.compareAndSet(i2, null, zzobVar)) {
            if (atomicReferenceArray.get(i2) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i2);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzobVar;
    }

    /* JADX INFO: renamed from: c */
    public final zzom m10588c(int i2, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.f22739a;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i2);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzod zzodVar = new zzod(str, this.f22740b.f22690a, str2);
        while (!atomicReferenceArray.compareAndSet(i2, null, zzodVar)) {
            if (atomicReferenceArray.get(i2) != null) {
                zzom zzomVar2 = (zzom) atomicReferenceArray.get(i2);
                zzomVar2.getClass();
                return zzomVar2;
            }
        }
        return zzodVar;
    }
}
