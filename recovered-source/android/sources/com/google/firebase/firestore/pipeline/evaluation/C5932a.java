package com.google.firebase.firestore.pipeline.evaluation;

import com.google.firebase.firestore.model.MutableDocument;
import java.util.List;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: com.google.firebase.firestore.pipeline.evaluation.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5932a implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23901s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ List f23902t;

    public /* synthetic */ C5932a(List list, int i2) {
        this.f23901s = i2;
        this.f23902t = list;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f23901s) {
            case 0:
                return ArrayKt.evaluateArrayIndexOf$lambda$36$lambda$35(this.f23902t, (MutableDocument) obj);
            case 1:
                return ArrayKt.evaluateArrayMinimumN$lambda$22$lambda$21(this.f23902t, (MutableDocument) obj);
            case 2:
                return ArrayKt.evaluateArrayLastN$lambda$14$lambda$13(this.f23902t, (MutableDocument) obj);
            case 3:
                return ArrayKt.evaluateJoin$lambda$28$lambda$27(this.f23902t, (MutableDocument) obj);
            case 4:
                return ArrayKt.evaluateArrayMaximum$lambda$18$lambda$17(this.f23902t, (MutableDocument) obj);
            case 5:
                return ArrayKt.evaluateArrayGet$lambda$32$lambda$31(this.f23902t, (MutableDocument) obj);
            case 6:
                return ArrayKt.evaluateArrayConcat$lambda$34$lambda$33(this.f23902t, (MutableDocument) obj);
            case 7:
                return ArrayKt.evaluateArrayLast$lambda$10$lambda$9(this.f23902t, (MutableDocument) obj);
            case 8:
                return ArrayKt.evaluateArrayFirstN$lambda$12$lambda$11(this.f23902t, (MutableDocument) obj);
            case 9:
                return ArrayKt.evaluateArrayFirst$lambda$8$lambda$7(this.f23902t, (MutableDocument) obj);
            case 10:
                return ArrayKt.evaluateArrayMinimum$lambda$16$lambda$15(this.f23902t, (MutableDocument) obj);
            case 11:
                return ArrayKt.evaluateArrayIndexOfAll$lambda$38$lambda$37(this.f23902t, (MutableDocument) obj);
            case 12:
                return ArrayKt.evaluateArrayMaximumN$lambda$26$lambda$25(this.f23902t, (MutableDocument) obj);
            case 13:
                return GenericsKt.evaluateConcat$lambda$6$lambda$5(this.f23902t, (MutableDocument) obj);
            case 14:
                return LogicalKt.evaluateOr$lambda$3$lambda$2(this.f23902t, (MutableDocument) obj);
            case 15:
                return LogicalKt.evaluateAnd$lambda$1$lambda$0(this.f23902t, (MutableDocument) obj);
            default:
                return MapsKt.evaluateMap$lambda$2$lambda$1(this.f23902t, (MutableDocument) obj);
        }
    }
}
