package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: android.support.customtabs.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0908e extends Binder implements InterfaceC0909f {
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_setEngagementSignalsCallback = 14;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;

    public AbstractBinderC0908e() {
        attachInterface(this, InterfaceC0909f.f2547c);
    }

    public static InterfaceC0909f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0909f.f2547c);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0909f)) {
            return (InterfaceC0909f) iInterfaceQueryLocalInterface;
        }
        C0907d c0907d = new C0907d();
        c0907d.f2546s = iBinder;
        return c0907d;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = InterfaceC0909f.f2547c;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i2) {
            case 2:
                boolean zWarmup = warmup(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(zWarmup ? 1 : 0);
                return true;
            case 3:
                boolean zNewSession = newSession(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSession ? 1 : 0);
                return true;
            case 4:
                InterfaceC0906c interfaceC0906cAsInterface = AbstractBinderC0905b.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) AbstractC0355G.m550b(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean zMayLaunchUrl = mayLaunchUrl(interfaceC0906cAsInterface, uri, (Bundle) AbstractC0355G.m550b(parcel, creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                return true;
            case 5:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC0355G.m562p(parcel2, bundleExtraCommand, 1);
                return true;
            case 6:
                boolean zUpdateVisuals = updateVisuals(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                return true;
            case 7:
                boolean zRequestPostMessageChannel = requestPostMessageChannel(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Uri) AbstractC0355G.m550b(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                return true;
            case 8:
                int iPostMessage = postMessage(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iPostMessage);
                return true;
            case 9:
                boolean zValidateRelationship = validateRelationship(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) AbstractC0355G.m550b(parcel, Uri.CREATOR), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zValidateRelationship ? 1 : 0);
                return true;
            case 10:
                boolean zNewSessionWithExtras = newSessionWithExtras(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                return true;
            case 11:
                boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Uri) AbstractC0355G.m550b(parcel, Uri.CREATOR), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                return true;
            case 12:
                boolean zReceiveFile = receiveFile(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Uri) AbstractC0355G.m550b(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zReceiveFile ? 1 : 0);
                return true;
            case 13:
                boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                return true;
            case 14:
                boolean engagementSignalsCallback = setEngagementSignalsCallback(AbstractBinderC0905b.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) AbstractC0355G.m550b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }
}
