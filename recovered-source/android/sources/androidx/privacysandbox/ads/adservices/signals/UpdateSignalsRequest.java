package androidx.privacysandbox.ads.adservices.signals;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext12OptIn
public final class UpdateSignalsRequest {
    private final Uri updateUri;

    public UpdateSignalsRequest(Uri updateUri) {
        AbstractC6452k.m12181e(updateUri, "updateUri");
        this.updateUri = updateUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSignalsRequest) {
            return AbstractC6452k.m12177a(this.updateUri, ((UpdateSignalsRequest) obj).updateUri);
        }
        return false;
    }

    public final Uri getUpdateUri() {
        return this.updateUri;
    }

    public int hashCode() {
        return this.updateUri.hashCode();
    }

    public String toString() {
        return "UpdateSignalsRequest: updateUri=" + this.updateUri;
    }
}
