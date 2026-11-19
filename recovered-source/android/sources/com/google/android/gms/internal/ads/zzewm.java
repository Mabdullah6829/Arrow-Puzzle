package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewm implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15047a;

    /* JADX INFO: renamed from: b */
    public final VersionInfoParcel f15048b;

    public zzewm(VersionInfoParcel versionInfoParcel, zzhcp zzhcpVar) {
        this.f15048b = versionInfoParcel;
        this.f15047a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15047a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VersionInfoParcel versionInfoParcel = this.f15046a.f15048b;
                zzbio zzbioVar = zzbix.f8804vb;
                zzbiv zzbivVar = com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c;
                if (!((Boolean) zzbivVar.m5030a(zzbioVar)).booleanValue()) {
                    return new zzewn(null);
                }
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                int extensionVersion = 0;
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                        extensionVersion = SdkExtensions.getExtensionVersion(1000000);
                    } else if (((Boolean) zzbivVar.m5030a(zzbix.f8855yb)).booleanValue() && versionInfoParcel.f3398u >= ((Integer) zzbivVar.m5030a(zzbix.f8838xb)).intValue() && i2 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getAdServicesExtensionVersion", e);
                }
                return new zzewn(Integer.valueOf(extensionVersion));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 54;
    }
}
