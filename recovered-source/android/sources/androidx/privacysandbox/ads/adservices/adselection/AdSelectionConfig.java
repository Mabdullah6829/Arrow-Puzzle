package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.core.app.AbstractC1156c;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.C6313u;
import p058e0.C6314v;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionConfig {
    public static final Companion Companion = new Companion(null);
    private static final AdSelectionConfig EMPTY;
    private final AdSelectionSignals adSelectionSignals;
    private final List<AdTechIdentifier> customAudienceBuyers;
    private final Uri decisionLogicUri;
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;
    private final AdTechIdentifier seller;
    private final AdSelectionSignals sellerSignals;
    private final Uri trustedScoringSignalsUri;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final AdSelectionConfig getEMPTY() {
            return AdSelectionConfig.EMPTY;
        }

        private Companion() {
        }
    }

    static {
        AdTechIdentifier adTechIdentifier = new AdTechIdentifier("");
        Uri EMPTY2 = Uri.EMPTY;
        AbstractC6452k.m12180d(EMPTY2, "EMPTY");
        AdSelectionSignals adSelectionSignals = new AdSelectionSignals("");
        AdSelectionSignals adSelectionSignals2 = new AdSelectionSignals("");
        AbstractC6452k.m12180d(EMPTY2, "EMPTY");
        EMPTY = new AdSelectionConfig(adTechIdentifier, EMPTY2, C6313u.f24338s, adSelectionSignals, adSelectionSignals2, C6314v.f24339s, EMPTY2);
    }

    public AdSelectionConfig(AdTechIdentifier seller, Uri decisionLogicUri, List<AdTechIdentifier> customAudienceBuyers, AdSelectionSignals adSelectionSignals, AdSelectionSignals sellerSignals, Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals, Uri trustedScoringSignalsUri) {
        AbstractC6452k.m12181e(seller, "seller");
        AbstractC6452k.m12181e(decisionLogicUri, "decisionLogicUri");
        AbstractC6452k.m12181e(customAudienceBuyers, "customAudienceBuyers");
        AbstractC6452k.m12181e(adSelectionSignals, "adSelectionSignals");
        AbstractC6452k.m12181e(sellerSignals, "sellerSignals");
        AbstractC6452k.m12181e(perBuyerSignals, "perBuyerSignals");
        AbstractC6452k.m12181e(trustedScoringSignalsUri, "trustedScoringSignalsUri");
        this.seller = seller;
        this.decisionLogicUri = decisionLogicUri;
        this.customAudienceBuyers = customAudienceBuyers;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = sellerSignals;
        this.perBuyerSignals = perBuyerSignals;
        this.trustedScoringSignalsUri = trustedScoringSignalsUri;
    }

    private final List<android.adservices.common.AdTechIdentifier> convertToAdServices(List<AdTechIdentifier> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<AdTechIdentifier> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().convertToAdServices$ads_adservices_release());
        }
        return arrayList;
    }

    public final android.adservices.adselection.AdSelectionConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = AbstractC1156c.m1998f().setAdSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setCustomAudienceBuyers(convertToAdServices(this.customAudienceBuyers)).setDecisionLogicUri(this.decisionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).setPerBuyerSignals(convertToAdServices(this.perBuyerSignals)).setSellerSignals(this.sellerSignals.convertToAdServices$ads_adservices_release()).setTrustedScoringSignalsUri(this.trustedScoringSignalsUri).build();
        AbstractC6452k.m12180d(adSelectionConfigBuild, "Builder()\n            .s…Uri)\n            .build()");
        return adSelectionConfigBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return AbstractC6452k.m12177a(this.seller, adSelectionConfig.seller) && AbstractC6452k.m12177a(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && AbstractC6452k.m12177a(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && AbstractC6452k.m12177a(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && AbstractC6452k.m12177a(this.sellerSignals, adSelectionConfig.sellerSignals) && AbstractC6452k.m12177a(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && AbstractC6452k.m12177a(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return this.trustedScoringSignalsUri.hashCode() + ((this.perBuyerSignals.hashCode() + ((this.sellerSignals.hashCode() + ((this.adSelectionSignals.hashCode() + ((this.customAudienceBuyers.hashCode() + ((this.decisionLogicUri.hashCode() + (this.seller.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }

    private final Map<android.adservices.common.AdTechIdentifier, android.adservices.common.AdSelectionSignals> convertToAdServices(Map<AdTechIdentifier, AdSelectionSignals> map) {
        HashMap map2 = new HashMap();
        for (AdTechIdentifier adTechIdentifier : map.keySet()) {
            android.adservices.common.AdTechIdentifier adTechIdentifierConvertToAdServices$ads_adservices_release = adTechIdentifier.convertToAdServices$ads_adservices_release();
            AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
            map2.put(adTechIdentifierConvertToAdServices$ads_adservices_release, adSelectionSignals != null ? adSelectionSignals.convertToAdServices$ads_adservices_release() : null);
        }
        return map2;
    }
}
