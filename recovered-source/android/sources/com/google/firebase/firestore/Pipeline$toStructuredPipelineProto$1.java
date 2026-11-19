package com.google.firebase.firestore;

import kotlin.jvm.internal.C6442a;
import p022N.C0393Z0;
import p022N.C0426l0;
import p057d0.C6289k;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class Pipeline$toStructuredPipelineProto$1 extends C6442a implements InterfaceC6502p {
    public Pipeline$toStructuredPipelineProto$1(Object obj) {
        super(obj, C0426l0.class, "putOptions", "putOptions(Ljava/lang/String;Lcom/google/firestore/v1/Value;)Lcom/google/firestore/v1/StructuredPipeline$Builder;", 8);
    }

    @Override // p078p0.InterfaceC6502p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (C0393Z0) obj2);
        return C6289k.f24318a;
    }

    public final void invoke(String str, C0393Z0 c0393z0) {
        ((C0426l0) this.receiver).m854b(str, c0393z0);
    }
}
