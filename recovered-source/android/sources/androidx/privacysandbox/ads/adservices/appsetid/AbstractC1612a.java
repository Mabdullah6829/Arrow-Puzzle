package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1612a {
    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m2525D() {
        return CustomAudienceManager.class;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ android.adservices.appsetid.AppSetId m2527b(Object obj) {
        return (android.adservices.appsetid.AppSetId) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ android.adservices.appsetid.AppSetIdManager m2529d(Object obj) {
        return (android.adservices.appsetid.AppSetIdManager) obj;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AdData.Builder m2530e() {
        return new AdData.Builder();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ CustomAudienceManager m2545t(Object obj) {
        return (CustomAudienceManager) obj;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ LeaveCustomAudienceRequest.Builder m2546u() {
        return new LeaveCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ TrustedBiddingData.Builder m2549x() {
        return new TrustedBiddingData.Builder();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ Class m2550y() {
        return android.adservices.appsetid.AppSetIdManager.class;
    }
}
