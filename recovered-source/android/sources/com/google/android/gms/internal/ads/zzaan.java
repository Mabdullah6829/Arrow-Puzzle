package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaan extends zzbl {

    /* JADX INFO: renamed from: F */
    public static final zzaan f4778F = new zzaan(new zzaam());

    /* JADX INFO: renamed from: A */
    public final boolean f4779A;

    /* JADX INFO: renamed from: B */
    public final boolean f4780B;

    /* JADX INFO: renamed from: C */
    public final boolean f4781C;

    /* JADX INFO: renamed from: D */
    public final SparseArray f4782D;

    /* JADX INFO: renamed from: E */
    public final SparseBooleanArray f4783E;

    /* JADX INFO: renamed from: w */
    public final boolean f4784w;

    /* JADX INFO: renamed from: x */
    public final boolean f4785x;

    /* JADX INFO: renamed from: y */
    public final boolean f4786y;

    /* JADX INFO: renamed from: z */
    public final boolean f4787z;

    static {
        String str = zzfm.f16091a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    public zzaan(zzaam zzaamVar) {
        super(zzaamVar);
        this.f4784w = zzaamVar.f4774w;
        this.f4785x = zzaamVar.f4775x;
        this.f4786y = zzaamVar.f4776y;
        this.f4787z = zzaamVar.f4777z;
        this.f4779A = zzaamVar.f4769A;
        this.f4780B = zzaamVar.f4770B;
        this.f4781C = zzaamVar.f4771C;
        this.f4782D = zzaamVar.f4772D;
        this.f4783E = zzaamVar.f4773E;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaan.class == obj.getClass()) {
            zzaan zzaanVar = (zzaan) obj;
            if (super.equals(zzaanVar) && this.f4784w == zzaanVar.f4784w && this.f4785x == zzaanVar.f4785x && this.f4786y == zzaanVar.f4786y && this.f4787z == zzaanVar.f4787z && this.f4779A == zzaanVar.f4779A && this.f4780B == zzaanVar.f4780B && this.f4781C == zzaanVar.f4781C) {
                SparseBooleanArray sparseBooleanArray = zzaanVar.f4783E;
                SparseBooleanArray sparseBooleanArray2 = this.f4783E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i2)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = zzaanVar.f4782D;
                    SparseArray sparseArray2 = this.f4782D;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i3 = 0; i3 < size2; i3++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i3));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i3);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzzo zzzoVar = (zzzo) entry.getKey();
                                        if (!map2.containsKey(zzzoVar) || !Objects.equals(entry.getValue(), map2.get(zzzoVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f4784w ? 1 : 0)) * 961) + (this.f4785x ? 1 : 0)) * 961) + (this.f4786y ? 1 : 0)) * 28629151) + (this.f4787z ? 1 : 0)) * 31) + (this.f4779A ? 1 : 0)) * 31) + (this.f4780B ? 1 : 0)) * 961) + (this.f4781C ? 1 : 0)) * 31;
    }
}
