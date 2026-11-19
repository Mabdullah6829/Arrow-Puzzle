package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import kotlin.jvm.internal.AbstractC6451j;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class DocumentsSource$args$1 extends AbstractC6451j implements InterfaceC6498l {
    public DocumentsSource$args$1(Object obj) {
        super(1, obj, Values.class, "encodeValue", "encodeValue(Lcom/google/firebase/firestore/model/ResourcePath;)Lcom/google/firestore/v1/Value;", 0);
    }

    @Override // p078p0.InterfaceC6498l
    public final C0393Z0 invoke(ResourcePath p1) {
        AbstractC6452k.m12181e(p1, "p0");
        return Values.encodeValue(p1);
    }
}
