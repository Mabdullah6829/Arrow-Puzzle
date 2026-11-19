package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class WebTriggerParams {
    public static final Companion Companion = new Companion(null);
    private final boolean debugKeyAllowed;
    private final Uri registrationUri;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams$ads_adservices_release(List<WebTriggerParams> request) {
            AbstractC6452k.m12181e(request, "request");
            ArrayList arrayList = new ArrayList();
            for (WebTriggerParams webTriggerParams : request) {
                AbstractC1632b.m2615C();
                android.adservices.measurement.WebTriggerParams webTriggerParamsBuild = AbstractC1632b.m2625i(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed()).build();
                AbstractC6452k.m12180d(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public WebTriggerParams(Uri registrationUri, boolean z) {
        AbstractC6452k.m12181e(registrationUri, "registrationUri");
        this.registrationUri = registrationUri;
        this.debugKeyAllowed = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerParams)) {
            return false;
        }
        WebTriggerParams webTriggerParams = (WebTriggerParams) obj;
        return AbstractC6452k.m12177a(this.registrationUri, webTriggerParams.registrationUri) && this.debugKeyAllowed == webTriggerParams.debugKeyAllowed;
    }

    public final boolean getDebugKeyAllowed() {
        return this.debugKeyAllowed;
    }

    public final Uri getRegistrationUri() {
        return this.registrationUri;
    }

    public int hashCode() {
        return Boolean.hashCode(this.debugKeyAllowed) + (this.registrationUri.hashCode() * 31);
    }

    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.registrationUri + ", DebugKeyAllowed=" + this.debugKeyAllowed + " }";
    }
}
