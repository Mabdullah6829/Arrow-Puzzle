package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzzy extends zzaaa {

    /* JADX INFO: renamed from: b */
    public final zzzj f23167b;

    /* JADX INFO: renamed from: c */
    public final zzzj f23168c;

    /* JADX INFO: renamed from: d */
    public final int[] f23169d;

    /* JADX INFO: renamed from: e */
    public final int f23170e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public zzzy(zzzj zzzjVar, zzzj zzzjVar2) {
        this.f23167b = zzzjVar;
        this.f23168c = zzzjVar2;
        int iMo10713a = zzzjVar2.mo10713a();
        if (!(iMo10713a <= 28)) {
            throw new IllegalArgumentException("metadata size too large");
        }
        int[] iArr = new int[iMo10713a];
        this.f23169d = iArr;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < iMo10713a) {
            zzyl zzylVarM10754d = m10754d(i2);
            long j3 = zzylVarM10754d.f23101e | j2;
            if (j3 == j2) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        i4 = -1;
                        break;
                    } else if (zzylVarM10754d.equals(m10754d(iArr[i4] & 31))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1) {
                    iArr[i4] = zzylVarM10754d.f23099c ? iArr[i4] | (1 << (i2 + 4)) : i2;
                } else {
                    iArr[i3] = i2;
                    i3++;
                }
            } else {
                iArr[i3] = i2;
                i3++;
            }
            i2++;
            j2 = j3;
        }
        this.f23170e = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: a */
    public final void mo9302a(zzzq zzzqVar, zzzc zzzcVar) {
        for (int i2 = 0; i2 < this.f23170e; i2++) {
            int i3 = this.f23169d[i2];
            zzyl zzylVarM10754d = m10754d(i3 & 31);
            if (zzylVarM10754d.f23099c) {
                zzzqVar.mo10752b(zzylVarM10754d, new zzzx(this, zzylVarM10754d, i3), zzzcVar);
            } else {
                zzzj zzzjVar = this.f23167b;
                int iMo10713a = zzzjVar.mo10713a();
                if (i3 >= iMo10713a) {
                    zzzjVar = this.f23168c;
                    i3 -= iMo10713a;
                }
                zzzqVar.mo10751a(zzylVarM10754d, zzylVarM10754d.f23098b.cast(zzzjVar.mo10715c(i3)), zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: b */
    public final int mo9303b() {
        return this.f23170e;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    /* JADX INFO: renamed from: c */
    public final Set mo9304c() {
        return new zzzw(this);
    }

    /* JADX INFO: renamed from: d */
    public final zzyl m10754d(int i2) {
        zzzj zzzjVar = this.f23167b;
        int iMo10713a = zzzjVar.mo10713a();
        return i2 >= iMo10713a ? this.f23168c.mo10714b(i2 - iMo10713a) : zzzjVar.mo10714b(i2);
    }
}
