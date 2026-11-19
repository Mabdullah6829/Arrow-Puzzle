package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgue extends zzgsy {

    /* JADX INFO: renamed from: u */
    public final CharSequence f18192u;

    /* JADX INFO: renamed from: v */
    public final zzgtf f18193v;

    /* JADX INFO: renamed from: w */
    public final boolean f18194w;

    /* JADX INFO: renamed from: x */
    public int f18195x = 0;

    /* JADX INFO: renamed from: y */
    public int f18196y = Integer.MAX_VALUE;

    public zzgue(zzgug zzgugVar, CharSequence charSequence) {
        this.f18193v = zzgugVar.f18197a;
        this.f18194w = zzgugVar.f18198b;
        this.f18192u = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    /* JADX INFO: renamed from: a */
    public final String mo7118a() {
        int iMo7141c;
        zzgtf zzgtfVar;
        int i2 = this.f18195x;
        while (true) {
            int i3 = this.f18195x;
            if (i3 == -1) {
                this.f18167t = 3;
                return null;
            }
            int iMo7140b = mo7140b(i3);
            CharSequence charSequence = this.f18192u;
            if (iMo7140b == -1) {
                iMo7140b = charSequence.length();
                this.f18195x = -1;
                iMo7141c = -1;
            } else {
                iMo7141c = mo7141c(iMo7140b);
                this.f18195x = iMo7141c;
            }
            if (iMo7141c == i2) {
                int i4 = iMo7141c + 1;
                this.f18195x = i4;
                if (i4 > charSequence.length()) {
                    this.f18195x = -1;
                }
            } else {
                while (true) {
                    zzgtfVar = this.f18193v;
                    if (i2 >= iMo7140b || !zzgtfVar.mo7123a(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (iMo7140b > i2) {
                    int i5 = iMo7140b - 1;
                    if (!zzgtfVar.mo7123a(charSequence.charAt(i5))) {
                        break;
                    }
                    iMo7140b = i5;
                }
                if (!this.f18194w || i2 != iMo7140b) {
                    int i6 = this.f18196y;
                    if (i6 == 1) {
                        iMo7140b = charSequence.length();
                        this.f18195x = -1;
                        while (iMo7140b > i2) {
                            int i7 = iMo7140b - 1;
                            if (!zzgtfVar.mo7123a(charSequence.charAt(i7))) {
                                break;
                            }
                            iMo7140b = i7;
                        }
                    } else {
                        this.f18196y = i6 - 1;
                    }
                    return charSequence.subSequence(i2, iMo7140b).toString();
                }
                i2 = this.f18195x;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo7140b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract int mo7141c(int i2);
}
