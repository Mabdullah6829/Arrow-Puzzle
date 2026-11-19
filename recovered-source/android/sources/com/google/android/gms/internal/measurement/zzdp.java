package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
final class zzdp extends zzeo {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Context f22389w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Bundle f22390x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ zzez f22391y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzez zzezVar, Context context, Bundle bundle) {
        super(zzezVar, true);
        this.f22389w = context;
        this.f22390x = bundle;
        this.f22391y = zzezVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeo
    /* JADX INFO: renamed from: a */
    public final void mo9837a() {
        zzcp zzcpVarAsInterface;
        try {
            Context context = this.f22389w;
            Preconditions.m3544h(context);
            com.google.firebase.analytics.zzg.zza().zzb();
            String strZza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strZza)) {
                strZza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            }
            Boolean boolZzc = com.google.android.gms.measurement.internal.zzhu.zzc("google_analytics_force_disable_updates", resources, strZza);
            zzez zzezVar = this.f22391y;
            boolean z = boolZzc == null || !boolZzc.booleanValue();
            zzezVar.getClass();
            try {
                zzcpVarAsInterface = zzco.asInterface(DynamiteModule.m3700c(context, z ? DynamiteModule.f4719d : DynamiteModule.f4718c, ModuleDescriptor.MODULE_ID).m3706b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e) {
                zzezVar.m9861m(e, true, false);
                zzcpVarAsInterface = null;
            }
            zzezVar.f22483h = zzcpVarAsInterface;
            if (zzezVar.f22483h == null) {
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int iM3699a = DynamiteModule.m3699a(context, ModuleDescriptor.MODULE_ID);
            int iM3701d = DynamiteModule.m3701d(context, ModuleDescriptor.MODULE_ID, false);
            int iMax = Math.max(iM3699a, iM3701d);
            boolean z2 = Boolean.TRUE.equals(boolZzc) || iM3701d < iM3699a;
            long j2 = iMax;
            zzezVar.f22484i = j2;
            zzdb zzdbVar = new zzdb(161000L, j2, z2, this.f22390x, com.google.android.gms.measurement.internal.zzhu.zza(context));
            if (zzezVar.f22484i >= 169) {
                zzcp zzcpVar = zzezVar.f22483h;
                Preconditions.m3544h(zzcpVar);
                zzcpVar.initializeWithElapsedTime(new ObjectWrapper(context), zzdbVar, this.f22452s, this.f22453t);
            } else {
                zzcp zzcpVar2 = zzezVar.f22483h;
                Preconditions.m3544h(zzcpVar2);
                zzcpVar2.initialize(new ObjectWrapper(context), zzdbVar, this.f22452s);
            }
        } catch (Exception e2) {
            this.f22391y.m9861m(e2, true, false);
        }
    }
}
