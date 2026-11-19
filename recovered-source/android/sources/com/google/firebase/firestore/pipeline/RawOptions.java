package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class RawOptions extends AbstractOptions<RawOptions> {
    public static final Companion Companion = new Companion(null);
    public static final RawOptions DEFAULT = new RawOptions(InternalOptions.EMPTY);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    private RawOptions(InternalOptions internalOptions) {
        super(internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.AbstractOptions
    public RawOptions self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new RawOptions(options);
    }
}
