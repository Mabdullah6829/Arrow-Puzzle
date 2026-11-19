package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.EvaluateResult;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public final class StageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, C0393Z0> associateWithoutDuplications(Selectable[] selectableArr, UserDataReader userDataReader) {
        HashMap map = new HashMap();
        for (Selectable selectable : selectableArr) {
            if (map.containsKey(selectable.getAlias$com_google_firebase_firebase_firestore())) {
                throw new IllegalArgumentException("Duplicate alias: '" + selectable.getAlias$com_google_firebase_firebase_firestore() + '\'');
            }
            map.put(selectable.getAlias$com_google_firebase_firebase_firestore(), selectable.toProto$com_google_firebase_firebase_firestore(userDataReader));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparator<Document> comparatorFromOrderings(final EvaluationContext evaluationContext, final Ordering[] orderingArr) {
        return new Comparator() { // from class: com.google.firebase.firestore.pipeline.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return StageKt.comparatorFromOrderings$lambda$1(orderingArr, evaluationContext, (Document) obj, (Document) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparatorFromOrderings$lambda$1(Ordering[] orderingArr, EvaluationContext evaluationContext, Document document, Document document2) {
        C0393Z0 value;
        C0393Z0 value2;
        for (Ordering ordering : orderingArr) {
            Expression expr = ordering.getExpr();
            InterfaceC6498l interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore = expr.evaluateFunction$com_google_firebase_firebase_firestore(evaluationContext);
            AbstractC6452k.m12179c(document, "null cannot be cast to non-null type com.google.firebase.firestore.model.MutableDocument");
            EvaluateResult evaluateResult = (EvaluateResult) interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore.invoke((MutableDocument) document);
            InterfaceC6498l interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore2 = expr.evaluateFunction$com_google_firebase_firebase_firestore(evaluationContext);
            AbstractC6452k.m12179c(document2, "null cannot be cast to non-null type com.google.firebase.firestore.model.MutableDocument");
            EvaluateResult evaluateResult2 = (EvaluateResult) interfaceC6498lEvaluateFunction$com_google_firebase_firebase_firestore2.invoke((MutableDocument) document2);
            if (evaluateResult.isError() || evaluateResult.isUnset()) {
                value = Values.NULL_VALUE;
            } else {
                value = evaluateResult.getValue();
                AbstractC6452k.m12178b(value);
            }
            if (evaluateResult2.isError() || evaluateResult2.isUnset()) {
                value2 = Values.NULL_VALUE;
            } else {
                value2 = evaluateResult2.getValue();
                AbstractC6452k.m12178b(value2);
            }
            int iCompare = Values.compare(value, value2);
            if (iCompare != 0) {
                return ordering.getDir() == Ordering.Direction.ASCENDING ? iCompare : -iCompare;
            }
        }
        return 0;
    }
}
