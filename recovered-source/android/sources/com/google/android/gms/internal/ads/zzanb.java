package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
final class zzanb {

    /* JADX INFO: renamed from: a */
    public int f6100a;

    /* JADX INFO: renamed from: b */
    public long f6101b;

    /* JADX INFO: renamed from: c */
    public int f6102c;

    /* JADX INFO: renamed from: d */
    public int f6103d;

    /* JADX INFO: renamed from: e */
    public int f6104e;

    /* JADX INFO: renamed from: f */
    public final int[] f6105f = new int[255];

    /* JADX INFO: renamed from: g */
    public final zzeu f6106g = new zzeu(255);

    /* JADX INFO: renamed from: a */
    public final boolean m4236a(zzagb zzagbVar, long j2) {
        boolean zMo4081K;
        zzgtr.m7128a(zzagbVar.mo4086g() == zzagbVar.mo4084e());
        zzeu zzeuVar = this.f6106g;
        zzeuVar.m6396y(4);
        while (true) {
            if (j2 != -1 && zzagbVar.mo4086g() + 4 >= j2) {
                break;
            }
            try {
                zMo4081K = zzagbVar.mo4081K(zzeuVar.f14887a, 0, 4, true);
            } catch (EOFException unused) {
                zMo4081K = false;
            }
            if (!zMo4081K) {
                break;
            }
            zzeuVar.m6363E(0);
            if (zzeuVar.m6374P() == 1332176723) {
                zzagbVar.zzl();
                return true;
            }
            zzagbVar.mo4091o(1);
        }
        do {
            if (j2 != -1 && zzagbVar.mo4086g() >= j2) {
                break;
            }
        } while (zzagbVar.mo4083d() != -1);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4237b(zzagb zzagbVar, boolean z) throws zzat, EOFException {
        boolean zMo4081K;
        boolean zMo4081K2;
        this.f6100a = 0;
        this.f6101b = 0L;
        this.f6102c = 0;
        this.f6103d = 0;
        this.f6104e = 0;
        zzeu zzeuVar = this.f6106g;
        zzeuVar.m6396y(27);
        try {
            zMo4081K = zzagbVar.mo4081K(zzeuVar.f14887a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo4081K = false;
        }
        if (zMo4081K && zzeuVar.m6374P() == 1332176723) {
            if (zzeuVar.m6369K() == 0) {
                this.f6100a = zzeuVar.m6369K();
                this.f6101b = zzeuVar.m6379e();
                zzeuVar.m6375a();
                zzeuVar.m6375a();
                zzeuVar.m6375a();
                int iM6369K = zzeuVar.m6369K();
                this.f6102c = iM6369K;
                this.f6103d = iM6369K + 27;
                zzeuVar.m6396y(iM6369K);
                try {
                    zMo4081K2 = zzagbVar.mo4081K(zzeuVar.f14887a, 0, this.f6102c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zMo4081K2 = false;
                }
                if (zMo4081K2) {
                    for (int i2 = 0; i2 < this.f6102c; i2++) {
                        int iM6369K2 = zzeuVar.m6369K();
                        this.f6105f[i2] = iM6369K2;
                        this.f6104e += iM6369K2;
                    }
                    return true;
                }
            } else if (!z) {
                throw zzat.m4384b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
