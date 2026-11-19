package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.Values;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0068x;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class AddFieldsStage extends Stage<AddFieldsStage> {
    private final Selectable[] fields;

    public /* synthetic */ AddFieldsStage(Selectable[] selectableArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(selectableArr, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
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
        if (!(obj instanceof AddFieldsStage)) {
            return false;
        }
        AddFieldsStage addFieldsStage = (AddFieldsStage) obj;
        return Arrays.equals(this.fields, addFieldsStage.fields) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), addFieldsStage.getOptions$com_google_firebase_firebase_firestore());
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (Arrays.hashCode(this.fields) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public AddFieldsStage self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new AddFieldsStage(this.fields, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFieldsStage(Selectable[] fields, InternalOptions options) {
        super("add_fields", options, null);
        AbstractC6452k.m12181e(fields, "fields");
        AbstractC6452k.m12181e(options, "options");
        this.fields = fields;
        for (Selectable selectable : fields) {
            String alias$com_google_firebase_firebase_firestore = selectable.getAlias$com_google_firebase_firebase_firestore();
            Field field = Field.DOCUMENT_ID;
            if (AbstractC6452k.m12177a(alias$com_google_firebase_firebase_firestore, field.getAlias$com_google_firebase_firebase_firestore())) {
                throw new IllegalArgumentException(("Alias " + field.getAlias$com_google_firebase_firebase_firestore() + " is reserved").toString());
            }
            Field field2 = Field.CREATE_TIME;
            if (AbstractC6452k.m12177a(alias$com_google_firebase_firebase_firestore, field2.getAlias$com_google_firebase_firebase_firestore())) {
                throw new IllegalArgumentException(("Alias " + field2.getAlias$com_google_firebase_firebase_firestore() + " is reserved").toString());
            }
            Field field3 = Field.UPDATE_TIME;
            if (AbstractC6452k.m12177a(alias$com_google_firebase_firebase_firestore, field3.getAlias$com_google_firebase_firebase_firestore())) {
                throw new IllegalArgumentException(("Alias " + field3.getAlias$com_google_firebase_firebase_firestore() + " is reserved").toString());
            }
        }
    }
}
