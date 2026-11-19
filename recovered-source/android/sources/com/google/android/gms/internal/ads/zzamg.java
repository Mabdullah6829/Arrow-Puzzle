package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;

/* JADX INFO: loaded from: classes2.dex */
final class zzamg implements zzahd {

    /* JADX INFO: renamed from: a */
    public final long f5930a;

    /* JADX INFO: renamed from: b */
    public final zzamh[] f5931b;

    /* JADX INFO: renamed from: c */
    public final int f5932c;

    public zzamg(long j2, zzamh[] zzamhVarArr, int i2) {
        this.f5930a = j2;
        this.f5931b = zzamhVarArr;
        this.f5932c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        long j3;
        long j4;
        long j5;
        long jMin;
        int i2;
        long jMin2;
        int i3;
        zzams zzamsVar;
        long[] jArr;
        int iM4225a;
        int iM4225a2;
        int iM4226b;
        zzamh[] zzamhVarArr = this.f5931b;
        int length = zzamhVarArr.length;
        zzahe zzaheVar = zzahe.f5308c;
        if (length == 0) {
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i4 = -1;
        int i5 = this.f5932c;
        if (i5 != -1) {
            zzams zzamsVar2 = zzamhVarArr[i5].f5934b;
            int i6 = zzami.f5939G;
            int iM4225a3 = zzamsVar2.m4225a(j2);
            if (iM4225a3 == -1) {
                iM4225a3 = zzamsVar2.m4226b(j2);
            }
            if (iM4225a3 == -1) {
                return new zzahb(zzaheVar, zzaheVar);
            }
            long[] jArr2 = zzamsVar2.f6037f;
            j4 = jArr2[iM4225a3];
            long[] jArr3 = zzamsVar2.f6034c;
            j3 = jArr3[iM4225a3];
            if (j4 < j2 && iM4225a3 < zzamsVar2.f6033b - 1 && (iM4226b = zzamsVar2.m4226b(j2)) != -1 && iM4226b != iM4225a3) {
                long j6 = jArr2[iM4226b];
                jMin = jArr3[iM4226b];
                j5 = j6;
            }
            i2 = 0;
            jMin2 = j3;
            while (i2 < zzamhVarArr.length) {
                if (i2 != i5) {
                    zzamsVar = zzamhVarArr[i2].f5934b;
                    jArr = zzamsVar.f6034c;
                    int i7 = zzami.f5939G;
                    iM4225a = zzamsVar.m4225a(j4);
                    if (iM4225a == i4) {
                        iM4225a = zzamsVar.m4226b(j4);
                    }
                    if (iM4225a == i4) {
                        jMin2 = Math.min(jArr[iM4225a], jMin2);
                    }
                    if (j5 != -9223372036854775807L) {
                        iM4225a2 = zzamsVar.m4225a(j5);
                        i3 = -1;
                        if (iM4225a2 == -1) {
                            iM4225a2 = zzamsVar.m4226b(j5);
                        }
                        if (iM4225a2 == -1) {
                            jMin = Math.min(jArr[iM4225a2], jMin);
                        }
                    } else {
                        i3 = -1;
                    }
                } else {
                    i2 = i2;
                    i3 = i4;
                }
                i4 = i3;
                i2++;
                zzamhVarArr = zzamhVarArr;
            }
            zzahe zzaheVar2 = new zzahe(j4, jMin2);
            return j5 == -9223372036854775807L ? new zzahb(zzaheVar2, zzaheVar2) : new zzahb(zzaheVar2, new zzahe(j5, jMin));
        }
        j3 = LocationRequestCompat.PASSIVE_INTERVAL;
        j4 = j2;
        j5 = -9223372036854775807L;
        jMin = -1;
        i2 = 0;
        jMin2 = j3;
        while (i2 < zzamhVarArr.length) {
            if (i2 != i5) {
                zzamsVar = zzamhVarArr[i2].f5934b;
                jArr = zzamsVar.f6034c;
                int i8 = zzami.f5939G;
                iM4225a = zzamsVar.m4225a(j4);
                if (iM4225a == i4) {
                    iM4225a = zzamsVar.m4226b(j4);
                }
                if (iM4225a == i4) {
                    jMin2 = Math.min(jArr[iM4225a], jMin2);
                }
                if (j5 != -9223372036854775807L) {
                    iM4225a2 = zzamsVar.m4225a(j5);
                    i3 = -1;
                    if (iM4225a2 == -1) {
                        iM4225a2 = zzamsVar.m4226b(j5);
                    }
                    if (iM4225a2 == -1) {
                        jMin = Math.min(jArr[iM4225a2], jMin);
                    }
                } else {
                    i3 = -1;
                }
            } else {
                i2 = i2;
                i3 = i4;
            }
            i4 = i3;
            i2++;
            zzamhVarArr = zzamhVarArr;
        }
        zzahe zzaheVar3 = new zzahe(j4, jMin2);
        if (j5 == -9223372036854775807L) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5930a;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
