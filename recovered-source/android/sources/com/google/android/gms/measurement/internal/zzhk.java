package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhk {
    final zzic zza;

    public zzhk(zzpg zzpgVar) {
        this.zza = zzpgVar.zzah();
    }

    @VisibleForTesting
    public final boolean zza() {
        try {
            zzic zzicVar = this.zza;
            PackageManagerWrapper packageManagerWrapperM3665a = Wrappers.m3665a(zzicVar.zzaZ());
            if (packageManagerWrapperM3665a != null) {
                return packageManagerWrapperM3665a.m3663b(128, "com.android.vending").versionCode >= 80837300;
            }
            zzicVar.zzaW().zzk().zza("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.zza.zzaW().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
