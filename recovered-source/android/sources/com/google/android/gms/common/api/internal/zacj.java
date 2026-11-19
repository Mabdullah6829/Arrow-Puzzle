package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zacj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zacm f4338s;

    public zacj(zacm zacmVar) {
        Objects.requireNonNull(zacmVar);
        this.f4338s = zacmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4338s.f4348y.mo3512b(new ConnectionResult(null, null, 4));
    }
}
