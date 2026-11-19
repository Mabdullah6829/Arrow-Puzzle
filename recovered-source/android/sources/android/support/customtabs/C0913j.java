package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.customtabs.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0913j implements InterfaceC0915l {

    /* JADX INFO: renamed from: s */
    public IBinder f2550s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2550s;
    }

    @Override // android.support.customtabs.InterfaceC0915l
    public final void onMessageChannelReady(InterfaceC0906c interfaceC0906c, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0915l.f2551e);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2550s.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0915l
    public final void onPostMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0915l.f2551e);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2550s.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
