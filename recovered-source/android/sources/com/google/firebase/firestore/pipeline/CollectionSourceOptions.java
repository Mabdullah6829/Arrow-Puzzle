package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionSourceOptions extends AbstractOptions<CollectionSourceOptions> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSourceOptions(InternalOptions options) {
        super(options);
        AbstractC6452k.m12181e(options, "options");
    }

    public final CollectionSourceOptions withHints(CollectionHints hints) {
        AbstractC6452k.m12181e(hints, "hints");
        return adding(hints);
    }

    public CollectionSourceOptions() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public CollectionSourceOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new CollectionSourceOptions(options);
    }
}
