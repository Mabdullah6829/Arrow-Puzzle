package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6161A;
import java.util.Map;
import p022N.AbstractC0355G;
import p022N.C0363K;
import p022N.C0367M;
import p022N.C0369N;
import p030R.C0561i0;
import p030R.C0567l0;
import p030R.EnumC0565k0;
import p041Y.AbstractC0875c;
import p041Y.C0874b;

/* JADX INFO: loaded from: classes2.dex */
public class WatchStream extends AbstractStream<C0367M, C0369N, Callback> {
    public static final AbstractC6251n EMPTY_RESUME_TOKEN = AbstractC6251n.f24219t;
    private final RemoteSerializer serializer;

    public interface Callback extends Stream.StreamCallback {
        void onWatchChange(SnapshotVersion snapshotVersion, WatchChange watchChange);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        C0567l0 c0567l0M1315e = AbstractC0355G.f701y;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f701y;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1198u;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "Listen");
                        c0561i0M1318b.f1191a = true;
                        C0367M c0367mM616i = C0367M.m616i();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0367mM616i);
                        c0561i0M1318b.f1193c = new C0874b(C0369N.m624e());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f701y = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(firestoreChannel, c0567l0M1315e, asyncQueue, AsyncQueue.TimerId.LISTEN_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.LISTEN_STREAM_IDLE, AsyncQueue.TimerId.HEALTH_CHECK_TIMEOUT, callback);
        this.serializer = remoteSerializer;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public void unwatchTarget(int i2) {
        Assert.hardAssert(isOpen(), "Unwatching targets requires an open stream", new Object[0]);
        C0363K c0363kM617j = C0367M.m617j();
        c0363kM617j.m602d(this.serializer.databaseName());
        c0363kM617j.m603e(i2);
        writeRequest((C0367M) c0363kM617j.m12341build());
    }

    public void watchQuery(TargetData targetData) {
        Assert.hardAssert(isOpen(), "Watching queries requires an open stream", new Object[0]);
        C0363K c0363kM617j = C0367M.m617j();
        c0363kM617j.m602d(this.serializer.databaseName());
        c0363kM617j.m601c(this.serializer.encodeTarget(targetData));
        Map<String, String> mapEncodeListenRequestLabels = this.serializer.encodeListenRequestLabels(targetData);
        if (mapEncodeListenRequestLabels != null) {
            c0363kM617j.m600b(mapEncodeListenRequestLabels);
        }
        writeRequest((C0367M) c0363kM617j.m12341build());
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onFirst(C0369N c0369n) {
        onNext(c0369n);
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onNext(C0369N c0369n) {
        this.backoff.reset();
        WatchChange watchChangeDecodeWatchChange = this.serializer.decodeWatchChange(c0369n);
        ((Callback) this.listener).onWatchChange(this.serializer.decodeVersionFromListenResponse(c0369n), watchChangeDecodeWatchChange);
    }
}
