package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
final class zzzj {

    /* JADX INFO: renamed from: a */
    public int f21480a;

    /* JADX INFO: renamed from: b */
    public final SparseArray f21481b;

    /* JADX INFO: renamed from: c */
    public final zzdu f21482c;

    public zzzj() {
        this(new zzdu() { // from class: com.google.android.gms.internal.ads.zzzi
            @Override // com.google.android.gms.internal.ads.zzdu
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void mo3942b(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final Object m9065a(int i2) {
        SparseArray sparseArray;
        if (this.f21480a == -1) {
            this.f21480a = 0;
        }
        while (true) {
            int i3 = this.f21480a;
            sparseArray = this.f21481b;
            if (i3 <= 0 || i2 >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f21480a--;
        }
        while (this.f21480a < sparseArray.size() - 1 && i2 >= sparseArray.keyAt(this.f21480a + 1)) {
            this.f21480a++;
        }
        return sparseArray.valueAt(this.f21480a);
    }

    public zzzj(zzdu zzduVar) {
        this.f21481b = new SparseArray();
        this.f21482c = zzduVar;
        this.f21480a = -1;
    }
}
