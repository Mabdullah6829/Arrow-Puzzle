package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RequestConfiguration {

    /* JADX INFO: renamed from: c */
    public static final List f2971c = Arrays.asList("MA", "T", "PG", "G");

    /* JADX INFO: renamed from: a */
    public final List f2972a;

    /* JADX INFO: renamed from: b */
    public final PublisherPrivacyPersonalizationState f2973b;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final ArrayList f2974a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final PublisherPrivacyPersonalizationState f2975b = PublisherPrivacyPersonalizationState.DEFAULT;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MaxAdContentRating {
    }

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLED(1),
        /* JADX INFO: Fake field, exist only in values array */
        DISABLED(2);


        /* JADX INFO: renamed from: s */
        public final int f2978s;

        PublisherPrivacyPersonalizationState(int i2) {
            this.f2978s = i2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForChildDirectedTreatment {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState) {
        this.f2972a = list;
        this.f2973b = publisherPrivacyPersonalizationState;
    }
}
