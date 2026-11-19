package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaht implements zzahd {

    /* JADX INFO: renamed from: a */
    public final long f5358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzahv f5359b;

    public zzaht(zzahv zzahvVar, long j2) {
        this.f5359b = zzahvVar;
        this.f5358a = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    /* JADX INFO: renamed from: a */
    public final zzahb mo4064a(long j2) {
        zzahv zzahvVar = this.f5359b;
        zzahb zzahbVarM4136a = zzahvVar.f5370i[0].m4136a(j2);
        int i2 = 1;
        while (true) {
            zzahy[] zzahyVarArr = zzahvVar.f5370i;
            if (i2 >= zzahyVarArr.length) {
                return zzahbVarM4136a;
            }
            zzahb zzahbVarM4136a2 = zzahyVarArr[i2].m4136a(j2);
            if (zzahbVarM4136a2.f5304a.f5310b < zzahbVarM4136a.f5304a.f5310b) {
                zzahbVarM4136a = zzahbVarM4136a2;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.f5358a;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }
}
