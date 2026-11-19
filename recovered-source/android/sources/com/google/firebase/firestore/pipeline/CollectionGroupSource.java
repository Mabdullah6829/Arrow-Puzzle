package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p022N.C0389X0;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionGroupSource extends Stage<CollectionGroupSource> {
    private final String collectionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionGroupSource(String collectionId, InternalOptions options) {
        super("collection_group", options, null);
        AbstractC6452k.m12181e(collectionId, "collectionId");
        AbstractC6452k.m12181e(options, "options");
        this.collectionId = collectionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m700s("");
        return AbstractC6302j.m12096r(new C0393Z0[]{c0389x0M714O.m12341build(), Values.encodeValue(this.collectionId)});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName$com_google_firebase_firebase_firestore());
        sb.append('(');
        return AbstractC0271e0.m401i(sb, this.collectionId, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionGroupSource)) {
            return false;
        }
        CollectionGroupSource collectionGroupSource = (CollectionGroupSource) obj;
        return AbstractC6452k.m12177a(this.collectionId, collectionGroupSource.collectionId) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), collectionGroupSource.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            MutableDocument mutableDocument = (MutableDocument) obj;
            if (mutableDocument.isFoundDocument() && AbstractC6452k.m12177a(mutableDocument.getKey().getCollectionGroup(), this.collectionId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (this.collectionId.hashCode() * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public CollectionGroupSource self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new CollectionGroupSource(this.collectionId, options);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionGroupSource(String collectionId, CollectionGroupOptions options) {
        this(collectionId, options.getOptions$com_google_firebase_firebase_firestore());
        AbstractC6452k.m12181e(collectionId, "collectionId");
        AbstractC6452k.m12181e(options, "options");
    }
}
