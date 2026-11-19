package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* JADX INFO: loaded from: classes.dex */
public interface zae extends IInterface {
    /* JADX INFO: renamed from: T1 */
    void mo3617T1(Status status, ModuleInstallResponse moduleInstallResponse);

    /* JADX INFO: renamed from: V0 */
    void mo3618V0(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    /* JADX INFO: renamed from: e1 */
    void mo3619e1(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);

    /* JADX INFO: renamed from: r1 */
    void mo3620r1(Status status);
}
