package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f20673a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b */
    public boolean f20674b;

    /* JADX INFO: renamed from: a */
    public final void m8845a(int i2) {
        zzgtr.m7133f(!this.f20674b);
        this.f20673a.append(i2, true);
    }

    /* JADX INFO: renamed from: b */
    public final zzs m8846b() {
        zzgtr.m7133f(!this.f20674b);
        this.f20674b = true;
        return new zzs(this.f20673a);
    }
}
