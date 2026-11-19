package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6305m;
import p089x0.AbstractC6566i;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class SortStage extends Stage<SortStage> {
    private final Ordering[] orders;
    public static final Companion Companion = new Companion(null);
    private static final SortStage BY_DOCUMENT_ID = new SortStage(new Ordering[]{Field.DOCUMENT_ID.ascending()}, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final SortStage getBY_DOCUMENT_ID$com_google_firebase_firebase_firestore() {
            return SortStage.BY_DOCUMENT_ID;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SortStage(Ordering[] orderingArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(orderingArr, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0393Z0 args$lambda$1(UserDataReader userDataReader, Ordering it) {
        AbstractC6452k.m12181e(it, "it");
        return it.toProto$com_google_firebase_firebase_firestore(userDataReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence canonicalId$lambda$0(Ordering it) {
        AbstractC6452k.m12181e(it, "it");
        return it.canonicalId$com_google_firebase_firebase_firestore();
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6566i.m12219u(AbstractC6302j.m12096r(this.orders), new C5823b(userDataReader, 1));
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getName$com_google_firebase_firebase_firestore() + '(' + AbstractC6302j.m12093D(this.orders, new C0059r(3)) + ')';
    }

    public final Comparator<Document> comparator$com_google_firebase_firebase_firestore(EvaluationContext context) {
        AbstractC6452k.m12181e(context, "context");
        return StageKt.comparatorFromOrderings(context, this.orders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SortStage)) {
            return false;
        }
        SortStage sortStage = (SortStage) obj;
        return Arrays.equals(this.orders, sortStage.orders) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), sortStage.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        return AbstractC6305m.m12110F(inputs, comparator$com_google_firebase_firebase_firestore(context));
    }

    public final Ordering[] getOrders() {
        return this.orders;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (Arrays.hashCode(this.orders) * 31);
    }

    public final SortStage withStableOrdering$com_google_firebase_firebase_firestore() {
        Ordering[] orderingArr = this.orders;
        int length = orderingArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            Expression expr = orderingArr[i2].getExpr();
            Field field = expr instanceof Field ? (Field) expr : null;
            if (AbstractC6452k.m12177a(field != null ? field.getAlias$com_google_firebase_firebase_firestore() : null, DocumentKey.KEY_FIELD_NAME)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            return new SortStage((Ordering[]) AbstractC6305m.m12107C(Field.DOCUMENT_ID.ascending(), AbstractC6302j.m12095q(this.orders)).toArray(new Ordering[0]), getOptions$com_google_firebase_firebase_firestore());
        }
        return this;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public SortStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new SortStage(this.orders, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortStage(Ordering[] orders, InternalOptions options) {
        super("sort", options, null);
        AbstractC6452k.m12181e(orders, "orders");
        AbstractC6452k.m12181e(options, "options");
        this.orders = orders;
    }
}
