package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p022N.C0393Z0;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6305m;
import p058e0.C6313u;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class LimitStage extends Stage<LimitStage> {
    private final int limit;

    public /* synthetic */ LimitStage(int i2, InternalOptions internalOptions, int i3, AbstractC6447f abstractC6447f) {
        this(i2, (i3 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue(this.limit)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getName$com_google_firebase_firebase_firestore() + '(' + this.limit + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitStage)) {
            return false;
        }
        LimitStage limitStage = (LimitStage) obj;
        return this.limit == limitStage.limit && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), limitStage.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        int i2 = this.limit;
        C6313u c6313u = C6313u.f24338s;
        if (i2 > 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Requested element count ", " is less than zero.").toString());
            }
            if (i2 != 0) {
                if (i2 >= inputs.size()) {
                    return AbstractC6305m.m12112H(inputs);
                }
                if (i2 == 1) {
                    return AbstractC0846b.m1752k(AbstractC6305m.m12116x(inputs));
                }
                ArrayList arrayList = new ArrayList(i2);
                Iterator<T> it = inputs.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    arrayList.add(it.next());
                    i3++;
                    if (i3 == i2) {
                        break;
                    }
                }
                int size = arrayList.size();
                if (size != 0) {
                    return size != 1 ? arrayList : AbstractC0846b.m1752k(arrayList.get(0));
                }
                return c6313u;
            }
        } else if (i2 < 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Requested element count ", " is less than zero.").toString());
            }
            if (i2 != 0) {
                int size2 = inputs.size();
                if (i2 >= size2) {
                    return AbstractC6305m.m12112H(inputs);
                }
                if (i2 == 1) {
                    return AbstractC0846b.m1752k(AbstractC6305m.m12106B(inputs));
                }
                ArrayList arrayList2 = new ArrayList(i2);
                if (inputs instanceof RandomAccess) {
                    for (int i4 = size2 - i2; i4 < size2; i4++) {
                        arrayList2.add(inputs.get(i4));
                    }
                } else {
                    ListIterator<MutableDocument> listIterator = inputs.listIterator(size2 - i2);
                    while (listIterator.hasNext()) {
                        arrayList2.add(listIterator.next());
                    }
                }
                return arrayList2;
            }
        }
        return c6313u;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.limit * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitStage(int i2, InternalOptions options) {
        super("limit", options, null);
        AbstractC6452k.m12181e(options, "options");
        this.limit = i2;
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public LimitStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new LimitStage(this.limit, options);
    }
}
