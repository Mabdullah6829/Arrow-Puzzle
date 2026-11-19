package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String identifier) {
        AbstractC6452k.m12181e(identifier, "identifier");
        this.identifier = identifier;
    }

    public final android.adservices.common.AdTechIdentifier convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdTechIdentifier adTechIdentifierFromString = android.adservices.common.AdTechIdentifier.fromString(this.identifier);
        AbstractC6452k.m12180d(adTechIdentifierFromString, "fromString(identifier)");
        return adTechIdentifierFromString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdTechIdentifier) {
            return AbstractC6452k.m12177a(this.identifier, ((AdTechIdentifier) obj).identifier);
        }
        return false;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return String.valueOf(this.identifier);
    }
}
