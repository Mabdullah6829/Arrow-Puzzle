package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayContainsFilter extends FieldFilter {
    public ArrayContainsFilter(FieldPath fieldPath, C0393Z0 c0393z0) {
        super(fieldPath, FieldFilter.Operator.ARRAY_CONTAINS, c0393z0);
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        C0393Z0 field = document.getField(getField());
        return Values.isArray(field) && Values.contains(field.m745t(), getValue());
    }
}
