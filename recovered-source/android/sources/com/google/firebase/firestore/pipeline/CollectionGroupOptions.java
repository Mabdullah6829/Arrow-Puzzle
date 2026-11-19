package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionGroupOptions extends AbstractOptions<CollectionGroupOptions> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionGroupOptions(InternalOptions options) {
        super(options);
        AbstractC6452k.m12181e(options, "options");
    }

    public final CollectionGroupOptions withHints(CollectionHints hints) {
        AbstractC6452k.m12181e(hints, "hints");
        return adding(hints);
    }

    public CollectionGroupOptions() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public CollectionGroupOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new CollectionGroupOptions(options);
    }
}
