package androidx.privacysandbox.ads.adservices.adselection;

import android.util.Log;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext8OptIn
public final class ReportEventRequest {
    public static final Companion Companion = new Companion(null);
    public static final int FLAG_REPORTING_DESTINATION_BUYER = 2;
    public static final int FLAG_REPORTING_DESTINATION_SELLER = 1;
    private final long adSelectionId;
    private final String eventData;
    private final String eventKey;
    private final InputEvent inputEvent;
    private final int reportingDestinations;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                AbstractC6452k.m12181e(request, "request");
                AbstractC1610a.m2517v();
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = AbstractC1610a.m2496a(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).setInputEvent(request.getInputEvent()).build();
                AbstractC6452k.m12180d(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.ReportEventRequest convertReportEventRequest(ReportEventRequest request) {
                AbstractC6452k.m12181e(request, "request");
                if (request.getInputEvent() != null) {
                    Log.w("ReportEventRequest", "inputEvent is ignored. Min version to use inputEvent is API 31 ext 10");
                }
                AbstractC1610a.m2517v();
                android.adservices.adselection.ReportEventRequest reportEventRequestBuild = AbstractC1610a.m2496a(request.getAdSelectionId(), request.getEventKey(), request.getEventData(), request.getReportingDestinations()).build();
                AbstractC6452k.m12180d(reportEventRequestBuild, "Builder(\n               …                 .build()");
                return reportEventRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext8Impl() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ReportingDestination {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReportEventRequest(long j2, String eventKey, String eventData, int i2) {
        this(j2, eventKey, eventData, i2, null, 16, null);
        AbstractC6452k.m12181e(eventKey, "eventKey");
        AbstractC6452k.m12181e(eventData, "eventData");
    }

    @ExperimentalFeatures.Ext10OptIn
    public static /* synthetic */ void getInputEvent$annotations() {
    }

    public final android.adservices.adselection.ReportEventRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) ? Ext10Impl.Companion.convertReportEventRequest(this) : Ext8Impl.Companion.convertReportEventRequest(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportEventRequest)) {
            return false;
        }
        ReportEventRequest reportEventRequest = (ReportEventRequest) obj;
        return this.adSelectionId == reportEventRequest.adSelectionId && AbstractC6452k.m12177a(this.eventKey, reportEventRequest.eventKey) && AbstractC6452k.m12177a(this.eventData, reportEventRequest.eventData) && this.reportingDestinations == reportEventRequest.reportingDestinations && AbstractC6452k.m12177a(this.inputEvent, reportEventRequest.inputEvent);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final String getEventData() {
        return this.eventData;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final InputEvent getInputEvent() {
        return this.inputEvent;
    }

    public final int getReportingDestinations() {
        return this.reportingDestinations;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.reportingDestinations) + ((this.eventData.hashCode() + ((this.eventKey.hashCode() + (Long.hashCode(this.adSelectionId) * 31)) * 31)) * 31)) * 31;
        InputEvent inputEvent = this.inputEvent;
        return iHashCode + (inputEvent != null ? inputEvent.hashCode() : 0);
    }

    public String toString() {
        return "ReportEventRequest: adSelectionId=" + this.adSelectionId + ", eventKey=" + this.eventKey + ", eventData=" + this.eventData + ", reportingDestinations=" + this.reportingDestinations + "inputEvent=" + this.inputEvent;
    }

    public ReportEventRequest(long j2, String eventKey, String eventData, int i2, InputEvent inputEvent) {
        AbstractC6452k.m12181e(eventKey, "eventKey");
        AbstractC6452k.m12181e(eventData, "eventData");
        this.adSelectionId = j2;
        this.eventKey = eventKey;
        this.eventData = eventData;
        this.reportingDestinations = i2;
        this.inputEvent = inputEvent;
        if (i2 <= 0 || i2 > 3) {
            throw new IllegalArgumentException("Invalid reporting destinations bitfield.");
        }
    }

    public /* synthetic */ ReportEventRequest(long j2, String str, String str2, int i2, InputEvent inputEvent, int i3, AbstractC6447f abstractC6447f) {
        this(j2, str, str2, i2, (i3 & 16) != 0 ? null : inputEvent);
    }
}
