package com.google.firebase.firestore.remote;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.AggregateField;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.PipelineResultObserver;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.C6161A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import p001B.AbstractC0089o;
import p022N.AbstractC0355G;
import p022N.C0349D;
import p022N.C0351E;
import p022N.C0376Q0;
import p022N.C0392Z;
import p022N.C0393Z0;
import p022N.C0395a0;
import p022N.C0398b0;
import p022N.C0412g;
import p022N.C0415h;
import p022N.C0418i;
import p022N.C0424k0;
import p022N.C0425l;
import p022N.C0427m;
import p022N.C0429n;
import p022N.C0439s;
import p030R.C0561i0;
import p030R.C0567l0;
import p030R.C0589w0;
import p030R.EnumC0565k0;
import p030R.EnumC0587v0;
import p041Y.AbstractC0875c;
import p041Y.C0874b;

/* JADX INFO: loaded from: classes2.dex */
public class Datastore {
    static final String SSL_DEPENDENCY_ERROR_MESSAGE = "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.";
    static final Set<String> WHITE_LISTED_HEADERS = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));
    private final FirestoreChannel channel;
    protected final RemoteSerializer serializer;
    private final AsyncQueue workerQueue;

    /* JADX INFO: renamed from: com.google.firebase.firestore.remote.Datastore$3 */
    public static /* synthetic */ class C59473 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code */
        static final /* synthetic */ int[] f23916xf2f5b1d8;

        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            f23916xf2f5b1d8 = iArr;
            try {
                iArr[FirebaseFirestoreException.Code.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23916xf2f5b1d8[FirebaseFirestoreException.Code.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public Datastore(AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, FirestoreChannel firestoreChannel) {
        this.workerQueue = asyncQueue;
        this.serializer = remoteSerializer;
        this.channel = firestoreChannel;
    }

    public static boolean isMissingSslCiphers(C0589w0 c0589w0) {
        EnumC0587v0 enumC0587v0 = c0589w0.f1287a;
        Throwable th = c0589w0.f1289c;
        if (!(th instanceof SSLHandshakeException)) {
            return false;
        }
        th.getMessage().contains("no ciphers available");
        return false;
    }

    public static boolean isPermanentError(FirebaseFirestoreException.Code code) {
        switch (C59473.f23916xf2f5b1d8[code.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + code);
        }
    }

    public static boolean isPermanentWriteError(C0589w0 c0589w0) {
        return isPermanentError(c0589w0) && !c0589w0.f1287a.equals(EnumC0587v0.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$commit$0(Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.getException()).getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                this.channel.invalidateToken();
            }
            throw task.getException();
        }
        C0429n c0429n = (C0429n) task.getResult();
        SnapshotVersion snapshotVersionDecodeVersion = this.serializer.decodeVersion(c0429n.m861e());
        int iM863h = c0429n.m863h();
        ArrayList arrayList = new ArrayList(iM863h);
        for (int i2 = 0; i2 < iM863h; i2++) {
            arrayList.add(this.serializer.decodeMutationResult(c0429n.m862g(i2), snapshotVersionDecodeVersion));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Map lambda$runAggregateQuery$1(HashMap map, Task task) throws Exception {
        if (!task.isSuccessful()) {
            if ((task.getException() instanceof FirebaseFirestoreException) && ((FirebaseFirestoreException) task.getException()).getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                this.channel.invalidateToken();
            }
            throw task.getException();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((C0398b0) task.getResult()).m762f().m764e().entrySet()) {
            Assert.hardAssert(map.containsKey(entry.getKey()), "%s not present in aliasMap", entry.getKey());
            map2.put((String) map.get(entry.getKey()), (C0393Z0) entry.getValue());
        }
        return map2;
    }

    public Task<List<MutationResult>> commit(List<Mutation> list) {
        C0425l c0425lM859h = C0427m.m859h();
        c0425lM859h.m853c(this.serializer.databaseName());
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            c0425lM859h.m852b(this.serializer.encodeMutation(it.next()));
        }
        FirestoreChannel firestoreChannel = this.channel;
        C0567l0 c0567l0M1315e = AbstractC0355G.f697u;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f697u;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1196s;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "Commit");
                        c0561i0M1318b.f1191a = true;
                        C0427m c0427mM858g = C0427m.m858g();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0427mM858g);
                        c0561i0M1318b.f1193c = new C0874b(C0429n.m860f());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f697u = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return firestoreChannel.runRpc(c0567l0M1315e, (C0427m) c0425lM859h.m12341build()).continueWith(this.workerQueue.getExecutor(), new C5966i(this));
    }

    public WatchStream createWatchStream(WatchStream.Callback callback) {
        return new WatchStream(this.channel, this.workerQueue, this.serializer, callback);
    }

    public WriteStream createWriteStream(WriteStream.Callback callback) {
        return new WriteStream(this.channel, this.workerQueue, this.serializer, callback);
    }

    public void executePipeline(C0349D c0349d, final PipelineResultObserver pipelineResultObserver) {
        FirestoreChannel firestoreChannel = this.channel;
        C0567l0 c0567l0M1315e = AbstractC0355G.f698v;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f698v;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1197t;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "ExecutePipeline");
                        c0561i0M1318b.f1191a = true;
                        C0349D c0349dM534g = C0349D.m534g();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0349dM534g);
                        c0561i0M1318b.f1193c = new C0874b(C0351E.m538e());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f698v = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        firestoreChannel.runStreamingResponseRpc(c0567l0M1315e, c0349d, new FirestoreChannel.StreamingListener<C0351E>() { // from class: com.google.firebase.firestore.remote.Datastore.2
            private Timestamp executionTime = null;

            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onClose(C0589w0 c0589w0) {
                if (c0589w0.m1352e()) {
                    pipelineResultObserver.onComplete(this.executionTime);
                    return;
                }
                FirebaseFirestoreException firebaseFirestoreExceptionExceptionFromStatus = Util.exceptionFromStatus(c0589w0);
                if (firebaseFirestoreExceptionExceptionFromStatus.getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                    Datastore.this.channel.invalidateToken();
                }
                pipelineResultObserver.onError(firebaseFirestoreExceptionExceptionFromStatus);
            }

            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onMessage(C0351E c0351e) {
                if (c0351e.m541h()) {
                    this.executionTime = Datastore.this.serializer.decodeTimestamp(c0351e.m539f());
                }
                for (C0439s c0439s : c0351e.m540g()) {
                    String name = c0439s.getName();
                    PipelineResultObserver pipelineResultObserver2 = pipelineResultObserver;
                    Timestamp timestampDecodeTimestamp = null;
                    DocumentKey documentKeyDecodeKey = AbstractC0089o.m161a(name) ? null : Datastore.this.serializer.decodeKey(name);
                    Map<String, C0393Z0> mapM901j = c0439s.m901j();
                    Timestamp timestampDecodeTimestamp2 = c0439s.m903l() ? Datastore.this.serializer.decodeTimestamp(c0439s.m900h()) : null;
                    if (c0439s.m904m()) {
                        timestampDecodeTimestamp = Datastore.this.serializer.decodeTimestamp(c0439s.m902k());
                    }
                    pipelineResultObserver2.onDocument(documentKeyDecodeKey, mapM901j, timestampDecodeTimestamp2, timestampDecodeTimestamp);
                }
            }
        });
    }

    @VisibleForTesting(otherwise = 5)
    public AsyncQueue getWorkerQueue() {
        return this.workerQueue;
    }

    public Task<List<MutableDocument>> lookup(final List<DocumentKey> list) {
        C0412g c0412gM820h = C0415h.m820h();
        c0412gM820h.m810c(this.serializer.databaseName());
        Iterator<DocumentKey> it = list.iterator();
        while (it.hasNext()) {
            c0412gM820h.m809b(this.serializer.encodeKey(it.next()));
        }
        final ArrayList arrayList = new ArrayList();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FirestoreChannel firestoreChannel = this.channel;
        C0567l0 c0567l0M1315e = AbstractC0355G.f696t;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f696t;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1197t;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "BatchGetDocuments");
                        c0561i0M1318b.f1191a = true;
                        C0415h c0415hM819g = C0415h.m819g();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0415hM819g);
                        c0561i0M1318b.f1193c = new C0874b(C0418i.m828e());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f696t = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        firestoreChannel.runStreamingResponseRpc(c0567l0M1315e, (C0415h) c0412gM820h.m12341build(), new FirestoreChannel.StreamingListener<C0418i>() { // from class: com.google.firebase.firestore.remote.Datastore.1
            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onClose(C0589w0 c0589w0) {
                if (c0589w0.m1352e()) {
                    taskCompletionSource.m10770d(Collections.EMPTY_LIST);
                    return;
                }
                FirebaseFirestoreException firebaseFirestoreExceptionExceptionFromStatus = Util.exceptionFromStatus(c0589w0);
                if (firebaseFirestoreExceptionExceptionFromStatus.getCode() == FirebaseFirestoreException.Code.UNAUTHENTICATED) {
                    Datastore.this.channel.invalidateToken();
                }
                taskCompletionSource.m10769c(firebaseFirestoreExceptionExceptionFromStatus);
            }

            @Override // com.google.firebase.firestore.remote.FirestoreChannel.StreamingListener
            public void onMessage(C0418i c0418i) {
                arrayList.add(c0418i);
                if (arrayList.size() == list.size()) {
                    HashMap map = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        MutableDocument mutableDocumentDecodeMaybeDocument = Datastore.this.serializer.decodeMaybeDocument((C0418i) it2.next());
                        map.put(mutableDocumentDecodeMaybeDocument.getKey(), mutableDocumentDecodeMaybeDocument);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add((MutableDocument) map.get((DocumentKey) it3.next()));
                    }
                    taskCompletionSource.m10770d(arrayList2);
                }
            }
        });
        return taskCompletionSource.f23216a;
    }

    public Task<Map<String, C0393Z0>> runAggregateQuery(Query query, List<AggregateField> list) {
        C0376Q0 c0376q0EncodeQueryTarget = this.serializer.encodeQueryTarget(query.toAggregateTarget());
        HashMap<String, String> map = new HashMap<>();
        C0424k0 c0424k0EncodeStructuredAggregationQuery = this.serializer.encodeStructuredAggregationQuery(c0376q0EncodeQueryTarget, list, map);
        C0392Z c0392zM754h = C0395a0.m754h();
        c0392zM754h.m712b(c0376q0EncodeQueryTarget.m656h());
        c0392zM754h.m713c(c0424k0EncodeStructuredAggregationQuery);
        FirestoreChannel firestoreChannel = this.channel;
        C0567l0 c0567l0M1315e = AbstractC0355G.f699w;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f699w;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1197t;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "RunAggregationQuery");
                        c0561i0M1318b.f1191a = true;
                        C0395a0 c0395a0M753g = C0395a0.m753g();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0395a0M753g);
                        c0561i0M1318b.f1193c = new C0874b(C0398b0.m761e());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f699w = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return firestoreChannel.runRpc(c0567l0M1315e, (C0395a0) c0392zM754h.m12341build()).continueWith(this.workerQueue.getExecutor(), new C5962e(0, this, map));
    }

    public void shutdown() {
        this.channel.shutdown();
    }

    public static boolean isPermanentError(C0589w0 c0589w0) {
        return isPermanentError(FirebaseFirestoreException.Code.fromValue(c0589w0.f1287a.f1265s));
    }
}
