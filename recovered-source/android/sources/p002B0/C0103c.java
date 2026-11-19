package p002B0;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.Field;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import p000A0.RunnableC0046k0;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: B0.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0103c implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f148s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f149t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f150u;

    public /* synthetic */ C0103c(int i2, Object obj, Object obj2) {
        this.f148s = i2;
        this.f149t = obj;
        this.f150u = obj2;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f148s) {
            case 0:
                C0104d c0104d = (C0104d) this.f149t;
                c0104d.f151s.removeCallbacks((RunnableC0046k0) this.f150u);
                return C6289k.f24318a;
            default:
                return Field.evaluateFunction$lambda$1((Field) this.f149t, (EvaluationContext) this.f150u, (MutableDocument) obj);
        }
    }
}
