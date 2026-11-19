package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class TrustedBiddingData {
    private final List<String> trustedBiddingKeys;
    private final Uri trustedBiddingUri;

    public TrustedBiddingData(Uri trustedBiddingUri, List<String> trustedBiddingKeys) {
        AbstractC6452k.m12181e(trustedBiddingUri, "trustedBiddingUri");
        AbstractC6452k.m12181e(trustedBiddingKeys, "trustedBiddingKeys");
        this.trustedBiddingUri = trustedBiddingUri;
        this.trustedBiddingKeys = trustedBiddingKeys;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        return AbstractC6452k.m12177a(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && AbstractC6452k.m12177a(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys);
    }

    public final List<String> getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public int hashCode() {
        return this.trustedBiddingKeys.hashCode() + (this.trustedBiddingUri.hashCode() * 31);
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
