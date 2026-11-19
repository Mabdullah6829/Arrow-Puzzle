package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionSignals {
    private final String signals;

    public AdSelectionSignals(String signals) {
        AbstractC6452k.m12181e(signals, "signals");
        this.signals = signals;
    }

    public final android.adservices.common.AdSelectionSignals convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdSelectionSignals adSelectionSignalsFromString = android.adservices.common.AdSelectionSignals.fromString(this.signals);
        AbstractC6452k.m12180d(adSelectionSignalsFromString, "fromString(signals)");
        return adSelectionSignalsFromString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdSelectionSignals) {
            return AbstractC6452k.m12177a(this.signals, ((AdSelectionSignals) obj).signals);
        }
        return false;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }
}
