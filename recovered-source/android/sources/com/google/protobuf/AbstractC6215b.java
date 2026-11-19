package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6215b implements InterfaceC6260r0 {
    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public static UninitializedMessageException newUninitializedMessageException(InterfaceC6262s0 interfaceC6262s0) {
        return new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: a */
    public final String m11845a() {
        return "Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).";
    }

    public abstract AbstractC6215b internalMergeFrom(AbstractC6218c abstractC6218c);

    public boolean mergeDelimitedFrom(InputStream inputStream, C6161A c6161a) throws IOException {
        int i2 = inputStream.read();
        if (i2 == -1) {
            return false;
        }
        m12355mergeFrom((InputStream) new C6212a(inputStream, AbstractC6261s.m11968s(i2, inputStream)), c6161a);
        return true;
    }

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC6215b m12346mergeFrom(AbstractC6261s abstractC6261s, C6161A c6161a);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC6215b m12347mergeFrom(byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: mergeFrom */
    public abstract AbstractC6215b m12348mergeFrom(byte[] bArr, int i2, int i3, C6161A c6161a);

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = AbstractC6213a0.f24134a;
        iterable.getClass();
        if (iterable instanceof InterfaceC6225e0) {
            List underlyingElements = ((InterfaceC6225e0) iterable).getUnderlyingElements();
            InterfaceC6225e0 interfaceC6225e0 = (InterfaceC6225e0) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC6225e0.size() - size) + " is null.";
                    for (int size2 = interfaceC6225e0.size() - 1; size2 >= size; size2--) {
                        interfaceC6225e0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC6251n) {
                    interfaceC6225e0.mo11830i((AbstractC6251n) obj);
                } else {
                    interfaceC6225e0.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC6164B0) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (T t : iterable) {
            if (t == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(t);
        }
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C6161A.m11704a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12353mergeFrom(AbstractC6261s abstractC6261s) {
        return m12346mergeFrom(abstractC6261s, C6161A.m11704a());
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12350mergeFrom(AbstractC6251n abstractC6251n) throws InvalidProtocolBufferException {
        try {
            AbstractC6261s abstractC6261sMo11725s = abstractC6251n.mo11725s();
            m12353mergeFrom(abstractC6261sMo11725s);
            abstractC6261sMo11725s.mo11912a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m11845a(), e2);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12351mergeFrom(AbstractC6251n abstractC6251n, C6161A c6161a) throws InvalidProtocolBufferException {
        try {
            AbstractC6261s abstractC6261sMo11725s = abstractC6251n.mo11725s();
            m12346mergeFrom(abstractC6261sMo11725s, c6161a);
            abstractC6261sMo11725s.mo11912a(0);
            return this;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(m11845a(), e2);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12356mergeFrom(byte[] bArr) {
        return m12347mergeFrom(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12357mergeFrom(byte[] bArr, C6161A c6161a) {
        return m12348mergeFrom(bArr, 0, bArr.length, c6161a);
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12354mergeFrom(InputStream inputStream) {
        AbstractC6261s abstractC6261sM11967g = AbstractC6261s.m11967g(inputStream);
        m12353mergeFrom(abstractC6261sM11967g);
        abstractC6261sM11967g.mo11912a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12355mergeFrom(InputStream inputStream, C6161A c6161a) {
        AbstractC6261s abstractC6261sM11967g = AbstractC6261s.m11967g(inputStream);
        m12346mergeFrom(abstractC6261sM11967g, c6161a);
        abstractC6261sM11967g.mo11912a(0);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
    public AbstractC6215b m12352mergeFrom(InterfaceC6262s0 interfaceC6262s0) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC6262s0)) {
            return internalMergeFrom((AbstractC6218c) interfaceC6262s0);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
