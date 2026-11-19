package com.google.firebase.firestore;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.EventManager;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.core.QueryListener;
import com.google.firebase.firestore.core.QueryOrPipeline;
import com.google.firebase.firestore.core.UserData;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.DeleteMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentReference {
    private final FirebaseFirestore firestore;
    private final DocumentKey key;

    public DocumentReference(DocumentKey documentKey, FirebaseFirestore firebaseFirestore) {
        this.key = (DocumentKey) Preconditions.checkNotNull(documentKey);
        this.firestore = (FirebaseFirestore) Preconditions.checkNotNull(firebaseFirestore);
    }

    private ListenerRegistration addSnapshotListenerInternal(Executor executor, EventManager.ListenOptions listenOptions, @Nullable Activity activity, EventListener<DocumentSnapshot> eventListener) {
        AsyncEventListener asyncEventListener = new AsyncEventListener(executor, new C5762e(this, eventListener, 0));
        return (ListenerRegistration) this.firestore.callClient(new C5763f(asQuery(), listenOptions, asyncEventListener, activity, 0));
    }

    private com.google.firebase.firestore.core.Query asQuery() {
        return com.google.firebase.firestore.core.Query.atPath(this.key.getPath());
    }

    public static DocumentReference forPath(ResourcePath resourcePath, FirebaseFirestore firebaseFirestore) {
        if (resourcePath.length() % 2 == 0) {
            return new DocumentReference(DocumentKey.fromPath(resourcePath), firebaseFirestore);
        }
        throw new IllegalArgumentException("Invalid document reference. Document references must have an even number of segments, but " + resourcePath.canonicalString() + " has " + resourcePath.length());
    }

    @NonNull
    private Task<DocumentSnapshot> getViaSnapshotListener(Source source) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        listenOptions.includeDocumentMetadataChanges = true;
        listenOptions.includeQueryMetadataChanges = true;
        listenOptions.waitForSyncWhenOnline = true;
        taskCompletionSource2.m10768b(addSnapshotListenerInternal(Executors.DIRECT_EXECUTOR, listenOptions, null, new C5764g(taskCompletionSource, taskCompletionSource2, source, 0)));
        return taskCompletionSource.f23216a;
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges) {
        return internalOptions(metadataChanges, ListenSource.DEFAULT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotListenerInternal$6(EventListener eventListener, ViewSnapshot viewSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            eventListener.onEvent(null, firebaseFirestoreException);
            return;
        }
        Assert.hardAssert(viewSnapshot != null, "Got event without value or error set", new Object[0]);
        Assert.hardAssert(viewSnapshot.getDocuments().size() <= 1, "Too many documents returned on a document query", new Object[0]);
        Document document = viewSnapshot.getDocuments().getDocument(this.key);
        eventListener.onEvent(document != null ? DocumentSnapshot.fromDocument(this.firestore, document, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys().contains(document.getKey())) : DocumentSnapshot.fromNoDocument(this.firestore, this.key, viewSnapshot.isFromCache()), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotListenerInternal$7(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient, QueryListener queryListener) {
        asyncEventListener.mute();
        firestoreClient.stopListening(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenerRegistration lambda$addSnapshotListenerInternal$8(com.google.firebase.firestore.core.Query query, EventManager.ListenOptions listenOptions, AsyncEventListener asyncEventListener, Activity activity, FirestoreClient firestoreClient) {
        return ActivityScope.bind(activity, new C5765h(asyncEventListener, firestoreClient, firestoreClient.listen(new QueryOrPipeline.QueryWrapper(query), listenOptions, asyncEventListener), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$delete$2(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$get$3(FirestoreClient firestoreClient) {
        return firestoreClient.getDocumentFromLocalCache(this.key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DocumentSnapshot lambda$get$4(Task task) {
        Document document = (Document) task.getResult();
        return new DocumentSnapshot(this.firestore, this.key, document, true, document != null && document.hasLocalMutations());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getViaSnapshotListener$5(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, Source source, DocumentSnapshot documentSnapshot, FirebaseFirestoreException firebaseFirestoreException) {
        if (firebaseFirestoreException != null) {
            taskCompletionSource.m10767a(firebaseFirestoreException);
            return;
        }
        try {
            ((ListenerRegistration) Tasks.m10771a(taskCompletionSource2.f23216a)).remove();
            if (!documentSnapshot.exists() && documentSnapshot.getMetadata().isFromCache()) {
                taskCompletionSource.m10767a(new FirebaseFirestoreException("Failed to get document because the client is offline.", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else if (documentSnapshot.exists() && documentSnapshot.getMetadata().isFromCache() && source == Source.SERVER) {
                taskCompletionSource.m10767a(new FirebaseFirestoreException("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", FirebaseFirestoreException.Code.UNAVAILABLE));
            } else {
                taskCompletionSource.m10768b(documentSnapshot);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw Assert.fail(e, "Failed to register a listener for a single document", new Object[0]);
        } catch (ExecutionException e2) {
            throw Assert.fail(e2, "Failed to register a listener for a single document", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$set$0(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$update$1(List list, FirestoreClient firestoreClient) {
        return firestoreClient.write(list);
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public CollectionReference collection(@NonNull String str) {
        Preconditions.checkNotNull(str, "Provided collection path must not be null.");
        return new CollectionReference(this.key.getPath().append(ResourcePath.fromString(str)), this.firestore);
    }

    @NonNull
    public Task<Void> delete() {
        return ((Task) this.firestore.callClient(new C5761d(Collections.singletonList(new DeleteMutation(this.key, Precondition.NONE)), 0))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocumentReference)) {
            return false;
        }
        DocumentReference documentReference = (DocumentReference) obj;
        return this.key.equals(documentReference.key) && this.firestore.equals(documentReference.firestore);
    }

    @NonNull
    public Task<DocumentSnapshot> get() {
        return get(Source.DEFAULT);
    }

    @NonNull
    public FirebaseFirestore getFirestore() {
        return this.firestore;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getFullPath() {
        DatabaseId databaseId = this.firestore.getDatabaseId();
        return "projects/" + databaseId.getProjectId() + "/databases/" + databaseId.getDatabaseId() + "/documents/" + getPath();
    }

    @NonNull
    public String getId() {
        return this.key.getDocumentId();
    }

    public DocumentKey getKey() {
        return this.key;
    }

    @NonNull
    public CollectionReference getParent() {
        return new CollectionReference(this.key.getCollectionPath(), this.firestore);
    }

    @NonNull
    public String getPath() {
        return this.key.getPath().canonicalString();
    }

    public int hashCode() {
        return this.firestore.hashCode() + (this.key.hashCode() * 31);
    }

    @NonNull
    public Task<Void> set(@NonNull Object obj) {
        return set(obj, SetOptions.OVERWRITE);
    }

    @NonNull
    public String toString() {
        return "DocumentReference{key=" + this.key + ", firestore=" + this.firestore + '}';
    }

    @NonNull
    public Task<Void> update(@NonNull Map<String, Object> map) {
        return update(this.firestore.getUserDataReader().parseUpdateData(map));
    }

    private static EventManager.ListenOptions internalOptions(MetadataChanges metadataChanges, ListenSource listenSource) {
        EventManager.ListenOptions listenOptions = new EventManager.ListenOptions();
        MetadataChanges metadataChanges2 = MetadataChanges.INCLUDE;
        listenOptions.includeDocumentMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.includeQueryMetadataChanges = metadataChanges == metadataChanges2;
        listenOptions.waitForSyncWhenOnline = false;
        listenOptions.source = listenSource;
        return listenOptions;
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Executor executor, @NonNull EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(executor, MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public Task<DocumentSnapshot> get(@NonNull Source source) {
        return source == Source.CACHE ? ((Task) this.firestore.callClient(new C5739a(this, 1))).continueWith(Executors.DIRECT_EXECUTOR, new C5743c(this, 1)) : getViaSnapshotListener(source);
    }

    @NonNull
    public Task<Void> set(@NonNull Object obj, @NonNull SetOptions setOptions) {
        Preconditions.checkNotNull(obj, "Provided data must not be null.");
        Preconditions.checkNotNull(setOptions, "Provided options must not be null.");
        return ((Task) this.firestore.callClient(new C5761d(Collections.singletonList((setOptions.isMerge() ? this.firestore.getUserDataReader().parseMergeData(obj, setOptions.getFieldMask()) : this.firestore.getUserDataReader().parseSetData(obj)).toMutation(this.key, Precondition.NONE)), 1))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Activity activity, @NonNull EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(activity, MetadataChanges.EXCLUDE, eventListener);
    }

    @NonNull
    public Task<Void> update(@NonNull String str, @Nullable Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, str, obj, objArr)));
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull MetadataChanges metadataChanges, @NonNull EventListener<DocumentSnapshot> eventListener) {
        return addSnapshotListener(Executors.DEFAULT_CALLBACK_EXECUTOR, metadataChanges, eventListener);
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Executor executor, @NonNull MetadataChanges metadataChanges, @NonNull EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(executor, "Provided executor must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(executor, internalOptions(metadataChanges), null, eventListener);
    }

    @NonNull
    public Task<Void> update(@NonNull FieldPath fieldPath, @Nullable Object obj, Object... objArr) {
        return update(this.firestore.getUserDataReader().parseUpdateData(Util.collectUpdateArguments(1, fieldPath, obj, objArr)));
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull Activity activity, @NonNull MetadataChanges metadataChanges, @NonNull EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(activity, "Provided activity must not be null.");
        Preconditions.checkNotNull(metadataChanges, "Provided MetadataChanges value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(Executors.DEFAULT_CALLBACK_EXECUTOR, internalOptions(metadataChanges), activity, eventListener);
    }

    private Task<Void> update(@NonNull UserData.ParsedUpdateData parsedUpdateData) {
        return ((Task) this.firestore.callClient(new C5761d(Collections.singletonList(parsedUpdateData.toMutation(this.key, Precondition.exists(true))), 2))).continueWith(Executors.DIRECT_EXECUTOR, Util.voidErrorTransformer());
    }

    @NonNull
    public ListenerRegistration addSnapshotListener(@NonNull SnapshotListenOptions snapshotListenOptions, @NonNull EventListener<DocumentSnapshot> eventListener) {
        Preconditions.checkNotNull(snapshotListenOptions, "Provided options value must not be null.");
        Preconditions.checkNotNull(eventListener, "Provided EventListener must not be null.");
        return addSnapshotListenerInternal(snapshotListenOptions.getExecutor(), internalOptions(snapshotListenOptions.getMetadataChanges(), snapshotListenOptions.getSource()), snapshotListenOptions.getActivity(), eventListener);
    }
}
