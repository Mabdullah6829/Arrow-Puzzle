package com.google.firebase.firestore.pipeline;

import com.google.firebase.firestore.UserDataReader;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.pipeline.evaluation.EvaluationContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p057d0.InterfaceC6281c;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6318z;
import p089x0.AbstractC6566i;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentsSource extends Stage<DocumentsSource> {
    private final InterfaceC6281c docKeySet$delegate;
    private final ResourcePath[] documents;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocumentsSource(ResourcePath[] documents) {
        this(documents, null, 2, 0 == true ? 1 : 0);
        AbstractC6452k.m12181e(documents, "documents");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet docKeySet_delegate$lambda$1(DocumentsSource documentsSource) {
        ResourcePath[] resourcePathArr = documentsSource.documents;
        ArrayList arrayList = new ArrayList(resourcePathArr.length);
        for (ResourcePath resourcePath : resourcePathArr) {
            arrayList.add(resourcePath.canonicalString());
        }
        HashSet hashSet = new HashSet(AbstractC6318z.m12126t(AbstractC6307o.m12123u(arrayList, 12)));
        AbstractC6305m.m12111G(arrayList, hashSet);
        return hashSet;
    }

    private final HashSet<String> getDocKeySet() {
        return (HashSet) this.docKeySet$delegate.getValue();
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public InterfaceC6563f args$com_google_firebase_firebase_firestore(UserDataReader userDataReader) {
        AbstractC6452k.m12181e(userDataReader, "userDataReader");
        return AbstractC6566i.m12219u(AbstractC6302j.m12096r(this.documents), new DocumentsSource$args$1(Values.INSTANCE));
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public String canonicalId$com_google_firebase_firebase_firestore() {
        ResourcePath[] resourcePathArr = this.documents;
        AbstractC6452k.m12181e(resourcePathArr, "<this>");
        if (resourcePathArr.length != 0) {
            Object[] objArrCopyOf = Arrays.copyOf(resourcePathArr, resourcePathArr.length);
            AbstractC6452k.m12180d(objArrCopyOf, "copyOf(...)");
            resourcePathArr = (Comparable[]) objArrCopyOf;
            if (resourcePathArr.length > 1) {
                Arrays.sort(resourcePathArr);
            }
        }
        List listM12095q = AbstractC6302j.m12095q(resourcePathArr);
        StringBuilder sb = new StringBuilder();
        sb.append(getName$com_google_firebase_firebase_firestore());
        sb.append('(');
        return AbstractC0271e0.m401i(sb, AbstractC6305m.m12105A(listM12095q, ",", null, null, null, 62), ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentsSource)) {
            return false;
        }
        DocumentsSource documentsSource = (DocumentsSource) obj;
        return Arrays.equals(this.documents, documentsSource.documents) && AbstractC6452k.m12177a(getOptions$com_google_firebase_firebase_firestore(), documentsSource.getOptions$com_google_firebase_firebase_firestore());
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public List<MutableDocument> evaluate$com_google_firebase_firebase_firestore(EvaluationContext context, List<MutableDocument> inputs) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(inputs, "inputs");
        ArrayList arrayList = new ArrayList();
        for (Object obj : inputs) {
            MutableDocument mutableDocument = (MutableDocument) obj;
            if (mutableDocument.isFoundDocument() && getDocKeySet().contains(mutableDocument.getKey().getPath().canonicalString())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ResourcePath[] getDocuments() {
        return this.documents;
    }

    public int hashCode() {
        return getOptions$com_google_firebase_firebase_firestore().hashCode() + (Arrays.hashCode(this.documents) * 31);
    }

    public /* synthetic */ DocumentsSource(ResourcePath[] resourcePathArr, InternalOptions internalOptions, int i2, AbstractC6447f abstractC6447f) {
        this(resourcePathArr, (i2 & 2) != 0 ? InternalOptions.EMPTY : internalOptions);
    }

    @Override // com.google.firebase.firestore.pipeline.Stage
    public DocumentsSource self$com_google_firebase_firebase_firestore(InternalOptions options) {
        AbstractC6452k.m12181e(options, "options");
        return new DocumentsSource(this.documents, options);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentsSource(ResourcePath[] documents, InternalOptions options) {
        super("documents", options, null);
        AbstractC6452k.m12181e(documents, "documents");
        AbstractC6452k.m12181e(options, "options");
        this.documents = documents;
        this.docKeySet$delegate = AbstractC0242F.m357n(new C5822a(this, 0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DocumentsSource(String document) {
        this(new ResourcePath[]{ResourcePath.fromString(document)}, null, 2, 0 == true ? 1 : 0);
        AbstractC6452k.m12181e(document, "document");
    }
}
