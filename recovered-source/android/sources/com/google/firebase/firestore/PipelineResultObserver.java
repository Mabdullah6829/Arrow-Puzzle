package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Map;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public interface PipelineResultObserver {
    void onComplete(Timestamp timestamp);

    void onDocument(DocumentKey documentKey, Map<String, C0393Z0> map, Timestamp timestamp, Timestamp timestamp2);

    void onError(FirebaseFirestoreException firebaseFirestoreException);
}
