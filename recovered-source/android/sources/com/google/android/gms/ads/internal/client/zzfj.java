package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj extends zzcx {

    /* JADX INFO: renamed from: s */
    public zzbsd f3186s;

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: C1 */
    public final void mo2898C1(zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: M2 */
    public final void mo2891M2(zzbvj zzbvjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: V */
    public final void mo2899V(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: W0 */
    public final void mo2892W0(zzbsd zzbsdVar) {
        this.f3186s = zzbsdVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: X2 */
    public final void mo2893X2(zzfr zzfrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: a */
    public final void mo2894a() {
        com.google.android.gms.ads.internal.util.client.zzo.m3070c("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.f3409b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbsd zzbsdVar = this.f3185s.f3186s;
                if (zzbsdVar != null) {
                    try {
                        zzbsdVar.mo2942i3(Collections.EMPTY_LIST);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3074g("Could not notify onComplete event.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: c0 */
    public final void mo2895c0(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: c3 */
    public final void mo2900c3(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: e */
    public final String mo2901e() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: f */
    public final List mo2896f() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: h */
    public final void mo2902h() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: i0 */
    public final void mo2903i0(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: q1 */
    public final void mo2904q1(IObjectWrapper iObjectWrapper, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: w1 */
    public final void mo2905w1(float f2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: z */
    public final void mo2897z() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    /* JADX INFO: renamed from: H0 */
    public final void mo2890H0(IObjectWrapper iObjectWrapper, String str) {
    }
}
