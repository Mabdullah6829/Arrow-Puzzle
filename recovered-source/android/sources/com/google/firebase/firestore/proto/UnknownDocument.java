package com.google.firebase.firestore.proto;

import com.google.protobuf.AbstractC6175H;
import com.google.protobuf.AbstractC6185M;
import com.google.protobuf.AbstractC6213a0;
import com.google.protobuf.AbstractC6218c;
import com.google.protobuf.AbstractC6251n;
import com.google.protobuf.AbstractC6261s;
import com.google.protobuf.C6161A;
import com.google.protobuf.C6177I;
import com.google.protobuf.C6195R0;
import com.google.protobuf.C6197S0;
import com.google.protobuf.C6248m;
import com.google.protobuf.EnumC6183L;
import com.google.protobuf.InterfaceC6162A0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class UnknownDocument extends AbstractC6185M implements UnknownDocumentOrBuilder {
    private static final UnknownDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C6197S0 version_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.UnknownDocument$1 */
    public static /* synthetic */ class C59391 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23910xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23910xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23910xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23910xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23910xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23910xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23910xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23910xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements UnknownDocumentOrBuilder {
        public /* synthetic */ Builder(C59391 c59391) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((UnknownDocument) this.instance).clearVersion();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public String getName() {
            return ((UnknownDocument) this.instance).getName();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public AbstractC6251n getNameBytes() {
            return ((UnknownDocument) this.instance).getNameBytes();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public C6197S0 getVersion() {
            return ((UnknownDocument) this.instance).getVersion();
        }

        @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
        public boolean hasVersion() {
            return ((UnknownDocument) this.instance).hasVersion();
        }

        public Builder mergeVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((UnknownDocument) this.instance).mergeVersion(c6197s0);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(AbstractC6251n abstractC6251n) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setNameBytes(abstractC6251n);
            return this;
        }

        public Builder setVersion(C6197S0 c6197s0) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion(c6197s0);
            return this;
        }

        private Builder() {
            super(UnknownDocument.DEFAULT_INSTANCE);
        }

        public Builder setVersion(C6195R0 c6195r0) {
            copyOnWrite();
            ((UnknownDocument) this.instance).setVersion((C6197S0) c6195r0.m12341build());
            return this;
        }
    }

    static {
        UnknownDocument unknownDocument = new UnknownDocument();
        DEFAULT_INSTANCE = unknownDocument;
        AbstractC6185M.registerDefaultInstance(UnknownDocument.class, unknownDocument);
    }

    private UnknownDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = null;
        this.bitField0_ &= -2;
    }

    public static UnknownDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.version_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.version_ = c6197s0;
        } else {
            this.version_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.version_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream) {
        return (UnknownDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC6162A0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC6251n abstractC6251n) {
        AbstractC6218c.checkByteStringIsUtf8(abstractC6251n);
        this.name_ = abstractC6251n.m11898y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.version_ = c6197s0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59391 c59391 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "version_"});
            case 3:
                return new UnknownDocument();
            case 4:
                return new Builder(c59391);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (UnknownDocument.class) {
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

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public AbstractC6251n getNameBytes() {
        String str = this.name_;
        C6248m c6248m = AbstractC6251n.f24219t;
        return new C6248m(str.getBytes(AbstractC6213a0.f24134a));
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public C6197S0 getVersion() {
        C6197S0 c6197s0 = this.version_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.UnknownDocumentOrBuilder
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(UnknownDocument unknownDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(unknownDocument);
    }

    public static UnknownDocument parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static UnknownDocument parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static UnknownDocument parseFrom(AbstractC6251n abstractC6251n) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static UnknownDocument parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static UnknownDocument parseFrom(byte[] bArr) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UnknownDocument parseFrom(byte[] bArr, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static UnknownDocument parseFrom(InputStream inputStream) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UnknownDocument parseFrom(InputStream inputStream, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static UnknownDocument parseFrom(AbstractC6261s abstractC6261s) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static UnknownDocument parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (UnknownDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
