package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbvf;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class zzek {

    /* JADX INFO: renamed from: b */
    public final zzq f3144b;

    /* JADX INFO: renamed from: e */
    public zza f3147e;

    /* JADX INFO: renamed from: f */
    public AdListener f3148f;

    /* JADX INFO: renamed from: g */
    public AdSize[] f3149g;

    /* JADX INFO: renamed from: h */
    public AppEventListener f3150h;

    /* JADX INFO: renamed from: j */
    public VideoOptions f3152j;

    /* JADX INFO: renamed from: k */
    public String f3153k;

    /* JADX INFO: renamed from: l */
    public final BaseAdView f3154l;

    /* JADX INFO: renamed from: m */
    public boolean f3155m;

    /* JADX INFO: renamed from: n */
    public OnPaidEventListener f3156n;

    /* JADX INFO: renamed from: a */
    public final zzbvf f3143a = new zzbvf();

    /* JADX INFO: renamed from: c */
    public final VideoController f3145c = new VideoController();

    /* JADX INFO: renamed from: d */
    public final zzaz f3146d = new zzei(this);

    /* JADX INFO: renamed from: o */
    public final AtomicLong f3157o = new AtomicLong();

    /* JADX INFO: renamed from: i */
    public zzbu f3151i = null;

    public zzek(BaseAdView baseAdView, AttributeSet attributeSet, zzq zzqVar) {
        zzr zzrVar;
        this.f3154l = baseAdView;
        this.f3144b = zzqVar;
        new AtomicBoolean(false);
        if (attributeSet != null) {
            Context context = baseAdView.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                AdSize[] adSizeArr = zzzVar.f3278a;
                if (adSizeArr.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f3149g = adSizeArr;
                this.f3153k = zzzVar.f3279b;
                if (baseAdView.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
                    AdSize adSize = this.f3149g[0];
                    if (adSize.equals(AdSize.f2954q)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.f3250B = false;
                    }
                    zzfVar.getClass();
                    com.google.android.gms.ads.internal.util.client.zzf.m3036h(baseAdView, zzrVar, "Ads by Google", ViewCompat.MEASURED_STATE_MASK, -1);
                }
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzay.f3085g.f3086a;
                zzr zzrVar2 = new zzr(context, AdSize.f2946i);
                String message = e.getMessage();
                String message2 = e.getMessage();
                zzfVar2.getClass();
                if (message2 != null) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3073f(message2);
                }
                com.google.android.gms.ads.internal.util.client.zzf.m3036h(baseAdView, zzrVar2, message, SupportMenu.CATEGORY_MASK, ViewCompat.MEASURED_STATE_MASK);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static zzr m2937a(Context context, AdSize[] adSizeArr) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.f2954q)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.f3250B = false;
        return zzrVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: RemoteException -> 0x00ba, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00ba, blocks: (B:26:0x0089, B:28:0x008f, B:30:0x009d, B:32:0x00af, B:35:0x00bc), top: B:52:0x0089, outer: #1 }] */
    /* JADX INFO: renamed from: b */
    public final void m2938b(zzeh zzehVar) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVar = this.f3151i;
            BaseAdView baseAdView = this.f3154l;
            if (zzbuVar == null) {
                if (this.f3149g == null || this.f3153k == null) {
                    if (zzbuVar == null) {
                        throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                    }
                }
                Context context = baseAdView.getContext();
                zzbu zzbuVar2 = (zzbu) new zzal(zzay.f3085g.f3087b, context, m2937a(context, this.f3149g), this.f3153k, this.f3143a).m2811d(context, false);
                this.f3151i = zzbuVar2;
                zzbuVar2.mo2845M3(new zzg(this.f3146d));
                zza zzaVar = this.f3147e;
                if (zzaVar != null) {
                    this.f3151i.mo2848W3(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.f3150h;
                if (appEventListener != null) {
                    this.f3151i.mo2842F0(new zzbfm(appEventListener));
                }
                if (this.f3152j != null) {
                    this.f3151i.mo2841D3(new zzfw(this.f3152j));
                }
                this.f3151i.mo2861x3(new zzfo(this.f3156n));
                this.f3151i.mo2843G2(this.f3155m);
                zzbu zzbuVar3 = this.f3151i;
                if (zzbuVar3 != null) {
                    try {
                        final IObjectWrapper iObjectWrapperZzb = zzbuVar3.zzb();
                        if (iObjectWrapperZzb != null) {
                            if (((Boolean) zzbkv.f9044f.m5057c()).booleanValue()) {
                                if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.f3141s.f3154l.addView((View) ObjectWrapper.m3697u0(iObjectWrapperZzb));
                                        }
                                    });
                                } else {
                                    baseAdView.addView((View) ObjectWrapper.m3697u0(iObjectWrapperZzb));
                                }
                            } else {
                                baseAdView.addView((View) ObjectWrapper.m3697u0(iObjectWrapperZzb));
                            }
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
                    }
                }
            }
            zzehVar.f3139n = jCurrentTimeMillis;
            zzbu zzbuVar4 = this.f3151i;
            if (zzbuVar4 == null) {
                throw null;
            }
            AtomicLong atomicLong = this.f3157o;
            if (atomicLong.get() != 0) {
                zzbuVar4.mo2849Y0(atomicLong.get());
            }
            zzq zzqVar = this.f3144b;
            Context context2 = baseAdView.getContext();
            zzqVar.getClass();
            zzbuVar4.mo2850Z(zzq.m2979a(context2, zzehVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2939c(zza zzaVar) {
        try {
            this.f3147e = zzaVar;
            zzbu zzbuVar = this.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2848W3(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2940d(AdSize... adSizeArr) {
        BaseAdView baseAdView = this.f3154l;
        this.f3149g = adSizeArr;
        try {
            zzbu zzbuVar = this.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2857o2(m2937a(baseAdView.getContext(), this.f3149g));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
        baseAdView.requestLayout();
    }

    /* JADX INFO: renamed from: e */
    public final void m2941e(AppEventListener appEventListener) {
        try {
            this.f3150h = appEventListener;
            zzbu zzbuVar = this.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2842F0(appEventListener != null ? new zzbfm(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.m3076i("#007 Could not call remote method.", e);
        }
    }
}
