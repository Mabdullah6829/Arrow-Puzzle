package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class zzalu implements zzahd {

    /* JADX INFO: renamed from: a */
    public final SparseArray f5837a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f5838b;

    /* JADX INFO: renamed from: c */
    public final long f5839c;

    /* JADX INFO: renamed from: d */
    public final long f5840d;

    /* JADX INFO: renamed from: e */
    public final int f5841e;

    public /* synthetic */ zzalu(SparseArray sparseArray, SparseArray sparseArray2, long j2, long j3, int i2) {
        this.f5837a = sparseArray;
        this.f5838b = sparseArray2;
        this.f5839c = j2;
        this.f5840d = j3;
        this.f5841e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        SparseArray sparseArray = this.f5837a;
        int i2 = this.f5841e;
        long[] jArr = (long[]) sparseArray.get(i2);
        SparseArray sparseArray2 = this.f5838b;
        long[] jArr2 = (long[]) sparseArray2.get(i2);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i2);
            jArr2 = (long[]) sparseArray2.get(i2);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j2 < jArr[0]) {
            zzahe zzaheVar = new zzahe(0L, this.f5840d);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iM6517s = zzfm.m6517s(jArr, j2, true);
        zzahe zzaheVar2 = new zzahe(jArr[iM6517s], jArr2[iM6517s]);
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5839c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
