package androidx.privacysandbox.ads.adservices.common;

import androidx.privacysandbox.ads.adservices.adselection.AbstractC1610a;
import java.time.Duration;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext8OptIn
public final class KeyedFrequencyCap {
    private final int adCounterKey;
    private final Duration interval;
    private final int maxCount;

    public KeyedFrequencyCap(int i2, int i3, Duration interval) {
        AbstractC6452k.m12181e(interval, "interval");
        this.adCounterKey = i2;
        this.maxCount = i3;
        this.interval = interval;
    }

    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        AbstractC1610a.m2493B();
        android.adservices.common.KeyedFrequencyCap keyedFrequencyCapBuild = AbstractC1610a.m2510o(this.adCounterKey, this.maxCount, this.interval).build();
        AbstractC6452k.m12180d(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyedFrequencyCap)) {
            return false;
        }
        KeyedFrequencyCap keyedFrequencyCap = (KeyedFrequencyCap) obj;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && AbstractC6452k.m12177a(this.interval, keyedFrequencyCap.interval);
    }

    public final int getAdCounterKey() {
        return this.adCounterKey;
    }

    public final Duration getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public int hashCode() {
        return this.interval.hashCode() + ((Integer.hashCode(this.maxCount) + (Integer.hashCode(this.adCounterKey) * 31)) * 31);
    }

    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }
}
