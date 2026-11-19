package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    /* JADX INFO: renamed from: u */
    public final boolean mo9072u(int i2, Parcel parcel) {
        if (i2 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = zzc.f21530a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        com.google.android.gms.appset.zzc zzcVarCreateFromParcel = parcel.readInt() == 0 ? null : com.google.android.gms.appset.zzc.CREATOR.createFromParcel(parcel);
        TaskUtil.m3486a(statusCreateFromParcel, zzcVarCreateFromParcel != null ? new AppSetIdInfo(zzcVarCreateFromParcel.f4038s, zzcVarCreateFromParcel.f4039t) : null, ((zzo) this).f21538s);
        return true;
    }
}
