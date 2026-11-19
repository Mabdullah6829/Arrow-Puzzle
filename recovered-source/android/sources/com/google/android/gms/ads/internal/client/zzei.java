package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes.dex */
final class zzei extends zzaz {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzek f3140u;

    public zzei(zzek zzekVar) {
        this.f3140u = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public final void mo2726c(LoadAdError loadAdError) {
        zzek zzekVar = this.f3140u;
        VideoController videoController = zzekVar.f3145c;
        zzbu zzbuVar = zzekVar.f3151i;
        zzea zzeaVarMo2860w = null;
        if (zzbuVar != null) {
            try {
                zzeaVarMo2860w = zzbuVar.mo2860w();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        videoController.m2761b(zzeaVarMo2860w);
        super.mo2726c(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public final void mo2727e() {
        zzek zzekVar = this.f3140u;
        VideoController videoController = zzekVar.f3145c;
        zzbu zzbuVar = zzekVar.f3151i;
        zzea zzeaVarMo2860w = null;
        if (zzbuVar != null) {
            try {
                zzeaVarMo2860w = zzbuVar.mo2860w();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        videoController.m2761b(zzeaVarMo2860w);
        super.mo2727e();
    }
}
