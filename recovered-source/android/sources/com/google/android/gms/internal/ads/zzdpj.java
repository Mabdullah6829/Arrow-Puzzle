package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdpj extends zzbmh {

    /* JADX INFO: renamed from: s */
    public final zzdqb f12534s;

    /* JADX INFO: renamed from: t */
    public IObjectWrapper f12535t;

    public zzdpj(zzdqb zzdqbVar) {
        this.f12534s = zzdqbVar;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m5976k4(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.m3697u0(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    /* JADX INFO: renamed from: c */
    public final IObjectWrapper mo5065c() {
        IObjectWrapper iObjectWrapper = this.f12535t;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbml zzbmlVarM5999b = this.f12534s.m5999b();
        if (zzbmlVarM5999b == null) {
            return null;
        }
        return zzbmlVarM5999b.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final com.google.android.gms.ads.internal.client.zzea zzj() {
        return this.f12534s.m6012r();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzk() {
        return this.f12534s.m6012r() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzl() {
        zzclb zzclbVar;
        zzdqb zzdqbVar = this.f12534s;
        synchronized (zzdqbVar) {
            zzclbVar = zzdqbVar.f12619j;
        }
        return zzclbVar != null;
    }
}
