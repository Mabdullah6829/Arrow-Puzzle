package p000A0;

import androidx.datastore.core.CorruptionException;
import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.AliasedExpression;
import com.google.firebase.firestore.pipeline.DefineStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.pipeline.evaluation.ArrayKt;
import com.google.firebase.firestore.pipeline.evaluation.DebugKt;
import com.google.firebase.firestore.pipeline.evaluation.GenericsKt;
import com.google.firebase.firestore.pipeline.evaluation.LogicalKt;
import com.google.firebase.firestore.pipeline.evaluation.MapsKt;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import java.util.List;
import p062g0.InterfaceC6351f;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0059r implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f74s;

    public /* synthetic */ C0059r(int i2) {
        this.f74s = i2;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        switch (this.f74s) {
            case 0:
                InterfaceC6351f interfaceC6351f = (InterfaceC6351f) obj;
                if (interfaceC6351f instanceof AbstractC0063t) {
                    return (AbstractC0063t) interfaceC6351f;
                }
                return null;
            case 1:
                return RealtimePipeline.canonicalId$lambda$6((Stage) obj);
            case 2:
                return DefineStage.canonicalId$lambda$0((AliasedExpression) obj);
            case 3:
                return SortStage.canonicalId$lambda$0((Ordering) obj);
            case 4:
                return ArrayKt.evaluateArrayFirst$lambda$8((List) obj);
            case 5:
                return ArrayKt.evaluateArrayConcat$lambda$34((List) obj);
            case 6:
                return ArrayKt.evaluateArrayIndexOf$lambda$36((List) obj);
            case 7:
                return ArrayKt.evaluateArrayIndexOfAll$lambda$38((List) obj);
            case 8:
                return ArrayKt.evaluateArrayLast$lambda$10((List) obj);
            case 9:
                return ArrayKt.evaluateArrayFirstN$lambda$12((List) obj);
            case 10:
                return ArrayKt.evaluateArrayLastN$lambda$14((List) obj);
            case 11:
                return ArrayKt.evaluateArrayMinimum$lambda$16((List) obj);
            case 12:
                return ArrayKt.evaluateArrayMaximum$lambda$18((List) obj);
            case 13:
                return ArrayKt.evaluateArrayMinimumN$lambda$22((List) obj);
            case 14:
                return ArrayKt.evaluateArrayMaximumN$lambda$26((List) obj);
            case 15:
                return ArrayKt.evaluateJoin$lambda$28((List) obj);
            case 16:
                return ArrayKt.evaluateArrayGet$lambda$32((List) obj);
            case 17:
                return DebugKt.evaluateError$lambda$2$lambda$1((MutableDocument) obj);
            case 18:
                return DebugKt.evaluateError$lambda$2((List) obj);
            case 19:
                return GenericsKt.evaluateConcat$lambda$6((List) obj);
            case 20:
                return LogicalKt.evaluateAnd$lambda$1((List) obj);
            case 21:
                return LogicalKt.evaluateOr$lambda$3((List) obj);
            case 22:
                return LogicalKt.evaluateIsNull$lambda$13((List) obj);
            case 23:
                return LogicalKt.evaluateIsNotNull$lambda$15((List) obj);
            case 24:
                return MapsKt.evaluateMap$lambda$2((List) obj);
            case 25:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$0((CorruptionException) obj);
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
