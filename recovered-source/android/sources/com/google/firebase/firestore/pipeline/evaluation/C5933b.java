package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5933b implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23903s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC6498l f23904t;

    public /* synthetic */ C5933b(int i2, InterfaceC6498l interfaceC6498l) {
        this.f23903s = i2;
        this.f23904t = interfaceC6498l;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f23903s) {
            case 0:
                return LogicalKt.evaluateIsNotNull$lambda$15$lambda$14(this.f23904t, (MutableDocument) obj);
            default:
                return LogicalKt.evaluateIsNull$lambda$13$lambda$12(this.f23904t, (MutableDocument) obj);
        }
    }
}
