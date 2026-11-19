package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1632b {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m2613A() {
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m2615C() {
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2616D() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ android.adservices.measurement.WebSourceParams.Builder m2619c(Uri uri) {
        return new android.adservices.measurement.WebSourceParams.Builder(uri);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ android.adservices.measurement.WebSourceRegistrationRequest.Builder m2622f(List list, Uri uri) {
        return new android.adservices.measurement.WebSourceRegistrationRequest.Builder(list, uri);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ android.adservices.measurement.WebTriggerParams.Builder m2625i(Uri uri) {
        return new android.adservices.measurement.WebTriggerParams.Builder(uri);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ android.adservices.measurement.WebTriggerRegistrationRequest.Builder m2627k(List list, Uri uri) {
        return new android.adservices.measurement.WebTriggerRegistrationRequest.Builder(list, uri);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ GetTopicsRequest.Builder m2629m() {
        return new GetTopicsRequest.Builder();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ GetTopicsResponse m2633q(Object obj) {
        return (GetTopicsResponse) obj;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ Topic m2634r(Object obj) {
        return (Topic) obj;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ TopicsManager m2636t(Object obj) {
        return (TopicsManager) obj;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ Class m2637u() {
        return TopicsManager.class;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m2639w() {
    }
}
