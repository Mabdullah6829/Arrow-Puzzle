package androidx.privacysandbox.ads.adservices.adselection;

import androidx.core.app.AbstractC1156c;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class ReportImpressionRequest {
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest request) {
                AbstractC6452k.m12181e(request, "request");
                if (AbstractC6452k.m12177a(request.getAdSelectionConfig(), AdSelectionConfig.Companion.getEMPTY())) {
                    AbstractC1156c.m2013u();
                    return AbstractC1610a.m2498c(request.getAdSelectionId());
                }
                AbstractC1156c.m2013u();
                return AbstractC1156c.m2008p(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext4Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest request) {
                AbstractC6452k.m12181e(request, "request");
                if (AbstractC6452k.m12177a(request.getAdSelectionConfig(), AdSelectionConfig.Companion.getEMPTY())) {
                    throw new UnsupportedOperationException("adSelectionConfig is mandatory forAPI versions lower than ext 10");
                }
                AbstractC1156c.m2013u();
                return AbstractC1156c.m2008p(request.getAdSelectionId(), request.getAdSelectionConfig().convertToAdServices$ads_adservices_release());
            }

            private Companion() {
            }
        }

        private Ext4Impl() {
        }
    }

    public ReportImpressionRequest(long j2, AdSelectionConfig adSelectionConfig) {
        AbstractC6452k.m12181e(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j2;
        this.adSelectionConfig = adSelectionConfig;
    }

    public final android.adservices.adselection.ReportImpressionRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) ? Ext10Impl.Companion.convertReportImpressionRequest(this) : Ext4Impl.Companion.convertReportImpressionRequest(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        return this.adSelectionId == reportImpressionRequest.adSelectionId && AbstractC6452k.m12177a(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig);
    }

    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public int hashCode() {
        return this.adSelectionConfig.hashCode() + (Long.hashCode(this.adSelectionId) * 31);
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }

    @ExperimentalFeatures.Ext8OptIn
    public ReportImpressionRequest(long j2) {
        this(j2, AdSelectionConfig.Companion.getEMPTY());
    }
}
