package androidx.privacysandbox.ads.adservices.adselection;

import androidx.core.os.AbstractC1196a;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext10OptIn
public final class PersistAdSelectionResultRequest {
    private final long adSelectionId;
    private final byte[] adSelectionResult;
    private final AdTechIdentifier seller;

    public PersistAdSelectionResultRequest(long j2) {
        this(j2, null, null, 6, null);
    }

    public final android.adservices.adselection.PersistAdSelectionResultRequest convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.PersistAdSelectionResultRequest.Builder adSelectionId = AbstractC1196a.m2254m().setAdSelectionId(this.adSelectionId);
        AdTechIdentifier adTechIdentifier = this.seller;
        android.adservices.adselection.PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = adSelectionId.setSeller(adTechIdentifier != null ? adTechIdentifier.convertToAdServices$ads_adservices_release() : null).setAdSelectionResult(this.adSelectionResult).build();
        AbstractC6452k.m12180d(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
        return persistAdSelectionResultRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistAdSelectionResultRequest)) {
            return false;
        }
        PersistAdSelectionResultRequest persistAdSelectionResultRequest = (PersistAdSelectionResultRequest) obj;
        return this.adSelectionId == persistAdSelectionResultRequest.adSelectionId && AbstractC6452k.m12177a(this.seller, persistAdSelectionResultRequest.seller) && Arrays.equals(this.adSelectionResult, persistAdSelectionResultRequest.adSelectionResult);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final byte[] getAdSelectionResult() {
        return this.adSelectionResult;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.adSelectionId) * 31;
        AdTechIdentifier adTechIdentifier = this.seller;
        int iHashCode2 = (iHashCode + (adTechIdentifier != null ? adTechIdentifier.hashCode() : 0)) * 31;
        byte[] bArr = this.adSelectionResult;
        return iHashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    public String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.adSelectionId + ", seller=" + this.seller + ", adSelectionResult=" + this.adSelectionResult;
    }

    public PersistAdSelectionResultRequest(long j2, AdTechIdentifier adTechIdentifier) {
        this(j2, adTechIdentifier, null, 4, null);
    }

    public PersistAdSelectionResultRequest(long j2, AdTechIdentifier adTechIdentifier, byte[] bArr) {
        this.adSelectionId = j2;
        this.seller = adTechIdentifier;
        this.adSelectionResult = bArr;
    }

    public /* synthetic */ PersistAdSelectionResultRequest(long j2, AdTechIdentifier adTechIdentifier, byte[] bArr, int i2, AbstractC6447f abstractC6447f) {
        this(j2, (i2 & 2) != 0 ? null : adTechIdentifier, (i2 & 4) != 0 ? null : bArr);
    }
}
