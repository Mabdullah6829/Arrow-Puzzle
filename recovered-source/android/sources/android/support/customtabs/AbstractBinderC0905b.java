package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p011H.AbstractC0243G;

/* JADX INFO: renamed from: android.support.customtabs.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0905b extends Binder implements InterfaceC0906c {
    static final int TRANSACTION_extraCallback = 3;
    static final int TRANSACTION_extraCallbackWithResult = 7;
    static final int TRANSACTION_onActivityLayout = 10;
    static final int TRANSACTION_onActivityResized = 8;
    static final int TRANSACTION_onMessageChannelReady = 4;
    static final int TRANSACTION_onMinimized = 11;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onPostMessage = 5;
    static final int TRANSACTION_onRelationshipValidationResult = 6;
    static final int TRANSACTION_onUnminimized = 12;
    static final int TRANSACTION_onWarmupCompleted = 9;

    public AbstractBinderC0905b() {
        attachInterface(this, InterfaceC0906c.f2545b);
    }

    public static InterfaceC0906c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0906c.f2545b);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0906c)) {
            return (InterfaceC0906c) iInterfaceQueryLocalInterface;
        }
        C0904a c0904a = new C0904a();
        c0904a.f2544s = iBinder;
        return c0904a;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0906c.f2545b;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i2) {
            case 2:
                onNavigationEvent(parcel.readInt(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                extraCallback(parcel.readString(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                onMessageChannelReady((Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                onPostMessage(parcel.readString(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                onRelationshipValidationResult(parcel.readInt(), (Uri) AbstractC0243G.m363a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC0243G.m364b(parcel2, bundleExtraCallbackWithResult, 1);
                return true;
            case 8:
                onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onWarmupCompleted((Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                onMinimized((Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            case 12:
                onUnminimized((Bundle) AbstractC0243G.m363a(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }
}
