package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbhq implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbhi f7871s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzcgd f7872t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzbhs f7873u;

    public zzbhq(zzbhs zzbhsVar, zzbhi zzbhiVar, zzcgd zzcgdVar) {
        this.f7871s = zzbhiVar;
        this.f7872t = zzcgdVar;
        this.f7873u = zzbhsVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhs zzbhsVar = this.f7873u;
        synchronized (zzbhsVar.f7878c) {
            try {
                if (zzbhsVar.f7877b) {
                    return;
                }
                zzbhsVar.f7877b = true;
                final zzbhh zzbhhVar = zzbhsVar.f7876a;
                if (zzbhhVar == null) {
                    return;
                }
                zzhcp zzhcpVar = zzcfy.f9946a;
                final zzbhi zzbhiVar = this.f7871s;
                final zzcgd zzcgdVar = this.f7872t;
                final ListenableFuture listenableFutureSubmit = ((zzhbb) zzhcpVar).submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhp
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbhf zzbhfVar;
                        boolean z;
                        long j2;
                        zzcgd zzcgdVar2 = zzcgdVar;
                        zzbhh zzbhhVar2 = zzbhhVar;
                        zzbhq zzbhqVar = this.f7867s;
                        try {
                            zzbhk zzbhkVar = (zzbhk) zzbhhVar2.getService();
                            boolean zM4888e = zzbhhVar2.m4888e();
                            zzbhi zzbhiVar2 = zzbhiVar;
                            if (zM4888e) {
                                Parcel parcelM4810u = zzbhkVar.m4810u();
                                zzben.m4815c(parcelM4810u, zzbhiVar2);
                                Parcel parcelM4809k0 = zzbhkVar.m4809k0(2, parcelM4810u);
                                zzbhfVar = (zzbhf) zzben.m4814b(parcelM4809k0, zzbhf.CREATOR);
                                parcelM4809k0.recycle();
                            } else {
                                Parcel parcelM4810u2 = zzbhkVar.m4810u();
                                zzben.m4815c(parcelM4810u2, zzbhiVar2);
                                Parcel parcelM4809k1 = zzbhkVar.m4809k0(1, parcelM4810u2);
                                zzbhfVar = (zzbhf) zzben.m4814b(parcelM4809k1, zzbhf.CREATOR);
                                parcelM4809k1.recycle();
                            }
                            if (!zzbhfVar.zza()) {
                                zzcgdVar2.m5398b(new RuntimeException("No entry contents."));
                                zzbhqVar.f7873u.m4890a();
                                return;
                            }
                            zzbhn zzbhnVar = new zzbhn(zzbhqVar, zzbhfVar.m4887w());
                            int i2 = zzbhnVar.read();
                            if (i2 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbhnVar.unread(i2);
                            synchronized (zzbhfVar) {
                                z = zzbhfVar.f7849t;
                            }
                            boolean zM4885H = zzbhfVar.m4885H();
                            synchronized (zzbhfVar) {
                                j2 = zzbhfVar.f7851v;
                            }
                            zzcgdVar2.m5397a(new zzbhu(zzbhnVar, z, zM4885H, j2, zzbhfVar.m4886a()));
                        } catch (RemoteException e) {
                            e = e;
                            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to obtain a cache service instance.", e);
                            zzcgdVar2.m5398b(e);
                            zzbhqVar.f7873u.m4890a();
                        } catch (IOException e2) {
                            e = e2;
                            int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                            com.google.android.gms.ads.internal.util.client.zzo.m3071d("Unable to obtain a cache service instance.", e);
                            zzcgdVar2.m5398b(e);
                            zzbhqVar.f7873u.m4890a();
                        }
                    }
                });
                zzcgdVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbho
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzcgdVar.isCancelled()) {
                            listenableFutureSubmit.cancel(true);
                        }
                    }
                }, zzcfy.f9953h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
    }
}
