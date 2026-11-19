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
public final class NoDocument extends AbstractC6185M implements NoDocumentOrBuilder {
    private static final NoDocument DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6162A0 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private C6197S0 readTime_;

    /* JADX INFO: renamed from: com.google.firebase.firestore.proto.NoDocument$1 */
    public static /* synthetic */ class C59361 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f23907xa1df5c61;

        static {
            int[] iArr = new int[EnumC6183L.values().length];
            f23907xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23907xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23907xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23907xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23907xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23907xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23907xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC6175H implements NoDocumentOrBuilder {
        public /* synthetic */ Builder(C59361 c59361) {
            this();
        }

        public Builder clearName() {
            copyOnWrite();
            ((NoDocument) this.instance).clearName();
            return this;
        }

        public Builder clearReadTime() {
            copyOnWrite();
            ((NoDocument) this.instance).clearReadTime();
            return this;
        }

        @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
        public String getName() {
            return ((NoDocument) this.instance).getName();
        }

        @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
        public AbstractC6251n getNameBytes() {
            return ((NoDocument) this.instance).getNameBytes();
        }

        @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
        public C6197S0 getReadTime() {
            return ((NoDocument) this.instance).getReadTime();
        }

        @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
        public boolean hasReadTime() {
            return ((NoDocument) this.instance).hasReadTime();
        }

        public Builder mergeReadTime(C6197S0 c6197s0) {
            copyOnWrite();
            ((NoDocument) this.instance).mergeReadTime(c6197s0);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((NoDocument) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(AbstractC6251n abstractC6251n) {
            copyOnWrite();
            ((NoDocument) this.instance).setNameBytes(abstractC6251n);
            return this;
        }

        public Builder setReadTime(C6197S0 c6197s0) {
            copyOnWrite();
            ((NoDocument) this.instance).setReadTime(c6197s0);
            return this;
        }

        private Builder() {
            super(NoDocument.DEFAULT_INSTANCE);
        }

        public Builder setReadTime(C6195R0 c6195r0) {
            copyOnWrite();
            ((NoDocument) this.instance).setReadTime((C6197S0) c6195r0.m12341build());
            return this;
        }
    }

    static {
        NoDocument noDocument = new NoDocument();
        DEFAULT_INSTANCE = noDocument;
        AbstractC6185M.registerDefaultInstance(NoDocument.class, noDocument);
    }

    private NoDocument() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    public static NoDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(C6197S0 c6197s0) {
        c6197s0.getClass();
        C6197S0 c6197s1 = this.readTime_;
        if (c6197s1 == null || c6197s1 == C6197S0.m11816g()) {
            this.readTime_ = c6197s0;
        } else {
            this.readTime_ = (C6197S0) ((C6195R0) C6197S0.m11818k(this.readTime_).mergeFrom((AbstractC6185M) c6197s0)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NoDocument parseDelimitedFrom(InputStream inputStream) {
        return (NoDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoDocument parseFrom(ByteBuffer byteBuffer) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setReadTime(C6197S0 c6197s0) {
        c6197s0.getClass();
        this.readTime_ = c6197s0;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC6185M
    public final Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2) {
        InterfaceC6162A0 c6177i;
        C59361 c59361 = null;
        switch (enumC6183L.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC6185M.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "name_", "readTime_"});
            case 3:
                return new NoDocument();
            case 4:
                return new Builder(c59361);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6162A0 interfaceC6162A0 = PARSER;
                if (interfaceC6162A0 != null) {
                    return interfaceC6162A0;
                }
                synchronized (NoDocument.class) {
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

    @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
    public AbstractC6251n getNameBytes() {
        String str = this.name_;
        C6248m c6248m = AbstractC6251n.f24219t;
        return new C6248m(str.getBytes(AbstractC6213a0.f24134a));
    }

    @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
    public C6197S0 getReadTime() {
        C6197S0 c6197s0 = this.readTime_;
        return c6197s0 == null ? C6197S0.m11816g() : c6197s0;
    }

    @Override // com.google.firebase.firestore.proto.NoDocumentOrBuilder
    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(NoDocument noDocument) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(noDocument);
    }

    public static NoDocument parseDelimitedFrom(InputStream inputStream, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static NoDocument parseFrom(ByteBuffer byteBuffer, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, byteBuffer, c6161a);
    }

    public static NoDocument parseFrom(AbstractC6251n abstractC6251n) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n);
    }

    public static NoDocument parseFrom(AbstractC6251n abstractC6251n, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6251n, c6161a);
    }

    public static NoDocument parseFrom(byte[] bArr) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NoDocument parseFrom(byte[] bArr, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, bArr, c6161a);
    }

    public static NoDocument parseFrom(InputStream inputStream) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NoDocument parseFrom(InputStream inputStream, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, inputStream, c6161a);
    }

    public static NoDocument parseFrom(AbstractC6261s abstractC6261s) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s);
    }

    public static NoDocument parseFrom(AbstractC6261s abstractC6261s, C6161A c6161a) {
        return (NoDocument) AbstractC6185M.parseFrom(DEFAULT_INSTANCE, abstractC6261s, c6161a);
    }
}
