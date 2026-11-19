package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.v4.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0922a implements InterfaceC0924c {

    /* JADX INFO: renamed from: s */
    public IBinder f2556s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2556s;
    }

    @Override // android.support.v4.app.InterfaceC0924c
    public final void cancel(String str, int i2, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0924c.f2557h);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str2);
            this.f2556s.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.InterfaceC0924c
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0924c.f2557h);
            parcelObtain.writeString(str);
            this.f2556s.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.app.InterfaceC0924c
    public final void notify(String str, int i2, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0924c.f2557h);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i2);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2556s.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
