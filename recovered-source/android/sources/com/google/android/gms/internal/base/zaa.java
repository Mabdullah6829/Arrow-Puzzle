package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class zaa implements IInterface {

    /* JADX INFO: renamed from: s */
    public final IBinder f21545s;

    /* JADX INFO: renamed from: t */
    public final String f21546t;

    public zaa(IBinder iBinder, String str) {
        this.f21545s = iBinder;
        this.f21546t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21545s;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m9075k0(Parcel parcel) {
        try {
            this.f21545s.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: u */
    public final Parcel m9076u() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21546t);
        return parcelObtain;
    }
}
