package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbib {

    /* JADX INFO: renamed from: a */
    public zzbet f7894a;

    /* JADX INFO: renamed from: b */
    public boolean f7895b;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f7896c;

    public zzbib() {
        this.f7896c = com.google.android.gms.ads.internal.util.client.zzb.f3404b;
    }

    public zzbib(final Context context) {
        ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.f3404b;
        this.f7896c = executorService;
        executorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhx
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8460b6)).booleanValue();
                Context context2 = context;
                zzbib zzbibVar = this.f7887s;
                if (zBooleanValue) {
                    try {
                        zzbibVar.f7894a = (zzbet) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context2, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.internal.ads.zzbhy
                            @Override // com.google.android.gms.ads.internal.util.client.zzq
                            /* JADX INFO: renamed from: a */
                            public final Object mo2799a(IBinder iBinder) {
                                IBinder iBinder2 = iBinder;
                                int i2 = zzbes.f7691s;
                                if (iBinder2 == null) {
                                    return null;
                                }
                                IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                return iInterfaceQueryLocalInterface instanceof zzbet ? (zzbet) iInterfaceQueryLocalInterface : new zzber(iBinder2, "com.google.android.gms.ads.clearcut.IClearcut");
                            }
                        });
                        zzbibVar.f7894a.mo4821O2(new ObjectWrapper(context2));
                        zzbibVar.f7895b = true;
                    } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3068a("Cannot dynamite load clearcut");
                    }
                }
            }
        });
    }
}
