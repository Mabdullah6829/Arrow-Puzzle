package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    /* JADX INFO: renamed from: u */
    public final boolean mo3465u(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            Status status = (Status) com.google.android.gms.internal.base.zac.m9077a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.m9077a(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.m9080d(parcel);
            mo3619e1(status, moduleAvailabilityResponse);
            return true;
        }
        if (i2 == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.zac.m9077a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.zac.m9077a(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.m9080d(parcel);
            mo3617T1(status2, moduleInstallResponse);
            return true;
        }
        if (i2 == 3) {
            Status status3 = (Status) com.google.android.gms.internal.base.zac.m9077a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.m9077a(parcel, ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.zac.m9080d(parcel);
            mo3618V0(status3, moduleInstallIntentResponse);
            return true;
        }
        if (i2 != 4) {
            return false;
        }
        Status status4 = (Status) com.google.android.gms.internal.base.zac.m9077a(parcel, Status.CREATOR);
        com.google.android.gms.internal.base.zac.m9080d(parcel);
        mo3620r1(status4);
        return true;
    }
}
