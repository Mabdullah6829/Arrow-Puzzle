package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: s */
    public final IBinder f21525s;

    public zza(IBinder iBinder) {
        this.f21525s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21525s;
    }

    /* JADX INFO: renamed from: u */
    public final Parcel m9069u(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21525s.transact(i2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
