package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzcj;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();

    /* JADX INFO: renamed from: s */
    public final boolean f3010s;

    /* JADX INFO: renamed from: t */
    public final zzcl f3011t;

    /* JADX INFO: renamed from: u */
    public final IBinder f3012u;

    @Deprecated
    public static final class Builder {
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        zzcl zzcjVar;
        this.f3010s = z;
        if (iBinder != null) {
            int i2 = zzck.f3103s;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcjVar = iInterfaceQueryLocalInterface instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface : new zzcj(iBinder);
        } else {
            zzcjVar = null;
        }
        this.f3011t = zzcjVar;
        this.f3012u = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f3010s ? 1 : 0);
        zzcl zzclVar = this.f3011t;
        SafeParcelWriter.m3578d(parcel, 2, zzclVar == null ? null : zzclVar.asBinder());
        SafeParcelWriter.m3578d(parcel, 3, this.f3012u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
