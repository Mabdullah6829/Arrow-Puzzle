package p014I0;

import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.Expression;
import p025O0.C0488m;
import p057d0.C6289k;
import p058e0.AbstractC6293a;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: I0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0313b implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f628s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f629t;

    public /* synthetic */ C0313b(C0315d c0315d, C0314c c0314c) {
        this.f628s = 0;
        this.f629t = c0315d;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f628s) {
            case 0:
                ((C0315d) this.f629t).m464f(null);
                return C6289k.f24318a;
            case 1:
                C0488m c0488m = (C0488m) this.f629t;
                int iIntValue = ((Integer) obj).intValue();
                return c0488m.f1028e[iIntValue] + ": " + c0488m.mo502h(iIntValue).mo496a();
            case 2:
                return Expression.Constant.evaluateFunction$lambda$0((Expression.Constant) this.f629t, (MutableDocument) obj);
            default:
                return obj == ((AbstractC6293a) this.f629t) ? "(this Collection)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ C0313b(Object obj, int i2) {
        this.f628s = i2;
        this.f629t = obj;
    }
}
