package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new zaz();

    /* JADX INFO: renamed from: s */
    public final int f4502s;

    /* JADX INFO: renamed from: t */
    public final IBinder f4503t;

    /* JADX INFO: renamed from: u */
    public final ConnectionResult f4504u;

    /* JADX INFO: renamed from: v */
    public final boolean f4505v;

    /* JADX INFO: renamed from: w */
    public final boolean f4506w;

    public zay(int i2, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f4502s = i2;
        this.f4503t = iBinder;
        this.f4504u = connectionResult;
        this.f4505v = z;
        this.f4506w = z2;
    }

    public final boolean equals(Object obj) {
        Object zztVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zay)) {
            return false;
        }
        zay zayVar = (zay) obj;
        if (!this.f4504u.equals(zayVar.f4504u)) {
            return false;
        }
        Object zztVar2 = null;
        IBinder iBinder = this.f4503t;
        if (iBinder == null) {
            zztVar = null;
        } else {
            int i2 = IAccountAccessor.Stub.f4445s;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = zayVar.f4503t;
        if (iBinder2 != null) {
            int i3 = IAccountAccessor.Stub.f4445s;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zztVar2 = iInterfaceQueryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface2 : new zzt(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return Objects.m3535a(zztVar, zztVar2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4502s);
        SafeParcelWriter.m3578d(parcel, 2, this.f4503t);
        SafeParcelWriter.m3582h(parcel, 3, this.f4504u, i2);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4505v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4506w ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
