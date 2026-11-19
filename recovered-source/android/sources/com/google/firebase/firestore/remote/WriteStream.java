package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Preconditions;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.C6161A;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p022N.AbstractC0355G;
import p022N.C0408e1;
import p022N.C0414g1;
import p022N.C0417h1;
import p030R.C0561i0;
import p030R.C0567l0;
import p030R.EnumC0565k0;
import p041Y.AbstractC0875c;
import p041Y.C0874b;

/* JADX INFO: loaded from: classes2.dex */
public class WriteStream extends AbstractStream<C0414g1, C0417h1, Callback> {
    public static final AbstractC6251n EMPTY_STREAM_TOKEN = AbstractC6251n.f24219t;
    protected boolean handshakeComplete;
    private AbstractC6251n lastStreamToken;
    private final RemoteSerializer serializer;

    public interface Callback extends Stream.StreamCallback {
        void onHandshakeComplete();

        void onWriteResponse(SnapshotVersion snapshotVersion, List<MutationResult> list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WriteStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        C0567l0 c0567l0M1315e = AbstractC0355G.f700x;
        if (c0567l0M1315e == null) {
            synchronized (AbstractC0355G.class) {
                try {
                    c0567l0M1315e = AbstractC0355G.f700x;
                    if (c0567l0M1315e == null) {
                        C0561i0 c0561i0M1318b = C0567l0.m1318b();
                        c0561i0M1318b.f1194d = EnumC0565k0.f1198u;
                        c0561i0M1318b.f1195e = C0567l0.m1317a("google.firestore.v1.Firestore", "Write");
                        c0561i0M1318b.f1191a = true;
                        C0414g1 c0414g1M815h = C0414g1.m815h();
                        C6161A c6161a = AbstractC0875c.f2456a;
                        c0561i0M1318b.f1192b = new C0874b(c0414g1M815h);
                        c0561i0M1318b.f1193c = new C0874b(C0417h1.m823f());
                        c0567l0M1315e = c0561i0M1318b.m1315e();
                        AbstractC0355G.f700x = c0567l0M1315e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        super(firestoreChannel, c0567l0M1315e, asyncQueue, AsyncQueue.TimerId.WRITE_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.WRITE_STREAM_IDLE, AsyncQueue.TimerId.HEALTH_CHECK_TIMEOUT, callback);
        this.handshakeComplete = false;
        this.lastStreamToken = EMPTY_STREAM_TOKEN;
        this.serializer = remoteSerializer;
    }

    public AbstractC6251n getLastStreamToken() {
        return this.lastStreamToken;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void inhibitBackoff() {
        super.inhibitBackoff();
    }

    public boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isOpen() {
        return super.isOpen();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ boolean isStarted() {
        return super.isStarted();
    }

    public void setLastStreamToken(AbstractC6251n abstractC6251n) {
        this.lastStreamToken = (AbstractC6251n) Preconditions.checkNotNull(abstractC6251n);
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public void start() {
        this.handshakeComplete = false;
        super.start();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream, com.google.firebase.firestore.remote.Stream
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void tearDown() {
        if (this.handshakeComplete) {
            writeMutations(Collections.EMPTY_LIST);
        }
    }

    public void writeHandshake() {
        Assert.hardAssert(isOpen(), "Writing handshake requires an opened stream", new Object[0]);
        Assert.hardAssert(!this.handshakeComplete, "Handshake already completed", new Object[0]);
        C0408e1 c0408e1M816i = C0414g1.m816i();
        c0408e1M816i.m806c(this.serializer.databaseName());
        writeRequest((C0414g1) c0408e1M816i.m12341build());
    }

    public void writeMutations(List<Mutation> list) {
        Assert.hardAssert(isOpen(), "Writing mutations requires an opened stream", new Object[0]);
        Assert.hardAssert(this.handshakeComplete, "Handshake must be complete before writing mutations", new Object[0]);
        C0408e1 c0408e1M816i = C0414g1.m816i();
        Iterator<Mutation> it = list.iterator();
        while (it.hasNext()) {
            c0408e1M816i.m805b(this.serializer.encodeMutation(it.next()));
        }
        c0408e1M816i.m807d(this.lastStreamToken);
        writeRequest((C0414g1) c0408e1M816i.m12341build());
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onFirst(C0417h1 c0417h1) {
        this.lastStreamToken = c0417h1.m825g();
        this.handshakeComplete = true;
        ((Callback) this.listener).onHandshakeComplete();
    }

    @Override // com.google.firebase.firestore.remote.AbstractStream
    public void onNext(C0417h1 c0417h1) {
        this.lastStreamToken = c0417h1.m825g();
        this.backoff.reset();
        SnapshotVersion snapshotVersionDecodeVersion = this.serializer.decodeVersion(c0417h1.m824e());
        int iM827i = c0417h1.m827i();
        ArrayList arrayList = new ArrayList(iM827i);
        for (int i2 = 0; i2 < iM827i; i2++) {
            arrayList.add(this.serializer.decodeMutationResult(c0417h1.m826h(i2), snapshotVersionDecodeVersion));
        }
        ((Callback) this.listener).onWriteResponse(snapshotVersionDecodeVersion, arrayList);
    }
}
