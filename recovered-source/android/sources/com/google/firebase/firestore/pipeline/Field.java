package com.google.firebase.firestore.pipeline;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResult;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResultUnset;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResultValue;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.C6197S0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p002B0.C0103c;
import p022N.C0389X0;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class Field extends Selectable {
    public static final Field CREATE_TIME;
    public static final Companion Companion = new Companion(null);
    public static final Field DOCUMENT_ID;
    public static final Field UPDATE_TIME;
    private final String alias;
    private final Expression expr;
    private final FieldPath fieldPath;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentSnapshot.ServerTimestampBehavior.values().length];
            try {
                iArr[DocumentSnapshot.ServerTimestampBehavior.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentSnapshot.ServerTimestampBehavior.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentSnapshot.ServerTimestampBehavior.PREVIOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FieldPath KEY_PATH = FieldPath.KEY_PATH;
        AbstractC6452k.m12180d(KEY_PATH, "KEY_PATH");
        DOCUMENT_ID = new Field(KEY_PATH);
        FieldPath UPDATE_TIME_PATH = FieldPath.UPDATE_TIME_PATH;
        AbstractC6452k.m12180d(UPDATE_TIME_PATH, "UPDATE_TIME_PATH");
        UPDATE_TIME = new Field(UPDATE_TIME_PATH);
        FieldPath CREATE_TIME_PATH = FieldPath.CREATE_TIME_PATH;
        AbstractC6452k.m12180d(CREATE_TIME_PATH, "CREATE_TIME_PATH");
        CREATE_TIME = new Field(CREATE_TIME_PATH);
    }

    public Field(FieldPath fieldPath) {
        AbstractC6452k.m12181e(fieldPath, "fieldPath");
        this.fieldPath = fieldPath;
        String strCanonicalString = fieldPath.canonicalString();
        AbstractC6452k.m12180d(strCanonicalString, "canonicalString(...)");
        this.alias = strCanonicalString;
        this.expr = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EvaluateResult evaluateFunction$lambda$1(Field field, EvaluationContext evaluationContext, MutableDocument input) {
        AbstractC6452k.m12181e(input, "input");
        FieldPath fieldPath = field.fieldPath;
        if (AbstractC6452k.m12177a(fieldPath, FieldPath.KEY_PATH)) {
            FirebaseFirestore firestore$com_google_firebase_firebase_firestore = evaluationContext.getPipeline().getFirestore$com_google_firebase_firebase_firestore();
            DocumentReference documentReferenceDocument = firestore$com_google_firebase_firebase_firestore != null ? firestore$com_google_firebase_firebase_firestore.document(input.getKey().getPath().canonicalString()) : null;
            AbstractC6452k.m12178b(documentReferenceDocument);
            return new EvaluateResultValue(Values.encodeValue(documentReferenceDocument));
        }
        if (AbstractC6452k.m12177a(fieldPath, FieldPath.CREATE_TIME_PATH)) {
            Timestamp timestamp = input.getCreateTime().getTimestamp();
            AbstractC6452k.m12180d(timestamp, "getTimestamp(...)");
            return new EvaluateResultValue(Values.encodeValue(timestamp));
        }
        if (AbstractC6452k.m12177a(fieldPath, FieldPath.UPDATE_TIME_PATH)) {
            Timestamp timestamp2 = input.getVersion().getTimestamp();
            AbstractC6452k.m12180d(timestamp2, "getTimestamp(...)");
            return new EvaluateResultValue(Values.encodeValue(timestamp2));
        }
        C0393Z0 field2 = input.getField(field.fieldPath);
        if (field2 != null) {
            EvaluateResult serverTimestamp = ServerTimestamps.isServerTimestamp(field2) ? field.getServerTimestamp(field2, evaluationContext) : new EvaluateResultValue(field2);
            if (serverTimestamp != null) {
                return serverTimestamp;
            }
        }
        return EvaluateResultUnset.INSTANCE;
    }

    private final EvaluateResult getServerTimestamp(C0393Z0 c0393z0, EvaluationContext evaluationContext) {
        DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior;
        EventManager.ListenOptions internalOptions$com_google_firebase_firebase_firestore = evaluationContext.getPipeline().getInternalOptions$com_google_firebase_firebase_firestore();
        if (internalOptions$com_google_firebase_firebase_firestore == null || (serverTimestampBehavior = internalOptions$com_google_firebase_firebase_firestore.serverTimestampBehavior) == null) {
            serverTimestampBehavior = DocumentSnapshot.ServerTimestampBehavior.NONE;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[serverTimestampBehavior.ordinal()];
        if (i2 == 1) {
            return EvaluateResult.Companion.getNULL();
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C0393Z0 previousValue = ServerTimestamps.getPreviousValue(c0393z0);
            return previousValue == null ? EvaluateResult.Companion.getNULL() : new EvaluateResultValue(previousValue);
        }
        EvaluateResult.Companion companion = EvaluateResult.Companion;
        C6197S0 localWriteTime = ServerTimestamps.getLocalWriteTime(c0393z0);
        AbstractC6452k.m12180d(localWriteTime, "getLocalWriteTime(...)");
        return companion.timestamp(localWriteTime);
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return "fld(" + this.fieldPath.canonicalString() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Field) {
            return AbstractC6452k.m12177a(this.fieldPath, ((Field) obj).fieldPath);
        }
        return false;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return new C0103c(1, this, context);
    }

    public final Expression geoDistance(GeoPoint location) {
        AbstractC6452k.m12181e(location, "location");
        return Expression.Companion.geoDistance(this, location);
    }

    @Override // com.google.firebase.firestore.pipeline.Selectable
    public String getAlias$com_google_firebase_firebase_firestore() {
        return this.alias;
    }

    @Override // com.google.firebase.firestore.pipeline.Selectable
    public Expression getExpr$com_google_firebase_firebase_firestore() {
        return this.expr;
    }

    public final FieldPath getFieldPath$com_google_firebase_firebase_firestore() {
        return this.fieldPath;
    }

    public int hashCode() {
        return this.fieldPath.hashCode();
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return toProto$com_google_firebase_firebase_firestore();
    }

    public final C0393Z0 toProto$com_google_firebase_firebase_firestore() {
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m692i(this.fieldPath.canonicalString());
        AbstractC6185M abstractC6185MM12341build = c0389x0M714O.m12341build();
        AbstractC6452k.m12180d(abstractC6185MM12341build, "build(...)");
        return (C0393Z0) abstractC6185MM12341build;
    }
}
