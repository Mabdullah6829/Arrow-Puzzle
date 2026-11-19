package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class zzbel implements IInterface {

    /* JADX INFO: renamed from: s */
    public final IBinder f7687s;

    /* JADX INFO: renamed from: t */
    public final String f7688t;

    public zzbel(IBinder iBinder, String str) {
        this.f7687s = iBinder;
        this.f7688t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7687s;
    }

    /* JADX INFO: renamed from: k0 */
    public final Parcel m4809k0(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7687s.transact(i2, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: u */
    public final Parcel m4810u() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7688t);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m4811u0(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7687s.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m4812x0(int i2, Parcel parcel) {
        try {
            this.f7687s.transact(i2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
