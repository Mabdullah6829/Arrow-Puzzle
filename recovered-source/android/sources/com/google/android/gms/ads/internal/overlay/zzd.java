package com.google.android.gms.ads.internal.overlay;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzm f3331s;

    public zzd(zzm zzmVar) {
        this.f3331s = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.f3331s;
        zzmVar.f3360P = 2;
        zzmVar.f3361t.finish();
    }
}
