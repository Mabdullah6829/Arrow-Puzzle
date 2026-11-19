package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkp extends zzbm implements zzkq {
    public zzkp() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        Status status = (Status) zzbn.m9818a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        zzbn.m9821d(parcel);
        TaskCompletionSource taskCompletionSource = ((zzjy) this).f22567s;
        if (!status.m3433w()) {
            TaskUtil.m3486a(status, null, taskCompletionSource);
            return true;
        }
        try {
            zzadf zzadfVar = zzadf.f22012b;
            int i4 = zzacf.f21956a;
            TaskUtil.m3486a(status, zzno.m10555C(bArrCreateByteArray, zzadf.f22013c), taskCompletionSource);
            return true;
        } catch (zzaeh e) {
            taskCompletionSource.m10767a(e);
            return true;
        }
    }
}
