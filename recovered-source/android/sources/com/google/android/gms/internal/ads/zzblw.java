package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblw extends zzbmk {

    /* JADX INFO: renamed from: s */
    public final Drawable f9152s;

    /* JADX INFO: renamed from: t */
    public final Uri f9153t;

    /* JADX INFO: renamed from: u */
    public final double f9154u;

    /* JADX INFO: renamed from: v */
    public final int f9155v;

    /* JADX INFO: renamed from: w */
    public final int f9156w;

    /* JADX INFO: renamed from: x */
    public final Map f9157x;

    public zzblw(Drawable drawable, Uri uri, double d, int i2, int i3, HashMap map) {
        this.f9152s = drawable;
        this.f9153t = uri;
        this.f9154u = d;
        this.f9155v = i2;
        this.f9156w = i3;
        this.f9157x = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: a */
    public final int mo5058a() {
        return this.f9155v;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: b */
    public final int mo5059b() {
        return this.f9156w;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: c */
    public final Map mo5060c() {
        return this.f9157x;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    /* JADX INFO: renamed from: d */
    public final double mo5061d() {
        return this.f9154u;
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final IObjectWrapper zzb() {
        return new ObjectWrapper(this.f9152s);
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final Uri zzc() {
        return this.f9153t;
    }
}
