package com.google.firebase.firestore;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.PreviewApi;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.emulators.EmulatedServiceSettings;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.FirebaseAppCheckTokenProvider;
import com.google.firebase.firestore.auth.FirebaseAuthCredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.ActivityScope;
import com.google.firebase.firestore.core.AsyncEventListener;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ByteBufferInputStream;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.inject.Deferred;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseFirestore {
    private static final String TAG = "FirebaseFirestore";
    private final CredentialsProvider<String> appCheckProvider;
    private final CredentialsProvider<User> authProvider;
    private final Function<FirebaseFirestoreSettings, ComponentProvider> componentProviderFactory;
    private final Context context;
    private final DatabaseId databaseId;

    @Nullable
    private EmulatedServiceSettings emulatorSettings;
    private final FirebaseApp firebaseApp;
    private final InstanceRegistry instanceRegistry;
    private final GrpcMetadataProvider metadataProvider;
    private final String persistenceKey;

    @Nullable
    private PersistentCacheIndexManager persistentCacheIndexManager;
    private final UserDataReader userDataReader;
    final FirestoreClientProvider clientProvider = new FirestoreClientProvider(new C5771l(this, 0));
    private FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder().build();

    public interface InstanceRegistry {
        void remove(@NonNull String str);
    }

    @VisibleForTesting
    public FirebaseFirestore(Context context, DatabaseId databaseId, String str, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, @NonNull Function<FirebaseFirestoreSettings, ComponentProvider> function, @Nullable FirebaseApp firebaseApp, InstanceRegistry instanceRegistry, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        this.context = (Context) Preconditions.checkNotNull(context);
        this.databaseId = (DatabaseId) Preconditions.checkNotNull((DatabaseId) Preconditions.checkNotNull(databaseId));
        this.userDataReader = new UserDataReader(databaseId);
        this.persistenceKey = (String) Preconditions.checkNotNull(str);
        this.authProvider = (CredentialsProvider) Preconditions.checkNotNull(credentialsProvider);
        this.appCheckProvider = (CredentialsProvider) Preconditions.checkNotNull(credentialsProvider2);
        this.componentProviderFactory = (Function) Preconditions.checkNotNull(function);
        this.firebaseApp = firebaseApp;
        this.instanceRegistry = instanceRegistry;
        this.metadataProvider = grpcMetadataProvider;
    }

    @NonNull
    private static FirebaseApp getDefaultFirebaseApp() {
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        if (firebaseApp != null) {
            return firebaseApp;
        }
        throw new IllegalStateException("You must call FirebaseApp.initializeApp first.");
    }

    @NonNull
    public static FirebaseFirestore getInstance() {
        return getInstance(getDefaultFirebaseApp(), DatabaseId.DEFAULT_DATABASE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotsInSyncListener$10(AsyncEventListener asyncEventListener, FirestoreClient firestoreClient) {
        asyncEventListener.mute();
        firestoreClient.removeSnapshotsInSyncListener(asyncEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListenerRegistration lambda$addSnapshotsInSyncListener$11(final AsyncEventListener asyncEventListener, Activity activity, final FirestoreClient firestoreClient) {
        firestoreClient.addSnapshotsInSyncListener(asyncEventListener);
        return ActivityScope.bind(activity, new ListenerRegistration() { // from class: com.google.firebase.firestore.m
            @Override // com.google.firebase.firestore.ListenerRegistration
            public final void remove() {
                FirebaseFirestore.lambda$addSnapshotsInSyncListener$10(asyncEventListener, firestoreClient);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addSnapshotsInSyncListener$9(Runnable runnable, Void r2, FirebaseFirestoreException firebaseFirestoreException) {
        Assert.hardAssert(firebaseFirestoreException == null, "snapshots-in-sync listeners should never get errors.", new Object[0]);
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$clearPersistence$4(Executor executor) {
        return Tasks.m10775e(new FirebaseFirestoreException("Persistence cannot be cleared while the firestore instance is running.", FirebaseFirestoreException.Code.FAILED_PRECONDITION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearPersistence$5(TaskCompletionSource taskCompletionSource) {
        try {
            SQLitePersistence.clearPersistence(this.context, this.databaseId, this.persistenceKey);
            taskCompletionSource.m10768b(null);
        } catch (FirebaseFirestoreException e) {
            taskCompletionSource.m10767a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$getNamedQuery$7(String str, FirestoreClient firestoreClient) {
        return firestoreClient.getNamedQuery(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Query lambda$getNamedQuery$8(Task task) {
        com.google.firebase.firestore.core.Query query = (com.google.firebase.firestore.core.Query) task.getResult();
        if (query != null) {
            return new Query(query, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$runTransaction$1(Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        return function.apply(new Transaction(transaction, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$runTransaction$2(Executor executor, Transaction.Function function, com.google.firebase.firestore.core.Transaction transaction) {
        return Tasks.m10773c(executor, new CallableC5770k(this, function, transaction, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$runTransaction$3(TransactionOptions transactionOptions, Function function, FirestoreClient firestoreClient) {
        return firestoreClient.transaction(transactionOptions, function);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$setIndexConfiguration$0(List list, FirestoreClient firestoreClient) {
        return firestoreClient.configureFieldIndexes(list);
    }

    private FirebaseFirestoreSettings mergeEmulatorSettings(@NonNull FirebaseFirestoreSettings firebaseFirestoreSettings, @Nullable EmulatedServiceSettings emulatedServiceSettings) {
        if (emulatedServiceSettings == null) {
            return firebaseFirestoreSettings;
        }
        if (!FirebaseFirestoreSettings.DEFAULT_HOST.equals(firebaseFirestoreSettings.getHost())) {
            Logger.warn(TAG, "Host has been set in FirebaseFirestoreSettings and useEmulator, emulator host will be used.", new Object[0]);
        }
        return new FirebaseFirestoreSettings.Builder(firebaseFirestoreSettings).setHost(emulatedServiceSettings.getHost() + ":" + emulatedServiceSettings.getPort()).setSslEnabled(false).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirestoreClient newClient(AsyncQueue asyncQueue) {
        FirestoreClient firestoreClient;
        synchronized (this.clientProvider) {
            firestoreClient = new FirestoreClient(this.context, new DatabaseInfo(this.databaseId, this.persistenceKey, this.settings.getHost(), this.settings.isSslEnabled()), this.authProvider, this.appCheckProvider, asyncQueue, this.metadataProvider, this.componentProviderFactory.apply(this.settings));
        }
        return firestoreClient;
    }

    @NonNull
    public static FirebaseFirestore newInstance(@NonNull Context context, @NonNull FirebaseApp firebaseApp, @NonNull Deferred<InternalAuthProvider> deferred, @NonNull Deferred<InteropAppCheckTokenProvider> deferred2, @NonNull String str, @NonNull InstanceRegistry instanceRegistry, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        String projectId = firebaseApp.getOptions().getProjectId();
        if (projectId == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        return new FirebaseFirestore(context, DatabaseId.forDatabase(projectId, str), firebaseApp.getName(), new FirebaseAuthCredentialsProvider(deferred), new FirebaseAppCheckTokenProvider(deferred2), new C5766i(3), firebaseApp, instanceRegistry, grpcMetadataProvider);
    }

    private <ResultT> Task<ResultT> runTransaction(TransactionOptions transactionOptions, Transaction.Function<ResultT> function, Executor executor) {
        this.clientProvider.ensureConfigured();
        return (Task) this.clientProvider.call(new C5970t(1, transactionOptions, new C5820o(this, executor, function, 0)));
    }

    @Keep
    public static void setClientLanguage(@NonNull String str) {
        FirestoreChannel.setClientLanguage(str);
    }

    public static void setLoggingEnabled(boolean z) {
        if (z) {
            Logger.setLogLevel(Logger.Level.DEBUG);
        } else {
            Logger.setLogLevel(Logger.Level.WARN);
        }
    }

    @NonNull
    public ListenerRegistration addSnapshotsInSyncListener(@NonNull Runnable runnable) {
        return addSnapshotsInSyncListener(Executors.DEFAULT_CALLBACK_EXECUTOR, runnable);
    }

    @NonNull
    public WriteBatch batch() {
        this.clientProvider.ensureConfigured();
        return new WriteBatch(this);
    }

    public <T> T callClient(Function<FirestoreClient, T> function) {
        return (T) this.clientProvider.call(function);
    }

    @NonNull
    public Task<Void> clearPersistence() {
        return (Task) this.clientProvider.executeIfShutdown(new C5771l(this, 1), new C5766i(4));
    }

    @NonNull
    public CollectionReference collection(@NonNull String str) {
        Preconditions.checkNotNull(str, "Provided collection path must not be null.");
        this.clientProvider.ensureConfigured();
        return new CollectionReference(ResourcePath.fromString(str), this);
    }

    @NonNull
    public Query collectionGroup(@NonNull String str) {
        Preconditions.checkNotNull(str, "Provided collection ID must not be null.");
        if (str.contains("/")) {
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Invalid collectionId '", str, "'. Collection IDs must not contain '/'."));
        }
        this.clientProvider.ensureConfigured();
        return new Query(new com.google.firebase.firestore.core.Query(ResourcePath.EMPTY, str), this);
    }

    @NonNull
    public Task<Void> disableNetwork() {
        return (Task) this.clientProvider.call(new C5766i(2));
    }

    @NonNull
    public DocumentReference document(@NonNull String str) {
        Preconditions.checkNotNull(str, "Provided document path must not be null.");
        this.clientProvider.ensureConfigured();
        return DocumentReference.forPath(ResourcePath.fromString(str), this);
    }

    @NonNull
    public Task<Void> enableNetwork() {
        return (Task) this.clientProvider.call(new C5766i(1));
    }

    @NonNull
    public FirebaseApp getApp() {
        return this.firebaseApp;
    }

    @NonNull
    public DatabaseId getDatabaseId() {
        return this.databaseId;
    }

    @NonNull
    public FirebaseFirestoreSettings getFirestoreSettings() {
        return this.settings;
    }

    @NonNull
    public Task<Query> getNamedQuery(@NonNull String str) {
        return ((Task) this.clientProvider.call(new C5739a(str, 2))).continueWith(new C5819n(this, 0));
    }

    @Nullable
    public PersistentCacheIndexManager getPersistentCacheIndexManager() {
        this.clientProvider.ensureConfigured();
        if (this.persistentCacheIndexManager == null && (this.settings.isPersistenceEnabled() || (this.settings.getCacheSettings() instanceof PersistentCacheSettings))) {
            this.persistentCacheIndexManager = new PersistentCacheIndexManager(this.clientProvider);
        }
        return this.persistentCacheIndexManager;
    }

    @NonNull
    public UserDataReader getUserDataReader() {
        return this.userDataReader;
    }

    @NonNull
    public LoadBundleTask loadBundle(@NonNull final InputStream inputStream) {
        final LoadBundleTask loadBundleTask = new LoadBundleTask();
        this.clientProvider.procedure(new Consumer() { // from class: com.google.firebase.firestore.j
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((FirestoreClient) obj).loadBundle(inputStream, loadBundleTask);
            }
        });
        return loadBundleTask;
    }

    @NonNull
    public PipelineSource pipeline() {
        this.clientProvider.ensureConfigured();
        return new PipelineSource(this);
    }

    @NonNull
    public RealtimePipelineSource realtimePipeline() {
        this.clientProvider.ensureConfigured();
        return new RealtimePipelineSource(this);
    }

    @NonNull
    public Task<Void> runBatch(@NonNull WriteBatch.Function function) {
        WriteBatch writeBatchBatch = batch();
        function.apply(writeBatchBatch);
        return writeBatchBatch.commit();
    }

    public void setFirestoreSettings(@NonNull FirebaseFirestoreSettings firebaseFirestoreSettings) {
        Preconditions.checkNotNull(firebaseFirestoreSettings, "Provided settings must not be null.");
        synchronized (this.databaseId) {
            try {
                FirebaseFirestoreSettings firebaseFirestoreSettingsMergeEmulatorSettings = mergeEmulatorSettings(firebaseFirestoreSettings, this.emulatorSettings);
                if (this.clientProvider.isConfigured() && !this.settings.equals(firebaseFirestoreSettingsMergeEmulatorSettings)) {
                    throw new IllegalStateException("FirebaseFirestore has already been started and its settings can no longer be changed. You can only call setFirestoreSettings() before calling any other methods on a FirebaseFirestore object.");
                }
                this.settings = firebaseFirestoreSettingsMergeEmulatorSettings;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @PreviewApi
    @Deprecated
    public Task<Void> setIndexConfiguration(@NonNull String str) {
        this.clientProvider.ensureConfigured();
        Preconditions.checkState(this.settings.isPersistenceEnabled(), "Cannot enable indexes when persistence is disabled");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("indexes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("indexes");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    String string = jSONObject2.getString("collectionGroup");
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("fields");
                    for (int i3 = 0; jSONArrayOptJSONArray != null && i3 < jSONArrayOptJSONArray.length(); i3++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                        com.google.firebase.firestore.model.FieldPath fieldPathFromServerFormat = com.google.firebase.firestore.model.FieldPath.fromServerFormat(jSONObject3.getString("fieldPath"));
                        if ("CONTAINS".equals(jSONObject3.optString("arrayConfig"))) {
                            arrayList2.add(FieldIndex.Segment.create(fieldPathFromServerFormat, FieldIndex.Segment.Kind.CONTAINS));
                        } else if ("ASCENDING".equals(jSONObject3.optString("order"))) {
                            arrayList2.add(FieldIndex.Segment.create(fieldPathFromServerFormat, FieldIndex.Segment.Kind.ASCENDING));
                        } else {
                            arrayList2.add(FieldIndex.Segment.create(fieldPathFromServerFormat, FieldIndex.Segment.Kind.DESCENDING));
                        }
                    }
                    arrayList.add(FieldIndex.create(-1, string, arrayList2, FieldIndex.INITIAL_STATE));
                }
            }
            return (Task) this.clientProvider.call(new C5739a(arrayList, 3));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Failed to parse index configuration", e);
        }
    }

    @NonNull
    public Task<Void> terminate() {
        this.instanceRegistry.remove(getDatabaseId().getDatabaseId());
        return this.clientProvider.terminate();
    }

    public void useEmulator(@NonNull String str, int i2) {
        synchronized (this.clientProvider) {
            try {
                if (this.clientProvider.isConfigured()) {
                    throw new IllegalStateException("Cannot call useEmulator() after instance has already been initialized.");
                }
                EmulatedServiceSettings emulatedServiceSettings = new EmulatedServiceSettings(str, i2);
                this.emulatorSettings = emulatedServiceSettings;
                this.settings = mergeEmulatorSettings(this.settings, emulatedServiceSettings);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void validateReference(DocumentReference documentReference) {
        Preconditions.checkNotNull(documentReference, "Provided DocumentReference must not be null.");
        if (documentReference.getFirestore() != this) {
            throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
        }
    }

    @NonNull
    public Task<Void> waitForPendingWrites() {
        return (Task) this.clientProvider.call(new C5766i(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Task<Void> clearPersistence(Executor executor) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new RunnableC5969s(1, this, taskCompletionSource));
        return taskCompletionSource.f23216a;
    }

    @NonNull
    public static FirebaseFirestore getInstance(@NonNull FirebaseApp firebaseApp) {
        return getInstance(firebaseApp, DatabaseId.DEFAULT_DATABASE_ID);
    }

    @NonNull
    public ListenerRegistration addSnapshotsInSyncListener(@NonNull Activity activity, @NonNull Runnable runnable) {
        return addSnapshotsInSyncListener(Executors.DEFAULT_CALLBACK_EXECUTOR, activity, runnable);
    }

    @NonNull
    public static FirebaseFirestore getInstance(@NonNull String str) {
        return getInstance(getDefaultFirebaseApp(), str);
    }

    @NonNull
    public ListenerRegistration addSnapshotsInSyncListener(@NonNull Executor executor, @NonNull Runnable runnable) {
        return addSnapshotsInSyncListener(executor, null, runnable);
    }

    @NonNull
    public LoadBundleTask loadBundle(@NonNull byte[] bArr) {
        return loadBundle(new ByteArrayInputStream(bArr));
    }

    private ListenerRegistration addSnapshotsInSyncListener(Executor executor, @Nullable Activity activity, @NonNull Runnable runnable) {
        return (ListenerRegistration) this.clientProvider.call(new C5970t(2, new AsyncEventListener(executor, new C5941q(runnable, 3)), activity));
    }

    @NonNull
    public static FirebaseFirestore getInstance(@NonNull FirebaseApp firebaseApp, @NonNull String str) {
        Preconditions.checkNotNull(firebaseApp, "Provided FirebaseApp must not be null.");
        Preconditions.checkNotNull(str, "Provided database name must not be null.");
        FirestoreMultiDbComponent firestoreMultiDbComponent = (FirestoreMultiDbComponent) firebaseApp.get(FirestoreMultiDbComponent.class);
        Preconditions.checkNotNull(firestoreMultiDbComponent, "Firestore component is not present.");
        return firestoreMultiDbComponent.get(str);
    }

    @NonNull
    public LoadBundleTask loadBundle(@NonNull ByteBuffer byteBuffer) {
        return loadBundle(new ByteBufferInputStream(byteBuffer));
    }

    @NonNull
    public <TResult> Task<TResult> runTransaction(@NonNull Transaction.Function<TResult> function) {
        return runTransaction(TransactionOptions.DEFAULT, function);
    }

    @NonNull
    public <TResult> Task<TResult> runTransaction(@NonNull TransactionOptions transactionOptions, @NonNull Transaction.Function<TResult> function) {
        Preconditions.checkNotNull(function, "Provided transaction update function must not be null.");
        return runTransaction(transactionOptions, function, com.google.firebase.firestore.core.Transaction.getDefaultExecutor());
    }
}
