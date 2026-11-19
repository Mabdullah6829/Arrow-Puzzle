package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzctg implements zzddu {

    /* JADX INFO: renamed from: s */
    public final zzfme f11359s;

    public zzctg(zzfme zzfmeVar) {
        this.f11359s = zzfmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: d */
    public final void mo5818d(Context context) {
        try {
            try {
                this.f11359s.f16105a.zzi();
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } catch (zzfln e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: j */
    public final void mo5819j(Context context) {
        try {
            try {
                this.f11359s.f16105a.zzl();
            } catch (Throwable th) {
                throw new zzfln(th);
            }
        } catch (zzfln e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    /* JADX INFO: renamed from: m */
    public final void mo5820m(Context context) {
        try {
            try {
                zzbvm zzbvmVar = this.f11359s.f16105a;
                zzbvmVar.mo5174e();
                if (context != null) {
                    try {
                        zzbvmVar.mo5169W(new ObjectWrapper(context));
                    } catch (Throwable th) {
                        throw new zzfln(th);
                    }
                }
            } catch (Throwable th2) {
                throw new zzfln(th2);
            }
        } catch (zzfln e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
