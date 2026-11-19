package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahr implements zzaga {

    /* JADX INFO: renamed from: l */
    public static final int[] f5343l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: m */
    public static final int[] f5344m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: n */
    public static final byte[] f5345n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f5346o;

    /* JADX INFO: renamed from: a */
    public final byte[] f5347a;

    /* JADX INFO: renamed from: b */
    public boolean f5348b;

    /* JADX INFO: renamed from: c */
    public long f5349c;

    /* JADX INFO: renamed from: d */
    public int f5350d;

    /* JADX INFO: renamed from: e */
    public int f5351e;

    /* JADX INFO: renamed from: f */
    public int f5352f;

    /* JADX INFO: renamed from: g */
    public zzagd f5353g;

    /* JADX INFO: renamed from: h */
    public zzahm f5354h;

    /* JADX INFO: renamed from: i */
    public zzahm f5355i;

    /* JADX INFO: renamed from: j */
    public zzahc f5356j;

    /* JADX INFO: renamed from: k */
    public boolean f5357k;

    static {
        String str = zzfm.f16091a;
        Charset charset = StandardCharsets.UTF_8;
        f5345n = "#!AMR\n".getBytes(charset);
        f5346o = "#!AMR-WB\n".getBytes(charset);
    }

    public zzahr() {
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4134a(zzagb zzagbVar) {
        zzagbVar.zzl();
        byte[] bArr = f5345n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzagbVar.mo4078H(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f5348b = false;
            zzagbVar.mo4091o(bArr.length);
            return true;
        }
        zzagbVar.zzl();
        byte[] bArr3 = f5346o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        zzagbVar.mo4078H(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f5348b = true;
        zzagbVar.mo4091o(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: b */
    public final void mo4103b() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: g */
    public final void mo4104g(long j2, long j3) {
        this.f5349c = 0L;
        this.f5350d = 0;
        this.f5351e = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: h */
    public final boolean mo4105h(zzagb zzagbVar) {
        return m4134a(zzagbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: i */
    public final void mo4106i(zzagd zzagdVar) {
        this.f5353g = zzagdVar;
        zzahm zzahmVarMo4109f = zzagdVar.mo4109f(0, 1);
        this.f5354h = zzahmVarMo4109f;
        this.f5355i = zzahmVarMo4109f;
        zzagdVar.mo4110v();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /* JADX INFO: renamed from: j */
    public final int mo4107j(zzagb zzagbVar, zzaha zzahaVar) throws zzat {
        byte b;
        int iMo4122d;
        int i2;
        this.f5354h.getClass();
        String str = zzfm.f16091a;
        if (zzagbVar.mo4086g() == 0 && !m4134a(zzagbVar)) {
            throw zzat.m4383a(null, "Could not find AMR header.");
        }
        boolean z = this.f5357k;
        int[] iArr = f5343l;
        int[] iArr2 = f5344m;
        if (!z) {
            this.f5357k = true;
            boolean z2 = this.f5348b;
            String str2 = true != z2 ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z2 ? "audio/3gpp" : "audio/amr-wb";
            int i3 = true != z2 ? 8000 : 16000;
            int i4 = z2 ? iArr2[8] : iArr[7];
            zzahm zzahmVar = this.f5354h;
            zzt zztVar = new zzt();
            zztVar.m8852d(str2);
            zztVar.m8853e(str3);
            zztVar.f20803o = i4;
            zztVar.f20780F = 1;
            zztVar.f20782H = i3;
            zzahmVar.mo4097e(new zzv(zztVar));
        }
        int i5 = this.f5351e;
        if (i5 == 0) {
            try {
                zzagbVar.zzl();
                byte[] bArr = this.f5347a;
                zzagbVar.mo4078H(bArr, 0, 1);
                byte b2 = bArr[0];
                if ((b2 & 131) > 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf((int) b2).length() + 38);
                    sb.append("Invalid padding bits for frame header ");
                    sb.append((int) b2);
                    throw zzat.m4383a(null, sb.toString());
                }
                boolean z3 = this.f5348b;
                int i6 = (b2 >> 3) & 15;
                if (!z3) {
                    if (!z3) {
                        if (i6 >= 12 && i6 <= 14) {
                        }
                    }
                    String str4 = true != z3 ? "NB" : "WB";
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i6).length() + 26);
                    sb2.append("Illegal AMR ");
                    sb2.append(str4);
                    sb2.append(" frame type ");
                    sb2.append(i6);
                    throw zzat.m4383a(null, sb2.toString());
                }
                if (i6 >= 10 && i6 <= 13) {
                    if (!z3) {
                        if (i6 >= 12) {
                        }
                    }
                    if (true != z3) {
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i6).length() + 26);
                    sb3.append("Illegal AMR ");
                    sb3.append(str4);
                    sb3.append(" frame type ");
                    sb3.append(i6);
                    throw zzat.m4383a(null, sb3.toString());
                }
                i5 = z3 ? iArr2[i6] : iArr[i6];
                this.f5350d = i5;
                this.f5351e = i5;
                if (this.f5352f == -1) {
                    this.f5352f = i5;
                }
                iMo4122d = this.f5355i.mo4122d(zzagbVar, i5, true);
                if (iMo4122d == -1) {
                    b = -1;
                } else {
                    i2 = this.f5351e - iMo4122d;
                    this.f5351e = i2;
                    if (i2 <= 0) {
                        this.f5355i.mo4095b(this.f5349c, 1, this.f5350d, 0, null);
                        this.f5349c += 20000;
                    }
                    b = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo4122d = this.f5355i.mo4122d(zzagbVar, i5, true);
            if (iMo4122d == -1) {
                b = -1;
            } else {
                i2 = this.f5351e - iMo4122d;
                this.f5351e = i2;
                if (i2 <= 0) {
                    this.f5355i.mo4095b(this.f5349c, 1, this.f5350d, 0, null);
                    this.f5349c += 20000;
                }
                b = 0;
            }
        }
        if (this.f5356j == null) {
            zzahc zzahcVar = new zzahc(-9223372036854775807L, 0L);
            this.f5356j = zzahcVar;
            this.f5353g.mo4108d(zzahcVar);
        }
        return b == -1 ? -1 : 0;
    }

    public zzahr(int i2) {
        this.f5347a = new byte[1];
        this.f5352f = -1;
        this.f5355i = new zzafx();
    }
}
