package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class WebTriggerRegistrationRequest {
    private final Uri destination;
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(List<WebTriggerParams> webTriggerParams, Uri destination) {
        AbstractC6452k.m12181e(webTriggerParams, "webTriggerParams");
        AbstractC6452k.m12181e(destination, "destination");
        this.webTriggerParams = webTriggerParams;
        this.destination = destination;
    }

    public final android.adservices.measurement.WebTriggerRegistrationRequest convertToAdServices$ads_adservices_release() {
        AbstractC1632b.m2616D();
        android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = AbstractC1632b.m2627k(WebTriggerParams.Companion.convertWebTriggerParams$ads_adservices_release(this.webTriggerParams), this.destination).build();
        AbstractC6452k.m12180d(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return AbstractC6452k.m12177a(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && AbstractC6452k.m12177a(this.destination, webTriggerRegistrationRequest.destination);
    }

    public final Uri getDestination() {
        return this.destination;
    }

    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return this.destination.hashCode() + (this.webTriggerParams.hashCode() * 31);
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
