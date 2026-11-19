package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzxb implements zzhr {

    /* JADX INFO: renamed from: a */
    public final zzhr f21249a;

    /* JADX INFO: renamed from: b */
    public final int f21250b;

    /* JADX INFO: renamed from: c */
    public final zzxa f21251c;

    /* JADX INFO: renamed from: d */
    public final byte[] f21252d;

    /* JADX INFO: renamed from: e */
    public int f21253e;

    public zzxb(zzhr zzhrVar, int i2, zzxa zzxaVar) {
        zzgtr.m7128a(i2 > 0);
        this.f21249a = zzhrVar;
        this.f21250b = i2;
        this.f21251c = zzxaVar;
        this.f21252d = new byte[1];
        this.f21253e = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
        zzipVar.getClass();
        this.f21249a.mo5493a(zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    /* JADX INFO: renamed from: b */
    public final int mo4082b(byte[] bArr, int i2, int i3) {
        int i4 = this.f21253e;
        zzhr zzhrVar = this.f21249a;
        if (i4 == 0) {
            byte[] bArr2 = this.f21252d;
            int i5 = 0;
            if (zzhrVar.mo4082b(bArr2, 0, 1) != -1) {
                int i6 = (bArr2[0] & 255) << 4;
                if (i6 != 0) {
                    byte[] bArr3 = new byte[i6];
                    int i7 = i6;
                    while (i7 > 0) {
                        int iMo4082b = zzhrVar.mo4082b(bArr3, i5, i7);
                        if (iMo4082b != -1) {
                            i5 += iMo4082b;
                            i7 -= iMo4082b;
                        }
                    }
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (bArr3[i8] != 0) {
                            break;
                        }
                        i6 = i8;
                    }
                    if (i6 > 0) {
                        zzeu zzeuVar = new zzeu(bArr3, i6);
                        zzyi zzyiVar = (zzyi) this.f21251c;
                        long jMax = !zzyiVar.f21346l ? zzyiVar.f21343i : Math.max(zzyiVar.f21347m.m9045y(true), zzyiVar.f21343i);
                        int iM6360B = zzeuVar.m6360B();
                        zzahm zzahmVar = zzyiVar.f21345k;
                        zzahmVar.getClass();
                        zzahmVar.mo4121a(iM6360B, zzeuVar);
                        zzahmVar.mo4095b(jMax, 1, iM6360B, 0, null);
                        zzyiVar.f21346l = true;
                    }
                }
                i4 = this.f21250b;
                this.f21253e = i4;
            }
            return -1;
        }
        int iMo4082b2 = zzhrVar.mo4082b(bArr, i2, Math.min(i4, i3));
        if (iMo4082b2 != -1) {
            this.f21253e -= iMo4082b2;
        }
        return iMo4082b2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: c */
    public final long mo5494c(zzhv zzhvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: d */
    public final void mo5495d() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.f21249a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzik
    public final Map zzj() {
        return this.f21249a.zzj();
    }
}
