package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.util.Function;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.firebase.firestore.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5739a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23650b;

    public /* synthetic */ C5739a(Object obj, int i2) {
        this.f23649a = i2;
        this.f23650b = obj;
    }

    @Override // com.google.firebase.firestore.util.Function
    public final Object apply(Object obj) {
        switch (this.f23649a) {
            case 0:
                return ((AggregateQuery) this.f23650b).lambda$get$0((FirestoreClient) obj);
            case 1:
                return ((DocumentReference) this.f23650b).lambda$get$3((FirestoreClient) obj);
            case 2:
                return FirebaseFirestore.lambda$getNamedQuery$7((String) this.f23650b, (FirestoreClient) obj);
            case 3:
                return FirebaseFirestore.lambda$setIndexConfiguration$0((ArrayList) this.f23650b, (FirestoreClient) obj);
            case 4:
                return ((Query) this.f23650b).lambda$get$0((FirestoreClient) obj);
            default:
                return ((WriteBatch) this.f23650b).lambda$commit$0((FirestoreClient) obj);
        }
    }
}
