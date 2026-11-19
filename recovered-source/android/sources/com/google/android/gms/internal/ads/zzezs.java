package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezs implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Context f15234a;

    /* JADX INFO: renamed from: b */
    public final zzhcp f15235b;

    public zzezs(Context context, zzhcp zzhcpVar) {
        this.f15235b = zzhcpVar;
        this.f15234a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15235b.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                Context context = this.f15233a.f15234a;
                com.google.android.gms.ads.internal.util.zzf zzfVar = com.google.android.gms.ads.internal.util.zzs.f3626l;
                Object systemService = context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                return new zzezt(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 57;
    }
}
