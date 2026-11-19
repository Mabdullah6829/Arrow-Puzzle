package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zznq {

    /* JADX INFO: renamed from: a */
    public final zzs f20524a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f20525b;

    public zznq(zzs zzsVar, SparseArray sparseArray) {
        this.f20524a = zzsVar;
        SparseBooleanArray sparseBooleanArray = zzsVar.f20733a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            zzgtr.m7136i(i2, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i2);
            zznp zznpVar = (zznp) sparseArray.get(iKeyAt);
            zznpVar.getClass();
            sparseArray2.append(iKeyAt, zznpVar);
        }
        this.f20525b = sparseArray2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8804a(int i2) {
        return this.f20524a.f20733a.get(i2);
    }
}
