package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5645b implements Comparator {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23589s;

    public /* synthetic */ C5645b(int i2) {
        this.f23589s = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23589s) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.lambda$static$1((File) obj, (File) obj2);
            default:
                return SessionReportingCoordinator.lambda$getSortedCustomAttributes$1((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
        }
    }
}
