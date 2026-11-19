package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzcaf;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    /* JADX INFO: renamed from: s */
    public final zzek f2967s;

    public BaseAdView(Context context) {
        super(context);
        this.f2967s = new zzek(this, null, zzq.f3248a);
    }

    /* JADX INFO: renamed from: a */
    public final void m2753a() {
        zzbix.m5032a(getContext());
        if (((Boolean) zzbkv.f9043e.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8873zc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f4031s;
                        try {
                            zzek zzekVar = baseAdView.f2967s;
                            zzekVar.getClass();
                            try {
                                zzbu zzbuVar = zzekVar.f3151i;
                                if (zzbuVar != null) {
                                    zzbuVar.zzc();
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                zzo.m3076i("#007 Could not call remote method.", e);
                                return;
                            }
                        } catch (IllegalStateException e2) {
                            zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.destroy", e2);
                        }
                        zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.destroy", e2);
                    }
                });
                return;
            }
        }
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.zzc();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2754b(final AdRequest adRequest) {
        Preconditions.m3540d("#008 Must be called on the main UI thread.");
        zzbix.m5032a(getContext());
        if (((Boolean) zzbkv.f9044f.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8049Cc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdRequest adRequest2 = adRequest;
                        BaseAdView baseAdView = this.f4027s;
                        try {
                            baseAdView.f2967s.m2938b(adRequest2.f2945a);
                        } catch (IllegalStateException e) {
                            zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.loadAd", e);
                        }
                    }
                });
                return;
            }
        }
        this.f2967s.m2938b(adRequest.f2945a);
    }

    /* JADX INFO: renamed from: c */
    public final void m2755c() {
        zzbix.m5032a(getContext());
        if (((Boolean) zzbkv.f9045g.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8015Ac)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f4029s;
                        try {
                            zzek zzekVar = baseAdView.f2967s;
                            zzekVar.getClass();
                            try {
                                zzbu zzbuVar = zzekVar.f3151i;
                                if (zzbuVar != null) {
                                    zzbuVar.mo2852b();
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                zzo.m3076i("#007 Could not call remote method.", e);
                                return;
                            }
                        } catch (IllegalStateException e2) {
                            zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.pause", e2);
                        }
                        zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.pause", e2);
                    }
                });
                return;
            }
        }
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2852b();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2756d() {
        zzbix.m5032a(getContext());
        if (((Boolean) zzbkv.f9046h.m5057c()).booleanValue()) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8856yc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.f3404b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.f4030s;
                        try {
                            zzek zzekVar = baseAdView.f2967s;
                            zzekVar.getClass();
                            try {
                                zzbu zzbuVar = zzekVar.f3151i;
                                if (zzbuVar != null) {
                                    zzbuVar.mo2853c();
                                    return;
                                }
                                return;
                            } catch (RemoteException e) {
                                zzo.m3076i("#007 Could not call remote method.", e);
                                return;
                            }
                        } catch (IllegalStateException e2) {
                            zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.resume", e2);
                        }
                        zzcaf.m5286c(baseAdView.getContext()).mo5291a("BaseAdView.resume", e2);
                    }
                });
                return;
            }
        }
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2853c();
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    public AdListener getAdListener() {
        return this.f2967s.f3148f;
    }

    public AdSize getAdSize() {
        zzr zzrVarMo2855g;
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null && (zzrVarMo2855g = zzbuVar.mo2855g()) != null) {
                return new AdSize(zzrVarMo2855g.f3261w, zzrVarMo2855g.f3258t, zzrVarMo2855g.f3257s);
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = zzekVar.f3149g;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        zzbu zzbuVar;
        zzek zzekVar = this.f2967s;
        if (zzekVar.f3153k == null && (zzbuVar = zzekVar.f3151i) != null) {
            try {
                zzekVar.f3153k = zzbuVar.mo2856k();
            } catch (RemoteException e) {
                zzo.m3076i("#007 Could not call remote method.", e);
            }
        }
        return zzekVar.f3153k;
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.f2967s.f3156n;
    }

    public long getPlacementId() {
        zzek zzekVar = this.f2967s;
        AtomicLong atomicLong = zzekVar.f3157o;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar == null) {
                return 0L;
            }
            atomicLong.set(zzbuVar.mo2846P());
            return atomicLong.get();
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
            return 0L;
        }
    }

    public ResponseInfo getResponseInfo() {
        zzdx zzdxVarMo2858r;
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            zzdxVarMo2858r = zzbuVar != null ? zzbuVar.mo2858r() : null;
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
        if (zzdxVarMo2858r != null) {
            return new ResponseInfo(zzdxVarMo2858r);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i6 = ((i4 - i2) - measuredWidth) / 2;
        int i7 = ((i5 - i3) - measuredHeight) / 2;
        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        AdSize adSize;
        int measuredHeight;
        int iM3033b;
        int iM3033b2;
        int i4;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.m3071d("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int i5 = adSize.f2956a;
                if (i5 == -3) {
                    iM3033b = -1;
                } else if (i5 != -1) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar = zzay.f3085g.f3086a;
                    iM3033b = com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, i5);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    Parcelable.Creator<zzr> creator = zzr.CREATOR;
                    iM3033b = displayMetrics.widthPixels;
                }
                int i6 = adSize.f2957b;
                if (i6 == -4 || i6 == -3) {
                    iM3033b2 = -1;
                } else if (i6 != -2) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVar2 = zzay.f3085g.f3086a;
                    iM3033b2 = com.google.android.gms.ads.internal.util.client.zzf.m3033b(context, i6);
                } else {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    Parcelable.Creator<zzr> creator2 = zzr.CREATOR;
                    float f2 = displayMetrics2.heightPixels;
                    float f3 = displayMetrics2.density;
                    int i7 = (int) (f2 / f3);
                    if (i7 <= 400) {
                        i4 = 32;
                    } else {
                        i4 = i7 <= 720 ? 50 : 90;
                    }
                    iM3033b2 = (int) (i4 * f3);
                }
                measuredHeight = iM3033b2;
                measuredWidth = iM3033b;
            } else {
                measuredHeight = 0;
            }
        } else {
            measureChild(childAt, i2, i3);
            measuredWidth = childAt.getMeasuredWidth();
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(measuredHeight, getSuggestedMinimumHeight()), i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        zzek zzekVar = this.f2967s;
        zzekVar.f3148f = adListener;
        zzaz zzazVar = zzekVar.f3146d;
        synchronized (zzazVar.f3092s) {
            zzazVar.f3093t = adListener;
        }
        if (adListener == 0) {
            zzekVar.m2939c(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzekVar.m2939c((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzekVar.m2941e((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        AdSize[] adSizeArr = {adSize};
        zzek zzekVar = this.f2967s;
        if (zzekVar.f3149g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzekVar.m2940d(adSizeArr);
    }

    public void setAdUnitId(String str) {
        zzek zzekVar = this.f2967s;
        if (zzekVar.f3153k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        zzekVar.f3153k = str;
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        zzek zzekVar = this.f2967s;
        zzekVar.getClass();
        try {
            zzekVar.f3156n = onPaidEventListener;
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2861x3(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    public void setPlacementId(long j2) {
        zzek zzekVar = this.f2967s;
        zzekVar.f3157o.set(j2);
        try {
            zzbu zzbuVar = zzekVar.f3151i;
            if (zzbuVar != null) {
                zzbuVar.mo2849Y0(j2);
            }
        } catch (RemoteException e) {
            zzo.m3076i("#007 Could not call remote method.", e);
        }
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2967s = new zzek(this, attributeSet, zzq.f3248a);
    }
}
