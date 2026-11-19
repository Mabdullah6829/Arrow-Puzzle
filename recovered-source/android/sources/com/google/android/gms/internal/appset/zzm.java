package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzm implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    /* JADX INFO: renamed from: a */
    public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzg zzgVar = (zzg) ((zzd) anyClient).getService();
        com.google.android.gms.appset.zza zzaVar = new com.google.android.gms.appset.zza(null, null);
        zzo zzoVar = new zzo(taskCompletionSource);
        zzgVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = zzc.f21530a;
        parcelObtain.writeInt(1);
        zzaVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(zzoVar);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            zzgVar.f21529s.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
