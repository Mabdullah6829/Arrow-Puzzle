package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import p003C.AbstractC0122m;
import p003C.C0106A;
import p003C.C0121l;
import p022N.AbstractC0355G;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmw {

    /* JADX INFO: renamed from: b */
    public static final zzmw f22661b;

    /* JADX INFO: renamed from: a */
    public final AbstractC0122m f22662a;

    static {
        int i2 = AbstractC0122m.f182x;
        f22661b = new zzmw(C0106A.f154z);
    }

    public zzmw(AbstractC0122m abstractC0122m) {
        this.f22662a = abstractC0122m;
    }

    /* JADX INFO: renamed from: a */
    public static zzmw m10529a(zzacv zzacvVar) throws zzaeh {
        long j2;
        String strMo9417w;
        zzmv zzmvVar;
        int iMo9390G = zzacvVar.mo9390G();
        if (iMo9390G < 0) {
            throw new zzaeh("Negative number of flags");
        }
        int i2 = AbstractC0122m.f182x;
        C0121l c0121l = new C0121l();
        long j3 = 0;
        for (int i3 = 0; i3 < iMo9390G; i3++) {
            long jMo9391H = zzacvVar.mo9391H();
            int i4 = (int) jMo9391H;
            long j4 = jMo9391H >>> 3;
            if (j4 == 0) {
                j2 = 0;
                strMo9417w = zzacvVar.mo9417w();
            } else {
                long j5 = j4 + j3;
                if (j5 > 2305843009213693951L) {
                    throw new zzaeh("Flag name larger than max size");
                }
                j2 = j5;
                strMo9417w = null;
            }
            int i5 = i4 & 7;
            if (i5 == 0 || i5 == 1) {
                zzmvVar = new zzmv(j2, strMo9417w, i5, 0L, null);
            } else if (i5 == 2) {
                zzmvVar = new zzmv(j2, strMo9417w, i5, zzacvVar.mo9391H(), null);
            } else if (i5 == 3) {
                zzmvVar = new zzmv(j2, strMo9417w, i5, Double.doubleToRawLongBits(zzacvVar.mo9409o()), null);
            } else if (i5 == 4) {
                zzmvVar = new zzmv(j2, strMo9417w, i5, 0L, zzacvVar.mo9417w());
            } else {
                if (i5 != 5) {
                    throw new zzaeh(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i5).length() + 23), "Unrecognized flag type ", i5));
                }
                zzmvVar = new zzmv(j2, strMo9417w, i5, 0L, zzacvVar.mo9420z());
            }
            long j6 = zzmvVar.f22655s;
            if (j6 != 0) {
                j3 = j6;
            }
            c0121l.m185a(zzmvVar);
        }
        return new zzmw(c0121l.m207d());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmw)) {
            return false;
        }
        return this.f22662a.equals(((zzmw) obj).f22662a);
    }

    public final int hashCode() {
        AbstractC0122m abstractC0122m = this.f22662a;
        abstractC0122m.getClass();
        return AbstractC0355G.m556j(abstractC0122m);
    }
}
