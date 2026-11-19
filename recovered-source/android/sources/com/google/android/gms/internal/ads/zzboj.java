package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
final class zzboj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ AdManagerAdView f9197s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu f9198t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzbok f9199u;

    public zzboj(zzbok zzbokVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.f9197s = adManagerAdView;
        this.f9198t = zzbuVar;
        this.f9199u = zzbokVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.f9198t;
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.f9197s.f2967s;
        zzekVar.getClass();
        try {
            IObjectWrapper iObjectWrapperZzb = zzbuVar.zzb();
            if (iObjectWrapperZzb != null && ((View) ObjectWrapper.m3697u0(iObjectWrapperZzb)).getParent() == null) {
                zzekVar.f3154l.addView((View) ObjectWrapper.m3697u0(iObjectWrapperZzb));
                zzekVar.f3151i = zzbuVar;
                this.f9199u.getClass();
                throw null;
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
        com.google.android.gms.ads.internal.util.client.zzo.m3073f("Could not bind.");
    }
}
