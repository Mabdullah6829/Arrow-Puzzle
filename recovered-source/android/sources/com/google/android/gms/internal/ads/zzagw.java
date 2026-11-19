package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagw implements zzahd {

    /* JADX INFO: renamed from: a */
    public final zzei f5286a;

    /* JADX INFO: renamed from: b */
    public final zzei f5287b;

    /* JADX INFO: renamed from: c */
    public final long f5288c;

    public zzagw(long j2, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzgtr.m7128a(length == length2);
        if (length2 <= 0 || jArr2[0] <= 0) {
            this.f5286a = new zzei(length2);
            this.f5287b = new zzei(length2);
        } else {
            int i2 = length2 + 1;
            zzei zzeiVar = new zzei(i2);
            this.f5286a = zzeiVar;
            zzei zzeiVar2 = new zzei(i2);
            this.f5287b = zzeiVar2;
            zzeiVar.m6219a();
            zzeiVar2.m6219a();
        }
        this.f5286a.m6220b(jArr);
        this.f5287b.m6220b(jArr2);
        this.f5288c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzei zzeiVar = this.f5287b;
        int i2 = zzeiVar.f13939a;
        if (i2 == 0) {
            zzahe zzaheVar = zzahe.f5308c;
            return new zzahb(zzaheVar, zzaheVar);
        }
        String str = zzfm.f16091a;
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        while (i5 <= i3) {
            int i6 = (i5 + i3) >>> 1;
            if (zzeiVar.m6221c(i6) < j2) {
                i5 = i6 + 1;
            } else {
                i3 = i6 - 1;
            }
        }
        int i7 = i3 + 1;
        if (i7 < zzeiVar.f13939a && zzeiVar.m6221c(i7) == j2) {
            i4 = i7;
        } else if (i3 != -1) {
            i4 = i3;
        }
        long jM6221c = zzeiVar.m6221c(i4);
        zzei zzeiVar2 = this.f5286a;
        zzahe zzaheVar2 = new zzahe(jM6221c, zzeiVar2.m6221c(i4));
        if (jM6221c == j2 || i4 == zzeiVar.f13939a - 1) {
            return new zzahb(zzaheVar2, zzaheVar2);
        }
        int i8 = i4 + 1;
        return new zzahb(zzaheVar2, new zzahe(zzeiVar.m6221c(i8), zzeiVar2.m6221c(i8)));
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5288c;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.f5287b.f13939a > 0;
    }
}
