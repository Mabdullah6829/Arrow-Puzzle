package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldPath;
import java.util.ArrayList;
import java.util.List;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public class KeyFieldNotInFilter extends FieldFilter {
    private final List<DocumentKey> keys;

    /* JADX WARN: Illegal instructions before constructor call */
    public KeyFieldNotInFilter(FieldPath fieldPath, C0393Z0 c0393z0) {
        FieldFilter.Operator operator = FieldFilter.Operator.NOT_IN;
        super(fieldPath, operator, c0393z0);
        ArrayList arrayList = new ArrayList();
        this.keys = arrayList;
        arrayList.addAll(KeyFieldInFilter.extractDocumentKeysFromArrayValue(operator, c0393z0));
    }

    @Override // com.google.firebase.firestore.core.FieldFilter, com.google.firebase.firestore.core.Filter
    public boolean matches(Document document) {
        return !this.keys.contains(document.getKey());
    }
}
