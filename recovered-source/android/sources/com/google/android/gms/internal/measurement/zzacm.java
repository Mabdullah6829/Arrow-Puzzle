package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzacm extends zzacp {

    /* JADX INFO: renamed from: u */
    public final byte[] f21968u;

    /* JADX INFO: renamed from: v */
    public final int f21969v;

    /* JADX INFO: renamed from: w */
    public final int f21970w;

    public zzacm(byte[] bArr, int i2, int i3) {
        zzacr.m9381r(i2, i2 + i3, bArr.length);
        this.f21968u = bArr;
        this.f21969v = i2;
        this.f21970w = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: a */
    public final byte mo9372a(int i2) {
        return this.f21968u[this.f21969v + i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: b */
    public final int mo9373b() {
        return this.f21970w;
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: d */
    public final zzacr mo9374d(int i2, int i3) {
        int iM9381r = zzacr.m9381r(i2, i3, this.f21970w);
        if (iM9381r == 0) {
            return zzacr.f21972t;
        }
        return new zzacm(this.f21968u, this.f21969v + i2, iM9381r);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: g */
    public final void mo9375g(int i2, byte[] bArr) {
        System.arraycopy(this.f21968u, this.f21969v, bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: h */
    public final void mo9376h(zzada zzadaVar) {
        zzadaVar.mo9371a(this.f21968u, this.f21969v, this.f21970w);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: j */
    public final boolean mo9377j(zzacr zzacrVar) {
        boolean z = zzacrVar instanceof zzacq;
        if (!z && !(zzacrVar instanceof zzacm)) {
            return zzacrVar.mo9377j(this);
        }
        int iMo9373b = zzacrVar.mo9373b();
        int i2 = this.f21970w;
        if (i2 > iMo9373b) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 > zzacrVar.mo9373b()) {
            int iMo9373b2 = zzacrVar.mo9373b();
            throw new IllegalArgumentException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(i2).length() + 27 + String.valueOf(iMo9373b2).length()), "Ran off end of other: 0, ", i2, ", ", iMo9373b2));
        }
        byte[] bArr = this.f21968u;
        int i3 = this.f21969v;
        if (z) {
            return zzacr.m9382s(bArr, i3, ((zzacq) zzacrVar).f21971u, 0, i2);
        }
        if (!(zzacrVar instanceof zzacm)) {
            return zzacrVar.mo9374d(0, i2).equals(mo9374d(i3, i2 + i3));
        }
        zzacm zzacmVar = (zzacm) zzacrVar;
        return zzacr.m9382s(bArr, i3, zzacmVar.f21968u, zzacmVar.f21969v, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzacr
    /* JADX INFO: renamed from: k */
    public final int mo9378k(int i2, int i3) {
        return zzaed.m9595a(i2, this.f21968u, this.f21969v, i3);
    }
}
