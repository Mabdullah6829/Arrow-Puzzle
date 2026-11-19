package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzcew;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbvf f3040c;

    public zzag(zzaw zzawVar, Context context, zzbvf zzbvfVar) {
        this.f3039b = context;
        this.f3040c = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        Context context = this.f3039b;
        try {
            return ((zzcew) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaf
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    int i2 = zzcev.f9850s;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcew ? (zzcew) iInterfaceQueryLocalInterface : new zzceu(iBinder2, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                }
            })).mo5377m0(new ObjectWrapper(context), this.f3040c);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2787P0(new ObjectWrapper(this.f3039b), this.f3040c, 261710000);
    }
}
