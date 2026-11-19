package androidx.core.os;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.os.ProfilingManager;

/* JADX INFO: renamed from: androidx.core.os.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1196a {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder m2243b() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome m2249h(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ GetAdSelectionDataRequest.Builder m2250i() {
        return new GetAdSelectionDataRequest.Builder();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ PersistAdSelectionResultRequest.Builder m2254m() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ ProfilingManager m2260s(Object obj) {
        return (ProfilingManager) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ Class m2261t() {
        return ProfilingManager.class;
    }
}
