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
import p022N.C0435q;
import p022N.C0439s;

/* JADX INFO: loaded from: classes2.dex */
public final class MaybeDocument extends AbstractC6185M implements MaybeDocumentOrBuilder {
    private static final MaybeDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.MaybeDocument$1 */
    public static /* synthetic */ class C59341 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23905xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23905xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23905xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23905xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23905xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23905xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23905xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23905xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements MaybeDocumentOrBuilder {
        public /* synthetic */ Builder(C59341 c59341) {
            this();
        }

        public Builder clearDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentType() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearDocumentType();
            return this;
        }

        public Builder clearHasCommittedMutations() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearHasCommittedMutations();
            return this;
        }

        public Builder clearNoDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearNoDocument();
            return this;
        }

        public Builder clearUnknownDocument() {
            copyOnWrite();
            ((MaybeDocument) this.instance).clearUnknownDocument();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public C0439s getDocument() {
            return ((MaybeDocument) this.instance).getDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public DocumentTypeCase getDocumentTypeCase() {
            return ((MaybeDocument) this.instance).getDocumentTypeCase();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean getHasCommittedMutations() {
            return ((MaybeDocument) this.instance).getHasCommittedMutations();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public NoDocument getNoDocument() {
            return ((MaybeDocument) this.instance).getNoDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public UnknownDocument getUnknownDocument() {
            return ((MaybeDocument) this.instance).getUnknownDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasDocument() {
            return ((MaybeDocument) this.instance).hasDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasNoDocument() {
            return ((MaybeDocument) this.instance).hasNoDocument();
        }

        @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
        public boolean hasUnknownDocument() {
            return ((MaybeDocument) this.instance).hasUnknownDocument();
        }

        public Builder mergeDocument(C0439s c0439s) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeDocument(c0439s);
            return this;
        }

        public Builder mergeNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeNoDocument(noDocument);
            return this;
        }

        public Builder mergeUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).mergeUnknownDocument(unknownDocument);
            return this;
        }

        public Builder setDocument(C0439s c0439s) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument(c0439s);
            return this;
        }

        public Builder setHasCommittedMutations(boolean z) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setHasCommittedMutations(z);
            return this;
        }

        public Builder setNoDocument(NoDocument noDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument(noDocument);
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument unknownDocument) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument(unknownDocument);
            return this;
        }

        private Builder() {
            super(MaybeDocument.DEFAULT_INSTANCE);
        }

        public Builder setDocument(C0435q c0435q) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setDocument((C0439s) c0435q.m12341build());
            return this;
        }

        public Builder setNoDocument(NoDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setNoDocument((NoDocument) builder.m12341build());
            return this;
        }

        public Builder setUnknownDocument(UnknownDocument.Builder builder) {
            copyOnWrite();
            ((MaybeDocument) this.instance).setUnknownDocument((UnknownDocument) builder.m12341build());
            return this;
        }
    }

    public enum DocumentTypeCase {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);

        private final int value;

        DocumentTypeCase(int i2) {
            this.value = i2;
        }

        public static DocumentTypeCase forNumber(int i2) {
            if (i2 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (i2 == 1) {
                return NO_DOCUMENT;
            }
            if (i2 == 2) {
                return DOCUMENT;
            }
            if (i2 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DocumentTypeCase valueOf(int i2) {
            return forNumber(i2);
        }
    }

    static {
        MaybeDocument maybeDocument = new MaybeDocument();
        DEFAULT_INSTANCE = maybeDocument;
        AbstractC6185M.registerDefaultInstance(MaybeDocument.class, maybeDocument);
    }

    private MaybeDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocument() {
        if (this.documentTypeCase_ == 2) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentType() {
        this.documentTypeCase_ = 0;
        this.documentType_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCommittedMutations() {
        this.hasCommittedMutations_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoDocument() {
        if (this.documentTypeCase_ == 1) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknownDocument() {
        if (this.documentTypeCase_ == 3) {
            this.documentTypeCase_ = 0;
            this.documentType_ = null;
        }
    }

    public static MaybeDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocument(C0439s c0439s) {
        c0439s.getClass();
        if (this.documentTypeCase_ != 2 || this.documentType_ == C0439s.m897i()) {
            this.documentType_ = c0439s;
        } else {
            this.documentType_ = ((C0435q) C0439s.m899o((C0439s) this.documentType_).mergeFrom((AbstractC6185M) c0439s)).buildPartial();
        }
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        if (this.documentTypeCase_ != 1 || this.documentType_ == NoDocument.getDefaultInstance()) {
            this.documentType_ = noDocument;
        } else {
            this.documentType_ = ((NoDocument.Builder) NoDocument.newBuilder((NoDocument) this.documentType_).mergeFrom((AbstractC6185M) noDocument)).buildPartial();
        }
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        if (this.documentTypeCase_ != 3 || this.documentType_ == UnknownDocument.getDefaultInstance()) {
            this.documentType_ = unknownDocument;
        } else {
            this.documentType_ = ((UnknownDocument.Builder) UnknownDocument.newBuilder((UnknownDocument) this.documentType_).mergeFrom((AbstractC6185M) unknownDocument)).buildPartial();
        }
        this.documentTypeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream) {
        return (MaybeDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(C0439s c0439s) {
        c0439s.getClass();
        this.documentType_ = c0439s;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCommittedMutations(boolean z) {
        this.hasCommittedMutations_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoDocument(NoDocument noDocument) {
        noDocument.getClass();
        this.documentType_ = noDocument;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknownDocument(UnknownDocument unknownDocument) {
        unknownDocument.getClass();
        this.documentType_ = unknownDocument;
        this.documentTypeCase_ = 3;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59341 c59341 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", NoDocument.class, C0439s.class, UnknownDocument.class, "hasCommittedMutations_"});
            case 3:
                return new MaybeDocument();
            case 4:
                return new Builder(c59341);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (MaybeDocument.class) {
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

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public C0439s getDocument() {
        return this.documentTypeCase_ == 2 ? (C0439s) this.documentType_ : C0439s.m897i();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public DocumentTypeCase getDocumentTypeCase() {
        return DocumentTypeCase.forNumber(this.documentTypeCase_);
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean getHasCommittedMutations() {
        return this.hasCommittedMutations_;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public NoDocument getNoDocument() {
        return this.documentTypeCase_ == 1 ? (NoDocument) this.documentType_ : NoDocument.getDefaultInstance();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public UnknownDocument getUnknownDocument() {
        return this.documentTypeCase_ == 3 ? (UnknownDocument) this.documentType_ : UnknownDocument.getDefaultInstance();
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasDocument() {
        return this.documentTypeCase_ == 2;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasNoDocument() {
        return this.documentTypeCase_ == 1;
    }

    @Override // com.google.firebase.firestore.proto.MaybeDocumentOrBuilder
    public boolean hasUnknownDocument() {
        return this.documentTypeCase_ == 3;
    }

    public static Builder newBuilder(MaybeDocument maybeDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(maybeDocument);
    }

    public static MaybeDocument parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static MaybeDocument parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static MaybeDocument parseFrom(AbstractC6251n abstractC6251n) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static MaybeDocument parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static MaybeDocument parseFrom(byte[] bArr) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MaybeDocument parseFrom(byte[] bArr, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static MaybeDocument parseFrom(InputStream inputStream) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MaybeDocument parseFrom(InputStream inputStream, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static MaybeDocument parseFrom(AbstractC6261s abstractC6261s) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static MaybeDocument parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (MaybeDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
