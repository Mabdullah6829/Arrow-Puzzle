package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaey {

    /* JADX INFO: renamed from: a */
    public static final int[] f5139a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f5140b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d5, code lost:
    
        if (r11 != 3) goto L64;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaex m4054a(com.google.android.gms.internal.ads.zzet r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaey.m4054a(com.google.android.gms.internal.ads.zzet, boolean):com.google.android.gms.internal.ads.zzaex");
    }

    /* JADX INFO: renamed from: b */
    public static int m4055b(zzet zzetVar) throws zzat {
        int iM6345h = zzetVar.m6345h(4);
        if (iM6345h == 15) {
            if (zzetVar.m6339b() >= 24) {
                return zzetVar.m6345h(24);
            }
            throw zzat.m4383a(null, "AAC header insufficient data");
        }
        if (iM6345h < 13) {
            return f5139a[iM6345h];
        }
        throw zzat.m4383a(null, "AAC header wrong Sampling Frequency Index");
    }
}
