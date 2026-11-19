package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: android.support.customtabs.trusted.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0920e extends Binder implements InterfaceC0921f {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    public static InterfaceC0921f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0921f.f2555g);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0921f)) {
            return (InterfaceC0921f) iInterfaceQueryLocalInterface;
        }
        C0919d c0919d = new C0919d();
        c0919d.f2554s = iBinder;
        return c0919d;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0921f.f2555g;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i2) {
            case 2:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) AbstractC0846b.m1742a(parcel));
                parcel2.writeNoException();
                AbstractC0846b.m1743b(1, bundleNotifyNotificationWithChannel, parcel2);
                return true;
            case 3:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                cancelNotification((Bundle) AbstractC0846b.m1742a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                AbstractC0846b.m1743b(1, activeNotifications, parcel2);
                return true;
            case 6:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) AbstractC0846b.m1742a(parcel));
                parcel2.writeNoException();
                AbstractC0846b.m1743b(1, bundleAreNotificationsEnabled, parcel2);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                AbstractC0846b.m1743b(1, smallIconBitmap, parcel2);
                return true;
            case 8:
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
            case 9:
                String string = parcel.readString();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundleExtraCommand = extraCommand(string, (Bundle) AbstractC0846b.m1742a(parcel), parcel.readStrongBinder());
                parcel2.writeNoException();
                AbstractC0846b.m1743b(1, bundleExtraCommand, parcel2);
                return true;
        }
    }
}
