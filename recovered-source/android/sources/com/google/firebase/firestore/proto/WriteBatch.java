package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6175H;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6218c;
import com.google.protobuf.AbstractC6221d;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.AbstractC6261s;
import com.google.protobuf.C6161A;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import com.google.protobuf.InterfaceC6210Z;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p022N.C0396a1;
import p022N.C0402c1;
import p022N.InterfaceC0405d1;

/* JADX INFO: loaded from: classes2.dex */
public final class WriteBatch extends AbstractC6185M implements WriteBatchOrBuilder {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private C6197S0 localWriteTime_;
    private InterfaceC6210Z writes_ = AbstractC6185M.emptyProtobufList();
    private InterfaceC6210Z baseWrites_ = AbstractC6185M.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.WriteBatch$1 */
    public static /* synthetic */ class C59401 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23911xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23911xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23911xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23911xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23911xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23911xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23911xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23911xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements WriteBatchOrBuilder {
        public /* synthetic */ Builder(C59401 c59401) {
            this();
        }

        public Builder addAllBaseWrites(Iterable<? extends C0402c1> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllBaseWrites(iterable);
            return this;
        }

        public Builder addAllWrites(Iterable<? extends C0402c1> iterable) {
            copyOnWrite();
            ((WriteBatch) this.instance).addAllWrites(iterable);
            return this;
        }

        public Builder addBaseWrites(C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(c0402c1);
            return this;
        }

        public Builder addWrites(C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(c0402c1);
            return this;
        }

        public Builder clearBaseWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBaseWrites();
            return this;
        }

        public Builder clearBatchId() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearBatchId();
            return this;
        }

        public Builder clearLocalWriteTime() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearLocalWriteTime();
            return this;
        }

        public Builder clearWrites() {
            copyOnWrite();
            ((WriteBatch) this.instance).clearWrites();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public C0402c1 getBaseWrites(int i2) {
            return ((WriteBatch) this.instance).getBaseWrites(i2);
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getBaseWritesCount() {
            return ((WriteBatch) this.instance).getBaseWritesCount();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public List<C0402c1> getBaseWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getBaseWritesList());
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getBatchId() {
            return ((WriteBatch) this.instance).getBatchId();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public C6197S0 getLocalWriteTime() {
            return ((WriteBatch) this.instance).getLocalWriteTime();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public C0402c1 getWrites(int i2) {
            return ((WriteBatch) this.instance).getWrites(i2);
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public int getWritesCount() {
            return ((WriteBatch) this.instance).getWritesCount();
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public List<C0402c1> getWritesList() {
            return Collections.unmodifiableList(((WriteBatch) this.instance).getWritesList());
        }

        @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
        public boolean hasLocalWriteTime() {
            return ((WriteBatch) this.instance).hasLocalWriteTime();
        }

        public Builder mergeLocalWriteTime(C6197S0 c6197s0) {
            copyOnWrite();
            ((WriteBatch) this.instance).mergeLocalWriteTime(c6197s0);
            return this;
        }

        public Builder removeBaseWrites(int i2) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeBaseWrites(i2);
            return this;
        }

        public Builder removeWrites(int i2) {
            copyOnWrite();
            ((WriteBatch) this.instance).removeWrites(i2);
            return this;
        }

        public Builder setBaseWrites(int i2, C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i2, c0402c1);
            return this;
        }

        public Builder setBatchId(int i2) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBatchId(i2);
            return this;
        }

        public Builder setLocalWriteTime(C6197S0 c6197s0) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime(c6197s0);
            return this;
        }

        public Builder setWrites(int i2, C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i2, c0402c1);
            return this;
        }

        private Builder() {
            super(WriteBatch.DEFAULT_INSTANCE);
        }

        public Builder addBaseWrites(int i2, C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i2, c0402c1);
            return this;
        }

        public Builder addWrites(int i2, C0402c1 c0402c1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i2, c0402c1);
            return this;
        }

        public Builder setBaseWrites(int i2, C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).setBaseWrites(i2, (C0402c1) c0396a1.m12341build());
            return this;
        }

        public Builder setLocalWriteTime(C6195R0 c6195r0) {
            copyOnWrite();
            ((WriteBatch) this.instance).setLocalWriteTime((C6197S0) c6195r0.m12341build());
            return this;
        }

        public Builder setWrites(int i2, C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).setWrites(i2, (C0402c1) c0396a1.m12341build());
            return this;
        }

        public Builder addBaseWrites(C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites((C0402c1) c0396a1.m12341build());
            return this;
        }

        public Builder addWrites(C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites((C0402c1) c0396a1.m12341build());
            return this;
        }

        public Builder addBaseWrites(int i2, C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addBaseWrites(i2, (C0402c1) c0396a1.m12341build());
            return this;
        }

        public Builder addWrites(int i2, C0396a1 c0396a1) {
            copyOnWrite();
            ((WriteBatch) this.instance).addWrites(i2, (C0402c1) c0396a1.m12341build());
            return this;
        }
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        AbstractC6185M.registerDefaultInstance(WriteBatch.class, writeBatch);
    }

    private WriteBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBaseWrites(Iterable<? extends C0402c1> iterable) {
        ensureBaseWritesIsMutable();
        AbstractC6218c.addAll((Iterable) iterable, (List) this.baseWrites_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends C0402c1> iterable) {
        ensureWritesIsMutable();
        AbstractC6218c.addAll((Iterable) iterable, (List) this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(c0402c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureWritesIsMutable();
        this.writes_.add(c0402c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseWrites() {
        this.baseWrites_ = AbstractC6185M.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchId() {
        this.batchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalWriteTime() {
        this.localWriteTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = AbstractC6185M.emptyProtobufList();
    }

    private void ensureBaseWritesIsMutable() {
        InterfaceC6210Z interfaceC6210Z = this.baseWrites_;
        if (((AbstractC6221d) interfaceC6210Z).f24160s) {
            return;
        }
        this.baseWrites_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
    }

    private void ensureWritesIsMutable() {
        InterfaceC6210Z interfaceC6210Z = this.writes_;
        if (((AbstractC6221d) interfaceC6210Z).f24160s) {
            return;
        }
        this.writes_ = AbstractC6185M.mutableCopy(interfaceC6210Z);
    }

    public static WriteBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocalWriteTime(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.localWriteTime_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.localWriteTime_ = c6197s0;
        } else {
            this.localWriteTime_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.localWriteTime_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream) {
        return (WriteBatch) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBaseWrites(int i2) {
        ensureBaseWritesIsMutable();
        this.baseWrites_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i2) {
        ensureWritesIsMutable();
        this.writes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseWrites(int i2, C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.set(i2, c0402c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchId(int i2) {
        this.batchId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalWriteTime(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.localWriteTime_ = c6197s0;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i2, C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i2, c0402c1);
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59401 c59401 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", C0402c1.class, "localWriteTime_", "baseWrites_", C0402c1.class});
            case 3:
                return new WriteBatch();
            case 4:
                return new Builder(c59401);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (WriteBatch.class) {
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

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public C0402c1 getBaseWrites(int i2) {
        return (C0402c1) this.baseWrites_.get(i2);
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getBaseWritesCount() {
        return this.baseWrites_.size();
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public List<C0402c1> getBaseWritesList() {
        return this.baseWrites_;
    }

    public InterfaceC0405d1 getBaseWritesOrBuilder(int i2) {
        return (InterfaceC0405d1) this.baseWrites_.get(i2);
    }

    public List<? extends InterfaceC0405d1> getBaseWritesOrBuilderList() {
        return this.baseWrites_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getBatchId() {
        return this.batchId_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public C6197S0 getLocalWriteTime() {
        C6197S0 c6197s0 = this.localWriteTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public C0402c1 getWrites(int i2) {
        return (C0402c1) this.writes_.get(i2);
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public int getWritesCount() {
        return this.writes_.size();
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public List<C0402c1> getWritesList() {
        return this.writes_;
    }

    public InterfaceC0405d1 getWritesOrBuilder(int i2) {
        return (InterfaceC0405d1) this.writes_.get(i2);
    }

    public List<? extends InterfaceC0405d1> getWritesOrBuilderList() {
        return this.writes_;
    }

    @Override // com.google.firebase.firestore.proto.WriteBatchOrBuilder
    public boolean hasLocalWriteTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(WriteBatch writeBatch) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(writeBatch);
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static WriteBatch parseFrom(AbstractC6251n abstractC6251n) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(int i2, C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(i2, c0402c1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i2, C0402c1 c0402c1) {
        c0402c1.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i2, c0402c1);
    }

    public static WriteBatch parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static WriteBatch parseFrom(byte[] bArr) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteBatch parseFrom(byte[] bArr, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static WriteBatch parseFrom(InputStream inputStream) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(InputStream inputStream, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static WriteBatch parseFrom(AbstractC6261s abstractC6261s) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static WriteBatch parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (WriteBatch) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
