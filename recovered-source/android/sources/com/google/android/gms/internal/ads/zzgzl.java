package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzgzl extends zzgzn {
    public zzgzl(zzgzj zzgzjVar, Character ch) {
        super(zzgzjVar, ch);
        zzgtr.m7128a(zzgzjVar.f18389b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: a */
    public final void mo7274a(StringBuilder sb, byte[] bArr, int i2) {
        int i3 = 0;
        zzgtr.m7138k(0, i2, bArr.length);
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3] & 255) << 16) | (bArr[i3 + 2] & 255);
            char[] cArr = this.f18398d.f18389b;
            sb.append(cArr[i5 >>> 18]);
            sb.append(cArr[(i5 >>> 12) & 63]);
            sb.append(cArr[(i5 >>> 6) & 63]);
            sb.append(cArr[i5 & 63]);
            i3 += 3;
        }
        if (i3 < i2) {
            m7281j(sb, bArr, i3, i2 - i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: b */
    public final int mo7275b(byte[] bArr, CharSequence charSequence) throws zzgzm {
        CharSequence charSequenceMo7279e = mo7279e(charSequence);
        int length = charSequenceMo7279e.length();
        zzgzj zzgzjVar = this.f18398d;
        if (!zzgzjVar.f18395h[length % zzgzjVar.f18392e]) {
            int length2 = charSequenceMo7279e.length();
            throw new zzgzm(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequenceMo7279e.length()) {
            int i4 = i3 + 1;
            int iM7273a = (zzgzjVar.m7273a(charSequenceMo7279e.charAt(i2 + 1)) << 12) | (zzgzjVar.m7273a(charSequenceMo7279e.charAt(i2)) << 18);
            bArr[i3] = (byte) (iM7273a >>> 16);
            int i5 = i2 + 2;
            if (i5 < charSequenceMo7279e.length()) {
                int i6 = i2 + 3;
                int iM7273a2 = iM7273a | (zzgzjVar.m7273a(charSequenceMo7279e.charAt(i5)) << 6);
                int i7 = i3 + 2;
                bArr[i4] = (byte) ((iM7273a2 >>> 8) & 255);
                if (i6 < charSequenceMo7279e.length()) {
                    i2 += 4;
                    i3 += 3;
                    bArr[i7] = (byte) ((iM7273a2 | zzgzjVar.m7273a(charSequenceMo7279e.charAt(i6))) & 255);
                } else {
                    i3 = i7;
                    i2 = i6;
                }
            } else {
                i2 = i5;
                i3 = i4;
            }
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    /* JADX INFO: renamed from: i */
    public final zzgzo mo7276i(zzgzj zzgzjVar, Character ch) {
        return new zzgzl(zzgzjVar, ch);
    }

    public zzgzl(String str, String str2) {
        this(new zzgzj(str, str2.toCharArray()), (Character) '=');
    }
}
