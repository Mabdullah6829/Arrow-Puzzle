package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.common.AdFilters;
import android.adservices.common.AdTechIdentifier;
import android.adservices.common.FrequencyCapFilters;
import android.adservices.common.KeyedFrequencyCap;
import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.net.Uri;
import java.time.Duration;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1610a {
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m2493B() {
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2495D() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ android.adservices.adselection.ReportEventRequest.Builder m2496a(long j2, String str, String str2, int i2) {
        return new android.adservices.adselection.ReportEventRequest.Builder(j2, str, str2, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ android.adservices.adselection.ReportImpressionRequest m2498c(long j2) {
        return new android.adservices.adselection.ReportImpressionRequest(j2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder m2499d(long j2, int i2, AdTechIdentifier adTechIdentifier) {
        return new android.adservices.adselection.UpdateAdCounterHistogramRequest.Builder(j2, i2, adTechIdentifier);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AdFilters.Builder m2504i() {
        return new AdFilters.Builder();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ FrequencyCapFilters.Builder m2507l() {
        return new FrequencyCapFilters.Builder();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ KeyedFrequencyCap.Builder m2510o(int i2, int i3, Duration duration) {
        return new KeyedFrequencyCap.Builder(i2, i3, duration);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder m2515t(Uri uri) {
        return new FetchAndJoinCustomAudienceRequest.Builder(uri);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m2517v() {
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m2521z() {
    }
}
