package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaox implements zzans {

    /* JADX INFO: renamed from: a */
    public final zzeu f6332a = new zzeu();

    /* JADX INFO: renamed from: b */
    public final boolean f6333b;

    /* JADX INFO: renamed from: c */
    public final int f6334c;

    /* JADX INFO: renamed from: d */
    public final int f6335d;

    /* JADX INFO: renamed from: e */
    public final String f6336e;

    /* JADX INFO: renamed from: f */
    public final float f6337f;

    /* JADX INFO: renamed from: g */
    public final int f6338g;

    public zzaox(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f6334c = 0;
            this.f6335d = -1;
            this.f6336e = "sans-serif";
            this.f6333b = false;
            this.f6337f = 0.85f;
            this.f6338g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f6334c = bArr[24];
        this.f6335d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        String str = zzfm.f16091a;
        this.f6336e = true == "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f6338g = i2;
        boolean z = (bArr[0] & 32) != 0;
        this.f6333b = z;
        if (z) {
            this.f6337f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i2, 0.95f));
        } else {
            this.f6337f = 0.85f;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4282b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            int i8 = i2 & 1;
            int i9 = i2 & 2;
            boolean z = true;
            if (i8 != 0) {
                if (i9 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                    z = false;
                }
            } else if (i9 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            } else {
                z = false;
            }
            if ((i2 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            } else {
                if (i8 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4283c(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzans
    /* JADX INFO: renamed from: a */
    public final void mo4246a(byte[] bArr, int i2, int i3, zzdu zzduVar) {
        String strM6385k;
        int i4;
        int i5;
        int i6;
        SpannableStringBuilder spannableStringBuilder;
        zzeu zzeuVar = this.f6332a;
        zzeuVar.m6397z(i2 + i3, bArr);
        zzeuVar.m6363E(i2);
        int i7 = 1;
        int i8 = 0;
        int i9 = 2;
        zzgtr.m7128a(zzeuVar.m6360B() >= 2);
        int iM6370L = zzeuVar.m6370L();
        if (iM6370L == 0) {
            strM6385k = "";
        } else {
            int i10 = zzeuVar.f14888b;
            Charset charsetM6391q = zzeuVar.m6391q();
            int i11 = zzeuVar.f14888b - i10;
            if (charsetM6391q == null) {
                charsetM6391q = StandardCharsets.UTF_8;
            }
            strM6385k = zzeuVar.m6385k(iM6370L - i11, charsetM6391q);
        }
        if (strM6385k.isEmpty()) {
            zzgzi zzgziVar = zzgwt.f18303t;
            ((zzanu) zzduVar).mo3942b(new zzank(zzgyo.f18355w, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strM6385k);
        int length = spannableStringBuilder2.length();
        int i12 = this.f6334c;
        m4282b(spannableStringBuilder2, i12, 0, 0, length, 16711680);
        int i13 = i12;
        int length2 = spannableStringBuilder2.length();
        int i14 = this.f6335d;
        m4283c(spannableStringBuilder2, i14, -1, 0, length2, 16711680);
        int i15 = i14;
        int length3 = spannableStringBuilder2.length();
        String str = this.f6336e;
        if (str != "sans-serif") {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float fMax = this.f6337f;
        while (zzeuVar.m6360B() >= 8) {
            int i16 = zzeuVar.f14888b;
            int iM6376b = zzeuVar.m6376b();
            int iM6376b2 = zzeuVar.m6376b();
            if (iM6376b2 == 1937013100) {
                zzgtr.m7128a(zzeuVar.m6360B() >= i9 ? i7 : i8);
                int iM6370L2 = zzeuVar.m6370L();
                int i17 = i8;
                while (i17 < iM6370L2) {
                    zzgtr.m7128a(zzeuVar.m6360B() >= 12 ? i7 : i8);
                    int iM6370L3 = zzeuVar.m6370L();
                    int iM6370L4 = zzeuVar.m6370L();
                    zzeuVar.m6365G(i9);
                    int i18 = iM6370L2;
                    int iM6369K = zzeuVar.m6369K();
                    zzeuVar.m6365G(i7);
                    int iM6376b3 = zzeuVar.m6376b();
                    if (iM6370L4 > spannableStringBuilder2.length()) {
                        int length4 = spannableStringBuilder2.length();
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(String.valueOf(iM6370L4).length() + 44, 2, String.valueOf(length4)));
                        sb.append("Truncating styl end (");
                        sb.append(iM6370L4);
                        sb.append(") to cueText.length() (");
                        sb.append(length4);
                        sb.append(").");
                        zzeh.m6211c("Tx3gParser", sb.toString());
                        iM6370L4 = spannableStringBuilder.length();
                    } else {
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iM6370L3 >= iM6370L4) {
                        StringBuilder sb2 = new StringBuilder(AbstractC1456a.m2438e(String.valueOf(iM6370L3).length() + 36, 2, String.valueOf(iM6370L4)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iM6370L3);
                        sb2.append(") >= end (");
                        sb2.append(iM6370L4);
                        sb2.append(").");
                        zzeh.m6211c("Tx3gParser", sb2.toString());
                        spannableStringBuilder2 = spannableStringBuilder;
                    } else {
                        spannableStringBuilder2 = spannableStringBuilder;
                        m4282b(spannableStringBuilder2, iM6369K, i13, iM6370L3, iM6370L4, 0);
                        m4283c(spannableStringBuilder2, iM6376b3, i15, iM6370L3, iM6370L4, 0);
                    }
                    i17++;
                    iM6370L2 = i18;
                    i13 = i13;
                    i15 = i15;
                    i7 = 1;
                    i8 = 0;
                    i9 = 2;
                }
                i4 = i13;
                i5 = i15;
                i6 = i9;
            } else {
                i4 = i13;
                i5 = i15;
                if (iM6376b2 == 1952608120 && this.f6333b) {
                    i6 = 2;
                    zzgtr.m7128a(zzeuVar.m6360B() >= 2);
                    float fM6370L = zzeuVar.m6370L();
                    String str2 = zzfm.f16091a;
                    fMax = Math.max(0.0f, Math.min(fM6370L / this.f6338g, 0.95f));
                } else {
                    i6 = 2;
                }
            }
            zzeuVar.m6363E(i16 + iM6376b);
            i9 = i6;
            i13 = i4;
            i15 = i5;
            i7 = 1;
            i8 = 0;
        }
        zzcx zzcxVar = new zzcx();
        zzcxVar.m5859a(spannableStringBuilder2);
        zzcxVar.f11653e = fMax;
        zzcxVar.f11654f = 0;
        zzcxVar.f11655g = 0;
        ((zzanu) zzduVar).mo3942b(new zzank(zzgwt.m7216n(zzcxVar.m5860b()), -9223372036854775807L, -9223372036854775807L));
    }
}
