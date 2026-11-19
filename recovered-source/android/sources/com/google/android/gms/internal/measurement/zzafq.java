package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzafq {

    /* JADX INFO: renamed from: a */
    public static final zzagb f22104a;

    static {
        int i2 = zzacf.f21956a;
        f22104a = new zzagb();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9651a(Object obj, Object obj2) {
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
    /* JADX INFO: renamed from: b */
    public static void m9652b(Object obj, Object obj2) {
        zzadu zzaduVar = (zzadu) obj;
        zzaga zzagaVar = zzaduVar.zzc;
        zzaga zzagaVar2 = ((zzadu) obj2).zzc;
        zzaga zzagaVar3 = zzaga.f22121f;
        if (!zzagaVar3.equals(zzagaVar2)) {
            if (zzagaVar3.equals(zzagaVar)) {
                int i2 = zzagaVar.f22122a + zzagaVar2.f22122a;
                int[] iArrCopyOf = Arrays.copyOf(zzagaVar.f22123b, i2);
                System.arraycopy(zzagaVar2.f22123b, 0, iArrCopyOf, zzagaVar.f22122a, zzagaVar2.f22122a);
                Object[] objArrCopyOf = Arrays.copyOf(zzagaVar.f22124c, i2);
                System.arraycopy(zzagaVar2.f22124c, 0, objArrCopyOf, zzagaVar.f22122a, zzagaVar2.f22122a);
                zzagaVar = new zzaga(i2, iArrCopyOf, objArrCopyOf, true);
            } else {
                zzagaVar.getClass();
                if (!zzagaVar2.equals(zzagaVar3)) {
                    if (!zzagaVar.f22126e) {
                        throw new UnsupportedOperationException();
                    }
                    int i3 = zzagaVar.f22122a + zzagaVar2.f22122a;
                    zzagaVar.m9690e(i3);
                    System.arraycopy(zzagaVar2.f22123b, 0, zzagaVar.f22123b, zzagaVar.f22122a, zzagaVar2.f22122a);
                    System.arraycopy(zzagaVar2.f22124c, 0, zzagaVar.f22124c, zzagaVar.f22122a, zzagaVar2.f22122a);
                    zzagaVar.f22122a = i3;
                }
            }
        }
        zzaduVar.zzc = zzagaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static Object m9653c(Object obj, int i2, zzaef zzaefVar, zzadz zzadzVar, Object obj2, zzafz zzafzVar) {
        if (zzadzVar == null) {
            return obj2;
        }
        if (zzaefVar == null) {
            Iterator<E> it = zzaefVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!zzadzVar.zza(iIntValue)) {
                    if (obj2 == null) {
                        obj2 = zzafzVar.mo9682h(obj);
                    }
                    zzafzVar.mo9675a(obj2, i2, iIntValue);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = zzaefVar.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) zzaefVar.get(i4);
            int iIntValue2 = num.intValue();
            if (zzadzVar.zza(iIntValue2)) {
                if (i4 != i3) {
                    zzaefVar.set(i3, num);
                }
                i3++;
            } else {
                if (obj2 == null) {
                    obj2 = zzafzVar.mo9682h(obj);
                }
                zzafzVar.mo9675a(obj2, i2, iIntValue2);
            }
        }
        if (i3 != size) {
            zzaefVar.subList(i3, size).clear();
        }
        return obj2;
    }

    /* JADX INFO: renamed from: d */
    public static int m9654d(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iM9511c = 0;
            while (i2 < size) {
                iM9511c += zzada.m9511c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM9511c;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iM9511c2 = 0;
        while (i2 < size) {
            iM9511c2 += zzada.m9511c(zzaeqVar.mo9596A(i2));
            i2++;
        }
        return iM9511c2;
    }

    /* JADX INFO: renamed from: e */
    public static int m9655e(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iM9511c = 0;
            while (i2 < size) {
                iM9511c += zzada.m9511c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return iM9511c;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iM9511c2 = 0;
        while (i2 < size) {
            iM9511c2 += zzada.m9511c(zzaeqVar.mo9596A(i2));
            i2++;
        }
        return iM9511c2;
    }

    /* JADX INFO: renamed from: f */
    public static int m9656f(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaeq)) {
            int iM9511c = 0;
            while (i2 < size) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                iM9511c += zzada.m9511c((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return iM9511c;
        }
        zzaeq zzaeqVar = (zzaeq) list;
        int iM9511c2 = 0;
        while (i2 < size) {
            long jMo9596A = zzaeqVar.mo9596A(i2);
            iM9511c2 += zzada.m9511c((jMo9596A >> 63) ^ (jMo9596A + jMo9596A));
            i2++;
        }
        return iM9511c2;
    }

    /* JADX INFO: renamed from: g */
    public static int m9657g(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iM9511c = 0;
            while (i2 < size) {
                iM9511c += zzada.m9511c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9511c;
        }
        zzadv zzadvVar = (zzadv) list;
        int iM9511c2 = 0;
        while (i2 < size) {
            iM9511c2 += zzada.m9511c(zzadvVar.mo9578o(i2));
            i2++;
        }
        return iM9511c2;
    }

    /* JADX INFO: renamed from: h */
    public static int m9658h(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iM9511c = 0;
            while (i2 < size) {
                iM9511c += zzada.m9511c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9511c;
        }
        zzadv zzadvVar = (zzadv) list;
        int iM9511c2 = 0;
        while (i2 < size) {
            iM9511c2 += zzada.m9511c(zzadvVar.mo9578o(i2));
            i2++;
        }
        return iM9511c2;
    }

    /* JADX INFO: renamed from: i */
    public static int m9659i(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iM9510b = 0;
            while (i2 < size) {
                iM9510b += zzada.m9510b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return iM9510b;
        }
        zzadv zzadvVar = (zzadv) list;
        int iM9510b2 = 0;
        while (i2 < size) {
            iM9510b2 += zzada.m9510b(zzadvVar.mo9578o(i2));
            i2++;
        }
        return iM9510b2;
    }

    /* JADX INFO: renamed from: j */
    public static int m9660j(List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzadv)) {
            int iM9510b = 0;
            while (i2 < size) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                iM9510b += zzada.m9510b((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return iM9510b;
        }
        zzadv zzadvVar = (zzadv) list;
        int iM9510b2 = 0;
        while (i2 < size) {
            int iMo9578o = zzadvVar.mo9578o(i2);
            iM9510b2 += zzada.m9510b((iMo9578o >> 31) ^ (iMo9578o + iMo9578o));
            i2++;
        }
        return iM9510b2;
    }

    /* JADX INFO: renamed from: k */
    public static int m9661k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.m9510b(i2 << 3) + 4) * size;
    }

    /* JADX INFO: renamed from: l */
    public static int m9662l(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzada.m9510b(i2 << 3) + 8) * size;
    }

    /* JADX INFO: renamed from: m */
    public static int m9663m(int i2, Object obj, zzafp zzafpVar) {
        int i3 = i2 << 3;
        if (obj instanceof zzaem) {
            int iM9510b = zzada.m9510b(i3);
            int iM9598a = ((zzaem) obj).m9598a();
            return AbstractC1456a.m2457x(iM9598a, iM9598a, iM9510b);
        }
        int iM9510b2 = zzada.m9510b(i3);
        int iMo9347j = ((zzacb) obj).mo9347j(zzafpVar);
        return AbstractC1456a.m2457x(iMo9347j, iMo9347j, iM9510b2);
    }
}
