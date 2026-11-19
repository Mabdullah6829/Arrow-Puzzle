package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplaceStage extends Stage<ReplaceStage> {
    private final Expression mapValue;
    private final Mode mode;

    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final Mode FULL_REPLACE = new Mode("full_replace");
        private static final Mode MERGE_PREFER_NEXT = new Mode("merge_prefer_nest");
        private static final Mode MERGE_PREFER_PARENT = new Mode("merge_prefer_parent");
        private final C0393Z0 proto;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final Mode getFULL_REPLACE() {
                return Mode.FULL_REPLACE;
            }

            public final Mode getMERGE_PREFER_NEXT() {
                return Mode.MERGE_PREFER_NEXT;
            }

            public final Mode getMERGE_PREFER_PARENT() {
                return Mode.MERGE_PREFER_PARENT;
            }

            private Companion() {
            }
        }

        private Mode(C0393Z0 c0393z0) {
            this.proto = c0393z0;
        }

        public final C0393Z0 getProto$com_google_firebase_firebase_firestore() {
            return this.proto;
        }

        private Mode(String str) {
            this(Values.encodeValue(str));
        }
    }

    public /* synthetic */ ReplaceStage(Expression expression, Mode mode, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(expression, mode, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{this.mapValue.toProto$com_google_firebase_firebase_firestore(userDataReader), this.mode.getProto$com_google_firebase_firebase_firestore()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceStage)) {
            return false;
        }
        ReplaceStage replaceStage = (ReplaceStage) obj;
        return AbstractC6452k.m12177a(this.mapValue, replaceStage.mapValue) && AbstractC6452k.m12177a(this.mode, replaceStage.mode) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), replaceStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((this.mode.hashCode() + (this.mapValue.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public ReplaceStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new ReplaceStage(this.mapValue, this.mode, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplaceStage(Expression mapValue, Mode mode, InternalOptions options) {
        super("replace_with", options, null);
        AbstractC6452k.m12181e(mapValue, "mapValue");
        AbstractC6452k.m12181e(mode, "mode");
        AbstractC6452k.m12181e(options, "options");
        this.mapValue = mapValue;
        this.mode = mode;
    }
}
