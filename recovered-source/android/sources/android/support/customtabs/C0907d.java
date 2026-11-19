package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: android.support.customtabs.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0907d implements InterfaceC0909f {

    /* JADX INFO: renamed from: s */
    public IBinder f2546s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2546s;
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final Bundle extraCommand(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeString(str);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC0355G.m550b(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean isEngagementSignalsApiAvailable(InterfaceC0906c interfaceC0906c, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean mayLaunchUrl(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle, List list) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, uri, 0);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            if (list == null) {
                parcelObtain.writeInt(-1);
            } else {
                int size = list.size();
                parcelObtain.writeInt(size);
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC0355G.m562p(parcelObtain, (Parcelable) list.get(i2), 0);
                }
            }
            this.f2546s.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean newSession(InterfaceC0906c interfaceC0906c) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            this.f2546s.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean newSessionWithExtras(InterfaceC0906c interfaceC0906c, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final int postMessage(InterfaceC0906c interfaceC0906c, String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            parcelObtain.writeString(str);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean receiveFile(InterfaceC0906c interfaceC0906c, Uri uri, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, uri, 0);
            parcelObtain.writeInt(i2);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean requestPostMessageChannel(InterfaceC0906c interfaceC0906c, Uri uri) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, uri, 0);
            this.f2546s.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean requestPostMessageChannelWithExtras(InterfaceC0906c interfaceC0906c, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, uri, 0);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean setEngagementSignalsCallback(InterfaceC0906c interfaceC0906c, IBinder iBinder, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            parcelObtain.writeStrongBinder(iBinder);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean updateVisuals(InterfaceC0906c interfaceC0906c, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean validateRelationship(InterfaceC0906c interfaceC0906c, int i2, Uri uri, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeStrongInterface(interfaceC0906c);
            parcelObtain.writeInt(i2);
            AbstractC0355G.m562p(parcelObtain, uri, 0);
            AbstractC0355G.m562p(parcelObtain, bundle, 0);
            this.f2546s.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0909f
    public final boolean warmup(long j2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0909f.f2547c);
            parcelObtain.writeLong(j2);
            this.f2546s.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
