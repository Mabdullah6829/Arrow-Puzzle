package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzxy extends zzzj {

    /* JADX INFO: renamed from: a */
    public Object[] f23079a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f23080b = 0;

    @Override // com.google.android.gms.internal.measurement.zzzj
    /* JADX INFO: renamed from: a */
    public final int mo10713a() {
        return this.f23080b;
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    /* JADX INFO: renamed from: b */
    public final zzyl mo10714b(int i2) {
        if (i2 < this.f23080b) {
            return (zzyl) this.f23079a[i2 + i2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    /* JADX INFO: renamed from: c */
    public final Object mo10715c(int i2) {
        if (i2 < this.f23080b) {
            return this.f23079a[i2 + i2 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.zzzj
    /* JADX INFO: renamed from: d */
    public final Object mo10716d(zzyl zzylVar) {
        int iM10718f = m10718f(zzylVar);
        if (iM10718f == -1) {
            return null;
        }
        return zzylVar.f23098b.cast(this.f23079a[iM10718f + iM10718f + 1]);
    }

    /* JADX INFO: renamed from: e */
    public final void m10717e(zzyl zzylVar, Object obj) {
        int iM10718f;
        if (!zzylVar.f23099c && (iM10718f = m10718f(zzylVar)) != -1) {
            zzabr.m9334a(obj, "metadata value");
            this.f23079a[iM10718f + iM10718f + 1] = obj;
            return;
        }
        int i2 = this.f23080b + 1;
        Object[] objArr = this.f23079a;
        int length = objArr.length;
        if (i2 + i2 > length) {
            this.f23079a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f23079a;
        int i3 = this.f23080b;
        int i4 = i3 + i3;
        objArr2[i4] = zzylVar;
        zzabr.m9334a(obj, "metadata value");
        objArr2[i4 + 1] = obj;
        this.f23080b++;
    }

    /* JADX INFO: renamed from: f */
    public final int m10718f(zzyl zzylVar) {
        for (int i2 = 0; i2 < this.f23080b; i2++) {
            if (this.f23079a[i2 + i2].equals(zzylVar)) {
                return i2;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i2 = 0; i2 < this.f23080b; i2++) {
            sb.append(" '");
            sb.append(mo10714b(i2));
            sb.append("': ");
            sb.append(mo10715c(i2));
        }
        sb.append(" }");
        return sb.toString();
    }
}
