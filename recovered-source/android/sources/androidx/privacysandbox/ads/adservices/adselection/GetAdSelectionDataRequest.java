package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.core.os.AbstractC1196a;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFeatures.Ext10OptIn
public final class GetAdSelectionDataRequest {
    private final Uri coordinatorOriginUri;
    private final AdTechIdentifier seller;

    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                AbstractC6452k.m12181e(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = AbstractC1196a.m2250i().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).build();
                AbstractC6452k.m12180d(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext10Impl() {
        }
    }

    public static final class Ext12Impl {
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final android.adservices.adselection.GetAdSelectionDataRequest convertGetAdSelectionDataRequest(GetAdSelectionDataRequest request) {
                AbstractC6452k.m12181e(request, "request");
                android.adservices.adselection.GetAdSelectionDataRequest getAdSelectionDataRequestBuild = AbstractC1196a.m2250i().setSeller(request.getSeller().convertToAdServices$ads_adservices_release()).setCoordinatorOriginUri(request.getCoordinatorOriginUri()).build();
                AbstractC6452k.m12180d(getAdSelectionDataRequestBuild, "Builder()\n              …                 .build()");
                return getAdSelectionDataRequestBuild;
            }

            private Companion() {
            }
        }

        private Ext12Impl() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetAdSelectionDataRequest(AdTechIdentifier seller) {
        this(seller, null, 2, 0 == true ? 1 : 0);
        AbstractC6452k.m12181e(seller, "seller");
    }

    @ExperimentalFeatures.Ext12OptIn
    public static /* synthetic */ void getCoordinatorOriginUri$annotations() {
    }

    public final android.adservices.adselection.GetAdSelectionDataRequest convertToAdServices$ads_adservices_release() {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        return (adServicesInfo.adServicesVersion() >= 12 || adServicesInfo.extServicesVersionS() >= 12) ? Ext12Impl.Companion.convertGetAdSelectionDataRequest(this) : Ext10Impl.Companion.convertGetAdSelectionDataRequest(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAdSelectionDataRequest)) {
            return false;
        }
        GetAdSelectionDataRequest getAdSelectionDataRequest = (GetAdSelectionDataRequest) obj;
        return AbstractC6452k.m12177a(this.seller, getAdSelectionDataRequest.seller) && AbstractC6452k.m12177a(this.coordinatorOriginUri, getAdSelectionDataRequest.coordinatorOriginUri);
    }

    public final Uri getCoordinatorOriginUri() {
        return this.coordinatorOriginUri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public int hashCode() {
        int iHashCode = this.seller.hashCode() * 31;
        Uri uri = this.coordinatorOriginUri;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "GetAdSelectionDataRequest: seller=" + this.seller + ", coordinatorOriginUri=" + this.coordinatorOriginUri;
    }

    public GetAdSelectionDataRequest(AdTechIdentifier seller, Uri uri) {
        AbstractC6452k.m12181e(seller, "seller");
        this.seller = seller;
        this.coordinatorOriginUri = uri;
    }

    public /* synthetic */ GetAdSelectionDataRequest(AdTechIdentifier adTechIdentifier, Uri uri, int i2, AbstractC6447f abstractC6447f) {
        this(adTechIdentifier, (i2 & 2) != 0 ? null : uri);
    }
}
