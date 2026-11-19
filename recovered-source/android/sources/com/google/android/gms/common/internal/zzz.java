package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    /* JADX INFO: renamed from: u */
    public final boolean mo3533u(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.zzc.m9103a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.zzc.m9105c(parcel);
            zzd zzdVar = (zzd) this;
            Preconditions.m3545i(zzdVar.f4522s, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar.f4522s.onPostInitHandler(i3, strongBinder, bundle, zzdVar.f4523t);
            zzdVar.f4522s = null;
        } else if (i2 == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.zzc.m9105c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i2 != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) com.google.android.gms.internal.common.zzc.m9103a(parcel, zzj.CREATOR);
            com.google.android.gms.internal.common.zzc.m9105c(parcel);
            zzd zzdVar2 = (zzd) this;
            BaseGmsClient baseGmsClient = zzdVar2.f4522s;
            Preconditions.m3545i(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.m3544h(zzjVar);
            baseGmsClient.zzc(zzjVar);
            Bundle bundle2 = zzjVar.f4530s;
            Preconditions.m3545i(zzdVar2.f4522s, "onPostInitComplete can be called only once per call to getRemoteService");
            zzdVar2.f4522s.onPostInitHandler(i4, strongBinder2, bundle2, zzdVar2.f4523t);
            zzdVar2.f4522s = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
