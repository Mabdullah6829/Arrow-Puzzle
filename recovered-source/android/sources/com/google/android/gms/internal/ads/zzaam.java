package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaam extends zzbk {

    /* JADX INFO: renamed from: A */
    public final boolean f4769A;

    /* JADX INFO: renamed from: B */
    public final boolean f4770B;

    /* JADX INFO: renamed from: C */
    public final boolean f4771C;

    /* JADX INFO: renamed from: D */
    public final SparseArray f4772D;

    /* JADX INFO: renamed from: E */
    public final SparseBooleanArray f4773E;

    /* JADX INFO: renamed from: w */
    public final boolean f4774w;

    /* JADX INFO: renamed from: x */
    public final boolean f4775x;

    /* JADX INFO: renamed from: y */
    public final boolean f4776y;

    /* JADX INFO: renamed from: z */
    public final boolean f4777z;

    public zzaam() {
        this.f4772D = new SparseArray();
        this.f4773E = new SparseBooleanArray();
        this.f4774w = true;
        this.f4775x = true;
        this.f4776y = true;
        this.f4777z = true;
        this.f4769A = true;
        this.f4770B = true;
        this.f4771C = true;
    }

    public zzaam(zzaan zzaanVar) {
        m5048a(zzaanVar);
        this.f4774w = zzaanVar.f4784w;
        this.f4775x = zzaanVar.f4785x;
        this.f4776y = zzaanVar.f4786y;
        this.f4777z = zzaanVar.f4787z;
        this.f4769A = zzaanVar.f4779A;
        this.f4770B = zzaanVar.f4780B;
        this.f4771C = zzaanVar.f4781C;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = zzaanVar.f4782D;
            if (i2 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i2), new HashMap((Map) sparseArray2.valueAt(i2)));
                i2++;
            } else {
                this.f4772D = sparseArray;
                this.f4773E = zzaanVar.f4783E.clone();
                return;
            }
        }
    }
}
