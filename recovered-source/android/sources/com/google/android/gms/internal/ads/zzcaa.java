package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzcaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaa> CREATOR = new zzcab();

    /* JADX INFO: renamed from: s */
    public final View f9577s;

    /* JADX INFO: renamed from: t */
    public final Map f9578t;

    public zzcaa(IBinder iBinder, IBinder iBinder2) {
        this.f9577s = (View) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder));
        this.f9578t = (Map) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3578d(parcel, 1, new ObjectWrapper(this.f9577s));
        SafeParcelWriter.m3578d(parcel, 2, new ObjectWrapper(this.f9578t));
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
