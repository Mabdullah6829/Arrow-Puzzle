package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzek extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Intent f22438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ zzez f22439x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzek(zzez zzezVar, Intent intent) {
        super(zzezVar, true);
        this.f22438w = intent;
        Objects.requireNonNull(zzezVar);
        this.f22439x = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22439x.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.setSgtmDebugInfo(this.f22438w);
    }
}
