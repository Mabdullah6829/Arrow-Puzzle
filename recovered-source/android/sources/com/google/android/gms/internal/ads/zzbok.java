package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbok extends zzbns {
    @Override // com.google.android.gms.internal.ads.zzbnt
    /* JADX INFO: renamed from: B0 */
    public final void mo5076B0(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        if (zzbuVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.m3697u0(iObjectWrapper));
        try {
            if (zzbuVar.mo2862z() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.mo2862z();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.f3201s : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
        }
        try {
            if (zzbuVar.mo2859v() instanceof zzbfm) {
                zzbfm zzbfmVar = (zzbfm) zzbuVar.mo2859v();
                adManagerAdView.setAppEventListener(zzbfmVar != null ? zzbfmVar.f7739t : null);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new zzboj(this, adManagerAdView, zzbuVar));
    }
}
