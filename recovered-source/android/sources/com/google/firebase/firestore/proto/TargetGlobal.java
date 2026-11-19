package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6175H;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.AbstractC6261s;
import com.google.protobuf.C6161A;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class TargetGlobal extends AbstractC6185M implements TargetGlobalOrBuilder {
    private static final TargetGlobal DEFAULT_INSTANCE;
    public static final int HIGHEST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 2;
    public static final int HIGHEST_TARGET_ID_FIELD_NUMBER = 1;
    public static final int LAST_REMOTE_SNAPSHOT_VERSION_FIELD_NUMBER = 3;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int TARGET_COUNT_FIELD_NUMBER = 4;
    private int bitField0_;
    private long highestListenSequenceNumber_;
    private int highestTargetId_;
    private C6197S0 lastRemoteSnapshotVersion_;
    private int targetCount_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.TargetGlobal$1 */
    public static /* synthetic */ class C59381 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23909xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23909xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23909xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23909xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23909xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23909xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23909xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23909xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements TargetGlobalOrBuilder {
        public /* synthetic */ Builder(C59381 c59381) {
            this();
        }

        public Builder clearHighestListenSequenceNumber() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestListenSequenceNumber();
            return this;
        }

        public Builder clearHighestTargetId() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearHighestTargetId();
            return this;
        }

        public Builder clearLastRemoteSnapshotVersion() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearLastRemoteSnapshotVersion();
            return this;
        }

        public Builder clearTargetCount() {
            copyOnWrite();
            ((TargetGlobal) this.instance).clearTargetCount();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public long getHighestListenSequenceNumber() {
            return ((TargetGlobal) this.instance).getHighestListenSequenceNumber();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public int getHighestTargetId() {
            return ((TargetGlobal) this.instance).getHighestTargetId();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public C6197S0 getLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).getLastRemoteSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public int getTargetCount() {
            return ((TargetGlobal) this.instance).getTargetCount();
        }

        @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
        public boolean hasLastRemoteSnapshotVersion() {
            return ((TargetGlobal) this.instance).hasLastRemoteSnapshotVersion();
        }

        public Builder mergeLastRemoteSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((TargetGlobal) this.instance).mergeLastRemoteSnapshotVersion(c6197s0);
            return this;
        }

        public Builder setHighestListenSequenceNumber(long j2) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestListenSequenceNumber(j2);
            return this;
        }

        public Builder setHighestTargetId(int i2) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setHighestTargetId(i2);
            return this;
        }

        public Builder setLastRemoteSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion(c6197s0);
            return this;
        }

        public Builder setTargetCount(int i2) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setTargetCount(i2);
            return this;
        }

        private Builder() {
            super(TargetGlobal.DEFAULT_INSTANCE);
        }

        public Builder setLastRemoteSnapshotVersion(C6195R0 c6195r0) {
            copyOnWrite();
            ((TargetGlobal) this.instance).setLastRemoteSnapshotVersion((C6197S0) c6195r0.m12341build());
            return this;
        }
    }

    static {
        TargetGlobal targetGlobal = new TargetGlobal();
        DEFAULT_INSTANCE = targetGlobal;
        AbstractC6185M.registerDefaultInstance(TargetGlobal.class, targetGlobal);
    }

    private TargetGlobal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestListenSequenceNumber() {
        this.highestListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHighestTargetId() {
        this.highestTargetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastRemoteSnapshotVersion() {
        this.lastRemoteSnapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetCount() {
        this.targetCount_ = 0;
    }

    public static TargetGlobal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastRemoteSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.lastRemoteSnapshotVersion_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.lastRemoteSnapshotVersion_ = c6197s0;
        } else {
            this.lastRemoteSnapshotVersion_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.lastRemoteSnapshotVersion_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream) {
        return (TargetGlobal) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestListenSequenceNumber(long j2) {
        this.highestListenSequenceNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHighestTargetId(int i2) {
        this.highestTargetId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastRemoteSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.lastRemoteSnapshotVersion_ = c6197s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetCount(int i2) {
        this.targetCount_ = i2;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59381 c59381 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003ဉ\u0000\u0004\u0004", new Object[]{"bitField0_", "highestTargetId_", "highestListenSequenceNumber_", "lastRemoteSnapshotVersion_", "targetCount_"});
            case 3:
                return new TargetGlobal();
            case 4:
                return new Builder(c59381);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (TargetGlobal.class) {
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

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public long getHighestListenSequenceNumber() {
        return this.highestListenSequenceNumber_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public int getHighestTargetId() {
        return this.highestTargetId_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public C6197S0 getLastRemoteSnapshotVersion() {
        C6197S0 c6197s0 = this.lastRemoteSnapshotVersion_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public int getTargetCount() {
        return this.targetCount_;
    }

    @Override // com.google.firebase.firestore.proto.TargetGlobalOrBuilder
    public boolean hasLastRemoteSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(TargetGlobal targetGlobal) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(targetGlobal);
    }

    public static TargetGlobal parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static TargetGlobal parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static TargetGlobal parseFrom(AbstractC6251n abstractC6251n) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static TargetGlobal parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static TargetGlobal parseFrom(byte[] bArr) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TargetGlobal parseFrom(byte[] bArr, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static TargetGlobal parseFrom(InputStream inputStream) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TargetGlobal parseFrom(InputStream inputStream, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static TargetGlobal parseFrom(AbstractC6261s abstractC6261s) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static TargetGlobal parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (TargetGlobal) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
