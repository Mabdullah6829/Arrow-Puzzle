package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.customtabs.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0911h extends Binder implements InterfaceC0912i {
    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
    static final int TRANSACTION_onSessionEnded = 4;
    static final int TRANSACTION_onVerticalScrollEvent = 2;

    public AbstractBinderC0911h() {
        attachInterface(this, InterfaceC0912i.f2549d);
    }

    public static InterfaceC0912i asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0912i.f2549d);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0912i)) {
            return (InterfaceC0912i) iInterfaceQueryLocalInterface;
        }
        C0910g c0910g = new C0910g();
        c0910g.f2548s = iBinder;
        return c0910g;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0912i.f2549d;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i2 == 2) {
            onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i2 == 3) {
            onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        if (i2 != 4) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        onSessionEnded(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
