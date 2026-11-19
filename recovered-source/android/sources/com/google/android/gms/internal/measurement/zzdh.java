package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdh extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f22368w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f22369x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Bundle f22370y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ zzez f22371z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzez zzezVar, String str, String str2, Bundle bundle) {
        super(zzezVar, true);
        this.f22368w = str;
        this.f22369x = str2;
        this.f22370y = bundle;
        Objects.requireNonNull(zzezVar);
        this.f22371z = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVar = this.f22371z.f22483h;
        Preconditions.m3544h(zzcpVar);
        zzcpVar.clearConditionalUserProperty(this.f22368w, this.f22369x, this.f22370y);
    }
}
