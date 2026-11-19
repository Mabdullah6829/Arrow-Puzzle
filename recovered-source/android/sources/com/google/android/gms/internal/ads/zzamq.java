package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamq {

    /* JADX INFO: renamed from: a */
    public final boolean f6010a;

    /* JADX INFO: renamed from: b */
    public final String f6011b;

    /* JADX INFO: renamed from: c */
    public final zzahl f6012c;

    /* JADX INFO: renamed from: d */
    public final int f6013d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6014e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzamq(boolean z, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        byte b = 0;
        int i5 = 1;
        zzgtr.m7128a((i2 == 0) ^ (bArr2 == null));
        this.f6010a = z;
        this.f6011b = str;
        this.f6013d = i2;
        this.f6014e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b = -1;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0 && b != 1) {
                if (b == 2 || b == 3) {
                    i5 = 2;
                } else {
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzeh.m6211c("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.f6012c = new zzahl(i5, bArr, i3, i4);
    }
}
