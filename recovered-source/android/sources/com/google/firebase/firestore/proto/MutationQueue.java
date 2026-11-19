package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6175H;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.AbstractC6261s;
import com.google.protobuf.C6161A;
import com.google.protobuf.C6177I;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MutationQueue extends AbstractC6185M implements MutationQueueOrBuilder {
    private static final MutationQueue DEFAULT_INSTANCE;
    public static final int LAST_ACKNOWLEDGED_BATCH_ID_FIELD_NUMBER = 1;
    public static final int LAST_STREAM_TOKEN_FIELD_NUMBER = 2;
    private static volatile InterfaceC6162A0 PARSER;
    private int lastAcknowledgedBatchId_;
    private AbstractC6251n lastStreamToken_ = AbstractC6251n.f24219t;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.MutationQueue$1 */
    public static /* synthetic */ class C59351 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23906xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23906xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23906xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23906xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23906xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23906xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23906xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23906xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements MutationQueueOrBuilder {
        public /* synthetic */ Builder(C59351 c59351) {
            this();
        }

        public Builder clearLastAcknowledgedBatchId() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastAcknowledgedBatchId();
            return this;
        }

        public Builder clearLastStreamToken() {
            copyOnWrite();
            ((MutationQueue) this.instance).clearLastStreamToken();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public int getLastAcknowledgedBatchId() {
            return ((MutationQueue) this.instance).getLastAcknowledgedBatchId();
        }

        @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
        public AbstractC6251n getLastStreamToken() {
            return ((MutationQueue) this.instance).getLastStreamToken();
        }

        public Builder setLastAcknowledgedBatchId(int i2) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastAcknowledgedBatchId(i2);
            return this;
        }

        public Builder setLastStreamToken(AbstractC6251n abstractC6251n) {
            copyOnWrite();
            ((MutationQueue) this.instance).setLastStreamToken(abstractC6251n);
            return this;
        }

        private Builder() {
            super(MutationQueue.DEFAULT_INSTANCE);
        }
    }

    static {
        MutationQueue mutationQueue = new MutationQueue();
        DEFAULT_INSTANCE = mutationQueue;
        AbstractC6185M.registerDefaultInstance(MutationQueue.class, mutationQueue);
    }

    private MutationQueue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAcknowledgedBatchId() {
        this.lastAcknowledgedBatchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastStreamToken() {
        this.lastStreamToken_ = getDefaultInstance().getLastStreamToken();
    }

    public static MutationQueue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream) {
        return (MutationQueue) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAcknowledgedBatchId(int i2) {
        this.lastAcknowledgedBatchId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastStreamToken(AbstractC6251n abstractC6251n) {
        abstractC6251n.getClass();
        this.lastStreamToken_ = abstractC6251n;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59351 c59351 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"lastAcknowledgedBatchId_", "lastStreamToken_"});
            case 3:
                return new MutationQueue();
            case 4:
                return new Builder(c59351);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (MutationQueue.class) {
                    try {
                        c6177i = PARSER;
                        if (c6177i == null) {
                            c6177i = new C6177I(DEFAULT_INSTANCE);
                            PARSER = c6177i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c6177i;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public int getLastAcknowledgedBatchId() {
        return this.lastAcknowledgedBatchId_;
    }

    @Override // com.google.firebase.firestore.proto.MutationQueueOrBuilder
    public AbstractC6251n getLastStreamToken() {
        return this.lastStreamToken_;
    }

    public static Builder newBuilder(MutationQueue mutationQueue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(mutationQueue);
    }

    public static MutationQueue parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static MutationQueue parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static MutationQueue parseFrom(AbstractC6251n abstractC6251n) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static MutationQueue parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static MutationQueue parseFrom(byte[] bArr) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MutationQueue parseFrom(byte[] bArr, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static MutationQueue parseFrom(InputStream inputStream) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MutationQueue parseFrom(InputStream inputStream, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static MutationQueue parseFrom(AbstractC6261s abstractC6261s) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static MutationQueue parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (MutationQueue) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
