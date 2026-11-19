package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
final class zzaa implements IGmsServiceBroker {

    /* JADX INFO: renamed from: s */
    public final IBinder f4510s;

    public zzaa(IBinder iBinder) {
        this.f4510s = iBinder;
    }

    @Override // com.google.android.gms.common.internal.IGmsServiceBroker
    /* JADX INFO: renamed from: T0 */
    public final void mo3534T0(zzd zzdVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(zzdVar);
            parcelObtain.writeInt(1);
            zzm.m3612a(getServiceRequest, parcelObtain, 0);
            this.f4510s.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4510s;
    }
}
