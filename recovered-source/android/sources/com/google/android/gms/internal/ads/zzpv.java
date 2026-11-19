package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzpv {

    /* JADX INFO: renamed from: a */
    public final String f20565a;

    /* JADX INFO: renamed from: b */
    public int f20566b;

    /* JADX INFO: renamed from: c */
    public long f20567c;

    /* JADX INFO: renamed from: d */
    public final zzxl f20568d;

    /* JADX INFO: renamed from: e */
    public boolean f20569e;

    /* JADX INFO: renamed from: f */
    public boolean f20570f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zzpw f20571g;

    public zzpv(zzpw zzpwVar, String str, int i2, zzxl zzxlVar) {
        this.f20571g = zzpwVar;
        this.f20565a = str;
        this.f20566b = i2;
        this.f20567c = zzxlVar == null ? -1L : zzxlVar.f21281d;
        if (zzxlVar == null || !zzxlVar.m9025b()) {
            return;
        }
        this.f20568d = zzxlVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8821a(zzbf zzbfVar, zzbf zzbfVar2) {
        zzxl zzxlVar;
        int i2 = this.f20566b;
        if (i2 < zzbfVar.mo4735a()) {
            zzpw zzpwVar = this.f20571g;
            zzbe zzbeVar = zzpwVar.f20574a;
            zzbfVar.mo4736b(i2, zzbeVar, 0L);
            int i3 = zzbeVar.f7685k;
            while (true) {
                if (i3 > zzbeVar.f7686l) {
                    i2 = -1;
                    break;
                }
                int iMo4739e = zzbfVar2.mo4739e(zzbfVar.mo4740f(i3));
                if (iMo4739e != -1) {
                    i2 = zzbfVar2.mo4738d(iMo4739e, zzpwVar.f20575b, false).f7634c;
                    break;
                }
                i3++;
            }
        } else if (i2 >= zzbfVar2.mo4735a()) {
            i2 = -1;
            break;
        }
        this.f20566b = i2;
        return i2 != -1 && ((zzxlVar = this.f20568d) == null || zzbfVar2.mo4739e(zzxlVar.f21278a) != -1);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8822b(zznp zznpVar) {
        zzxl zzxlVar = zznpVar.f20517d;
        if (zzxlVar == null) {
            return this.f20566b != zznpVar.f20516c;
        }
        long j2 = this.f20567c;
        if (j2 == -1) {
            return false;
        }
        long j3 = zzxlVar.f21281d;
        if (j3 > j2) {
            return true;
        }
        zzxl zzxlVar2 = this.f20568d;
        if (zzxlVar2 == null) {
            return false;
        }
        zzbf zzbfVar = zznpVar.f20515b;
        int iMo4739e = zzbfVar.mo4739e(zzxlVar.f21278a);
        int iMo4739e2 = zzbfVar.mo4739e(zzxlVar2.f21278a);
        long j4 = zzxlVar2.f21281d;
        int i2 = zzxlVar2.f21279b;
        if (j3 < j4 || iMo4739e < iMo4739e2) {
            return false;
        }
        if (iMo4739e > iMo4739e2) {
            return true;
        }
        if (!zzxlVar.m9025b()) {
            int i3 = zzxlVar.f21282e;
            return i3 == -1 || i3 > i2;
        }
        int i4 = zzxlVar.f21279b;
        int i5 = zzxlVar.f21280c;
        if (i4 <= i2) {
            return i4 == i2 && i5 > zzxlVar2.f21280c;
        }
        return true;
    }
}
