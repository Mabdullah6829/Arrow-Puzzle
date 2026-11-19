package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.C5133a;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwq extends zzbvx {

    /* JADX INFO: renamed from: s */
    public final UnifiedNativeAdMapper f9473s;

    public zzbwq(C5133a c5133a) {
        this.f9473s = c5133a;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: A3 */
    public final Bundle mo5209A3() {
        return this.f9473s.f3742l;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: B */
    public final void mo5210B() {
        this.f9473s.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: C */
    public final float mo5211C() {
        this.f9473s.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: F1 */
    public final boolean mo5212F1() {
        return this.f9473s.f3744n;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: G1 */
    public final void mo5213G1(IObjectWrapper iObjectWrapper) {
        this.f9473s.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: W */
    public final void mo5214W(IObjectWrapper iObjectWrapper) {
        this.f9473s.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: X0 */
    public final void mo5215X0(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f9473s.mo2724a((View) ObjectWrapper.m3697u0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: a */
    public final String mo5216a() {
        return this.f9473s.f3731a;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: b */
    public final List mo5217b() {
        List<NativeAd.Image> list = this.f9473s.f3732b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (NativeAd.Image image : list) {
                arrayList.add(new zzblw(image.mo2769a(), image.mo2771c(), image.mo2770b(), image.mo2772d(), image.mo2773e(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: c */
    public final String mo5218c() {
        return this.f9473s.f3733c;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: e */
    public final String mo5219e() {
        return this.f9473s.f3739i;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: f */
    public final IObjectWrapper mo5220f() {
        this.f9473s.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: g */
    public final com.google.android.gms.ads.internal.client.zzea mo5221g() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        VideoController videoController = this.f9473s.f3740j;
        if (videoController == null) {
            return null;
        }
        synchronized (videoController.f2982a) {
            zzeaVar = videoController.f2983b;
        }
        return zzeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: i */
    public final IObjectWrapper mo5222i() {
        this.f9473s.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: j */
    public final zzbme mo5223j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: n */
    public final IObjectWrapper mo5224n() {
        Object obj = this.f9473s.f3741k;
        if (obj == null) {
            return null;
        }
        return new ObjectWrapper(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: r */
    public final boolean mo5225r() {
        return this.f9473s.f3743m;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: t */
    public final float mo5226t() {
        this.f9473s.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: v */
    public final void mo5227v() {
        this.f9473s.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    /* JADX INFO: renamed from: x */
    public final float mo5228x() {
        this.f9473s.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbml zzh() {
        NativeAd.Image image = this.f9473s.f3734d;
        if (image != null) {
            return new zzblw(image.mo2769a(), image.mo2771c(), image.mo2770b(), image.mo2772d(), image.mo2773e(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzi() {
        return this.f9473s.f3735e;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzj() {
        return this.f9473s.f3736f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final double zzk() {
        Double d = this.f9473s.f3737g;
        if (d != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzl() {
        return this.f9473s.f3738h;
    }
}
