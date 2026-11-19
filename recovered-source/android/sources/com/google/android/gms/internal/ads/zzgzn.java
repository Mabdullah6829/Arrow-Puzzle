package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class zzgzn extends zzgzo {

    /* JADX INFO: renamed from: d */
    public final zzgzj f18398d;

    /* JADX INFO: renamed from: e */
    public final Character f18399e;

    /* JADX INFO: renamed from: f */
    public volatile zzgzo f18400f;

    public zzgzn(zzgzj zzgzjVar, Character ch) {
        this.f18398d = zzgzjVar;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = zzgzjVar.f18394g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        zzgtr.m7132e("Padding character %s was already in alphabet", z, ch);
        this.f18399e = ch;
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: a */
    public void mo7274a(StringBuilder sb, byte[] bArr, int i2) {
        int i3 = 0;
        zzgtr.m7138k(0, i2, bArr.length);
        while (i3 < i2) {
            int i4 = this.f18398d.f18393f;
            m7281j(sb, bArr, i3, Math.min(i4, i2 - i3));
            i3 += i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: b */
    public int mo7275b(byte[] bArr, CharSequence charSequence) throws zzgzm {
        int i2;
        CharSequence charSequenceMo7279e = mo7279e(charSequence);
        int length = charSequenceMo7279e.length();
        zzgzj zzgzjVar = this.f18398d;
        boolean z = zzgzjVar.f18395h[length % zzgzjVar.f18392e];
        int i3 = zzgzjVar.f18391d;
        if (!z) {
            int length2 = charSequenceMo7279e.length();
            throw new zzgzm(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(length2).length() + 21), "Invalid input length ", length2));
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequenceMo7279e.length()) {
            long jM7273a = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i2 = zzgzjVar.f18392e;
                if (i6 >= i2) {
                    break;
                }
                jM7273a <<= i3;
                if (i4 + i6 < charSequenceMo7279e.length()) {
                    jM7273a |= (long) zzgzjVar.m7273a(charSequenceMo7279e.charAt(i7 + i4));
                    i7++;
                }
                i6++;
            }
            int i8 = zzgzjVar.f18393f;
            int i9 = i7 * i3;
            int i10 = (i8 - 1) * 8;
            while (i10 >= (i8 * 8) - i9) {
                bArr[i5] = (byte) ((jM7273a >>> i10) & 255);
                i10 -= 8;
                i5++;
            }
            i4 += i2;
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: c */
    public final int mo7277c(int i2) {
        zzgzj zzgzjVar = this.f18398d;
        int i3 = zzgzjVar.f18393f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        return zzgzjVar.f18392e * zzhag.m7295a(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: d */
    public final int mo7278d(int i2) {
        return (int) (((((long) this.f18398d.f18391d) * ((long) i2)) + 7) / 8);
    }

    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: e */
    public final CharSequence mo7279e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.f18399e == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgzn) {
            zzgzn zzgznVar = (zzgzn) obj;
            if (this.f18398d.equals(zzgznVar.f18398d) && Objects.equals(this.f18399e, zzgznVar.f18399e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    @Override // com.google.android.gms.internal.ads.zzgzo
    /* JADX INFO: renamed from: f */
    public final zzgzo mo7280f() {
        zzgzj zzgzjVar;
        boolean z;
        zzgzo zzgzoVarMo7276i = this.f18400f;
        if (zzgzoVarMo7276i == null) {
            zzgzj zzgzjVar2 = this.f18398d;
            int i2 = 0;
            while (true) {
                char[] cArr = zzgzjVar2.f18389b;
                int length = cArr.length;
                if (i2 >= length) {
                    zzgzjVar = zzgzjVar2;
                    break;
                }
                if (zzgsz.m7121c(cArr[i2])) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i3];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    zzgtr.m7134g("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c2 = cArr[i4];
                        if (zzgsz.m7121c(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i4] = (char) c2;
                    }
                    zzgzjVar = new zzgzj(zzgzjVar2.f18388a.concat(".lowerCase()"), cArr2);
                    if (!zzgzjVar2.f18396i || zzgzjVar.f18396i) {
                        break;
                        break;
                    }
                    byte[] bArr = zzgzjVar.f18394g;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                    for (int i5 = 65; i5 <= 90; i5++) {
                        int i6 = i5 | 32;
                        byte b = bArr[i5];
                        byte b2 = bArr[i6];
                        if (b == -1) {
                            bArrCopyOf[i5] = b2;
                        } else {
                            char c3 = (char) i5;
                            char c4 = (char) i6;
                            if (b2 != -1) {
                                throw new IllegalStateException(zzgui.m7149b("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                            }
                            bArrCopyOf[i6] = b;
                        }
                    }
                    zzgzjVar = new zzgzj(zzgzjVar.f18388a.concat(".ignoreCase()"), zzgzjVar.f18389b, bArrCopyOf, true);
                    break;
                }
                i2++;
            }
            zzgzoVarMo7276i = zzgzjVar == zzgzjVar2 ? this : mo7276i(zzgzjVar, this.f18399e);
            this.f18400f = zzgzoVarMo7276i;
        }
        return zzgzoVarMo7276i;
    }

    public final int hashCode() {
        return this.f18398d.hashCode() ^ Objects.hashCode(this.f18399e);
    }

    /* JADX INFO: renamed from: i */
    public zzgzo mo7276i(zzgzj zzgzjVar, Character ch) {
        return new zzgzn(zzgzjVar, ch);
    }

    /* JADX INFO: renamed from: j */
    public final void m7281j(StringBuilder sb, byte[] bArr, int i2, int i3) {
        zzgtr.m7138k(i2, i2 + i3, bArr.length);
        zzgzj zzgzjVar = this.f18398d;
        int i4 = zzgzjVar.f18393f;
        int i5 = 0;
        zzgtr.m7128a(i3 <= i4);
        long j2 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j2 = (j2 | ((long) (bArr[i2 + i6] & 255))) << 8;
        }
        int i7 = (i3 + 1) * 8;
        int i8 = zzgzjVar.f18391d;
        while (i5 < i3 * 8) {
            sb.append(zzgzjVar.f18389b[zzgzjVar.f18390c & ((int) (j2 >>> ((i7 - i8) - i5)))]);
            i5 += i8;
        }
        if (this.f18399e != null) {
            while (i5 < i4 * 8) {
                sb.append('=');
                i5 += i8;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgzj zzgzjVar = this.f18398d;
        sb.append(zzgzjVar);
        if (8 % zzgzjVar.f18391d != 0) {
            Character ch = this.f18399e;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zzgzn(String str, String str2) {
        this(new zzgzj(str, str2.toCharArray()), (Character) '=');
    }
}
