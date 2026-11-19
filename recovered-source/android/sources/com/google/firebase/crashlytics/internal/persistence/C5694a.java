package com.google.firebase.crashlytics.internal.persistence;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.persistence.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5694a implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23631a;

    public /* synthetic */ C5694a(int i2) {
        this.f23631a = i2;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f23631a) {
            case 0:
                return CrashlyticsReportPersistence.lambda$static$1(file, str);
            default:
                return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str);
        }
    }
}
