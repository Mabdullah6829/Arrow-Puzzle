package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p011H.AbstractC0243G;

/* JADX INFO: renamed from: android.support.customtabs.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0904a implements InterfaceC0906c {

    /* JADX INFO: renamed from: s */
    public IBinder f2544s;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2544s;
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void extraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeString(str);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeString(str);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC0243G.m363a(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            parcelObtain.writeInt(i5);
            parcelObtain.writeInt(i6);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(10, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onActivityResized(int i2, int i3, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onMessageChannelReady(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onMinimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(11, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onNavigationEvent(int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeInt(i2);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onPostMessage(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeString(str);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onRelationshipValidationResult(int i2, Uri uri, boolean z, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            parcelObtain.writeInt(i2);
            AbstractC0243G.m364b(parcelObtain, uri, 0);
            parcelObtain.writeInt(z ? 1 : 0);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(6, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onUnminimized(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(12, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.customtabs.InterfaceC0906c
    public final void onWarmupCompleted(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0906c.f2545b);
            AbstractC0243G.m364b(parcelObtain, bundle, 0);
            this.f2544s.transact(9, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
