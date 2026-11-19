package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmp;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: s */
    public final FrameLayout f3776s;

    /* JADX INFO: renamed from: t */
    public final zzbmp f3777t;

    public NativeAdView(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f3776s = frameLayout;
        this.f3777t = isInEditMode() ? null : zzay.f3085g.f3087b.m2805e(frameLayout.getContext(), this, frameLayout);
    }

    /* JADX INFO: renamed from: a */
    public final View m3310a(String str) {
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar != null) {
            try {
                IObjectWrapper iObjectWrapperMo2951D = zzbmpVar.mo2951D(str);
                if (iObjectWrapperMo2951D != null) {
                    return (View) ObjectWrapper.m3697u0(iObjectWrapperMo2951D);
                }
            } catch (RemoteException e) {
                zzo.m3071d("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        super.bringChildToFront(this.f3776s);
    }

    /* JADX INFO: renamed from: b */
    public final void m3311b(String str, View view) {
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.mo2958s0(new ObjectWrapper(view), str);
        } catch (RemoteException e) {
            zzo.m3071d("Unable to call setAssetView on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f3776s;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar != null) {
            if (((Boolean) zzba.f3095e.f3098c.m5030a(zzbix.f8401Xc)).booleanValue()) {
                try {
                    zzbmpVar.mo2953X1(new ObjectWrapper(motionEvent));
                } catch (RemoteException e) {
                    zzo.m3071d("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public AdChoicesView getAdChoicesView() {
        View viewM3310a = m3310a("3011");
        if (viewM3310a instanceof AdChoicesView) {
            return (AdChoicesView) viewM3310a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return m3310a("3005");
    }

    public final View getBodyView() {
        return m3310a("3004");
    }

    public final View getCallToActionView() {
        return m3310a("3002");
    }

    public final View getHeadlineView() {
        return m3310a("3001");
    }

    public final View getIconView() {
        return m3310a("3003");
    }

    public final View getImageView() {
        return m3310a("3008");
    }

    public final MediaView getMediaView() {
        View viewM3310a = m3310a("3010");
        if (viewM3310a instanceof MediaView) {
            return (MediaView) viewM3310a;
        }
        if (viewM3310a == null) {
            return null;
        }
        zzo.m3068a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return m3310a("3007");
    }

    public final View getStarRatingView() {
        return m3310a("3009");
    }

    public final View getStoreView() {
        return m3310a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.mo2955f0(new ObjectWrapper(view), i2);
        } catch (RemoteException e) {
            zzo.m3071d("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f3776s);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f3776s == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        m3311b("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        m3311b("3005", view);
    }

    public final void setBodyView(View view) {
        m3311b("3004", view);
    }

    public final void setCallToActionView(View view) {
        m3311b("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.mo2952L2(new ObjectWrapper(view));
        } catch (RemoteException e) {
            zzo.m3071d("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(View view) {
        m3311b("3001", view);
    }

    public final void setIconView(View view) {
        m3311b("3003", view);
    }

    public final void setImageView(View view) {
        m3311b("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        m3311b("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        zzb zzbVar = new zzb(this);
        synchronized (mediaView) {
            mediaView.f3754u = zzbVar;
            if (mediaView.f3753t) {
                zzbVar.m3313a(mediaView.f3752s);
            }
        }
        zzblz zzblzVar = new zzblz() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzblz
            /* JADX INFO: renamed from: a */
            public final void mo3312a(ImageView.ScaleType scaleType) {
                zzbmp zzbmpVar = this.f3778a.f3777t;
                if (zzbmpVar == null || scaleType == null) {
                    return;
                }
                try {
                    zzbmpVar.mo2959z1(new ObjectWrapper(scaleType));
                } catch (RemoteException e) {
                    zzo.m3071d("Unable to call setMediaViewImageScaleType on delegate", e);
                }
            }
        };
        synchronized (mediaView) {
            mediaView.f3757x = zzblzVar;
            if (mediaView.f3756w) {
                zzblzVar.mo3312a(mediaView.f3755v);
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbmp zzbmpVar = this.f3777t;
        if (zzbmpVar == null) {
            return;
        }
        try {
            zzbmpVar.mo2957p3(nativeAd.mo3308d());
        } catch (RemoteException e) {
            zzo.m3071d("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(View view) {
        m3311b("3007", view);
    }

    public final void setStarRatingView(View view) {
        m3311b("3009", view);
    }

    public final void setStoreView(View view) {
        m3311b("3006", view);
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f3776s = frameLayout;
        this.f3777t = isInEditMode() ? null : zzay.f3085g.f3087b.m2805e(frameLayout.getContext(), this, frameLayout);
    }
}
