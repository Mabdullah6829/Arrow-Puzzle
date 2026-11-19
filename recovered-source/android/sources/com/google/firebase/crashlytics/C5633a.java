package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5633a implements BreadcrumbSource, AnalyticsEventLogger, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ AnalyticsDeferredProxy f23582s;

    public /* synthetic */ C5633a(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f23582s = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        this.f23582s.lambda$init$2(provider);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        this.f23582s.lambda$getAnalyticsEventLogger$1(str, bundle);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        this.f23582s.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }
}
