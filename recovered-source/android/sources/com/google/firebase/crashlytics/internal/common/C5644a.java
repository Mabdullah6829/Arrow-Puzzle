package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5644a implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23588a;

    public /* synthetic */ C5644a(int i2) {
        this.f23588a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f23588a) {
            case 0:
                return CrashlyticsAppQualitySessionsStore.lambda$static$0(file, str);
            default:
                return CrashlyticsController.lambda$static$0(file, str);
        }
    }
}
