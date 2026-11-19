package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.auth.CredentialsProvider;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.core.DatabaseInfo;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Util;
import java.util.BitSet;
import p001B.C0099y;
import p011H.AbstractC0271e0;
import p030R.AbstractC0520C;
import p030R.AbstractC0553e0;
import p030R.AbstractC0560i;
import p030R.AbstractC0562j;
import p030R.C0549c0;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0572o;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
public class FirestoreChannel {
    private static final AbstractC0553e0 RESOURCE_PREFIX_HEADER;
    private static final AbstractC0553e0 X_GOOG_API_CLIENT_HEADER;
    private static final AbstractC0553e0 X_GOOG_REQUEST_PARAMS_HEADER;
    private static volatile String clientLanguage;
    private final CredentialsProvider<String> appCheckProvider;
    private final AsyncQueue asyncQueue;
    private final CredentialsProvider<User> authProvider;
    private final GrpcCallProvider callProvider;
    private final GrpcMetadataProvider metadataProvider;
    private final String resourcePrefixValue;

    static {
        C0572o c0572o = C0559h0.f1187d;
        BitSet bitSet = AbstractC0553e0.f1161d;
        X_GOOG_API_CLIENT_HEADER = new C0549c0("x-goog-api-client", c0572o);
        RESOURCE_PREFIX_HEADER = new C0549c0("google-cloud-resource-prefix", c0572o);
        X_GOOG_REQUEST_PARAMS_HEADER = new C0549c0("x-goog-request-params", c0572o);
        clientLanguage = "gl-java/";
    }

    public FirestoreChannel(AsyncQueue asyncQueue, Context context, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseInfo databaseInfo, GrpcMetadataProvider grpcMetadataProvider) {
        this(asyncQueue, credentialsProvider, credentialsProvider2, databaseInfo.getDatabaseId(), grpcMetadataProvider, getGrpcCallProvider(asyncQueue, context, credentialsProvider, credentialsProvider2, databaseInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FirebaseFirestoreException exceptionFromStatus(C0589w0 c0589w0) {
        return Datastore.isMissingSslCiphers(c0589w0) ? new FirebaseFirestoreException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", FirebaseFirestoreException.Code.fromValue(c0589w0.f1287a.f1265s), c0589w0.f1289c) : Util.exceptionFromStatus(c0589w0);
    }

    private String getGoogApiClientValue() {
        return AbstractC0271e0.m414v(clientLanguage, " fire/26.3.0 grpc/");
    }

    private static GrpcCallProvider getGrpcCallProvider(AsyncQueue asyncQueue, Context context, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseInfo databaseInfo) {
        return new GrpcCallProvider(asyncQueue, context, databaseInfo, new FirestoreCallCredentials(credentialsProvider, credentialsProvider2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runBidiStreamingRpc$0(final AbstractC0562j[] abstractC0562jArr, final IncomingStreamObserver incomingStreamObserver, Task task) {
        AbstractC0562j abstractC0562j = (AbstractC0562j) task.getResult();
        abstractC0562jArr[0] = abstractC0562j;
        abstractC0562j.start(new AbstractC0560i() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.1
            @Override // p030R.AbstractC0560i
            public void onClose(C0589w0 c0589w0, C0559h0 c0559h0) {
                try {
                    incomingStreamObserver.onClose(c0589w0);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // p030R.AbstractC0560i
            public void onHeaders(C0559h0 c0559h0) {
                try {
                    incomingStreamObserver.onHeaders(c0559h0);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // p030R.AbstractC0560i
            public void onMessage(RespT respt) {
                try {
                    incomingStreamObserver.onNext(respt);
                    abstractC0562jArr[0].request(1);
                } catch (Throwable th) {
                    FirestoreChannel.this.asyncQueue.panic(th);
                }
            }

            @Override // p030R.AbstractC0560i
            public void onReady() {
            }
        }, requestHeaders());
        incomingStreamObserver.onOpen();
        abstractC0562jArr[0].request(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runRpc$2(final TaskCompletionSource taskCompletionSource, Object obj, Task task) {
        AbstractC0562j abstractC0562j = (AbstractC0562j) task.getResult();
        abstractC0562j.start(new AbstractC0560i() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.4
            @Override // p030R.AbstractC0560i
            public void onClose(C0589w0 c0589w0, C0559h0 c0559h0) {
                if (!c0589w0.m1352e()) {
                    taskCompletionSource.m10767a(FirestoreChannel.this.exceptionFromStatus(c0589w0));
                } else {
                    if (taskCompletionSource.f23216a.isComplete()) {
                        return;
                    }
                    taskCompletionSource.m10767a(new FirebaseFirestoreException("Received onClose with status OK, but no message.", FirebaseFirestoreException.Code.INTERNAL));
                }
            }

            @Override // p030R.AbstractC0560i
            public void onMessage(RespT respt) {
                taskCompletionSource.m10768b(respt);
            }
        }, requestHeaders());
        abstractC0562j.request(2);
        abstractC0562j.sendMessage(obj);
        abstractC0562j.halfClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runStreamingResponseRpc$1(final StreamingListener streamingListener, Object obj, Task task) {
        final AbstractC0562j abstractC0562j = (AbstractC0562j) task.getResult();
        abstractC0562j.start(new AbstractC0560i() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.3
            @Override // p030R.AbstractC0560i
            public void onClose(C0589w0 c0589w0, C0559h0 c0559h0) {
                streamingListener.onClose(c0589w0);
            }

            @Override // p030R.AbstractC0560i
            public void onMessage(RespT respt) {
                streamingListener.onMessage(respt);
                abstractC0562j.request(1);
            }
        }, requestHeaders());
        abstractC0562j.request(1);
        abstractC0562j.sendMessage(obj);
        abstractC0562j.halfClose();
    }

    private C0559h0 requestHeaders() {
        C0559h0 c0559h0 = new C0559h0();
        c0559h0.m1310f(X_GOOG_API_CLIENT_HEADER, getGoogApiClientValue());
        c0559h0.m1310f(RESOURCE_PREFIX_HEADER, this.resourcePrefixValue);
        c0559h0.m1310f(X_GOOG_REQUEST_PARAMS_HEADER, this.resourcePrefixValue);
        GrpcMetadataProvider grpcMetadataProvider = this.metadataProvider;
        if (grpcMetadataProvider != null) {
            grpcMetadataProvider.updateMetadata(c0559h0);
        }
        return c0559h0;
    }

    public static void setClientLanguage(String str) {
        clientLanguage = str;
    }

    public void invalidateToken() {
        this.authProvider.invalidateToken();
        this.appCheckProvider.invalidateToken();
    }

    public <ReqT, RespT> AbstractC0562j runBidiStreamingRpc(C0567l0 c0567l0, IncomingStreamObserver<RespT> incomingStreamObserver) {
        final AbstractC0562j[] abstractC0562jArr = {null};
        final Task<AbstractC0562j> taskCreateClientCall = this.callProvider.createClientCall(c0567l0);
        taskCreateClientCall.addOnCompleteListener(this.asyncQueue.getExecutor(), new C5963f(this, abstractC0562jArr, incomingStreamObserver, 1));
        return new AbstractC0520C() { // from class: com.google.firebase.firestore.remote.FirestoreChannel.2
            @Override // p030R.AbstractC0520C
            public AbstractC0562j delegate() {
                Assert.hardAssert(abstractC0562jArr[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
                return abstractC0562jArr[0];
            }

            @Override // p030R.AbstractC0520C, p030R.AbstractC0562j
            public void halfClose() {
                if (abstractC0562jArr[0] == null) {
                    taskCreateClientCall.addOnSuccessListener(FirestoreChannel.this.asyncQueue.getExecutor(), new C0099y(24));
                } else {
                    super.halfClose();
                }
            }
        };
    }

    public <ReqT, RespT> Task<RespT> runRpc(C0567l0 c0567l0, ReqT reqt) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.callProvider.createClientCall(c0567l0).addOnCompleteListener(this.asyncQueue.getExecutor(), new C5963f(this, taskCompletionSource, reqt, 2));
        return taskCompletionSource.f23216a;
    }

    public <ReqT, RespT> void runStreamingResponseRpc(C0567l0 c0567l0, ReqT reqt, StreamingListener<RespT> streamingListener) {
        this.callProvider.createClientCall(c0567l0).addOnCompleteListener(this.asyncQueue.getExecutor(), new C5963f(this, streamingListener, reqt, 3));
    }

    public void shutdown() {
        this.callProvider.shutdown();
    }

    public FirestoreChannel(AsyncQueue asyncQueue, CredentialsProvider<User> credentialsProvider, CredentialsProvider<String> credentialsProvider2, DatabaseId databaseId, GrpcMetadataProvider grpcMetadataProvider, GrpcCallProvider grpcCallProvider) {
        this.asyncQueue = asyncQueue;
        this.metadataProvider = grpcMetadataProvider;
        this.authProvider = credentialsProvider;
        this.appCheckProvider = credentialsProvider2;
        this.callProvider = grpcCallProvider;
        this.resourcePrefixValue = "projects/" + databaseId.getProjectId() + "/databases/" + databaseId.getDatabaseId();
    }

    public static abstract class StreamingListener<T> {
        public void onMessage(T t) {
        }

        public void onClose(C0589w0 c0589w0) {
        }
    }
}
