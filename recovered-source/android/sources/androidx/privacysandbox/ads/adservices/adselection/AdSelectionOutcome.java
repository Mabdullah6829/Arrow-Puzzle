package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionOutcome {
    public static final Companion Companion = new Companion(null);
    public static final AdSelectionOutcome NO_OUTCOME;
    private final long adSelectionId;
    private final Uri renderUri;

    @ExperimentalFeatures.Ext10OptIn
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        @ExperimentalFeatures.Ext10OptIn
        public static /* synthetic */ void getNO_OUTCOME$annotations() {
        }

        private Companion() {
        }
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        AbstractC6452k.m12180d(EMPTY, "EMPTY");
        NO_OUTCOME = new AdSelectionOutcome(0L, EMPTY);
    }

    public AdSelectionOutcome(long j2, Uri renderUri) {
        AbstractC6452k.m12181e(renderUri, "renderUri");
        this.adSelectionId = j2;
        this.renderUri = renderUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.adSelectionId == adSelectionOutcome.adSelectionId && AbstractC6452k.m12177a(this.renderUri, adSelectionOutcome.renderUri);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    @ExperimentalFeatures.Ext10OptIn
    public final boolean hasOutcome() {
        return !equals(NO_OUTCOME);
    }

    public int hashCode() {
        return this.renderUri.hashCode() + (Long.hashCode(this.adSelectionId) * 31);
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome response) {
        AbstractC6452k.m12181e(response, "response");
        long adSelectionId = response.getAdSelectionId();
        Uri renderUri = response.getRenderUri();
        AbstractC6452k.m12180d(renderUri, "response.renderUri");
        this(adSelectionId, renderUri);
    }
}
