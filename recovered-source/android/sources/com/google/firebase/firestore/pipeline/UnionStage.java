package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.Pipeline;
import com.google.firebase.firestore.UserDataReader;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0389X0;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class UnionStage extends Stage<UnionStage> {
    private final Pipeline other;

    public /* synthetic */ UnionStage(Pipeline pipeline, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(pipeline, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m699r(this.other.toPipelineProto$com_google_firebase_firebase_firestore(userDataReader));
        return AbstractC6302j.m12096r(new C0393Z0[]{c0389x0M714O.m12341build()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionStage)) {
            return false;
        }
        UnionStage unionStage = (UnionStage) obj;
        return AbstractC6452k.m12177a(this.other, unionStage.other) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), unionStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.other.hashCode() * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public UnionStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new UnionStage(this.other, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionStage(Pipeline other, InternalOptions options) {
        super("union", options, null);
        AbstractC6452k.m12181e(other, "other");
        AbstractC6452k.m12181e(options, "options");
        this.other = other;
    }
}
