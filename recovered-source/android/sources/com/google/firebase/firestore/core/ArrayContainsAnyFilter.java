package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import java.util.Iterator;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayContainsAnyFilter extends FieldFilter {
    public ArrayContainsAnyFilter(FieldPath fieldPath, C0393Z0 c0393z0) {
        super(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS_ANY, c0393z0);
        Assert.hardAssert(Values.isArray(c0393z0), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        C0393Z0 field = document.getField(getField());
        if (!Values.isArray(field)) {
            return false;
        }
        Iterator it = field.m745t().getValuesList().iterator();
        while (it.hasNext()) {
            if (Values.contains(getValue().m745t(), (C0393Z0) it.next())) {
                return true;
            }
        }
        return false;
    }
}
