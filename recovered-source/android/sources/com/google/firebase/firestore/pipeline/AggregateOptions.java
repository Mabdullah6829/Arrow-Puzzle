package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateOptions extends AbstractOptions<AggregateOptions> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateOptions(InternalOptions options) {
        super(options);
        AbstractC6452k.m12181e(options, "options");
    }

    public final AggregateOptions withHints(AggregateHints hints) {
        AbstractC6452k.m12181e(hints, "hints");
        return adding(hints);
    }

    public AggregateOptions() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public AggregateOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new AggregateOptions(options);
    }
}
