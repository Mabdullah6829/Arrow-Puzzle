package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: android.support.customtabs.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0910g implements InterfaceC0912i {

    /* JADX INFO: renamed from: s */
    public IBinder f2548s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2548s;
    }

    @Override // android.support.customtabs.InterfaceC0912i
    public final void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0912i.f2549d);
            parcelObtain.writeInt(i2);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2548s.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0912i
    public final void onSessionEnded(boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0912i.f2549d);
            parcelObtain.writeInt(z ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2548s.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0912i
    public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0912i.f2549d);
            parcelObtain.writeInt(z ? 1 : 0);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2548s.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
