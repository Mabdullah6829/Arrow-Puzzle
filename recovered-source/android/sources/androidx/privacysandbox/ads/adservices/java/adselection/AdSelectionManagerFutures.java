package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest;
import androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportEventRequest;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.adselection.UpdateAdCounterHistogramRequest;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdSelectionManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AdSelectionManagerFutures from(Context context) {
            AbstractC6452k.m12181e(context, "context");
            AdSelectionManager adSelectionManagerObtain = AdSelectionManager.Companion.obtain(context);
            if (adSelectionManagerObtain != null) {
                return new Api33Ext4JavaImpl(adSelectionManagerObtain);
            }
            return null;
        }

        private Companion() {
        }
    }

    public static final AdSelectionManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @ExperimentalFeatures.Ext10OptIn
    public abstract ListenableFuture getAdSelectionDataAsync(GetAdSelectionDataRequest getAdSelectionDataRequest);

    @ExperimentalFeatures.Ext10OptIn
    public abstract ListenableFuture persistAdSelectionResultAsync(PersistAdSelectionResultRequest persistAdSelectionResultRequest);

    @ExperimentalFeatures.Ext8OptIn
    public abstract ListenableFuture reportEventAsync(ReportEventRequest reportEventRequest);

    public abstract ListenableFuture reportImpressionAsync(ReportImpressionRequest reportImpressionRequest);

    public abstract ListenableFuture selectAdsAsync(AdSelectionConfig adSelectionConfig);

    @ExperimentalFeatures.Ext10OptIn
    public abstract ListenableFuture selectAdsAsync(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig);

    @ExperimentalFeatures.Ext8OptIn
    public abstract ListenableFuture updateAdCounterHistogramAsync(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest);

    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture getAdSelectionDataAsync(GetAdSelectionDataRequest getAdSelectionDataRequest) {
            AbstractC6452k.m12181e(getAdSelectionDataRequest, "getAdSelectionDataRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1615x63036bbf(this, getAdSelectionDataRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture persistAdSelectionResultAsync(PersistAdSelectionResultRequest persistAdSelectionResultRequest) {
            AbstractC6452k.m12181e(persistAdSelectionResultRequest, "persistAdSelectionResultRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1616xcfbf2aea(this, persistAdSelectionResultRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture reportEventAsync(ReportEventRequest reportEventRequest) {
            AbstractC6452k.m12181e(reportEventRequest, "reportEventRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportEventAsync$1(this, reportEventRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture reportImpressionAsync(ReportImpressionRequest reportImpressionRequest) {
            AbstractC6452k.m12181e(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1617x3453cbdf(this, reportImpressionRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture selectAdsAsync(AdSelectionConfig adSelectionConfig) {
            AbstractC6452k.m12181e(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture updateAdCounterHistogramAsync(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest) {
            AbstractC6452k.m12181e(updateAdCounterHistogramRequest, "updateAdCounterHistogramRequest");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new C1618x64bcb5a8(this, updateAdCounterHistogramRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        public ListenableFuture selectAdsAsync(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig) {
            AbstractC6452k.m12181e(adSelectionFromOutcomesConfig, "adSelectionFromOutcomesConfig");
            return CoroutineAdapterKt.asListenableFuture$default(AbstractC0069y.m103b(AbstractC0069y.m102a(AbstractC0007H.f4a), new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$2(this, adSelectionFromOutcomesConfig, null), 3), null, 1, null);
        }
    }
}
