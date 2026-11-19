package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbze;

/* JADX INFO: loaded from: classes.dex */
final class zzai extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f3042b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbvf f3043c;

    public zzai(zzaw zzawVar, Context context, zzbvf zzbvfVar) {
        this.f3042b = context;
        this.f3043c = zzbvfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        Context context = this.f3042b;
        try {
            return ((zzbze) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzah
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    int i2 = zzbzd.f9563s;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbze ? (zzbze) iInterfaceQueryLocalInterface : new zzbzc(iBinder2, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                }
            })).mo5278m0(new ObjectWrapper(context), this.f3043c);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2790e4(new ObjectWrapper(this.f3042b), this.f3043c, 261710000);
    }
}
