package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzedx {

    /* JADX INFO: renamed from: a */
    public AdRequest f13712a;

    /* JADX INFO: renamed from: b */
    public NativeAdOptions f13713b;

    /* JADX INFO: renamed from: c */
    public VideoOptions f13714c;

    /* JADX INFO: renamed from: d */
    public AdSize f13715d = AdSize.f2946i;

    /* JADX INFO: renamed from: e */
    public String f13716e = "";

    /* JADX INFO: renamed from: f */
    public String f13717f = "";

    /* JADX INFO: renamed from: g */
    public boolean f13718g = false;

    public zzedx() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.f13712a = new AdRequest((AdRequest.Builder) new AdRequest.Builder().m2741b(bundle));
    }
}
