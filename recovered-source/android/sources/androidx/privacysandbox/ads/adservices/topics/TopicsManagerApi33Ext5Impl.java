package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.measurement.AbstractC1632b;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext5Impl(Context context) {
        AbstractC6452k.m12181e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC1632b.m2637u());
        AbstractC6452k.m12180d(systemService, "context.getSystemService…opicsManager::class.java)");
        super(AbstractC1632b.m2636t(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest request) {
        AbstractC6452k.m12181e(request, "request");
        return GetTopicsRequestHelper.INSTANCE.convertRequestWithRecordObservation$ads_adservices_release(request);
    }
}
