package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.core.os.AbstractC1196a;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext10OptIn
public final class AdSelectionFromOutcomesConfig {
    private final List<Long> adSelectionIds;
    private final AdSelectionSignals adSelectionSignals;
    private Uri selectionLogicUri;
    private final AdTechIdentifier seller;

    public AdSelectionFromOutcomesConfig(AdTechIdentifier seller, List<Long> adSelectionIds, AdSelectionSignals adSelectionSignals, Uri selectionLogicUri) {
        AbstractC6452k.m12181e(seller, "seller");
        AbstractC6452k.m12181e(adSelectionIds, "adSelectionIds");
        AbstractC6452k.m12181e(adSelectionSignals, "adSelectionSignals");
        AbstractC6452k.m12181e(selectionLogicUri, "selectionLogicUri");
        this.seller = seller;
        this.adSelectionIds = adSelectionIds;
        this.adSelectionSignals = adSelectionSignals;
        this.selectionLogicUri = selectionLogicUri;
    }

    public final android.adservices.adselection.AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = AbstractC1196a.m2243b().setSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setAdSelectionIds(this.adSelectionIds).setSelectionLogicUri(this.selectionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).build();
        AbstractC6452k.m12180d(adSelectionFromOutcomesConfigBuild, "Builder()\n            .s…s())\n            .build()");
        return adSelectionFromOutcomesConfigBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionFromOutcomesConfig)) {
            return false;
        }
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = (AdSelectionFromOutcomesConfig) obj;
        return AbstractC6452k.m12177a(this.seller, adSelectionFromOutcomesConfig.seller) && AbstractC6452k.m12177a(this.adSelectionIds, adSelectionFromOutcomesConfig.adSelectionIds) && AbstractC6452k.m12177a(this.adSelectionSignals, adSelectionFromOutcomesConfig.adSelectionSignals) && AbstractC6452k.m12177a(this.selectionLogicUri, adSelectionFromOutcomesConfig.selectionLogicUri);
    }

    public final List<Long> getAdSelectionIds() {
        return this.adSelectionIds;
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final Uri getSelectionLogicUri() {
        return this.selectionLogicUri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        return this.selectionLogicUri.hashCode() + ((this.adSelectionSignals.hashCode() + ((this.adSelectionIds.hashCode() + (this.seller.hashCode() * 31)) * 31)) * 31);
    }

    public final void setSelectionLogicUri(Uri uri) {
        AbstractC6452k.m12181e(uri, "<set-?>");
        this.selectionLogicUri = uri;
    }

    public String toString() {
        return "AdSelectionFromOutcomesConfig: seller=" + this.seller + ", adSelectionIds='" + this.adSelectionIds + "', adSelectionSignals=" + this.adSelectionSignals + ", selectionLogicUri=" + this.selectionLogicUri;
    }
}
