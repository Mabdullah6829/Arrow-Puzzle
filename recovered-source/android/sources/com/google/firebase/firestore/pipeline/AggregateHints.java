package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateHints extends AbstractOptions<AggregateHints> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AggregateHints(InternalOptions options) {
        super(options);
        AbstractC6452k.m12181e(options, "options");
    }

    public final AggregateHints withForceStreamableEnabled() {
        return with("force_streamable", true);
    }

    public AggregateHints() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public AggregateHints self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new AggregateHints(options);
    }
}
