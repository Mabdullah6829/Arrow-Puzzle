package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class zza implements IInterface {

    /* JADX INFO: renamed from: s */
    public final IBinder f21567s;

    /* JADX INFO: renamed from: t */
    public final String f21568t;

    public zza(IBinder iBinder, String str) {
        this.f21567s = iBinder;
        this.f21568t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21567s;
    }

    /* JADX INFO: renamed from: k0 */
    public final Parcel m9084k0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21568t);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: u */
    public final Parcel m9085u(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21567s.transact(i2, parcel, parcelObtain, 0);
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
