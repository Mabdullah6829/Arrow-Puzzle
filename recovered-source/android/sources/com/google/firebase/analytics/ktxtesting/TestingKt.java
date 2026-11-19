package com.google.firebase.analytics.ktxtesting;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes2.dex */
public final class TestingKt {
    public static final void withAnalyticsForTest(@NonNull FirebaseAnalytics analytics, @NonNull InterfaceC6487a block) {
        AbstractC6452k.m12181e(analytics, "analytics");
        AbstractC6452k.m12181e(block, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics2 = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(analytics);
            try {
                block.invoke();
                AnalyticsKt.setANALYTICS(analytics2);
            } catch (Throwable th) {
                AnalyticsKt.setANALYTICS(analytics2);
                throw th;
            }
        }
    }
}
