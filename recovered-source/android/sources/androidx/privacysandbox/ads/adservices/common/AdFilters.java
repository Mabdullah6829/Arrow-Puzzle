package androidx.privacysandbox.ads.adservices.common;

import androidx.privacysandbox.ads.adservices.adselection.AbstractC1610a;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext8OptIn
public final class AdFilters {
    private final FrequencyCapFilters frequencyCapFilters;

    public AdFilters(FrequencyCapFilters frequencyCapFilters) {
        this.frequencyCapFilters = frequencyCapFilters;
    }

    public final android.adservices.common.AdFilters convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdFilters.Builder builderM2504i = AbstractC1610a.m2504i();
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        android.adservices.common.AdFilters adFiltersBuild = builderM2504i.setFrequencyCapFilters(frequencyCapFilters != null ? frequencyCapFilters.convertToAdServices$ads_adservices_release() : null).build();
        AbstractC6452k.m12180d(adFiltersBuild, "Builder()\n            .s…s())\n            .build()");
        return adFiltersBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdFilters) {
            return AbstractC6452k.m12177a(this.frequencyCapFilters, ((AdFilters) obj).frequencyCapFilters);
        }
        return false;
    }

    public final FrequencyCapFilters getFrequencyCapFilters() {
        return this.frequencyCapFilters;
    }

    public int hashCode() {
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        if (frequencyCapFilters != null) {
            return frequencyCapFilters.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.frequencyCapFilters;
    }
}
