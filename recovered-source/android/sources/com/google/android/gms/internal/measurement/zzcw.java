package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcw extends zzbl implements zzcy {
    public zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* JADX INFO: renamed from: b */
    public final int mo9834b() {
        Parcel parcelZzP = zzP(2, zza());
        int i2 = parcelZzP.readInt();
        parcelZzP.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* JADX INFO: renamed from: y0 */
    public final void mo9835y0(String str, String str2, Bundle bundle, long j2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.m9819b(parcelZza, bundle);
        parcelZza.writeLong(j2);
        zzc(1, parcelZza);
    }
}
