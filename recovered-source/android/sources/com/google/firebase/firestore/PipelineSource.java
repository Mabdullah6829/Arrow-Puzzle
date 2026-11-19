package com.google.firebase.firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.pipeline.AliasedAggregate;
import com.google.firebase.firestore.pipeline.CollectionGroupOptions;
import com.google.firebase.firestore.pipeline.CollectionGroupSource;
import com.google.firebase.firestore.pipeline.CollectionSource;
import com.google.firebase.firestore.pipeline.CollectionSourceOptions;
import com.google.firebase.firestore.pipeline.DatabaseSource;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.google.firebase.firestore.pipeline.SubcollectionSource;
import com.google.firebase.firestore.remote.RemoteSerializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.C6313u;

/* JADX INFO: loaded from: classes2.dex */
public final class PipelineSource {
    public static final Companion Companion = new Companion(null);
    private final FirebaseFirestore firestore;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public final Pipeline subcollection(String path) {
            AbstractC6452k.m12181e(path, "path");
            return new Pipeline((FirebaseFirestore) null, (UserDataReader) null, SubcollectionSource.Companion.m11460of(path));
        }

        private Companion() {
        }

        public final Pipeline subcollection(SubcollectionSource source) {
            AbstractC6452k.m12181e(source, "source");
            return new Pipeline((FirebaseFirestore) null, (UserDataReader) null, source);
        }
    }

    public PipelineSource(FirebaseFirestore firestore) {
        AbstractC6452k.m12181e(firestore, "firestore");
        this.firestore = firestore;
    }

    public static final Pipeline subcollection(SubcollectionSource subcollectionSource) {
        return Companion.subcollection(subcollectionSource);
    }

    public final Pipeline collection(String path) {
        AbstractC6452k.m12181e(path, "path");
        CollectionReference collectionReferenceCollection = this.firestore.collection(path);
        AbstractC6452k.m12180d(collectionReferenceCollection, "collection(...)");
        return collection(collectionReferenceCollection);
    }

    public final Pipeline collectionGroup(String collectionId) {
        AbstractC6452k.m12181e(collectionId, "collectionId");
        return collectionGroup(collectionId, new CollectionGroupOptions());
    }

    public final Pipeline createFrom(Query query) {
        AbstractC6452k.m12181e(query, "query");
        if (!AbstractC6452k.m12177a(query.firestore.getDatabaseId(), this.firestore.getDatabaseId())) {
            throw new IllegalArgumentException("Provided query is from a different Firestore instance.");
        }
        com.google.firebase.firestore.core.Query query2 = query.query;
        FirebaseFirestore firebaseFirestore = this.firestore;
        Pipeline pipeline = query2.toPipeline(firebaseFirestore, firebaseFirestore.getUserDataReader());
        AbstractC6452k.m12180d(pipeline, "toPipeline(...)");
        return pipeline;
    }

    public final Pipeline database() {
        FirebaseFirestore firebaseFirestore = this.firestore;
        return new Pipeline(firebaseFirestore, firebaseFirestore.getUserDataReader(), new DatabaseSource(null, 1, null));
    }

    public final Pipeline documents(String... documents) {
        AbstractC6452k.m12181e(documents, "documents");
        FirebaseFirestore firebaseFirestore = this.firestore;
        ArrayList arrayList = new ArrayList(documents.length);
        for (String str : documents) {
            arrayList.add(firebaseFirestore.document(str));
        }
        DocumentReference[] documentReferenceArr = (DocumentReference[]) arrayList.toArray(new DocumentReference[0]);
        return documents((DocumentReference[]) Arrays.copyOf(documentReferenceArr, documentReferenceArr.length));
    }

    public static final Pipeline subcollection(String str) {
        return Companion.subcollection(str);
    }

    public final Pipeline collection(CollectionReference ref) {
        AbstractC6452k.m12181e(ref, "ref");
        return collection(ref, new CollectionSourceOptions());
    }

    public final Pipeline collectionGroup(String collectionId, CollectionGroupOptions options) {
        AbstractC6452k.m12181e(collectionId, "collectionId");
        AbstractC6452k.m12181e(options, "options");
        FirebaseFirestore firebaseFirestore = this.firestore;
        return new Pipeline(firebaseFirestore, firebaseFirestore.getUserDataReader(), new CollectionGroupSource(collectionId, options));
    }

    public final Pipeline collection(CollectionReference ref, CollectionSourceOptions options) {
        FirebaseOptions options2;
        FirebaseOptions options3;
        AbstractC6452k.m12181e(ref, "ref");
        AbstractC6452k.m12181e(options, "options");
        if (AbstractC6452k.m12177a(ref.firestore.getDatabaseId(), this.firestore.getDatabaseId())) {
            FirebaseApp app = ref.firestore.getApp();
            String projectId = null;
            String projectId2 = (app == null || (options3 = app.getOptions()) == null) ? null : options3.getProjectId();
            FirebaseApp app2 = this.firestore.getApp();
            if (app2 != null && (options2 = app2.getOptions()) != null) {
                projectId = options2.getProjectId();
            }
            if (AbstractC6452k.m12177a(projectId2, projectId)) {
                FirebaseFirestore firebaseFirestore = this.firestore;
                UserDataReader userDataReader = firebaseFirestore.getUserDataReader();
                ResourcePath resourcePathFromString = ResourcePath.fromString(ref.getPath());
                AbstractC6452k.m12180d(resourcePathFromString, "fromString(...)");
                return new Pipeline(firebaseFirestore, userDataReader, new CollectionSource(resourcePathFromString, new RemoteSerializer(this.firestore.getDatabaseId()), options));
            }
        }
        throw new IllegalArgumentException("Invalid CollectionReference. The Firestore instance of the CollectionReference must match the Firestore instance of the PipelineSource.");
    }

    public final Pipeline createFrom(AggregateQuery aggregateQuery) {
        Iterable iterableM1752k;
        AbstractC6452k.m12181e(aggregateQuery, "aggregateQuery");
        List<AggregateField> aggregateFields = aggregateQuery.getAggregateFields();
        AbstractC6452k.m12180d(aggregateFields, "getAggregateFields(...)");
        Query query = aggregateQuery.getQuery();
        AbstractC6452k.m12180d(query, "getQuery(...)");
        Pipeline pipelineCreateFrom = createFrom(query);
        AliasedAggregate pipeline = ((AggregateField) AbstractC6305m.m12116x(aggregateFields)).toPipeline();
        AbstractC6452k.m12180d(pipeline, "toPipeline(...)");
        int size = aggregateFields.size() - 1;
        if (size <= 0) {
            iterableM1752k = C6313u.f24338s;
        } else if (size == 1) {
            iterableM1752k = AbstractC0846b.m1752k(AbstractC6305m.m12106B(aggregateFields));
        } else {
            ArrayList arrayList = new ArrayList(size);
            if (aggregateFields instanceof RandomAccess) {
                int size2 = aggregateFields.size();
                for (int i2 = 1; i2 < size2; i2++) {
                    arrayList.add(aggregateFields.get(i2));
                }
            } else {
                ListIterator<AggregateField> listIterator = aggregateFields.listIterator(1);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            iterableM1752k = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC6307o.m12123u(iterableM1752k, 10));
        Iterator it = iterableM1752k.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AggregateField) it.next()).toPipeline());
        }
        AliasedAggregate[] aliasedAggregateArr = (AliasedAggregate[]) arrayList2.toArray(new AliasedAggregate[0]);
        return pipelineCreateFrom.aggregate(pipeline, (AliasedAggregate[]) Arrays.copyOf(aliasedAggregateArr, aliasedAggregateArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pipeline documents(DocumentReference... documents) {
        AbstractC6452k.m12181e(documents, "documents");
        DatabaseId databaseId = this.firestore.getDatabaseId();
        AbstractC6452k.m12180d(databaseId, "getDatabaseId(...)");
        for (DocumentReference documentReference : documents) {
            if (!AbstractC6452k.m12177a(documentReference.getFirestore().getDatabaseId(), databaseId)) {
                throw new IllegalArgumentException("Provided document reference is from a different Firestore instance.");
            }
        }
        FirebaseFirestore firebaseFirestore = this.firestore;
        UserDataReader userDataReader = firebaseFirestore.getUserDataReader();
        ArrayList arrayList = new ArrayList(documents.length);
        for (DocumentReference documentReference2 : documents) {
            arrayList.add(ResourcePath.fromString(documentReference2.getPath()));
        }
        return new Pipeline(firebaseFirestore, userDataReader, new DocumentsSource((ResourcePath[]) arrayList.toArray(new ResourcePath[0]), null, 2, 0 == true ? 1 : 0));
    }
}
