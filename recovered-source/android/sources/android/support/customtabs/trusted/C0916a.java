package android.support.customtabs.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.customtabs.trusted.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0916a implements InterfaceC0918c {

    /* JADX INFO: renamed from: s */
    public IBinder f2552s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2552s;
    }

    @Override // android.support.customtabs.trusted.InterfaceC0918c
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0918c.f2553f);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2552s.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
