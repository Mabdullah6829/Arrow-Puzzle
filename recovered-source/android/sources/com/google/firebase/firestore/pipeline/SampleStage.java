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
public final class SampleStage extends Stage<SampleStage> {
    public static final Companion Companion = new Companion(null);
    private final Mode mode;
    private final Number size;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final SampleStage withDocLimit(int i2) {
            return new SampleStage(Integer.valueOf(i2), Mode.Companion.getDOCUMENTS(), null, 4, null);
        }

        public final SampleStage withPercentage(double d) {
            return new SampleStage(Double.valueOf(d), Mode.Companion.getPERCENT(), null, 4, null);
        }

        private Companion() {
        }
    }

    public static final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final Mode DOCUMENTS = new Mode("documents");
        private static final Mode PERCENT = new Mode("percent");
        private final C0393Z0 proto;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            public final Mode getDOCUMENTS() {
                return Mode.DOCUMENTS;
            }

            public final Mode getPERCENT() {
                return Mode.PERCENT;
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

    public /* synthetic */ SampleStage(Number number, Mode mode, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(number, mode, (i2 & 4) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    public static final SampleStage withDocLimit(int i2) {
        return Companion.withDocLimit(i2);
    }

    public static final SampleStage withPercentage(double d) {
        return Companion.withPercentage(d);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue(this.size), this.mode.getProto$com_google_firebase_firebase_firestore()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleStage)) {
            return false;
        }
        SampleStage sampleStage = (SampleStage) obj;
        return AbstractC6452k.m12177a(this.size, sampleStage.size) && AbstractC6452k.m12177a(this.mode, sampleStage.mode) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), sampleStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((this.mode.hashCode() + (this.size.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public SampleStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new SampleStage(this.size, this.mode, options);
    }

    private SampleStage(Number number, Mode mode, InternalOptions internalOptions) {
        super("sample", internalOptions, null);
        this.size = number;
        this.mode = mode;
    }
}
