package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;

/* JADX INFO: loaded from: classes.dex */
public final class zzk extends RemoteCreator {

    /* JADX INFO: renamed from: c */
    public zzcah f3205c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo2949a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    /* JADX INFO: renamed from: c */
    public final zzbu m2975c(Context context, zzr zzrVar, String str, zzbvj zzbvjVar, int i2) {
        zzbix.m5032a(context);
        if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8483cc)).booleanValue()) {
            try {
                IBinder iBinderM2880D0 = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.m3079a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Object mo2799a(IBinder iBinder) {
                        IBinder iBinder2 = iBinder;
                        if (iBinder2 == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder2);
                    }
                })).m2880D0(new ObjectWrapper(context), zzrVar, str, zzbvjVar, i2);
                if (iBinderM2880D0 != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderM2880D0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderM2880D0);
                }
            } catch (RemoteException e) {
                e = e;
                Exception exc = e;
                zzcah zzcahVarM5286c = zzcaf.m5286c(context);
                this.f3205c = zzcahVarM5286c;
                zzcahVarM5286c.mo5291a("AdManagerCreator.newAdManagerByDynamiteLoader", exc);
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", exc);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                Exception exc2 = e;
                zzcah zzcahVarM5286c2 = zzcaf.m5286c(context);
                this.f3205c = zzcahVarM5286c2;
                zzcahVarM5286c2.mo5291a("AdManagerCreator.newAdManagerByDynamiteLoader", exc2);
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", exc2);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Exception exc3 = e;
                zzcah zzcahVarM5286c3 = zzcaf.m5286c(context);
                this.f3205c = zzcahVarM5286c3;
                zzcahVarM5286c3.mo5291a("AdManagerCreator.newAdManagerByDynamiteLoader", exc3);
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", exc3);
                return null;
            }
        } else {
            try {
                IBinder iBinderM2880D1 = ((zzbv) m3698b(context)).m2880D0(new ObjectWrapper(context), zzrVar, str, zzbvjVar, i2);
                if (iBinderM2880D1 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderM2880D1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface2 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface2 : new zzbs(iBinderM2880D1);
                }
            } catch (RemoteException e4) {
                e = e4;
                com.google.android.gms.ads.internal.util.client.zzo.m3069b("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e5) {
                e = e5;
                com.google.android.gms.ads.internal.util.client.zzo.m3069b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
