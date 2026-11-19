package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzant implements zzagd {

    /* JADX INFO: renamed from: s */
    public final zzagd f6139s;

    /* JADX INFO: renamed from: t */
    public final zzanq f6140t;

    /* JADX INFO: renamed from: u */
    public final SparseArray f6141u = new SparseArray();

    /* JADX INFO: renamed from: v */
    public boolean f6142v;

    public zzant(zzagd zzagdVar, zzanq zzanqVar) {
        this.f6139s = zzagdVar;
        this.f6140t = zzanqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: d */
    public final void mo4108d(zzahd zzahdVar) {
        this.f6139s.mo4108d(zzahdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: f */
    public final zzahm mo4109f(int i2, int i3) {
        if (i3 != 3 && i3 != 5) {
            this.f6142v = true;
        }
        zzagd zzagdVar = this.f6139s;
        if (i3 != 3) {
            return zzagdVar.mo4109f(i2, i3);
        }
        SparseArray sparseArray = this.f6141u;
        zzanv zzanvVar = (zzanv) sparseArray.get(i2);
        if (zzanvVar != null) {
            return zzanvVar;
        }
        zzanv zzanvVar2 = new zzanv(zzagdVar.mo4109f(i2, 3), this.f6140t);
        sparseArray.put(i2, zzanvVar2);
        return zzanvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    /* JADX INFO: renamed from: v */
    public final void mo4110v() {
        this.f6139s.mo4110v();
        if (!this.f6142v) {
            return;
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f6141u;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((zzanv) sparseArray.valueAt(i2)).f6154i = true;
            i2++;
        }
    }
}
