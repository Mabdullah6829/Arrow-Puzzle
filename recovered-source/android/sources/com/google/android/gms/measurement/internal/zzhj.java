package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.MainThread;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhj implements ServiceConnection {
    final /* synthetic */ zzhk zza;
    private final String zzb;

    public zzhj(zzhk zzhkVar, String str) {
        Objects.requireNonNull(zzhkVar);
        this.zza = zzhkVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            AbstractC1456a.m2459z(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i2 = com.google.android.gms.internal.measurement.zzbr.f22330s;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.zzbs zzbqVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.zzbs ? (com.google.android.gms.internal.measurement.zzbs) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.zzbq(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (zzbqVar == null) {
                this.zza.zza.zzaW().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
            zzic zzicVar = this.zza.zza;
            zzicVar.zzaW().zzk().zza("Install Referrer Service connected");
            zzicVar.zzaX().zzj(new zzhi(this, zzbqVar, this));
        } catch (RuntimeException e) {
            this.zza.zza.zzaW().zze().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzaW().zzk().zza("Install Referrer Service disconnected");
    }

    public final /* synthetic */ String zza() {
        return this.zzb;
    }
}
