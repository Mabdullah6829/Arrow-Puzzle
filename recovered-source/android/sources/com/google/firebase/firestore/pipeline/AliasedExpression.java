package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class AliasedExpression extends Selectable {
    private final String alias;
    private final Expression expr;

    public AliasedExpression(String alias, Expression expr) {
        AbstractC6452k.m12181e(alias, "alias");
        AbstractC6452k.m12181e(expr, "expr");
        this.alias = alias;
        this.expr = expr;
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getExpr$com_google_firebase_firebase_firestore().canonicalId$com_google_firebase_firebase_firestore();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliasedExpression)) {
            return false;
        }
        AliasedExpression aliasedExpression = (AliasedExpression) obj;
        return AbstractC6452k.m12177a(getAlias$com_google_firebase_firebase_firestore(), aliasedExpression.getAlias$com_google_firebase_firebase_firestore()) && AbstractC6452k.m12177a(getExpr$com_google_firebase_firebase_firestore(), aliasedExpression.getExpr$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public InterfaceC6498l evaluateFunction$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return getExpr$com_google_firebase_firebase_firestore().evaluateFunction$com_google_firebase_firebase_firestore(context);
    }

    @Override // com.google.firebase.firestore.pipeline.Selectable
    public String getAlias$com_google_firebase_firebase_firestore() {
        return this.alias;
    }

    @Override // com.google.firebase.firestore.pipeline.Selectable
    public Expression getExpr$com_google_firebase_firebase_firestore() {
        return this.expr;
    }

    public int hashCode() {
        return getExpr$com_google_firebase_firebase_firestore().hashCode() + (getAlias$com_google_firebase_firebase_firestore().hashCode() * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Expression
    public C0393Z0 toProto$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return getExpr$com_google_firebase_firebase_firestore().toProto$com_google_firebase_firebase_firestore(userDataReader);
    }
}
