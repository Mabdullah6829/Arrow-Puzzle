package com.google.android.gms.ads.internal.client;

import android.content.ContextWrapper;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: loaded from: classes.dex */
final class zzar extends zzax {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ContextWrapper f3066b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbvf f3067c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzaw f3068d;

    public zzar(zzaw zzawVar, ContextWrapper contextWrapper, zzbvf zzbvfVar) {
        this.f3066b = contextWrapper;
        this.f3067c = zzbvfVar;
        this.f3068d = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2796a() {
        zzaw.m2800k(this.f3066b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: b */
    public final Object mo2797b() {
        zzch zzcfVar;
        ContextWrapper contextWrapper = this.f3066b;
        ObjectWrapper objectWrapper = new ObjectWrapper(contextWrapper);
        zzbix.m5032a(contextWrapper);
        boolean zBooleanValue = ((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue();
        zzaw zzawVar = this.f3068d;
        zzbvf zzbvfVar = this.f3067c;
        if (!zBooleanValue) {
            zzl zzlVar = zzawVar.f3083g;
            try {
                ObjectWrapper objectWrapper2 = new ObjectWrapper(contextWrapper);
                zzci zzciVar = (zzci) zzlVar.m3698b(contextWrapper);
                Parcel parcelM4810u = zzciVar.m4810u();
                zzben.m4817e(parcelM4810u, objectWrapper2);
                zzben.m4817e(parcelM4810u, zzbvfVar);
                parcelM4810u.writeInt(261710000);
                Parcel parcelM4809k0 = zzciVar.m4809k0(1, parcelM4810u);
                IBinder strongBinder = parcelM4809k0.readStrongBinder();
                parcelM4809k0.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(strongBinder);
            } catch (RemoteException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            zzci zzciVar2 = (zzci) com.google.android.gms.ads.internal.util.client.zzs.m3079a(contextWrapper, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Object mo2799a(IBinder iBinder) {
                    IBinder iBinder2 = iBinder;
                    if (iBinder2 == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzci ? (zzci) iInterfaceQueryLocalInterface2 : new zzci(iBinder2);
                }
            });
            Parcel parcelM4810u2 = zzciVar2.m4810u();
            zzben.m4817e(parcelM4810u2, objectWrapper);
            zzben.m4817e(parcelM4810u2, zzbvfVar);
            parcelM4810u2.writeInt(261710000);
            Parcel parcelM4809k1 = zzciVar2.m4809k0(1, parcelM4810u2);
            IBinder strongBinder2 = parcelM4809k1.readStrongBinder();
            parcelM4809k1.recycle();
            if (strongBinder2 == null) {
                zzcfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzch ? (zzch) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
            }
            zzcfVar.mo2888x2(zzbvfVar);
            return zzcfVar;
        } catch (RemoteException e4) {
            e = e4;
            zzcah zzcahVarM5286c = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c;
            zzcahVarM5286c.mo5291a("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e5) {
            e = e5;
            zzcah zzcahVarM5286c2 = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c2;
            zzcahVarM5286c2.mo5291a("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            zzcah zzcahVarM5286c3 = zzcaf.m5286c(contextWrapper);
            zzawVar.f3082f = zzcahVarM5286c3;
            zzcahVarM5286c3.mo5291a("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    /* JADX INFO: renamed from: c */
    public final Object mo2798c(zzco zzcoVar) {
        return zzcoVar.mo2789T2(new ObjectWrapper(this.f3066b), this.f3067c, 261710000);
    }
}
