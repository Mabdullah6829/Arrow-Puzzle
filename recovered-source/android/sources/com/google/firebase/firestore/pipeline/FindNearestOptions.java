package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class FindNearestOptions extends AbstractOptions<FindNearestOptions> {
    private FindNearestOptions(InternalOptions internalOptions) {
        super(internalOptions);
    }

    public final FindNearestOptions withDistanceField(Field distanceField) {
        AbstractC6452k.m12181e(distanceField, "distanceField");
        return with("distance_field", distanceField);
    }

    public final FindNearestOptions withLimit(long j2) {
        return with("limit", j2);
    }

    public FindNearestOptions() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public FindNearestOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new FindNearestOptions(options);
    }

    public final FindNearestOptions withDistanceField(String str) {
        Expression.Companion companion = Expression.Companion;
        AbstractC6452k.m12178b(str);
        return withDistanceField(companion.field(str));
    }
}
