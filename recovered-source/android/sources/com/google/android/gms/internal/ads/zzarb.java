package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarb implements zzarp {

    /* JADX INFO: renamed from: a */
    public final zzara f6719a;

    /* JADX INFO: renamed from: b */
    public final zzeu f6720b = new zzeu(32);

    /* JADX INFO: renamed from: c */
    public int f6721c;

    /* JADX INFO: renamed from: d */
    public int f6722d;

    /* JADX INFO: renamed from: e */
    public boolean f6723e;

    /* JADX INFO: renamed from: f */
    public boolean f6724f;

    public zzarb(zzara zzaraVar) {
        this.f6719a = zzaraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    /* JADX INFO: renamed from: a */
    public final void mo4329a(int i2, zzeu zzeuVar) {
        int iM6369K;
        int i3 = i2 & 1;
        if (i3 != 0) {
            iM6369K = zzeuVar.f14888b + zzeuVar.m6369K();
        } else {
            iM6369K = -1;
        }
        if (this.f6724f) {
            if (i3 == 0) {
                return;
            }
            this.f6724f = false;
            zzeuVar.m6363E(iM6369K);
            this.f6722d = 0;
        }
        while (zzeuVar.m6360B() > 0) {
            int i4 = this.f6722d;
            zzeu zzeuVar2 = this.f6720b;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iM6369K2 = zzeuVar.m6369K();
                    zzeuVar.m6363E(zzeuVar.f14888b - 1);
                    if (iM6369K2 == 255) {
                        this.f6724f = true;
                        return;
                    }
                }
                int iMin = Math.min(zzeuVar.m6360B(), 3 - this.f6722d);
                zzeuVar.m6366H(zzeuVar2.f14887a, this.f6722d, iMin);
                int i5 = this.f6722d + iMin;
                this.f6722d = i5;
                if (i5 == 3) {
                    zzeuVar2.m6363E(0);
                    zzeuVar2.m6361C(3);
                    zzeuVar2.m6365G(1);
                    int iM6369K3 = zzeuVar2.m6369K();
                    boolean z = (iM6369K3 & 128) != 0;
                    int iM6369K4 = zzeuVar2.m6369K();
                    this.f6723e = z;
                    int i6 = (((iM6369K3 & 15) << 8) | iM6369K4) + 3;
                    this.f6721c = i6;
                    byte[] bArr = zzeuVar2.f14887a;
                    if (bArr.length < i6) {
                        int length = bArr.length;
                        zzeuVar2.m6359A(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i6, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzeuVar.m6360B(), this.f6721c - this.f6722d);
                zzeuVar.m6366H(zzeuVar2.f14887a, this.f6722d, iMin2);
                int i7 = this.f6722d + iMin2;
                this.f6722d = i7;
                int i8 = this.f6721c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.f6723e) {
                        zzeuVar2.m6361C(i8);
                    } else {
                        if (zzfm.m6506h(0, zzeuVar2.f14887a, i8, -1) != 0) {
                            this.f6724f = true;
                            return;
                        }
                        zzeuVar2.m6361C(this.f6721c - 4);
                    }
                    zzeuVar2.m6363E(0);
                    this.f6719a.mo4328c(zzeuVar2);
                    this.f6722d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    /* JADX INFO: renamed from: b */
    public final void mo4330b(zzfj zzfjVar, zzagd zzagdVar, zzaro zzaroVar) {
        this.f6719a.mo4327b(zzfjVar, zzagdVar, zzaroVar);
        this.f6724f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarp
    public final void zzb() {
        this.f6724f = true;
    }
}
