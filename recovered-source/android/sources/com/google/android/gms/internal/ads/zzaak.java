package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzaak extends zzaar implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f4765w;

    /* JADX INFO: renamed from: x */
    public final int f4766x;

    public zzaak(int i2, zzbg zzbgVar, int i3, zzaan zzaanVar, int i4) {
        int i5;
        super(i2, zzbgVar, i3);
        this.f4765w = zzne.m8768m(i4, zzaanVar.f4780B) ? 1 : 0;
        zzv zzvVar = this.f4801v;
        int i6 = zzvVar.f21068v;
        int i7 = -1;
        if (i6 != -1 && (i5 = zzvVar.f21069w) != -1) {
            i7 = i6 * i5;
        }
        this.f4766x = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: b */
    public final int mo3898b() {
        return this.f4765w;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo3899c(zzaar zzaarVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4766x, ((zzaak) obj).f4766x);
    }
}
