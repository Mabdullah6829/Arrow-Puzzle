package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class JoinCustomAudienceRequest {
    private final CustomAudience customAudience;

    public JoinCustomAudienceRequest(CustomAudience customAudience) {
        AbstractC6452k.m12181e(customAudience, "customAudience");
        this.customAudience = customAudience;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoinCustomAudienceRequest) {
            return AbstractC6452k.m12177a(this.customAudience, ((JoinCustomAudienceRequest) obj).customAudience);
        }
        return false;
    }

    public final CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
