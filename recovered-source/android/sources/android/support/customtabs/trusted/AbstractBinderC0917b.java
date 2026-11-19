package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.customtabs.trusted.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0917b extends Binder implements InterfaceC0918c {
    static final int TRANSACTION_onExtraCallback = 2;

    public static InterfaceC0918c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0918c.f2553f);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0918c)) {
            return (InterfaceC0918c) iInterfaceQueryLocalInterface;
        }
        C0916a c0916a = new C0916a();
        c0916a.f2552s = iBinder;
        return c0916a;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0918c.f2553f;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i2 != 2) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        onExtraCallback(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        parcel2.writeNoException();
        return true;
    }
}
