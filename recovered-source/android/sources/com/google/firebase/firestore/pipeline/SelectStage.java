package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p034T.C0783s0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectStage extends Stage<SelectStage> {
    public static final Companion Companion = new Companion(null);
    private final Selectable[] fields;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        /* JADX INFO: renamed from: of */
        public final SelectStage m11454of(Selectable selection, Object... additionalSelections) {
            AbstractC6452k.m12181e(selection, "selection");
            AbstractC6452k.m12181e(additionalSelections, "additionalSelections");
            C0783s0 c0783s0 = new C0783s0(2);
            c0783s0.m1657a(selection);
            Selectable.Companion companion = Selectable.Companion;
            ArrayList arrayList = new ArrayList(additionalSelections.length);
            for (Object obj : additionalSelections) {
                arrayList.add(companion.toSelectable(obj));
            }
            c0783s0.m1658b(arrayList.toArray(new Selectable[0]));
            ArrayList arrayList2 = c0783s0.f2033b;
            return new SelectStage((Selectable[]) arrayList2.toArray(new Selectable[arrayList2.size()]), InternalOptions.EMPTY, null);
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: of */
        public final SelectStage m11455of(String fieldName, Object... additionalSelections) {
            AbstractC6452k.m12181e(fieldName, "fieldName");
            AbstractC6452k.m12181e(additionalSelections, "additionalSelections");
            return m11454of(Expression.Companion.field(fieldName), Arrays.copyOf(additionalSelections, additionalSelections.length));
        }
    }

    public /* synthetic */ SelectStage(Selectable[] selectableArr, InternalOptions internalOptions, AbstractC6447f abstractC6447f) {
        this(selectableArr, internalOptions);
    }

    /* JADX INFO: renamed from: of */
    public static final SelectStage m11452of(Selectable selectable, Object... objArr) {
        return Companion.m11454of(selectable, objArr);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6302j.m12096r(new C0393Z0[]{Values.encodeValue((Map<String, C0393Z0>) StageKt.associateWithoutDuplications(this.fields, userDataReader))});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        throw new C0068x("An operation is not implemented: Not yet implemented");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectStage)) {
            return false;
        }
        SelectStage selectStage = (SelectStage) obj;
        return Arrays.equals(this.fields, selectStage.fields) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), selectStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public final Selectable[] getFields$com_google_firebase_firebase_firestore() {
        return this.fields;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (Arrays.hashCode(this.fields) * 31);
    }

    private SelectStage(Selectable[] selectableArr, InternalOptions internalOptions) {
        super("select", internalOptions, null);
        this.fields = selectableArr;
    }

    /* JADX INFO: renamed from: of */
    public static final SelectStage m11453of(String str, Object... objArr) {
        return Companion.m11455of(str, objArr);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public SelectStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new SelectStage(this.fields, options);
    }
}
