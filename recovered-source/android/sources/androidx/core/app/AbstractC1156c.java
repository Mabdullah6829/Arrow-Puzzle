package androidx.core.app;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.adservices.adselection.ReportImpressionRequest;

/* JADX INFO: renamed from: androidx.core.app.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1156c {
    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m1992D() {
        return AdSelectionManager.class;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AdId m1995c(Object obj) {
        return (AdId) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ AdIdManager m1997e(Object obj) {
        return (AdIdManager) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AdSelectionConfig.Builder m1998f() {
        return new AdSelectionConfig.Builder();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ AdSelectionManager m2006n(Object obj) {
        return (AdSelectionManager) obj;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ AdSelectionOutcome m2007o(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ReportImpressionRequest m2008p(long j2, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j2, adSelectionConfig);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ Class m2011s() {
        return AdIdManager.class;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m2013u() {
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m2018z(Object obj) {
    }
}
