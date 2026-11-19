package com.google.firebase.firestore.pipeline;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionHints extends AbstractOptions<CollectionHints> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionHints(InternalOptions options) {
        super(options);
        AbstractC6452k.m12181e(options, "options");
    }

    public final CollectionHints withForceIndex(String value) {
        AbstractC6452k.m12181e(value, "value");
        return with("force_index", value);
    }

    public final CollectionHints withIgnoreIndexFields(String... values) {
        AbstractC6452k.m12181e(values, "values");
        return with("ignore_index_fields", (String[]) Arrays.copyOf(values, values.length));
    }

    public CollectionHints() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public CollectionHints self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new CollectionHints(options);
    }
}
