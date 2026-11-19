package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResult;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p078p0.InterfaceC6498l;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class WhereStage extends Stage<WhereStage> {
    private final Expression condition;

    public /* synthetic */ WhereStage(Expression expression, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(expression, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{this.condition.toProto$com_google_firebase_firebase_firestore(userDataReader)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getName$com_google_firebase_firebase_firestore() + '(' + this.condition.canonicalId$com_google_firebase_firebase_firestore() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhereStage)) {
            return false;
        }
        WhereStage whereStage = (WhereStage) obj;
        return AbstractC6452k.m12177a(this.condition, whereStage.condition) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), whereStage.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        InterfaceC6498l interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore = this.condition.evaluateFunction$com_google_firebase_firebase_firestore(context);
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            C0393Z0 value = ((EvaluateResult) interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore.invoke((MutableDocument) obj)).getValue();
            if (value != null ? value.m746u() : false) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Expression getCondition$com_google_firebase_firebase_firestore() {
        return this.condition;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.condition.hashCode() * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public WhereStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new WhereStage(this.condition, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhereStage(Expression condition, InternalOptions options) {
        super("where", options, null);
        AbstractC6452k.m12181e(condition, "condition");
        AbstractC6452k.m12181e(options, "options");
        this.condition = condition;
    }
}
