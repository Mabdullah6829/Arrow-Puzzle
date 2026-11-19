package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzigs {

    /* JADX INFO: renamed from: a */
    public static final zzihf f19881a;

    static {
        int i2 = zzicy.f19697a;
        f19881a = new zzihf();
    }

    /* JADX INFO: renamed from: a */
    public static int m8418a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzidu.m8280b(i2 << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: b */
    public static int m8419b(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzidu.m8280b(i2 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8420c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
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
    /* JADX INFO: renamed from: d */
    public static void m8421d(Object obj, Object obj2) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        zzihe zziheVar2 = ((zziep) obj2).zzt;
        zzihe zziheVar3 = zzihe.f19896f;
        if (!zziheVar3.equals(zziheVar2)) {
            if (zziheVar3.equals(zziheVar)) {
                int i2 = zziheVar.f19897a + zziheVar2.f19897a;
                int[] iArrCopyOf = Arrays.copyOf(zziheVar.f19898b, i2);
                System.arraycopy(zziheVar2.f19898b, 0, iArrCopyOf, zziheVar.f19897a, zziheVar2.f19897a);
                Object[] objArrCopyOf = Arrays.copyOf(zziheVar.f19899c, i2);
                System.arraycopy(zziheVar2.f19899c, 0, objArrCopyOf, zziheVar.f19897a, zziheVar2.f19897a);
                zziheVar = new zzihe(i2, iArrCopyOf, objArrCopyOf, true);
            } else {
                zziheVar.getClass();
                if (!zziheVar2.equals(zziheVar3)) {
                    if (!zziheVar.f19901e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = zziheVar.f19897a + zziheVar2.f19897a;
                    zziheVar.m8458e(i3);
                    System.arraycopy(zziheVar2.f19898b, 0, zziheVar.f19898b, zziheVar.f19897a, zziheVar2.f19897a);
                    System.arraycopy(zziheVar2.f19899c, 0, zziheVar.f19899c, zziheVar.f19897a, zziheVar2.f19897a);
                    zziheVar.f19897a = i3;
                }
            }
        }
        zziepVar.zzt = zziheVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static Object m8422e(Object obj, int i2, zzifb zzifbVar, zziev zzievVar, Object obj2, zzihd zzihdVar) {
        if (zzievVar == null) {
            return obj2;
        }
        if (zzifbVar == null) {
            Iterator<E> it = zzifbVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzievVar.zza(iIntValue)) {
                    if (obj2 == null) {
                        obj2 = zzihdVar.mo8450h(obj);
                    }
                    zzihdVar.mo8443a(obj2, i2, iIntValue);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzifbVar.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) zzifbVar.get(i4);
            int iIntValue2 = num.intValue();
            if (zzievVar.zza(iIntValue2)) {
                if (i4 != i3) {
                    zzifbVar.set(i3, num);
                }
                i3++;
            } else {
                if (obj2 == null) {
                    obj2 = zzihdVar.mo8450h(obj);
                }
                zzihdVar.mo8443a(obj2, i2, iIntValue2);
            }
        }
        if (i3 != size) {
            zzifbVar.subList(i3, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: f */
    public static void m8423f(int i2, List list, zzidv zzidvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzidu zziduVar = zzidvVar.f19752a;
        int i3 = 0;
        if (!(list instanceof zzifk)) {
            while (i3 < list.size()) {
                zziduVar.mo8258l(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        zzifk zzifkVar = (zzifk) list;
        while (i3 < list.size()) {
            Object objZzc = zzifkVar.zzc();
            if (objZzc instanceof String) {
                zziduVar.mo8258l(i2, (String) objZzc);
            } else {
                zziduVar.mo8259m(i2, (zzidl) objZzc);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8424g(int i2, List list, zzidv zzidvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzidvVar.f19752a.mo8259m(i2, (zzidl) list.get(i3));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8425h(int i2, List list, zzidv zzidvVar, zzigr zzigrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzidvVar.m8298p(i2, list.get(i3), zzigrVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m8426i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iM8281c = 0;
            while (i2 < size) {
                iM8281c += zzidu.m8281c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM8281c;
        }
        zzifn zzifnVar = (zzifn) list;
        int iM8281c2 = 0;
        while (i2 < size) {
            iM8281c2 += zzidu.m8281c(zzifnVar.m8361A(i2));
            i2++;
        }
        return iM8281c2;
    }

    /* JADX INFO: renamed from: j */
    public static int m8427j(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iM8281c = 0;
            while (i2 < size) {
                iM8281c += zzidu.m8281c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM8281c;
        }
        zzifn zzifnVar = (zzifn) list;
        int iM8281c2 = 0;
        while (i2 < size) {
            iM8281c2 += zzidu.m8281c(zzifnVar.m8361A(i2));
            i2++;
        }
        return iM8281c2;
    }

    /* JADX INFO: renamed from: k */
    public static int m8428k(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzifn)) {
            int iM8281c = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iM8281c += zzidu.m8281c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return iM8281c;
        }
        zzifn zzifnVar = (zzifn) list;
        int iM8281c2 = 0;
        while (i2 < size) {
            long jM8361A = zzifnVar.m8361A(i2);
            iM8281c2 += zzidu.m8281c((jM8361A >> 63) ^ (jM8361A + jM8361A));
            i2++;
        }
        return iM8281c2;
    }

    /* JADX INFO: renamed from: l */
    public static int m8429l(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iM8281c = 0;
            while (i2 < size) {
                iM8281c += zzidu.m8281c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM8281c;
        }
        zzieq zzieqVar = (zzieq) list;
        int iM8281c2 = 0;
        while (i2 < size) {
            iM8281c2 += zzidu.m8281c(zzieqVar.m8352o(i2));
            i2++;
        }
        return iM8281c2;
    }

    /* JADX INFO: renamed from: m */
    public static int m8430m(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iM8281c = 0;
            while (i2 < size) {
                iM8281c += zzidu.m8281c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM8281c;
        }
        zzieq zzieqVar = (zzieq) list;
        int iM8281c2 = 0;
        while (i2 < size) {
            iM8281c2 += zzidu.m8281c(zzieqVar.m8352o(i2));
            i2++;
        }
        return iM8281c2;
    }

    /* JADX INFO: renamed from: n */
    public static int m8431n(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iM8280b = 0;
            while (i2 < size) {
                iM8280b += zzidu.m8280b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM8280b;
        }
        zzieq zzieqVar = (zzieq) list;
        int iM8280b2 = 0;
        while (i2 < size) {
            iM8280b2 += zzidu.m8280b(zzieqVar.m8352o(i2));
            i2++;
        }
        return iM8280b2;
    }

    /* JADX INFO: renamed from: o */
    public static int m8432o(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzieq)) {
            int iM8280b = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iM8280b += zzidu.m8280b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return iM8280b;
        }
        zzieq zzieqVar = (zzieq) list;
        int iM8280b2 = 0;
        while (i2 < size) {
            int iM8352o = zzieqVar.m8352o(i2);
            iM8280b2 += zzidu.m8280b((iM8352o >> 31) ^ (iM8352o + iM8352o));
            i2++;
        }
        return iM8280b2;
    }
}
