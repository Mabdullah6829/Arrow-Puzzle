package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class zzzx implements zzabb {

    /* JADX INFO: renamed from: a */
    public final zzbg f21499a;

    /* JADX INFO: renamed from: b */
    public final int f21500b;

    /* JADX INFO: renamed from: c */
    public final int[] f21501c;

    /* JADX INFO: renamed from: d */
    public final zzv[] f21502d;

    /* JADX INFO: renamed from: e */
    public int f21503e;

    public zzzx(zzbg zzbgVar, int[] iArr) {
        int length = iArr.length;
        zzgtr.m7133f(length > 0);
        zzbgVar.getClass();
        zzv[] zzvVarArr = zzbgVar.f7810d;
        this.f21499a = zzbgVar;
        this.f21500b = length;
        this.f21502d = new zzv[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f21502d[i2] = zzvVarArr[iArr[i2]];
        }
        Arrays.sort(this.f21502d, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzw
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((zzv) obj2).f21056j - ((zzv) obj).f21056j;
            }
        });
        this.f21501c = new int[this.f21500b];
        for (int i3 = 0; i3 < this.f21500b; i3++) {
            int[] iArr2 = this.f21501c;
            zzv zzvVar = this.f21502d[i3];
            int i4 = 0;
            while (true) {
                if (i4 >= zzvVarArr.length) {
                    i4 = -1;
                    break;
                } else if (zzvVar == zzvVarArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i3] = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    /* JADX INFO: renamed from: a */
    public final int mo3918a() {
        return this.f21501c.length;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    /* JADX INFO: renamed from: b */
    public final zzv mo3919b(int i2) {
        return this.f21502d[i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzx zzzxVar = (zzzx) obj;
            if (this.f21499a.equals(zzzxVar.f21499a) && Arrays.equals(this.f21501c, zzzxVar.f21501c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f21503e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f21501c) + (System.identityHashCode(this.f21499a) * 31);
        this.f21503e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    /* JADX INFO: renamed from: o */
    public final int mo3920o(int i2) {
        return this.f21501c[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    /* JADX INFO: renamed from: p */
    public final int mo3921p(int i2) {
        for (int i3 = 0; i3 < this.f21500b; i3++) {
            if (this.f21501c[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.f21499a;
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.f21502d[0];
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzh() {
        return this.f21501c[0];
    }
}
