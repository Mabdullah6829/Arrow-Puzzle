package com.google.firebase.firestore.model;

import kotlin.jvm.internal.AbstractC6451j;
import p022N.C0393Z0;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class Values$Enterprise$compare$1 extends AbstractC6451j implements InterfaceC6502p {
    public Values$Enterprise$compare$1(Object obj) {
        super(2, obj, Values.class, "compare", "compare(Lcom/google/firestore/v1/Value;Lcom/google/firestore/v1/Value;)I", 0);
    }

    @Override // p078p0.InterfaceC6502p
    public final Integer invoke(C0393Z0 c0393z0, C0393Z0 c0393z1) {
        return Integer.valueOf(Values.compare(c0393z0, c0393z1));
    }
}
