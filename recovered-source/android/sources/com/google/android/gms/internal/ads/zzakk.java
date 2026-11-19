package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzakk implements zzahd {

    /* JADX INFO: renamed from: a */
    public final zzafo f5606a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f5607b;

    /* JADX INFO: renamed from: c */
    public final long f5608c;

    /* JADX INFO: renamed from: d */
    public final int f5609d;

    public zzakk(SparseArray sparseArray, long j2, int i2, long j3, long j4) {
        int i3;
        this.f5607b = sparseArray;
        this.f5608c = j2;
        this.f5609d = i2;
        List list = (List) sparseArray.get(i2);
        zzafo zzafoVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                zzakj zzakjVar = (zzakj) list.get(i5);
                jArrCopyOf3[i5] = zzakjVar.f5603s;
                jArrCopyOf[i5] = zzakjVar.f5604t;
            }
            while (true) {
                i3 = size - 1;
                if (i4 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                iArrCopyOf[i4] = (int) (jArrCopyOf[i6] - jArrCopyOf[i4]);
                jArrCopyOf2[i4] = jArrCopyOf3[i6] - jArrCopyOf3[i4];
                i4 = i6;
            }
            int i7 = i3;
            while (i7 > 0 && jArrCopyOf3[i7] >= j2) {
                i7--;
            }
            iArrCopyOf[i7] = (int) ((j3 + j4) - jArrCopyOf[i7]);
            jArrCopyOf2[i7] = j2 - jArrCopyOf3[i7];
            if (i7 < i3) {
                zzeh.m6211c("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i8 = i7 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i8);
            }
            zzafoVar = new zzafo(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f5606a = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzafo zzafoVar = this.f5606a;
        if (zzafoVar != null) {
            return zzafoVar.mo4064a(j2);
        }
        zzahe zzaheVar = zzahe.f5308c;
        return new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5608c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        List list = (List) this.f5607b.get(this.f5609d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
