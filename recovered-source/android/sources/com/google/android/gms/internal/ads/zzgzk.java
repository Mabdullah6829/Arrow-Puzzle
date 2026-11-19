package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzgzk extends zzgzn {

    /* JADX INFO: renamed from: g */
    public final char[] f18397g;

    public zzgzk(zzgzj zzgzjVar) {
        super(zzgzjVar, (Character) null);
        this.f18397g = new char[512];
        zzgtr.m7128a(zzgzjVar.f18389b.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            char[] cArr = this.f18397g;
            char[] cArr2 = zzgzjVar.f18389b;
            cArr[i2] = cArr2[i2 >>> 4];
            cArr[i2 | 256] = cArr2[i2 & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: a */
    public final void mo7274a(StringBuilder sb, byte[] bArr, int i2) {
        zzgtr.m7138k(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3] & 255;
            char[] cArr = this.f18397g;
            sb.append(cArr[i4]);
            sb.append(cArr[i4 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzn, com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: b */
    public final int mo7275b(byte[] bArr, CharSequence charSequence) throws zzgzm {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgzm(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length).length() + 21), "Invalid input length ", length));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i2);
            zzgzj zzgzjVar = this.f18398d;
            bArr[i3] = (byte) ((zzgzjVar.m7273a(cCharAt) << 4) | zzgzjVar.m7273a(charSequence.charAt(i2 + 1)));
            i2 += 2;
            i3++;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    /* JADX INFO: renamed from: i */
    public final zzgzo mo7276i(zzgzj zzgzjVar, Character ch) {
        return new zzgzk(zzgzjVar);
    }
}
