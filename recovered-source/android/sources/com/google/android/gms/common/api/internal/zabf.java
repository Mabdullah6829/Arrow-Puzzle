package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zabf implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GoogleApiManager f4285a;

    public zabf(GoogleApiManager googleApiManager) {
        this.f4285a = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        GoogleApiManager googleApiManager = this.f4285a;
        googleApiManager.f4244F.sendMessage(googleApiManager.f4244F.obtainMessage(1, boolValueOf));
    }
}
