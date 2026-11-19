package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafo implements zzahd {

    /* JADX INFO: renamed from: a */
    public final int f5197a;

    /* JADX INFO: renamed from: b */
    public final int[] f5198b;

    /* JADX INFO: renamed from: c */
    public final long[] f5199c;

    /* JADX INFO: renamed from: d */
    public final long[] f5200d;

    /* JADX INFO: renamed from: e */
    public final long[] f5201e;

    /* JADX INFO: renamed from: f */
    public final long f5202f;

    public zzafo(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f5198b = iArr;
        this.f5199c = jArr;
        this.f5200d = jArr2;
        this.f5201e = jArr3;
        int length = iArr.length;
        this.f5197a = length;
        if (length <= 0) {
            this.f5202f = 0L;
        } else {
            int i2 = length - 1;
            this.f5202f = jArr2[i2] + jArr3[i2];
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        long[] jArr = this.f5201e;
        int iM6517s = zzfm.m6517s(jArr, j2, true);
        long j3 = jArr[iM6517s];
        long[] jArr2 = this.f5199c;
        zzahe zzaheVar = new zzahe(j3, jArr2[iM6517s]);
        if (j3 >= j2 || iM6517s == this.f5197a - 1) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i2 = iM6517s + 1;
        return new zzahb(zzaheVar, new zzahe(jArr[i2], jArr2[i2]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f5198b);
        String string2 = Arrays.toString(this.f5199c);
        String string3 = Arrays.toString(this.f5201e);
        String string4 = Arrays.toString(this.f5200d);
        int i2 = this.f5197a;
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(string);
        AbstractC0271e0.m413u(sb, ", offsets=", string2, ", timeUs=", string3);
        return AbstractC1456a.m2450q(sb, ", durationsUs=", string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5202f;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
