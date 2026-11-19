package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.VectorValue;
import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class FindNearestStage extends Stage<FindNearestStage> {
    public static final Companion Companion = new Companion(null);
    private final DistanceMeasure distanceMeasure;
    private final Expression property;
    private final Expression vector;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public static /* synthetic */ FindNearestStage of$com_google_firebase_firebase_firestore$default(Companion companion, Field field, VectorValue vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                findNearestOptions = new FindNearestOptions();
            }
            return companion.of$com_google_firebase_firebase_firestore(field, vectorValue, distanceMeasure, findNearestOptions);
        }

        public final FindNearestStage of$com_google_firebase_firebase_firestore(Field vectorField, VectorValue vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions options) {
            AbstractC6452k.m12181e(vectorField, "vectorField");
            AbstractC6452k.m12181e(vectorValue, "vectorValue");
            AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
            AbstractC6452k.m12181e(options, "options");
            return new FindNearestStage(vectorField, Expression.Companion.constant(vectorValue), distanceMeasure, options, null);
        }

        private Companion() {
        }

        public final FindNearestStage of$com_google_firebase_firebase_firestore(Field vectorField, double[] vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions options) {
            AbstractC6452k.m12181e(vectorField, "vectorField");
            AbstractC6452k.m12181e(vectorValue, "vectorValue");
            AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
            AbstractC6452k.m12181e(options, "options");
            return new FindNearestStage(vectorField, Expression.Companion.vector(vectorValue), distanceMeasure, options, null);
        }

        public static /* synthetic */ FindNearestStage of$com_google_firebase_firebase_firestore$default(Companion companion, Field field, double[] dArr, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                findNearestOptions = new FindNearestOptions();
            }
            return companion.of$com_google_firebase_firebase_firestore(field, dArr, distanceMeasure, findNearestOptions);
        }

        public final FindNearestStage of$com_google_firebase_firebase_firestore(String vectorField, VectorValue vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions options) {
            AbstractC6452k.m12181e(vectorField, "vectorField");
            AbstractC6452k.m12181e(vectorValue, "vectorValue");
            AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
            AbstractC6452k.m12181e(options, "options");
            Expression.Companion companion = Expression.Companion;
            return new FindNearestStage(companion.field(vectorField), companion.constant(vectorValue), distanceMeasure, options, null);
        }

        public final FindNearestStage of$com_google_firebase_firebase_firestore(String vectorField, double[] vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions options) {
            AbstractC6452k.m12181e(vectorField, "vectorField");
            AbstractC6452k.m12181e(vectorValue, "vectorValue");
            AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
            AbstractC6452k.m12181e(options, "options");
            Expression.Companion companion = Expression.Companion;
            return new FindNearestStage(companion.field(vectorField), companion.vector(vectorValue), distanceMeasure, options, null);
        }

        public static /* synthetic */ FindNearestStage of$com_google_firebase_firebase_firestore$default(Companion companion, String str, VectorValue vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                findNearestOptions = new FindNearestOptions();
            }
            return companion.of$com_google_firebase_firebase_firestore(str, vectorValue, distanceMeasure, findNearestOptions);
        }

        public final FindNearestStage of$com_google_firebase_firebase_firestore(String vectorField, Expression vectorValue, DistanceMeasure distanceMeasure, FindNearestOptions options) {
            AbstractC6452k.m12181e(vectorField, "vectorField");
            AbstractC6452k.m12181e(vectorValue, "vectorValue");
            AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
            AbstractC6452k.m12181e(options, "options");
            return new FindNearestStage(Expression.Companion.field(vectorField), vectorValue, distanceMeasure, options, null);
        }

        public static /* synthetic */ FindNearestStage of$com_google_firebase_firebase_firestore$default(Companion companion, String str, double[] dArr, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                findNearestOptions = new FindNearestOptions();
            }
            return companion.of$com_google_firebase_firebase_firestore(str, dArr, distanceMeasure, findNearestOptions);
        }

        public static /* synthetic */ FindNearestStage of$com_google_firebase_firebase_firestore$default(Companion companion, String str, Expression expression, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                findNearestOptions = new FindNearestOptions();
            }
            return companion.of$com_google_firebase_firebase_firestore(str, expression, distanceMeasure, findNearestOptions);
        }
    }

    public static final class DistanceMeasure {
        private final C0393Z0 proto;
        public static final Companion Companion = new Companion(null);
        public static final DistanceMeasure EUCLIDEAN = new DistanceMeasure("euclidean");
        public static final DistanceMeasure COSINE = new DistanceMeasure("cosine");
        public static final DistanceMeasure DOT_PRODUCT = new DistanceMeasure("dot_product");

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
                this();
            }

            private Companion() {
            }
        }

        private DistanceMeasure(C0393Z0 c0393z0) {
            this.proto = c0393z0;
        }

        public final C0393Z0 getProto$com_google_firebase_firebase_firestore() {
            return this.proto;
        }

        private DistanceMeasure(String str) {
            this(Values.encodeValue(str));
        }
    }

    public /* synthetic */ FindNearestStage(Expression expression, Expression expression2, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions, AbstractC6447f abstractC6447f) {
        this(expression, expression2, distanceMeasure, findNearestOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{this.property.toProto$com_google_firebase_firebase_firestore(userDataReader), this.vector.toProto$com_google_firebase_firebase_firestore(userDataReader), this.distanceMeasure.getProto$com_google_firebase_firebase_firestore()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindNearestStage)) {
            return false;
        }
        FindNearestStage findNearestStage = (FindNearestStage) obj;
        return AbstractC6452k.m12177a(this.property, findNearestStage.property) && AbstractC6452k.m12177a(this.vector, findNearestStage.vector) && AbstractC6452k.m12177a(this.distanceMeasure, findNearestStage.distanceMeasure) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), findNearestStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((this.distanceMeasure.hashCode() + ((this.vector.hashCode() + (this.property.hashCode() * 31)) * 31)) * 31);
    }

    public /* synthetic */ FindNearestStage(Expression expression, Expression expression2, DistanceMeasure distanceMeasure, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(expression, expression2, distanceMeasure, (i2 & 8) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public FindNearestStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new FindNearestStage(this.property, this.vector, this.distanceMeasure, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindNearestStage(Expression property, Expression vector, DistanceMeasure distanceMeasure, InternalOptions options) {
        super("find_nearest", options, null);
        AbstractC6452k.m12181e(property, "property");
        AbstractC6452k.m12181e(vector, "vector");
        AbstractC6452k.m12181e(distanceMeasure, "distanceMeasure");
        AbstractC6452k.m12181e(options, "options");
        this.property = property;
        this.vector = vector;
        this.distanceMeasure = distanceMeasure;
    }

    private FindNearestStage(Expression expression, Expression expression2, DistanceMeasure distanceMeasure, FindNearestOptions findNearestOptions) {
        this(expression, expression2, distanceMeasure, findNearestOptions.getOptions$com_google_firebase_firebase_firestore());
    }
}
