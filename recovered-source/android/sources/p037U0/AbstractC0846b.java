package p037U0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import p000A0.AbstractC0069y;
import p000A0.C0055p;
import p003C.AbstractC0122m;
import p003C.C0127r;
import p003C.InterfaceC0108C;
import p010F0.C0231q;
import p018K0.InterfaceC0325a;
import p025O0.C0485j;
import p043a.AbstractC0878a;
import p060f0.C6335c;
import p062g0.C6354i;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6371a;
import p078p0.InterfaceC6502p;
import p087v0.C6545d;
import p092z0.EnumC6585c;

/* JADX INFO: renamed from: U0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0846b {
    /* JADX INFO: renamed from: a */
    public static Object m1742a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m1743b(int i2, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C6335c m1744c(C6335c c6335c) {
        c6335c.m12146j();
        c6335c.f24375u = true;
        return c6335c.f24374t > 0 ? c6335c : C6335c.f24372v;
    }

    /* JADX INFO: renamed from: d */
    public static Object m1745d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(AbstractC0846b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: renamed from: e */
    public static final long m1746e(long j2, EnumC6585c sourceUnit, EnumC6585c targetUnit) {
        AbstractC6452k.m12181e(sourceUnit, "sourceUnit");
        AbstractC6452k.m12181e(targetUnit, "targetUnit");
        return targetUnit.f24818s.convert(j2, sourceUnit.f24818s);
    }

    /* JADX INFO: renamed from: f */
    public static C6335c m1747f() {
        return new C6335c(10);
    }

    /* JADX INFO: renamed from: g */
    public static void m1748g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC6351f m1749h(InterfaceC6351f interfaceC6351f, InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        if (AbstractC6452k.m12177a(interfaceC6351f.getKey(), key)) {
            return interfaceC6351f;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0325a m1750i(InterfaceC0325a interfaceC0325a) {
        AbstractC6452k.m12181e(interfaceC0325a, "<this>");
        return interfaceC0325a.getDescriptor().mo497c() ? interfaceC0325a : new C0485j(interfaceC0325a);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1751j(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C0127r.f191s;
            }
        } else {
            if (!(collection instanceof InterfaceC0108C)) {
                return false;
            }
            objComparator = ((AbstractC0122m) ((InterfaceC0108C) collection)).f183v;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: k */
    public static List m1752k(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC6452k.m12180d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC6353h m1753l(InterfaceC6351f interfaceC6351f, InterfaceC6352g key) {
        AbstractC6452k.m12181e(key, "key");
        return AbstractC6452k.m12177a(interfaceC6351f.getKey(), key) ? C6354i.f24409s : interfaceC6351f;
    }

    /* JADX INFO: renamed from: m */
    public static final byte[] m1754m(InputStream inputStream) throws IOException {
        AbstractC6452k.m12181e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC6452k.m12180d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: renamed from: n */
    public static int m1755n(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: o */
    public static final Object m1756o(C0231q c0231q, C0231q c0231q2, InterfaceC6502p interfaceC6502p) {
        Object c0055p;
        Object objM51F;
        try {
            if (interfaceC6502p instanceof AbstractC6371a) {
                AbstractC6465x.m12191a(2, interfaceC6502p);
                c0055p = interfaceC6502p.invoke(c0231q2, c0231q);
            } else {
                c0055p = AbstractC0878a.m1805r(interfaceC6502p, c0231q2, c0231q);
            }
        } catch (Throwable th) {
            c0055p = new C0055p(false, th);
        }
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        if (c0055p == enumC6363a || (objM51F = c0231q.m51F(c0055p)) == AbstractC0069y.f90e) {
            return enumC6363a;
        }
        if (objM51F instanceof C0055p) {
            throw ((C0055p) objM51F).f68a;
        }
        return AbstractC0069y.m117p(objM51F);
    }

    /* JADX INFO: renamed from: p */
    public static C6545d m1757p(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? C6545d.f24774v : new C6545d(i2, i3 - 1, 1);
    }
}
