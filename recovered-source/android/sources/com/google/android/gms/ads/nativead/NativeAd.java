package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbys;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAd {

    public static abstract class AdChoicesInfo {
    }

    public static abstract class Image {
    }

    public interface OnNativeAdLoadedListener {
        /* JADX INFO: renamed from: a */
        void mo3309a(zzbys zzbysVar);
    }

    public interface UnconfirmedClickListener {
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo3305a();

    /* JADX INFO: renamed from: b */
    public abstract String mo3306b();

    /* JADX INFO: renamed from: c */
    public abstract ResponseInfo mo3307c();

    /* JADX INFO: renamed from: d */
    public abstract IObjectWrapper mo3308d();

    public abstract void recordEvent(Bundle bundle);
}
