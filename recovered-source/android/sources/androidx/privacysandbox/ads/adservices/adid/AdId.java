package androidx.privacysandbox.ads.adservices.adid;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdId {
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(String adId, boolean z) {
        AbstractC6452k.m12181e(adId, "adId");
        this.adId = adId;
        this.isLimitAdTrackingEnabled = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return AbstractC6452k.m12177a(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled;
    }

    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLimitAdTrackingEnabled) + (this.adId.hashCode() * 31);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }

    public /* synthetic */ AdId(String str, boolean z, int i2, AbstractC6447f abstractC6447f) {
        this(str, (i2 & 2) != 0 ? false : z);
    }
}
