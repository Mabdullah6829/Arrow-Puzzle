package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzkg implements zzlu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzlj f20190a;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m8623a(final zzlt zzltVar) {
        final zzlj zzljVar = this.f20190a;
        zzljVar.f20256j.mo6122g(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                long j2;
                boolean z;
                zzlj zzljVar2 = zzljVar;
                zzlt zzltVar2 = zzltVar;
                int i3 = zzljVar2.f20224F - zzltVar2.f20287c;
                zzljVar2.f20224F = i3;
                boolean z2 = true;
                if (zzltVar2.f20288d) {
                    zzljVar2.f20225G = zzltVar2.f20289e;
                    zzljVar2.f20226H = true;
                }
                if (i3 == 0) {
                    zzbf zzbfVar = zzltVar2.f20286b.f20456a;
                    int iMo4710h = -1;
                    if (!zzljVar2.f20244Z.f20456a.m4833g() && zzbfVar.m4833g()) {
                        zzljVar2.f20245a0 = -1;
                        zzljVar2.f20247b0 = 0L;
                    }
                    if (!zzbfVar.m4833g()) {
                        List listAsList = Arrays.asList(((zzna) zzbfVar).f20491h);
                        int size = listAsList.size();
                        ArrayList arrayList = zzljVar2.f20262p;
                        zzgtr.m7133f(size == arrayList.size());
                        for (int i4 = 0; i4 < listAsList.size(); i4++) {
                            ((zzlf) arrayList.get(i4)).f20212b = (zzbf) listAsList.get(i4);
                        }
                    }
                    long j3 = -9223372036854775807L;
                    if (zzljVar2.f20226H) {
                        boolean z3 = zzltVar2.f20286b.f20456a.m4833g() && zzljVar2.f20244Z.f20456a.m4833g();
                        boolean zEquals = zzltVar2.f20286b.f20457b.equals(zzljVar2.f20244Z.f20457b);
                        long j4 = zzltVar2.f20286b.f20459d;
                        long j5 = zzljVar2.f20244Z.f20473r;
                        if (z3 || (zEquals && j4 == j5)) {
                            z2 = false;
                        }
                        if (z2) {
                            iMo4710h = zzljVar2.mo4710h();
                            if (zzbfVar.m4833g() || zzltVar2.f20286b.f20457b.m9025b()) {
                                j3 = zzltVar2.f20286b.f20459d;
                            } else {
                                zzmu zzmuVar = zzltVar2.f20286b;
                                zzxl zzxlVar = zzmuVar.f20457b;
                                long j6 = zzmuVar.f20459d;
                                zzbfVar.mo4841o(zzxlVar.f21278a, zzljVar2.f20261o);
                                j3 = j6;
                            }
                        }
                        z = z2;
                        long j7 = j3;
                        i2 = iMo4710h;
                        j2 = j7;
                    } else {
                        i2 = -1;
                        j2 = -9223372036854775807L;
                        z = false;
                    }
                    zzljVar2.f20226H = false;
                    zzljVar2.m8634o(zzltVar2.f20286b, 1, z, zzljVar2.f20225G, j2, i2);
                }
            }
        });
    }
}
