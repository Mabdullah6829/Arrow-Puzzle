package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class KeyFieldFilter extends FieldFilter {
    private final DocumentKey key;

    public KeyFieldFilter(FieldPath fieldPath, FieldFilter.Operator operator, C0393Z0 c0393z0) {
        super(fieldPath, operator, c0393z0);
        Assert.hardAssert(Values.isReferenceValue(c0393z0), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.key = DocumentKey.fromName(getValue().m734D());
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        return matchesComparison(document.getKey().compareTo(this.key));
    }
}
