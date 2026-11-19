package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
final class zzana {

    /* JADX INFO: renamed from: a */
    public final zzanb f6095a = new zzanb();

    /* JADX INFO: renamed from: b */
    public final zzeu f6096b = new zzeu(new byte[65025], 0);

    /* JADX INFO: renamed from: c */
    public int f6097c = -1;

    /* JADX INFO: renamed from: d */
    public int f6098d;

    /* JADX INFO: renamed from: e */
    public boolean f6099e;

    /* JADX INFO: renamed from: a */
    public final boolean m4234a(zzagb zzagbVar) {
        int i2;
        boolean z = this.f6099e;
        zzeu zzeuVar = this.f6096b;
        if (z) {
            this.f6099e = false;
            zzeuVar.m6396y(0);
        }
        while (true) {
            if (this.f6099e) {
                return true;
            }
            int i3 = this.f6097c;
            zzanb zzanbVar = this.f6095a;
            if (i3 < 0) {
                if (zzanbVar.m4236a(zzagbVar, -1L) && zzanbVar.m4237b(zzagbVar, true)) {
                    int iM4235b = zzanbVar.f6103d;
                    if ((zzanbVar.f6100a & 1) == 1 && zzeuVar.f14889c == 0) {
                        iM4235b += m4235b(0);
                        i2 = this.f6098d;
                    } else {
                        i2 = 0;
                    }
                    try {
                        zzagbVar.mo4091o(iM4235b);
                        this.f6097c = i2;
                        i3 = i2;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM4235b2 = m4235b(i3);
            int i4 = this.f6097c + this.f6098d;
            if (iM4235b2 > 0) {
                zzeuVar.m6359A(zzeuVar.f14889c + iM4235b2);
                try {
                    zzagbVar.mo4076F(zzeuVar.f14887a, zzeuVar.f14889c, iM4235b2);
                    zzeuVar.m6361C(zzeuVar.f14889c + iM4235b2);
                    this.f6099e = zzanbVar.f6105f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == zzanbVar.f6102c) {
                i4 = -1;
            }
            this.f6097c = i4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4235b(int i2) {
        int i3;
        int i4 = 0;
        this.f6098d = 0;
        do {
            int i5 = this.f6098d;
            int i6 = i2 + i5;
            zzanb zzanbVar = this.f6095a;
            if (i6 >= zzanbVar.f6102c) {
                break;
            }
            this.f6098d = i5 + 1;
            i3 = zzanbVar.f6105f[i6];
            i4 += i3;
        } while (i3 == 255);
        return i4;
    }
}
