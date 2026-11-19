package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class InFilter extends FieldFilter {
    public InFilter(FieldPath fieldPath, C0393Z0 c0393z0) {
        super(fieldPath, FieldFilter.Operator.IN, c0393z0);
        Assert.hardAssert(Values.isArray(c0393z0), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        C0393Z0 field = document.getField(getField());
        return field != null && Values.contains(getValue().m745t(), field);
    }
}
