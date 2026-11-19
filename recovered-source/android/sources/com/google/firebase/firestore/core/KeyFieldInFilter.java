package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class KeyFieldInFilter extends FieldFilter {
    private final List<DocumentKey> keys;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyFieldInFilter(FieldPath fieldPath, C0393Z0 c0393z0) {
        FieldFilter.Operator operator = FieldFilter.Operator.IN;
        super(fieldPath, operator, c0393z0);
        ArrayList arrayList = new ArrayList();
        this.keys = arrayList;
        arrayList.addAll(extractDocumentKeysFromArrayValue(operator, c0393z0));
    }

    public static List<DocumentKey> extractDocumentKeysFromArrayValue(FieldFilter.Operator operator, C0393Z0 c0393z0) {
        Assert.hardAssert(operator == FieldFilter.Operator.IN || operator == FieldFilter.Operator.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        Assert.hardAssert(Values.isArray(c0393z0), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C0393Z0 c0393z1 : c0393z0.m745t().getValuesList()) {
            Assert.hardAssert(Values.isReferenceValue(c0393z1), "Comparing on key with " + operator.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(DocumentKey.fromName(c0393z1.m734D()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        return this.keys.contains(document.getKey());
    }
}
