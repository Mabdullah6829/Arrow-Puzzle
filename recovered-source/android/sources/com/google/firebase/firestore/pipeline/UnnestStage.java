package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class UnnestStage extends Stage<UnnestStage> {
    public static final Companion Companion = new Companion(null);
    private final Selectable selectable;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final UnnestStage withField(Selectable arrayWithAlias) {
            AbstractC6452k.m12181e(arrayWithAlias, "arrayWithAlias");
            return new UnnestStage(arrayWithAlias, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final UnnestStage withField(String arrayField, String alias) {
            AbstractC6452k.m12181e(arrayField, "arrayField");
            AbstractC6452k.m12181e(alias, "alias");
            return new UnnestStage(Expression.Companion.field(arrayField).alias(alias), null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ UnnestStage(Selectable selectable, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(selectable, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    public static final UnnestStage withField(Selectable selectable) {
        return Companion.withField(selectable);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{this.selectable.toProto$com_google_firebase_firebase_firestore(userDataReader), Expression.Companion.field(this.selectable.getAlias$com_google_firebase_firebase_firestore()).toProto$com_google_firebase_firebase_firestore()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnnestStage)) {
            return false;
        }
        UnnestStage unnestStage = (UnnestStage) obj;
        return AbstractC6452k.m12177a(this.selectable, unnestStage.selectable) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), unnestStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.selectable.hashCode() * 31);
    }

    public final UnnestStage withIndexField(String indexField) {
        AbstractC6452k.m12181e(indexField, "indexField");
        return withOption("index_field", indexField);
    }

    public static final UnnestStage withField(String str, String str2) {
        return Companion.withField(str, str2);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public UnnestStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new UnnestStage(this.selectable, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnnestStage(Selectable selectable, InternalOptions options) {
        super("unnest", options, null);
        AbstractC6452k.m12181e(selectable, "selectable");
        AbstractC6452k.m12181e(options, "options");
        this.selectable = selectable;
    }
}
