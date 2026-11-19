package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbnc;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: s */
    public MediaContent f3752s;

    /* JADX INFO: renamed from: t */
    public boolean f3753t;

    /* JADX INFO: renamed from: u */
    public zzblx f3754u;

    /* JADX INFO: renamed from: v */
    public ImageView.ScaleType f3755v;

    /* JADX INFO: renamed from: w */
    public boolean f3756w;

    /* JADX INFO: renamed from: x */
    public zzblz f3757x;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaContent getMediaContent() {
        return this.f3752s;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f3756w = true;
        this.f3755v = scaleType;
        zzblz zzblzVar = this.f3757x;
        if (zzblzVar != null) {
            zzblzVar.mo3312a(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zMo5071T;
        this.f3753t = true;
        this.f3752s = mediaContent;
        zzblx zzblxVar = this.f3754u;
        if (zzblxVar != null) {
            ((zzb) zzblxVar).m3313a(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnc zzbncVarZzb = mediaContent.zzb();
            if (zzbncVarZzb != null) {
                if (!mediaContent.mo2757a()) {
                    if (mediaContent.zza()) {
                        zMo5071T = zzbncVarZzb.mo5071T(new ObjectWrapper(this));
                    }
                    removeAllViews();
                }
                zMo5071T = zzbncVarZzb.mo5070N(new ObjectWrapper(this));
                if (zMo5071T) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.m3071d("", e);
        }
    }
}
