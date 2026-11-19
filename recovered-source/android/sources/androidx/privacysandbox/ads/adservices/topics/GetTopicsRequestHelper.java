package androidx.privacysandbox.ads.adservices.topics;

import androidx.privacysandbox.ads.adservices.measurement.AbstractC1632b;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class GetTopicsRequestHelper {
    public static final GetTopicsRequestHelper INSTANCE = new GetTopicsRequestHelper();

    private GetTopicsRequestHelper() {
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        AbstractC6452k.m12181e(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = AbstractC1632b.m2629m().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.shouldRecordObservation()).build();
        AbstractC6452k.m12180d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(GetTopicsRequest request) {
        AbstractC6452k.m12181e(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = AbstractC1632b.m2629m().setAdsSdkName(request.getAdsSdkName()).build();
        AbstractC6452k.m12180d(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}
