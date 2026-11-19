package com.google.protobuf;

import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.J0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6180J0 {

    /* JADX INFO: renamed from: a */
    public static final Class f24092a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6199T0 f24093b;

    /* JADX INFO: renamed from: c */
    public static final C6203V0 f24094c;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC6199T0 abstractC6199T0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f24092a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC6199T0 = (AbstractC6199T0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f24093b = abstractC6199T0;
        f24094c = new C6203V0();
    }

    /* JADX INFO: renamed from: a */
    public static int m11745a(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6193Q)) {
            int iM12067B = 0;
            while (i2 < size) {
                iM12067B += AbstractC6269w.m12067B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM12067B;
        }
        C6193Q c6193q = (C6193Q) list;
        int iM12067B2 = 0;
        while (i2 < size) {
            c6193q.m11811b(i2);
            iM12067B2 += AbstractC6269w.m12067B(c6193q.f24121t[i2]);
            i2++;
        }
        return iM12067B2;
    }

    /* JADX INFO: renamed from: b */
    public static int m11746b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC6269w.m12069D(i2) + 4) * size;
    }

    /* JADX INFO: renamed from: c */
    public static int m11747c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC6269w.m12069D(i2) + 8) * size;
    }

    /* JADX INFO: renamed from: d */
    public static int m11748d(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6193Q)) {
            int iM12067B = 0;
            while (i2 < size) {
                iM12067B += AbstractC6269w.m12067B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM12067B;
        }
        C6193Q c6193q = (C6193Q) list;
        int iM12067B2 = 0;
        while (i2 < size) {
            c6193q.m11811b(i2);
            iM12067B2 += AbstractC6269w.m12067B(c6193q.f24121t[i2]);
            i2++;
        }
        return iM12067B2;
    }

    /* JADX INFO: renamed from: e */
    public static int m11749e(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6237i0)) {
            int iM12071F = 0;
            while (i2 < size) {
                iM12071F += AbstractC6269w.m12071F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM12071F;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int iM12071F2 = 0;
        while (i2 < size) {
            c6237i0.m11888b(i2);
            iM12071F2 += AbstractC6269w.m12071F(c6237i0.f24188t[i2]);
            i2++;
        }
        return iM12071F2;
    }

    /* JADX INFO: renamed from: f */
    public static int m11750f(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6193Q)) {
            int iM12070E = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iM12070E += AbstractC6269w.m12070E((iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return iM12070E;
        }
        C6193Q c6193q = (C6193Q) list;
        int iM12070E2 = 0;
        while (i2 < size) {
            c6193q.m11811b(i2);
            int i3 = c6193q.f24121t[i2];
            iM12070E2 += AbstractC6269w.m12070E((i3 >> 31) ^ (i3 << 1));
            i2++;
        }
        return iM12070E2;
    }

    /* JADX INFO: renamed from: g */
    public static int m11751g(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6237i0)) {
            int iM12071F = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iM12071F += AbstractC6269w.m12071F((jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return iM12071F;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int iM12071F2 = 0;
        while (i2 < size) {
            c6237i0.m11888b(i2);
            long j2 = c6237i0.f24188t[i2];
            iM12071F2 += AbstractC6269w.m12071F((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
        return iM12071F2;
    }

    /* JADX INFO: renamed from: h */
    public static int m11752h(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6193Q)) {
            int iM12070E = 0;
            while (i2 < size) {
                iM12070E += AbstractC6269w.m12070E(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM12070E;
        }
        C6193Q c6193q = (C6193Q) list;
        int iM12070E2 = 0;
        while (i2 < size) {
            c6193q.m11811b(i2);
            iM12070E2 += AbstractC6269w.m12070E(c6193q.f24121t[i2]);
            i2++;
        }
        return iM12070E2;
    }

    /* JADX INFO: renamed from: i */
    public static int m11753i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C6237i0)) {
            int iM12071F = 0;
            while (i2 < size) {
                iM12071F += AbstractC6269w.m12071F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM12071F;
        }
        C6237i0 c6237i0 = (C6237i0) list;
        int iM12071F2 = 0;
        while (i2 < size) {
            c6237i0.m11888b(i2);
            iM12071F2 += AbstractC6269w.m12071F(c6237i0.f24188t[i2]);
            i2++;
        }
        return iM12071F2;
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
    /* JADX INFO: renamed from: j */
    public static void m11754j(AbstractC6199T0 abstractC6199T0, Object obj, Object obj2) {
        ((C6203V0) abstractC6199T0).getClass();
        AbstractC6185M abstractC6185M = (AbstractC6185M) obj;
        C6201U0 c6201u0M11823e = abstractC6185M.unknownFields;
        C6201U0 c6201u0 = ((AbstractC6185M) obj2).unknownFields;
        C6201U0 c6201u1 = C6201U0.f24124f;
        if (!c6201u1.equals(c6201u0)) {
            if (c6201u1.equals(c6201u0M11823e)) {
                c6201u0M11823e = C6201U0.m11823e(c6201u0M11823e, c6201u0);
            } else {
                c6201u0M11823e.getClass();
                if (!c6201u0.equals(c6201u1)) {
                    c6201u0M11823e.m11824a();
                    int i2 = c6201u0M11823e.f24125a + c6201u0.f24125a;
                    c6201u0M11823e.m11825b(i2);
                    System.arraycopy(c6201u0.f24126b, 0, c6201u0M11823e.f24126b, c6201u0M11823e.f24125a, c6201u0.f24125a);
                    System.arraycopy(c6201u0.f24127c, 0, c6201u0M11823e.f24127c, c6201u0M11823e.f24125a, c6201u0.f24125a);
                    c6201u0M11823e.f24125a = i2;
                }
            }
        }
        abstractC6185M.unknownFields = c6201u0M11823e;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11755k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m11756l(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo11997I(i2, ((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Boolean) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4++;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo11996H(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m11757m(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                double dDoubleValue = ((Double) list.get(i3)).doubleValue();
                abstractC6269w.getClass();
                abstractC6269w.mo12003O(i2, Double.doubleToRawLongBits(dDoubleValue));
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Double) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 8;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12004P(Double.doubleToRawLongBits(((Double) list.get(i3)).doubleValue()));
            i3++;
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m11758n(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12005Q(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12067B = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM12067B += AbstractC6269w.m12067B(((Integer) list.get(i4)).intValue());
        }
        abstractC6269w.mo12013Y(iM12067B);
        while (i3 < list.size()) {
            abstractC6269w.mo12006R(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m11759o(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12001M(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 4;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12002N(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m11760p(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12003O(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 8;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12004P(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m11761q(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                float fFloatValue = ((Float) list.get(i3)).floatValue();
                abstractC6269w.getClass();
                abstractC6269w.mo12001M(i2, Float.floatToRawIntBits(fFloatValue));
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Float) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 4;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12002N(Float.floatToRawIntBits(((Float) list.get(i3)).floatValue()));
            i3++;
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m11762r(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12005Q(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12067B = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM12067B += AbstractC6269w.m12067B(((Integer) list.get(i4)).intValue());
        }
        abstractC6269w.mo12013Y(iM12067B);
        while (i3 < list.size()) {
            abstractC6269w.mo12006R(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m11763s(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12014Z(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12071F = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM12071F += AbstractC6269w.m12071F(((Long) list.get(i4)).longValue());
        }
        abstractC6269w.mo12013Y(iM12071F);
        while (i3 < list.size()) {
            abstractC6269w.mo12015a0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m11764t(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12001M(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Integer) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 4;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12002N(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m11765u(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12003O(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((Long) list.get(i5)).getClass();
            Logger logger = AbstractC6269w.f24289d;
            i4 += 8;
        }
        abstractC6269w.mo12013Y(i4);
        while (i3 < list.size()) {
            abstractC6269w.mo12004P(((Long) list.get(i3)).longValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m11766v(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                int iIntValue = ((Integer) list.get(i3)).intValue();
                abstractC6269w.mo12012X(i2, (iIntValue >> 31) ^ (iIntValue << 1));
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12070E = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            iM12070E += AbstractC6269w.m12070E((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        abstractC6269w.mo12013Y(iM12070E);
        while (i3 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i3)).intValue();
            abstractC6269w.mo12013Y((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i3++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m11767w(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                long jLongValue = ((Long) list.get(i3)).longValue();
                abstractC6269w.mo12014Z(i2, (jLongValue >> 63) ^ (jLongValue << 1));
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12071F = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = ((Long) list.get(i4)).longValue();
            iM12071F += AbstractC6269w.m12071F((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        abstractC6269w.mo12013Y(iM12071F);
        while (i3 < list.size()) {
            long jLongValue3 = ((Long) list.get(i3)).longValue();
            abstractC6269w.mo12015a0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i3++;
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m11768x(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12012X(i2, ((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12070E = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM12070E += AbstractC6269w.m12070E(((Integer) list.get(i4)).intValue());
        }
        abstractC6269w.mo12013Y(iM12070E);
        while (i3 < list.size()) {
            abstractC6269w.mo12013Y(((Integer) list.get(i3)).intValue());
            i3++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m11769y(int i2, List list, C6243k0 c6243k0, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC6269w abstractC6269w = (AbstractC6269w) c6243k0.f24193a;
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                abstractC6269w.mo12014Z(i2, ((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        abstractC6269w.mo12011W(i2, 2);
        int iM12071F = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM12071F += AbstractC6269w.m12071F(((Long) list.get(i4)).longValue());
        }
        abstractC6269w.mo12013Y(iM12071F);
        while (i3 < list.size()) {
            abstractC6269w.mo12015a0(((Long) list.get(i3)).longValue());
            i3++;
        }
    }
}
