package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public class zzaz extends AdListener {

    /* JADX INFO: renamed from: s */
    public final Object f3092s = new Object();

    /* JADX INFO: renamed from: t */
    public AdListener f3093t;

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: b */
    public final void mo2725b() {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2725b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: c */
    public void mo2726c(LoadAdError loadAdError) {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2726c(loadAdError);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: d */
    public final void mo2739d() {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2739d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: e */
    public void mo2727e() {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2727e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    /* JADX INFO: renamed from: g */
    public final void mo2728g() {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2728g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        synchronized (this.f3092s) {
            try {
                AdListener adListener = this.f3093t;
                if (adListener != null) {
                    adListener.mo2730k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
