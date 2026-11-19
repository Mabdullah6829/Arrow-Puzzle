package com.google.firebase.firestore.pipeline;

import com.google.protobuf.AbstractC6185M;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0389X0;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class UnnestOptions extends AbstractOptions<UnnestOptions> {
    private UnnestOptions(InternalOptions internalOptions) {
        super(internalOptions);
    }

    public final UnnestOptions withIndexField(String indexField) {
        AbstractC6452k.m12181e(indexField, "indexField");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m692i(indexField);
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return with("index_field", (C0393Z0) abstractC6185MM12341build);
    }

    public UnnestOptions() {
        this(InternalOptions.EMPTY);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public UnnestOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new UnnestOptions(options);
    }
}
