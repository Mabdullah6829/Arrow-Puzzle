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
import p022N.C0366L0;
import p022N.C0368M0;
import p022N.C0370N0;
import p022N.C0372O0;
import p022N.C0374P0;
import p022N.C0376Q0;

/* JADX INFO: loaded from: classes2.dex */
public final class Target extends AbstractC6185M implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int PIPELINE_QUERY_FIELD_NUMBER = 13;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C6197S0 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private C6197S0 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private AbstractC6251n resumeToken_ = AbstractC6251n.f24219t;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.Target$1 */
    public static /* synthetic */ class C59371 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23908xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23908xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23908xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23908xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23908xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23908xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23908xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23908xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements TargetOrBuilder {
        public /* synthetic */ Builder(C59371 c59371) {
            this();
        }

        public Builder clearDocuments() {
            copyOnWrite();
            ((Target) this.instance).clearDocuments();
            return this;
        }

        public Builder clearLastLimboFreeSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearLastLimboFreeSnapshotVersion();
            return this;
        }

        public Builder clearLastListenSequenceNumber() {
            copyOnWrite();
            ((Target) this.instance).clearLastListenSequenceNumber();
            return this;
        }

        public Builder clearPipelineQuery() {
            copyOnWrite();
            ((Target) this.instance).clearPipelineQuery();
            return this;
        }

        public Builder clearQuery() {
            copyOnWrite();
            ((Target) this.instance).clearQuery();
            return this;
        }

        public Builder clearResumeToken() {
            copyOnWrite();
            ((Target) this.instance).clearResumeToken();
            return this;
        }

        public Builder clearSnapshotVersion() {
            copyOnWrite();
            ((Target) this.instance).clearSnapshotVersion();
            return this;
        }

        public Builder clearTargetId() {
            copyOnWrite();
            ((Target) this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            copyOnWrite();
            ((Target) this.instance).clearTargetType();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public C0368M0 getDocuments() {
            return ((Target) this.instance).getDocuments();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public C6197S0 getLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).getLastLimboFreeSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public long getLastListenSequenceNumber() {
            return ((Target) this.instance).getLastListenSequenceNumber();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public C0372O0 getPipelineQuery() {
            return ((Target) this.instance).getPipelineQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public C0376Q0 getQuery() {
            return ((Target) this.instance).getQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public AbstractC6251n getResumeToken() {
            return ((Target) this.instance).getResumeToken();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public C6197S0 getSnapshotVersion() {
            return ((Target) this.instance).getSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public int getTargetId() {
            return ((Target) this.instance).getTargetId();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public TargetTypeCase getTargetTypeCase() {
            return ((Target) this.instance).getTargetTypeCase();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasDocuments() {
            return ((Target) this.instance).hasDocuments();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasLastLimboFreeSnapshotVersion() {
            return ((Target) this.instance).hasLastLimboFreeSnapshotVersion();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasPipelineQuery() {
            return ((Target) this.instance).hasPipelineQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasQuery() {
            return ((Target) this.instance).hasQuery();
        }

        @Override // com.google.firebase.firestore.proto.TargetOrBuilder
        public boolean hasSnapshotVersion() {
            return ((Target) this.instance).hasSnapshotVersion();
        }

        public Builder mergeDocuments(C0368M0 c0368m0) {
            copyOnWrite();
            ((Target) this.instance).mergeDocuments(c0368m0);
            return this;
        }

        public Builder mergeLastLimboFreeSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((Target) this.instance).mergeLastLimboFreeSnapshotVersion(c6197s0);
            return this;
        }

        public Builder mergePipelineQuery(C0372O0 c0372o0) {
            copyOnWrite();
            ((Target) this.instance).mergePipelineQuery(c0372o0);
            return this;
        }

        public Builder mergeQuery(C0376Q0 c0376q0) {
            copyOnWrite();
            ((Target) this.instance).mergeQuery(c0376q0);
            return this;
        }

        public Builder mergeSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((Target) this.instance).mergeSnapshotVersion(c6197s0);
            return this;
        }

        public Builder setDocuments(C0368M0 c0368m0) {
            copyOnWrite();
            ((Target) this.instance).setDocuments(c0368m0);
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion(c6197s0);
            return this;
        }

        public Builder setLastListenSequenceNumber(long j2) {
            copyOnWrite();
            ((Target) this.instance).setLastListenSequenceNumber(j2);
            return this;
        }

        public Builder setPipelineQuery(C0372O0 c0372o0) {
            copyOnWrite();
            ((Target) this.instance).setPipelineQuery(c0372o0);
            return this;
        }

        public Builder setQuery(C0376Q0 c0376q0) {
            copyOnWrite();
            ((Target) this.instance).setQuery(c0376q0);
            return this;
        }

        public Builder setResumeToken(AbstractC6251n abstractC6251n) {
            copyOnWrite();
            ((Target) this.instance).setResumeToken(abstractC6251n);
            return this;
        }

        public Builder setSnapshotVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion(c6197s0);
            return this;
        }

        public Builder setTargetId(int i2) {
            copyOnWrite();
            ((Target) this.instance).setTargetId(i2);
            return this;
        }

        private Builder() {
            super(Target.DEFAULT_INSTANCE);
        }

        public Builder setDocuments(C0366L0 c0366l0) {
            copyOnWrite();
            ((Target) this.instance).setDocuments((C0368M0) c0366l0.m12341build());
            return this;
        }

        public Builder setLastLimboFreeSnapshotVersion(C6195R0 c6195r0) {
            copyOnWrite();
            ((Target) this.instance).setLastLimboFreeSnapshotVersion((C6197S0) c6195r0.m12341build());
            return this;
        }

        public Builder setPipelineQuery(C0370N0 c0370n0) {
            copyOnWrite();
            ((Target) this.instance).setPipelineQuery((C0372O0) c0370n0.m12341build());
            return this;
        }

        public Builder setQuery(C0374P0 c0374p0) {
            copyOnWrite();
            ((Target) this.instance).setQuery((C0376Q0) c0374p0.m12341build());
            return this;
        }

        public Builder setSnapshotVersion(C6195R0 c6195r0) {
            copyOnWrite();
            ((Target) this.instance).setSnapshotVersion((C6197S0) c6195r0.m12341build());
            return this;
        }
    }

    public enum TargetTypeCase {
        QUERY(5),
        DOCUMENTS(6),
        PIPELINE_QUERY(13),
        TARGETTYPE_NOT_SET(0);

        private final int value;

        TargetTypeCase(int i2) {
            this.value = i2;
        }

        public static TargetTypeCase forNumber(int i2) {
            if (i2 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (i2 == 13) {
                return PIPELINE_QUERY;
            }
            if (i2 == 5) {
                return QUERY;
            }
            if (i2 != 6) {
                return null;
            }
            return DOCUMENTS;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static TargetTypeCase valueOf(int i2) {
            return forNumber(i2);
        }
    }

    static {
        Target target = new Target();
        DEFAULT_INSTANCE = target;
        AbstractC6185M.registerDefaultInstance(Target.class, target);
    }

    private Target() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        if (this.targetTypeCase_ == 6) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastLimboFreeSnapshotVersion() {
        this.lastLimboFreeSnapshotVersion_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastListenSequenceNumber() {
        this.lastListenSequenceNumber_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipelineQuery() {
        if (this.targetTypeCase_ == 13) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuery() {
        if (this.targetTypeCase_ == 5) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeToken() {
        this.resumeToken_ = getDefaultInstance().getResumeToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnapshotVersion() {
        this.snapshotVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocuments(C0368M0 c0368m0) {
        c0368m0.getClass();
        if (this.targetTypeCase_ != 6 || this.targetType_ == C0368M0.m619f()) {
            this.targetType_ = c0368m0;
        } else {
            this.targetType_ = ((C0366L0) C0368M0.m621j((C0368M0) this.targetType_).mergeFrom((AbstractC6185M) c0368m0)).buildPartial();
        }
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastLimboFreeSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.lastLimboFreeSnapshotVersion_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.lastLimboFreeSnapshotVersion_ = c6197s0;
        } else {
            this.lastLimboFreeSnapshotVersion_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.lastLimboFreeSnapshotVersion_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePipelineQuery(C0372O0 c0372o0) {
        c0372o0.getClass();
        if (this.targetTypeCase_ != 13 || this.targetType_ == C0372O0.m637f()) {
            this.targetType_ = c0372o0;
        } else {
            this.targetType_ = ((C0370N0) C0372O0.m639j((C0372O0) this.targetType_).mergeFrom((AbstractC6185M) c0372o0)).buildPartial();
        }
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuery(C0376Q0 c0376q0) {
        c0376q0.getClass();
        if (this.targetTypeCase_ != 5 || this.targetType_ == C0376Q0.m653g()) {
            this.targetType_ = c0376q0;
        } else {
            this.targetType_ = ((C0374P0) C0376Q0.m655k((C0376Q0) this.targetType_).mergeFrom((AbstractC6185M) c0376q0)).buildPartial();
        }
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.snapshotVersion_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.snapshotVersion_ = c6197s0;
        } else {
            this.snapshotVersion_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.snapshotVersion_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Target parseDelimitedFrom(InputStream inputStream) {
        return (Target) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(ByteBuffer byteBuffer) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(C0368M0 c0368m0) {
        c0368m0.getClass();
        this.targetType_ = c0368m0;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastLimboFreeSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.lastLimboFreeSnapshotVersion_ = c6197s0;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastListenSequenceNumber(long j2) {
        this.lastListenSequenceNumber_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipelineQuery(C0372O0 c0372o0) {
        c0372o0.getClass();
        this.targetType_ = c0372o0;
        this.targetTypeCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(C0376Q0 c0376q0) {
        c0376q0.getClass();
        this.targetType_ = c0376q0;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeToken(AbstractC6251n abstractC6251n) {
        abstractC6251n.getClass();
        this.resumeToken_ = abstractC6251n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnapshotVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.snapshotVersion_ = c6197s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i2) {
        this.targetId_ = i2;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59371 c59371 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\r\b\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007ဉ\u0001\r<\u0000", new Object[]{"targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", C0376Q0.class, C0368M0.class, "lastLimboFreeSnapshotVersion_", C0372O0.class});
            case 3:
                return new Target();
            case 4:
                return new Builder(c59371);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (Target.class) {
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

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public C0368M0 getDocuments() {
        return this.targetTypeCase_ == 6 ? (C0368M0) this.targetType_ : C0368M0.m619f();
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public C6197S0 getLastLimboFreeSnapshotVersion() {
        C6197S0 c6197s0 = this.lastLimboFreeSnapshotVersion_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public long getLastListenSequenceNumber() {
        return this.lastListenSequenceNumber_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public C0372O0 getPipelineQuery() {
        return this.targetTypeCase_ == 13 ? (C0372O0) this.targetType_ : C0372O0.m637f();
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public C0376Q0 getQuery() {
        return this.targetTypeCase_ == 5 ? (C0376Q0) this.targetType_ : C0376Q0.m653g();
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public AbstractC6251n getResumeToken() {
        return this.resumeToken_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public C6197S0 getSnapshotVersion() {
        C6197S0 c6197s0 = this.snapshotVersion_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public int getTargetId() {
        return this.targetId_;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber(this.targetTypeCase_);
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasDocuments() {
        return this.targetTypeCase_ == 6;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasLastLimboFreeSnapshotVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasPipelineQuery() {
        return this.targetTypeCase_ == 13;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasQuery() {
        return this.targetTypeCase_ == 5;
    }

    @Override // com.google.firebase.firestore.proto.TargetOrBuilder
    public boolean hasSnapshotVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(Target target) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (Target) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static Target parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static Target parseFrom(AbstractC6251n abstractC6251n) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static Target parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static Target parseFrom(byte[] bArr) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Target parseFrom(byte[] bArr, C6161A c6161a) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static Target parseFrom(InputStream inputStream) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Target parseFrom(InputStream inputStream, C6161A c6161a) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static Target parseFrom(AbstractC6261s abstractC6261s) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static Target parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (Target) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
