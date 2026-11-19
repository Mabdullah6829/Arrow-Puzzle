package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context);
        Preconditions.m3545i(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.f2967s.f3149g;
    }

    public AppEventListener getAppEventListener() {
        return this.f2967s.f3150h;
    }

    public VideoController getVideoController() {
        return this.f2967s.f3145c;
    }

    public VideoOptions getVideoOptions() {
        return this.f2967s.f3152j;
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f2967s.m2940d(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f2967s.m2941e(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        zzek zzekVar = this.f2967s;
        zzekVar.f3155m = z;
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2843G2(z);
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        zzek zzekVar = this.f2967s;
        zzekVar.f3152j = videoOptions;
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2841D3(videoOptions == null ? null : new zzfw(videoOptions));
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
