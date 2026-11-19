package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzacq extends zzacp {

    /* JADX INFO: renamed from: u */
    public final byte[] f21971u;

    public zzacq(byte[] bArr) {
        bArr.getClass();
        this.f21971u = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: a */
    public final byte mo9372a(int i2) {
        return this.f21971u[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: b */
    public final int mo9373b() {
        return this.f21971u.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: d */
    public final zzacr mo9374d(int i2, int i3) {
        byte[] bArr = this.f21971u;
        int iM9381r = zzacr.m9381r(0, i3, bArr.length);
        return iM9381r == 0 ? zzacr.f21972t : new zzacm(bArr, 0, iM9381r);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: g */
    public final void mo9375g(int i2, byte[] bArr) {
        System.arraycopy(this.f21971u, 0, bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: h */
    public final void mo9376h(zzada zzadaVar) {
        byte[] bArr = this.f21971u;
        zzadaVar.mo9371a(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: j */
    public final boolean mo9377j(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        byte[] bArr = this.f21971u;
        if (z) {
            return Arrays.equals(bArr, ((zzacq) zzacrVar).f21971u);
        }
        boolean z2 = zzacrVar instanceof zzacm;
        if (!z2) {
            return zzacrVar.mo9377j(this);
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        int i2 = zzacmVar.f21970w;
        int length = bArr.length;
        if (length > i2) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length > i2) {
            int i3 = zzacmVar.f21970w;
            throw new IllegalArgumentException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i3).length()), "Ran off end of other: 0, ", length, ", ", i3));
        }
        if (z) {
            return zzacr.m9382s(bArr, 0, ((zzacq) zzacrVar).f21971u, 0, length);
        }
        if (!z2) {
            return zzacrVar.mo9374d(0, length).equals(mo9374d(0, length));
        }
        zzacm zzacmVar2 = (zzacm) zzacrVar;
        return zzacr.m9382s(bArr, 0, zzacmVar2.f21968u, zzacmVar2.f21969v, length);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: k */
    public final int mo9378k(int i2, int i3) {
        return zzaed.m9595a(i2, this.f21971u, 0, i3);
    }
}
