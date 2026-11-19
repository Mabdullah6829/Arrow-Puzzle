package com.google.firebase.firestore;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.pipeline.CollectionGroupOptions;
import com.google.firebase.firestore.pipeline.CollectionGroupSource;
import com.google.firebase.firestore.pipeline.CollectionSource;
import com.google.firebase.firestore.pipeline.CollectionSourceOptions;
import com.google.firebase.firestore.remote.RemoteSerializer;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class RealtimePipelineSource {
    private final FirebaseFirestore firestore;

    public RealtimePipelineSource(FirebaseFirestore firestore) {
        AbstractC6452k.m12181e(firestore, "firestore");
        this.firestore = firestore;
    }

    public final RealtimePipeline collection(String path) {
        AbstractC6452k.m12181e(path, "path");
        CollectionReference collectionReferenceCollection = this.firestore.collection(path);
        AbstractC6452k.m12180d(collectionReferenceCollection, "collection(...)");
        return collection(collectionReferenceCollection);
    }

    public final RealtimePipeline collection$com_google_firebase_firebase_firestore(CollectionSource stage) {
        AbstractC6452k.m12181e(stage, "stage");
        if (!AbstractC6452k.m12177a(stage.getSerializer$com_google_firebase_firebase_firestore().databaseId(), this.firestore.getDatabaseId())) {
            throw new IllegalArgumentException("Provided collection is from a different Firestore instance.");
        }
        FirebaseFirestore firebaseFirestore = this.firestore;
        RemoteSerializer remoteSerializer = new RemoteSerializer(firebaseFirestore.getDatabaseId());
        UserDataReader userDataReader = this.firestore.getUserDataReader();
        AbstractC6452k.m12180d(userDataReader, "getUserDataReader(...)");
        return new RealtimePipeline(firebaseFirestore, remoteSerializer, userDataReader, stage);
    }

    public final RealtimePipeline collectionGroup(String collectionId) {
        AbstractC6452k.m12181e(collectionId, "collectionId");
        return collectionGroup$com_google_firebase_firebase_firestore(new CollectionGroupSource(collectionId, new CollectionGroupOptions()));
    }

    public final RealtimePipeline collectionGroup$com_google_firebase_firebase_firestore(CollectionGroupSource stage) {
        AbstractC6452k.m12181e(stage, "stage");
        FirebaseFirestore firebaseFirestore = this.firestore;
        RemoteSerializer remoteSerializer = new RemoteSerializer(firebaseFirestore.getDatabaseId());
        UserDataReader userDataReader = this.firestore.getUserDataReader();
        AbstractC6452k.m12180d(userDataReader, "getUserDataReader(...)");
        return new RealtimePipeline(firebaseFirestore, remoteSerializer, userDataReader, stage);
    }

    public final RealtimePipeline convertFrom(Query query) {
        AbstractC6452k.m12181e(query, "query");
        if (!AbstractC6452k.m12177a(query.firestore.getDatabaseId(), this.firestore.getDatabaseId())) {
            throw new IllegalArgumentException("Provided query is from a different Firestore instance.");
        }
        com.google.firebase.firestore.core.Query query2 = query.query;
        FirebaseFirestore firebaseFirestore = this.firestore;
        RealtimePipeline realtimePipeline = query2.toRealtimePipeline(firebaseFirestore, firebaseFirestore.getUserDataReader());
        AbstractC6452k.m12180d(realtimePipeline, "toRealtimePipeline(...)");
        return realtimePipeline;
    }

    public final RealtimePipeline collection(CollectionReference ref) {
        AbstractC6452k.m12181e(ref, "ref");
        ResourcePath resourcePathFromString = ResourcePath.fromString(ref.getPath());
        AbstractC6452k.m12180d(resourcePathFromString, "fromString(...)");
        return collection$com_google_firebase_firebase_firestore(new CollectionSource(resourcePathFromString, new RemoteSerializer(this.firestore.getDatabaseId()), new CollectionSourceOptions()));
    }
}
