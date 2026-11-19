package androidx.privacysandbox.ads.adservices.adselection;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext8OptIn
public final class UpdateAdCounterHistogramRequest {
    private final int adEventType;
    private final long adSelectionId;
    private final AdTechIdentifier callerAdTech;

    public UpdateAdCounterHistogramRequest(long j2, int i2, AdTechIdentifier callerAdTech) {
        AbstractC6452k.m12181e(callerAdTech, "callerAdTech");
        this.adSelectionId = j2;
        this.adEventType = i2;
        this.callerAdTech = callerAdTech;
        if (i2 == 0) {
            throw new IllegalArgumentException("Win event types cannot be manually updated.");
        }
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            throw new IllegalArgumentException("Ad event type must be one of AD_EVENT_TYPE_IMPRESSION, AD_EVENT_TYPE_VIEW, or AD_EVENT_TYPE_CLICK");
        }
    }

    public final android.adservices.adselection.UpdateAdCounterHistogramRequest convertToAdServices$ads_adservices_release() {
        AbstractC1610a.m2521z();
        android.adservices.adselection.UpdateAdCounterHistogramRequest updateAdCounterHistogramRequestBuild = AbstractC1610a.m2499d(this.adSelectionId, this.adEventType, this.callerAdTech.convertToAdServices$ads_adservices_release()).build();
        AbstractC6452k.m12180d(updateAdCounterHistogramRequestBuild, "Builder(\n               …   )\n            .build()");
        return updateAdCounterHistogramRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateAdCounterHistogramRequest)) {
            return false;
        }
        UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest = (UpdateAdCounterHistogramRequest) obj;
        return this.adSelectionId == updateAdCounterHistogramRequest.adSelectionId && this.adEventType == updateAdCounterHistogramRequest.adEventType && AbstractC6452k.m12177a(this.callerAdTech, updateAdCounterHistogramRequest.callerAdTech);
    }

    public final int getAdEventType() {
        return this.adEventType;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final AdTechIdentifier getCallerAdTech() {
        return this.callerAdTech;
    }

    public int hashCode() {
        return this.callerAdTech.hashCode() + ((Integer.hashCode(this.adEventType) + (Long.hashCode(this.adSelectionId) * 31)) * 31);
    }

    public String toString() {
        String str;
        int i2 = this.adEventType;
        if (i2 == 0) {
            str = "AD_EVENT_TYPE_WIN";
        } else if (i2 == 1) {
            str = "AD_EVENT_TYPE_IMPRESSION";
        } else if (i2 != 2) {
            str = i2 != 3 ? "Invalid ad event type" : "AD_EVENT_TYPE_CLICK";
        } else {
            str = "AD_EVENT_TYPE_VIEW";
        }
        return "UpdateAdCounterHistogramRequest: adSelectionId=" + this.adSelectionId + ", adEventType=" + str + ", callerAdTech=" + this.callerAdTech;
    }
}
