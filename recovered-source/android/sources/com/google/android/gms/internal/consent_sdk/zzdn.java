package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzdn extends zzdc {

    /* JADX INFO: renamed from: u */
    public final String f21627u;

    /* JADX INFO: renamed from: v */
    public int f21628v = 0;

    /* JADX INFO: renamed from: w */
    public int f21629w = Integer.MAX_VALUE;

    public zzdn(String str) {
        this.f21627u = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdc
    /* JADX INFO: renamed from: a */
    public final String mo9122a() {
        int iMo9127b;
        int i2 = this.f21628v;
        while (true) {
            int i3 = this.f21628v;
            if (i3 == -1) {
                this.f21625t = 3;
                return null;
            }
            int iMo9128c = mo9128c(i3);
            String str = this.f21627u;
            if (iMo9128c == -1) {
                iMo9128c = str.length();
                this.f21628v = -1;
                iMo9127b = -1;
            } else {
                iMo9127b = mo9127b(iMo9128c);
                this.f21628v = iMo9127b;
            }
            if (iMo9127b != i2) {
                if (i2 < iMo9128c) {
                    str.charAt(i2);
                }
                if (i2 < iMo9128c) {
                    str.charAt(iMo9128c - 1);
                }
                int i4 = this.f21629w;
                if (i4 == 1) {
                    iMo9128c = str.length();
                    this.f21628v = -1;
                    if (iMo9128c > i2) {
                        str.charAt(iMo9128c - 1);
                    }
                } else {
                    this.f21629w = i4 - 1;
                }
                return str.subSequence(i2, iMo9128c).toString();
            }
            int i5 = iMo9127b + 1;
            this.f21628v = i5;
            if (i5 > str.length()) {
                this.f21628v = -1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo9127b(int i2);

    /* JADX INFO: renamed from: c */
    public abstract int mo9128c(int i2);
}
