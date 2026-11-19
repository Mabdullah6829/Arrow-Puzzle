package com.google.firebase.firestore.pipeline;

import kotlin.jvm.internal.AbstractC6451j;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0393Z0;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class RemoveFieldsStage$args$1 extends AbstractC6451j implements InterfaceC6498l {
    public static final RemoveFieldsStage$args$1 INSTANCE = new RemoveFieldsStage$args$1();

    public RemoveFieldsStage$args$1() {
        super(1, Field.class, "toProto", "toProto$com_google_firebase_firebase_firestore()Lcom/google/firestore/v1/Value;", 0);
    }

    @Override // p078p0.InterfaceC6498l
    public final C0393Z0 invoke(Field p1) {
        AbstractC6452k.m12181e(p1, "p0");
        return p1.toProto$com_google_firebase_firebase_firestore();
    }
}
