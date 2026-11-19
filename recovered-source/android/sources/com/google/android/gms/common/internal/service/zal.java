package com.google.android.gms.common.internal.service;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class zal extends com.google.android.gms.internal.base.zab implements zam {
    public zal() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* JADX INFO: renamed from: u */
    public final boolean mo3465u(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        com.google.android.gms.internal.base.zac.m9080d(parcel);
        mo3591R1(i3);
        return true;
    }
}
