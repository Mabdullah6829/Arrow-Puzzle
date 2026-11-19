package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzduo extends zzbnb {

    /* JADX INFO: renamed from: s */
    public final Context f13003s;

    /* JADX INFO: renamed from: t */
    public final zzdqb f13004t;

    /* JADX INFO: renamed from: u */
    public zzdra f13005u;

    /* JADX INFO: renamed from: v */
    public zzdpw f13006v;

    public zzduo(Context context, zzdqb zzdqbVar, zzdra zzdraVar, zzdpw zzdpwVar) {
        this.f13003s = context;
        this.f13004t = zzdqbVar;
        this.f13005u = zzdraVar;
        this.f13006v = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: B2 */
    public final IObjectWrapper mo5069B2() {
        return new ObjectWrapper(this.f13003s);
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: N */
    public final boolean mo5070N(IObjectWrapper iObjectWrapper) {
        zzdra zzdraVar;
        Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapper);
        if (!(objM3697u0 instanceof ViewGroup) || (zzdraVar = this.f13005u) == null || !zzdraVar.m6038c((ViewGroup) objM3697u0, true)) {
            return false;
        }
        this.f13004t.m6005h().mo5580I0(new zzdun(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    /* JADX INFO: renamed from: T */
    public final boolean mo5071T(IObjectWrapper iObjectWrapper) {
        zzdra zzdraVar;
        Object objM3697u0 = ObjectWrapper.m3697u0(iObjectWrapper);
        if (!(objM3697u0 instanceof ViewGroup) || (zzdraVar = this.f13005u) == null || !zzdraVar.m6038c((ViewGroup) objM3697u0, false)) {
            return false;
        }
        this.f13004t.m6006i().mo5580I0(new zzdun(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnc
    public final String zzh() {
        return this.f13004t.m6004g();
    }
}
