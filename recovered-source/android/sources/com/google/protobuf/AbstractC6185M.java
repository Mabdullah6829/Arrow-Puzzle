package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: com.google.protobuf.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6185M extends AbstractC6218c {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC6185M> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C6201U0 unknownFields;

    public AbstractC6185M() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C6201U0.f24124f;
    }

    public static C6181K access$000(AbstractC6273y abstractC6273y) {
        abstractC6273y.getClass();
        return (C6181K) abstractC6273y;
    }

    /* JADX INFO: renamed from: b */
    public static void m11777b(AbstractC6185M abstractC6185M) throws InvalidProtocolBufferException {
        if (abstractC6185M == null || abstractC6185M.isInitialized()) {
            return;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = abstractC6185M.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC6185M m11778c(AbstractC6185M abstractC6185M, InputStream inputStream, C6161A c6161a) throws InvalidProtocolBufferException {
        try {
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            AbstractC6261s abstractC6261sM11967g = AbstractC6261s.m11967g(new C6212a(inputStream, AbstractC6261s.m11968s(i2, inputStream)));
            AbstractC6185M partialFrom = parsePartialFrom(abstractC6185M, abstractC6261sM11967g, c6161a);
            abstractC6261sM11967g.mo11912a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.f24088s) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6185M m11779d(AbstractC6185M abstractC6185M, byte[] bArr, int i2, int i3, C6161A c6161a) throws InvalidProtocolBufferException {
        AbstractC6185M abstractC6185MNewMutableInstance = abstractC6185M.newMutableInstance();
        try {
            InterfaceC6178I0 interfaceC6178I0M11706b = C6166C0.f24055c.m11706b(abstractC6185MNewMutableInstance);
            interfaceC6178I0M11706b.mo11733c(abstractC6185MNewMutableInstance, bArr, i2, i2 + i3, new C6230g(c6161a));
            interfaceC6178I0M11706b.makeImmutable(abstractC6185MNewMutableInstance);
            return abstractC6185MNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.f24088s) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m11744h();
        }
    }

    public static InterfaceC6196S emptyBooleanList() {
        return C6233h.f24179v;
    }

    public static InterfaceC6198T emptyDoubleList() {
        return C6271x.f24295v;
    }

    public static InterfaceC6204W emptyFloatList() {
        return C6171F.f24072v;
    }

    public static InterfaceC6206X emptyIntList() {
        return C6193Q.f24120v;
    }

    public static InterfaceC6208Y emptyLongList() {
        return C6237i0.f24187v;
    }

    public static <E> InterfaceC6210Z emptyProtobufList() {
        return C6168D0.f24060v;
    }

    public static <T extends AbstractC6185M> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC6185M) AbstractC6223d1.m11861b(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static InterfaceC6206X mutableCopy(InterfaceC6206X interfaceC6206X) {
        C6193Q c6193q = (C6193Q) interfaceC6206X;
        int i2 = c6193q.f24122u;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 >= i2) {
            return new C6193Q(Arrays.copyOf(c6193q.f24121t, i3), c6193q.f24122u, true);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(InterfaceC6262s0 interfaceC6262s0, String str, Object[] objArr) {
        return new C6170E0(interfaceC6262s0, str, objArr);
    }

    public static <ContainingType extends InterfaceC6262s0, Type> C6181K newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC6262s0 interfaceC6262s0, InterfaceC6202V interfaceC6202V, int i2, EnumC6247l1 enumC6247l1, boolean z, Class cls) {
        return new C6181K(containingtype, Collections.EMPTY_LIST, interfaceC6262s0, new C6179J(interfaceC6202V, i2, enumC6247l1, true, z));
    }

    public static <ContainingType extends InterfaceC6262s0, Type> C6181K newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC6262s0 interfaceC6262s0, InterfaceC6202V interfaceC6202V, int i2, EnumC6247l1 enumC6247l1, Class cls) {
        return new C6181K(containingtype, type, interfaceC6262s0, new C6179J(interfaceC6202V, i2, enumC6247l1, false, false));
    }

    public static <T extends AbstractC6185M> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) m11778c(t, inputStream, C6161A.m11704a());
        m11777b(t2);
        return t2;
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, ByteBuffer byteBuffer, C6161A c6161a) throws InvalidProtocolBufferException {
        AbstractC6261s abstractC6261sM11966f;
        if (byteBuffer.hasArray()) {
            abstractC6261sM11966f = AbstractC6261s.m11966f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && AbstractC6223d1.f24165d) {
            abstractC6261sM11966f = new C6259r(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC6261sM11966f = AbstractC6261s.m11966f(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, abstractC6261sM11966f, c6161a);
        m11777b(t2);
        return t2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static <T extends AbstractC6185M> T parsePartialFrom(T t, AbstractC6261s abstractC6261s, C6161A c6161a) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            InterfaceC6178I0 interfaceC6178I0M11706b = C6166C0.f24055c.m11706b(t2);
            C6263t c6263t = abstractC6261s.f24261c;
            if (c6263t == null) {
                c6263t = new C6263t(abstractC6261s);
            }
            interfaceC6178I0M11706b.mo11732b(t2, c6263t, c6161a);
            interfaceC6178I0M11706b.makeImmutable(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            if (e.f24088s) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends AbstractC6185M> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(EnumC6183L.f24105u);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        C6166C0 c6166c0 = C6166C0.f24055c;
        c6166c0.getClass();
        return c6166c0.m11705a(getClass()).mo11734d(this);
    }

    public final <MessageType extends AbstractC6185M, BuilderType extends AbstractC6175H> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(EnumC6183L.f24107w);
    }

    public Object dynamicMethod(EnumC6183L enumC6183L, Object obj) {
        return dynamicMethod(enumC6183L, obj, null);
    }

    public abstract Object dynamicMethod(EnumC6183L enumC6183L, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6166C0 c6166c0 = C6166C0.f24055c;
        c6166c0.getClass();
        return c6166c0.m11705a(getClass()).mo11736f(this, (AbstractC6185M) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public final InterfaceC6162A0 getParserForType() {
        return (InterfaceC6162A0) dynamicMethod(EnumC6183L.f24109y);
    }

    @Override // com.google.protobuf.AbstractC6218c
    public int getSerializedSize(InterfaceC6178I0 interfaceC6178I0) {
        int iMo11735e;
        int iMo11735e2;
        if (isMutable()) {
            if (interfaceC6178I0 == null) {
                C6166C0 c6166c0 = C6166C0.f24055c;
                c6166c0.getClass();
                iMo11735e2 = c6166c0.m11705a(getClass()).mo11735e(this);
            } else {
                iMo11735e2 = interfaceC6178I0.mo11735e(this);
            }
            if (iMo11735e2 >= 0) {
                return iMo11735e2;
            }
            throw new IllegalStateException(AbstractC0271e0.m396d(iMo11735e2, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC6178I0 == null) {
            C6166C0 c6166c1 = C6166C0.f24055c;
            c6166c1.getClass();
            iMo11735e = c6166c1.m11705a(getClass()).mo11735e(this);
        } else {
            iMo11735e = interfaceC6178I0.mo11735e(this);
        }
        setMemoizedSerializedSize(iMo11735e);
        return iMo11735e;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.InterfaceC6264t0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        C6166C0 c6166c0 = C6166C0.f24055c;
        c6166c0.getClass();
        c6166c0.m11705a(getClass()).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i2, AbstractC6251n abstractC6251n) {
        if (this.unknownFields == C6201U0.f24124f) {
            this.unknownFields = new C6201U0();
        }
        C6201U0 c6201u0 = this.unknownFields;
        c6201u0.m11824a();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c6201u0.m11828f((i2 << 3) | 2, abstractC6251n);
    }

    public final void mergeUnknownFields(C6201U0 c6201u0) {
        this.unknownFields = C6201U0.m11823e(this.unknownFields, c6201u0);
    }

    public void mergeVarintField(int i2, int i3) {
        if (this.unknownFields == C6201U0.f24124f) {
            this.unknownFields = new C6201U0();
        }
        C6201U0 c6201u0 = this.unknownFields;
        c6201u0.m11824a();
        if (i2 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c6201u0.m11828f(i2 << 3, Long.valueOf(i3));
    }

    public AbstractC6185M newMutableInstance() {
        return (AbstractC6185M) dynamicMethod(EnumC6183L.f24106v);
    }

    public boolean parseUnknownField(int i2, AbstractC6261s abstractC6261s) {
        if ((i2 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == C6201U0.f24124f) {
            this.unknownFields = new C6201U0();
        }
        return this.unknownFields.m11827d(i2, abstractC6261s);
    }

    public void setMemoizedHashCode(int i2) {
        this.memoizedHashCode = i2;
    }

    public void setMemoizedSerializedSize(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException(AbstractC0271e0.m396d(i2, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i2 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC6266u0.f24269a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC6266u0.m12020c(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public void writeTo(AbstractC6269w abstractC6269w) {
        C6166C0 c6166c0 = C6166C0.f24055c;
        c6166c0.getClass();
        InterfaceC6178I0 interfaceC6178I0M11705a = c6166c0.m11705a(getClass());
        C6243k0 c6243k0 = abstractC6269w.f24291c;
        if (c6243k0 == null) {
            c6243k0 = new C6243k0(abstractC6269w);
        }
        interfaceC6178I0M11705a.mo11731a(this, c6243k0);
    }

    public static final <T extends AbstractC6185M> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(EnumC6183L.f24103s)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C6166C0 c6166c0 = C6166C0.f24055c;
        c6166c0.getClass();
        boolean zIsInitialized = c6166c0.m11705a(t.getClass()).isInitialized(t);
        if (z) {
            t.dynamicMethod(EnumC6183L.f24104t, zIsInitialized ? t : null);
        }
        return zIsInitialized;
    }

    public final <MessageType extends AbstractC6185M, BuilderType extends AbstractC6175H> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((AbstractC6185M) messagetype);
    }

    public Object dynamicMethod(EnumC6183L enumC6183L) {
        return dynamicMethod(enumC6183L, null, null);
    }

    @Override // com.google.protobuf.InterfaceC6264t0
    public final AbstractC6185M getDefaultInstanceForType() {
        return (AbstractC6185M) dynamicMethod(EnumC6183L.f24108x);
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public final AbstractC6175H newBuilderForType() {
        return (AbstractC6175H) dynamicMethod(EnumC6183L.f24107w);
    }

    /* JADX INFO: renamed from: toBuilder, reason: merged with bridge method [inline-methods] */
    public final AbstractC6175H m12349toBuilder() {
        return ((AbstractC6175H) dynamicMethod(EnumC6183L.f24107w)).mergeFrom(this);
    }

    public static <T extends AbstractC6185M> T parseDelimitedFrom(T t, InputStream inputStream, C6161A c6161a) throws InvalidProtocolBufferException {
        T t2 = (T) m11778c(t, inputStream, c6161a);
        m11777b(t2);
        return t2;
    }

    public static InterfaceC6208Y mutableCopy(InterfaceC6208Y interfaceC6208Y) {
        C6237i0 c6237i0 = (C6237i0) interfaceC6208Y;
        int i2 = c6237i0.f24189u;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 >= i2) {
            return new C6237i0(Arrays.copyOf(c6237i0.f24188t, i3), c6237i0.f24189u, true);
        }
        throw new IllegalArgumentException();
    }

    public static InterfaceC6204W mutableCopy(InterfaceC6204W interfaceC6204W) {
        C6171F c6171f = (C6171F) interfaceC6204W;
        int i2 = c6171f.f24074u;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 >= i2) {
            return new C6171F(Arrays.copyOf(c6171f.f24073t, i3), c6171f.f24074u, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, C6161A.m11704a());
    }

    public static InterfaceC6198T mutableCopy(InterfaceC6198T interfaceC6198T) {
        C6271x c6271x = (C6271x) interfaceC6198T;
        int i2 = c6271x.f24297u;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 >= i2) {
            return new C6271x(Arrays.copyOf(c6271x.f24296t, i3), c6271x.f24297u, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, AbstractC6251n abstractC6251n) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, abstractC6251n, C6161A.m11704a());
        m11777b(t2);
        return t2;
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, AbstractC6251n abstractC6251n, C6161A c6161a) throws InvalidProtocolBufferException {
        AbstractC6261s abstractC6261sMo11725s = abstractC6251n.mo11725s();
        T t2 = (T) parsePartialFrom(t, abstractC6261sMo11725s, c6161a);
        abstractC6261sMo11725s.mo11912a(0);
        m11777b(t2);
        return t2;
    }

    public static InterfaceC6196S mutableCopy(InterfaceC6196S interfaceC6196S) {
        C6233h c6233h = (C6233h) interfaceC6196S;
        int i2 = c6233h.f24181u;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 >= i2) {
            return new C6233h(Arrays.copyOf(c6233h.f24180t, i3), c6233h.f24181u, true);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) m11779d(t, bArr, 0, bArr.length, C6161A.m11704a());
        m11777b(t2);
        return t2;
    }

    public static <E> InterfaceC6210Z mutableCopy(InterfaceC6210Z interfaceC6210Z) {
        int size = interfaceC6210Z.size();
        return interfaceC6210Z.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, byte[] bArr, C6161A c6161a) throws InvalidProtocolBufferException {
        T t2 = (T) m11779d(t, bArr, 0, bArr.length, c6161a);
        m11777b(t2);
        return t2;
    }

    @Override // com.google.protobuf.InterfaceC6262s0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends AbstractC6185M> T parsePartialFrom(T t, AbstractC6261s abstractC6261s) {
        return (T) parsePartialFrom(t, abstractC6261s, C6161A.m11704a());
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, AbstractC6261s.m11967g(inputStream), C6161A.m11704a());
        m11777b(t2);
        return t2;
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, InputStream inputStream, C6161A c6161a) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, AbstractC6261s.m11967g(inputStream), c6161a);
        m11777b(t2);
        return t2;
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, AbstractC6261s abstractC6261s) {
        return (T) parseFrom(t, abstractC6261s, C6161A.m11704a());
    }

    public static <T extends AbstractC6185M> T parseFrom(T t, AbstractC6261s abstractC6261s, C6161A c6161a) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, abstractC6261s, c6161a);
        m11777b(t2);
        return t2;
    }
}
