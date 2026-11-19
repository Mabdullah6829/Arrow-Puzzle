package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.customaudience.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1613a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ android.adservices.customaudience.CustomAudience.Builder m2556a() {
        return new android.adservices.customaudience.CustomAudience.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ android.adservices.customaudience.JoinCustomAudienceRequest.Builder m2558c() {
        return new android.adservices.customaudience.JoinCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ DeletionRequest.Builder m2565j() {
        return new DeletionRequest.Builder();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ MeasurementManager m2571p(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ Class m2574s() {
        return MeasurementManager.class;
    }
}
