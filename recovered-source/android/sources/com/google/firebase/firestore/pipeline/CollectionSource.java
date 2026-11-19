package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import com.google.firebase.firestore.remote.RemoteSerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.C0389X0;
import p022N.C0393Z0;
import p058e0.AbstractC6302j;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionSource extends Stage<CollectionSource> {
    private final ResourcePath path;
    private final RemoteSerializer serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSource(ResourcePath path, RemoteSerializer serializer, InternalOptions options) {
        super("collection", options, null);
        AbstractC6452k.m12181e(path, "path");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(options, "options");
        this.path = path;
        this.serializer = serializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        C0389X0 c0389x0M714O = C0393Z0.m714O();
        c0389x0M714O.m700s("/" + this.path.canonicalString());
        return AbstractC6302j.m12096r(new C0393Z0[]{c0389x0M714O.m12341build()});
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        return getName$com_google_firebase_firebase_firestore() + '(' + this.path.canonicalString() + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionSource)) {
            return false;
        }
        CollectionSource collectionSource = (CollectionSource) obj;
        return AbstractC6452k.m12177a(this.path, collectionSource.path) && AbstractC6452k.m12177a(this.serializer.databaseId(), collectionSource.serializer.databaseId()) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), collectionSource.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            MutableDocument mutableDocument = (MutableDocument) obj;
            if (mutableDocument.isFoundDocument() && AbstractC6452k.m12177a(mutableDocument.getKey().getCollectionPath(), this.path)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ResourcePath getPath$com_google_firebase_firebase_firestore() {
        return this.path;
    }

    public final RemoteSerializer getSerializer$com_google_firebase_firebase_firestore() {
        return this.serializer;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + ((this.serializer.databaseId().hashCode() + (this.path.hashCode() * 31)) * 31);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public CollectionSource self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new CollectionSource(this.path, this.serializer, options);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionSource(ResourcePath path, RemoteSerializer serializer, CollectionSourceOptions options) {
        this(path, serializer, options.getOptions$com_google_firebase_firebase_firestore());
        AbstractC6452k.m12181e(path, "path");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(options, "options");
    }
}
