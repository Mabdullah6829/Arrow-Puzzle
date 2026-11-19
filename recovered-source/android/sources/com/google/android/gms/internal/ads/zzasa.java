package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzasa {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6818a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b */
    public static final byte[] f6819b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public static boolean m4359a(zzagb zzagbVar) {
        zzeu zzeuVar = new zzeu(8);
        int i2 = zzarz.m4348a(zzagbVar, zzeuVar).f6814a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        zzagbVar.mo4078H(zzeuVar.f14887a, 0, 4);
        zzeuVar.m6363E(0);
        int iM6376b = zzeuVar.m6376b();
        if (iM6376b == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iM6376b).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iM6376b);
        zzeh.m6213e("WavHeaderReader", sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static zzarz m4360b(int i2, zzagb zzagbVar, zzeu zzeuVar) throws zzat {
        zzarz zzarzVarM4348a = zzarz.m4348a(zzagbVar, zzeuVar);
        while (true) {
            int i3 = zzarzVarM4348a.f6814a;
            if (i3 == i2) {
                return zzarzVarM4348a;
            }
            AbstractC5152f.m3776h(new StringBuilder(String.valueOf(i3).length() + 28), "Ignoring unknown WAV chunk: ", i3, "WavHeaderReader");
            long j2 = zzarzVarM4348a.f6815b;
            long j3 = 8 + j2;
            if ((1 & j2) != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 40);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i3);
                throw zzat.m4384b(sb.toString());
            }
            zzagbVar.mo4091o((int) j3);
            zzarzVarM4348a = zzarz.m4348a(zzagbVar, zzeuVar);
        }
    }
}
