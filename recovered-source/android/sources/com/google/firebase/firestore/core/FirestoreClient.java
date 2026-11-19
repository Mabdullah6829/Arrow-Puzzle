package com.google.firebase.firestore.core;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.internal.RunnableC5362b;
import com.google.firebase.crashlytics.internal.common.RunnableC5651h;
import com.google.firebase.crashlytics.internal.metadata.RunnableC5661a;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.CallableC5770k;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.PipelineResultObserver;
import com.google.firebase.firestore.TransactionOptions;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.bundle.BundleSerializer;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.local.IndexBackfiller;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.Persistence;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.local.Scheduler;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.firestore.util.Logger;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p001B.C0099y;
import p011H.RunnableC0245I;
import p011H.RunnableC0294w;
import p022N.C0349D;
import p022N.C0393Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class FirestoreClient {
    private static final String LOG_TAG = "FirestoreClient";
    private static final int MAX_CONCURRENT_LIMBO_RESOLUTIONS = 100;
    private final CredentialsProvider<String> appCheckProvider;
    private final AsyncQueue asyncQueue;
    private final CredentialsProvider<User> authProvider;
    private final BundleSerializer bundleSerializer;
    private final DatabaseInfo databaseInfo;
    private EventManager eventManager;

    @Nullable
    private Scheduler gcScheduler;

    @Nullable
    private Scheduler indexBackfillScheduler;
    private LocalStore localStore;
    private Persistence persistence;
    private RemoteStore remoteStore;
    private SyncEngine syncEngine;

    public FirestoreClient(Context context, DatabaseInfo databaseInfo, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, final AsyncQueue asyncQueue, @Nullable GrpcMetadataProvider grpcMetadataProvider, ComponentProvider componentProvider) {
        this.databaseInfo = databaseInfo;
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
        this.asyncQueue = asyncQueue;
        this.bundleSerializer = new BundleSerializer(new RemoteSerializer(databaseInfo.getDatabaseId()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        asyncQueue.enqueueAndForget(new RunnableC0245I(this, taskCompletionSource, context, componentProvider, grpcMetadataProvider, 1));
        credentialsProvider.setChangeListener(new Listener() { // from class: com.google.firebase.firestore.core.d
            @Override // com.google.firebase.firestore.util.Listener
            public final void onValue(Object obj) {
                this.f23674s.lambda$new$2(atomicBoolean, taskCompletionSource, asyncQueue, (User) obj);
            }
        });
        credentialsProvider2.setChangeListener(new C0099y(19));
    }

    private void initialize(Context context, User user, ComponentProvider componentProvider, GrpcMetadataProvider grpcMetadataProvider) {
        Logger.debug(LOG_TAG, "Initializing. user=%s", user.getUid());
        componentProvider.initialize(new ComponentProvider.Configuration(context, this.asyncQueue, this.databaseInfo, user, 100, this.authProvider, this.appCheckProvider, grpcMetadataProvider));
        this.persistence = componentProvider.getPersistence();
        this.gcScheduler = componentProvider.getGarbageCollectionScheduler();
        this.localStore = componentProvider.getLocalStore();
        this.remoteStore = componentProvider.getRemoteStore();
        this.syncEngine = componentProvider.getSyncEngine();
        this.eventManager = componentProvider.getEventManager();
        IndexBackfiller indexBackfiller = componentProvider.getIndexBackfiller();
        Scheduler scheduler = this.gcScheduler;
        if (scheduler != null) {
            scheduler.start();
        }
        if (indexBackfiller != null) {
            IndexBackfiller.Scheduler scheduler2 = indexBackfiller.getScheduler();
            this.indexBackfillScheduler = scheduler2;
            scheduler2.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addSnapshotsInSyncListener$19(EventListener eventListener) {
        this.eventManager.addSnapshotsInSyncListener(eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureFieldIndexes$22(List list) {
        this.localStore.configureFieldIndexes(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteAllFieldIndexes$24() {
        this.localStore.deleteAllFieldIndexes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disableNetwork$4() {
        this.remoteStore.disableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableNetwork$5() {
        this.remoteStore.enableNetwork();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executePipeline$17(C0349D c0349d, PipelineResultObserver pipelineResultObserver) {
        this.remoteStore.executePipeline(c0349d, pipelineResultObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Document lambda$getDocumentFromLocalCache$10(Task task) throws FirebaseFirestoreException {
        Document document = (Document) task.getResult();
        if (document.isFoundDocument()) {
            return document;
        }
        if (document.isNoDocument()) {
            return null;
        }
        throw new FirebaseFirestoreException("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", FirebaseFirestoreException.Code.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Document lambda$getDocumentFromLocalCache$9(DocumentKey documentKey) {
        return this.localStore.readDocument(documentKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ViewSnapshot lambda$getDocumentsFromLocalCache$11(QueryOrPipeline queryOrPipeline) {
        QueryResult queryResultExecuteQuery = this.localStore.executeQuery(queryOrPipeline, true);
        View view = new View(queryOrPipeline, queryResultExecuteQuery.getRemoteKeys());
        return view.applyChanges(view.computeDocChanges(queryResultExecuteQuery.getDocuments())).getSnapshot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getNamedQuery$21(String str, TaskCompletionSource taskCompletionSource) {
        NamedQuery namedQuery = this.localStore.getNamedQuery(str);
        if (namedQuery == null) {
            taskCompletionSource.m10768b(null);
        } else {
            Target target = namedQuery.getBundledQuery().getTarget();
            taskCompletionSource.m10768b(new Query(target.getPath(), target.getCollectionGroup(), target.getFilters(), target.getOrderBy(), target.getLimit(), namedQuery.getBundledQuery().getLimitType(), target.getStartAt(), target.getEndAt()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listen$7(QueryListener queryListener) {
        this.eventManager.addQueryListener(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadBundle$20(BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        this.syncEngine.loadBundle(bundleReader, loadBundleTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(TaskCompletionSource taskCompletionSource, Context context, ComponentProvider componentProvider, GrpcMetadataProvider grpcMetadataProvider) {
        try {
            initialize(context, (User) Tasks.m10771a(taskCompletionSource.f23216a), componentProvider, grpcMetadataProvider);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(User user) {
        Assert.hardAssert(this.syncEngine != null, "SyncEngine not yet initialized", new Object[0]);
        Logger.debug(LOG_TAG, "Credential changed. Current user: %s", user.getUid());
        this.syncEngine.handleCredentialChange(user);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, AsyncQueue asyncQueue, User user) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            asyncQueue.enqueueAndForget(new RunnableC0294w(11, this, user));
        } else {
            Assert.hardAssert(!taskCompletionSource.f23216a.isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.m10768b(user);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$3(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeSnapshotsInSyncListener$25(EventListener eventListener) {
        this.eventManager.removeSnapshotsInSyncListener(eventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runAggregateQuery$16(Query query, List list, TaskCompletionSource taskCompletionSource) {
        this.syncEngine.runAggregateQuery(query, list).addOnSuccessListener(new C5758f(taskCompletionSource)).addOnFailureListener(new C5758f(taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setIndexAutoCreationEnabled$23(boolean z) {
        this.localStore.setIndexAutoCreationEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopListening$8(QueryListener queryListener) {
        this.eventManager.removeQueryListener(queryListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$terminate$6() {
        this.remoteStore.shutdown();
        this.persistence.shutdown();
        Scheduler scheduler = this.gcScheduler;
        if (scheduler != null) {
            scheduler.stop();
        }
        Scheduler scheduler2 = this.indexBackfillScheduler;
        if (scheduler2 != null) {
            scheduler2.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$transaction$13(TransactionOptions transactionOptions, Function function) {
        return this.syncEngine.transaction(this.asyncQueue, transactionOptions, function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitForPendingWrites$18(TaskCompletionSource taskCompletionSource) {
        this.syncEngine.registerPendingWritesTask(taskCompletionSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$write$12(List list, TaskCompletionSource taskCompletionSource) {
        this.syncEngine.writeMutations(list, taskCompletionSource);
    }

    private void verifyNotTerminated() {
        if (isTerminated()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public void addSnapshotsInSyncListener(EventListener<Void> eventListener) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new RunnableC5755c(this, eventListener, 0));
    }

    public Task<Void> configureFieldIndexes(List<FieldIndex> list) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new RunnableC0294w(12, this, list));
    }

    public void deleteAllFieldIndexes() {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new RunnableC5753a(this, 0));
    }

    public Task<Void> disableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new RunnableC5753a(this, 3));
    }

    public Task<Void> enableNetwork() {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new RunnableC5753a(this, 1));
    }

    public void executePipeline(C0349D c0349d, PipelineResultObserver pipelineResultObserver) {
        this.asyncQueue.enqueueAndForget(new RunnableC5651h(this, c0349d, pipelineResultObserver, 4));
    }

    public Task<Document> getDocumentFromLocalCache(DocumentKey documentKey) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new CallableC5754b(this, documentKey, 0)).continueWith(new C0099y(18));
    }

    public Task<ViewSnapshot> getDocumentsFromLocalCache(QueryOrPipeline queryOrPipeline) {
        verifyNotTerminated();
        return this.asyncQueue.enqueue(new CallableC5754b(this, queryOrPipeline, 1));
    }

    public Task<Query> getNamedQuery(String str) {
        verifyNotTerminated();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new RunnableC5651h(this, str, taskCompletionSource, 5));
        return taskCompletionSource.f23216a;
    }

    public boolean isTerminated() {
        return this.asyncQueue.isShuttingDown();
    }

    public QueryListener listen(QueryOrPipeline queryOrPipeline, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        verifyNotTerminated();
        QueryListener queryListener = new QueryListener(queryOrPipeline, listenOptions, eventListener);
        this.asyncQueue.enqueueAndForget(new RunnableC5757e(this, queryListener, 1));
        return queryListener;
    }

    public void loadBundle(InputStream inputStream, LoadBundleTask loadBundleTask) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new RunnableC5651h(this, new BundleReader(this.bundleSerializer, inputStream), loadBundleTask, 3));
    }

    public void removeSnapshotsInSyncListener(EventListener<Void> eventListener) {
        this.asyncQueue.enqueueAndForget(new RunnableC5755c(this, eventListener, 1));
    }

    public Task<Map<String, C0393Z0>> runAggregateQuery(Query query, List<AggregateField> list) {
        verifyNotTerminated();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new RunnableC5661a(this, query, list, taskCompletionSource));
        return taskCompletionSource.f23216a;
    }

    public void setIndexAutoCreationEnabled(boolean z) {
        verifyNotTerminated();
        this.asyncQueue.enqueueAndForget(new RunnableC5362b(this, z, 1));
    }

    public void stopListening(QueryListener queryListener) {
        this.asyncQueue.enqueueAndForget(new RunnableC5757e(this, queryListener, 0));
    }

    public Task<Void> terminate() {
        this.authProvider.removeChangeListener();
        this.appCheckProvider.removeChangeListener();
        return this.asyncQueue.enqueueAndInitiateShutdown(new RunnableC5753a(this, 2));
    }

    public <TResult> Task<TResult> transaction(TransactionOptions transactionOptions, Function<Transaction, Task<TResult>> function) {
        verifyNotTerminated();
        return AsyncQueue.callTask(this.asyncQueue.getExecutor(), new CallableC5770k(this, transactionOptions, function, 1));
    }

    public Task<Void> waitForPendingWrites() {
        verifyNotTerminated();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new RunnableC0294w(10, this, taskCompletionSource));
        return taskCompletionSource.f23216a;
    }

    public Task<Void> write(List<Mutation> list) {
        verifyNotTerminated();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.asyncQueue.enqueueAndForget(new RunnableC5651h(this, list, taskCompletionSource, 2));
        return taskCompletionSource.f23216a;
    }
}
