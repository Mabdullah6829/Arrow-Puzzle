package p058e0;

import androidx.graphics.shapes.MeasuredPolygon;
import com.google.protobuf.InterfaceC6210Z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p037U0.AbstractC0846b;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: e0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6305m extends AbstractC6311s {
    /* JADX INFO: renamed from: A */
    public static String m12105A(Iterable iterable, String str, String str2, String str3, InterfaceC6498l interfaceC6498l, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i2 & 2) != 0 ? "" : str2;
        String str5 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 32) != 0) {
            interfaceC6498l = null;
        }
        AbstractC6452k.m12181e(iterable, "<this>");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        m12118z(iterable, sb, str4, prefix, str5, "...", interfaceC6498l);
        return sb.toString();
    }

    /* JADX INFO: renamed from: B */
    public static Object m12106B(List list) {
        AbstractC6452k.m12181e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC6306n.m12119q(list));
    }

    /* JADX INFO: renamed from: C */
    public static ArrayList m12107C(Object obj, Collection collection) {
        AbstractC6452k.m12181e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public static ArrayList m12108D(List list, Object[] elements) {
        AbstractC6452k.m12181e(elements, "elements");
        ArrayList arrayList = new ArrayList(list.size() + elements.length);
        arrayList.addAll(list);
        arrayList.addAll(AbstractC6302j.m12095q(elements));
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public static List m12109E(InterfaceC6210Z interfaceC6210Z) {
        if (interfaceC6210Z.size() <= 1) {
            return m12112H(interfaceC6210Z);
        }
        List listM12113I = m12113I(interfaceC6210Z);
        Collections.reverse(listM12113I);
        return listM12113I;
    }

    /* JADX INFO: renamed from: F */
    public static List m12110F(List list, Comparator comparator) {
        AbstractC6452k.m12181e(list, "<this>");
        AbstractC6452k.m12181e(comparator, "comparator");
        if (list.size() <= 1) {
            return m12112H(list);
        }
        Object[] array = list.toArray(new Object[0]);
        AbstractC6452k.m12181e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC6302j.m12095q(array);
    }

    /* JADX INFO: renamed from: G */
    public static final void m12111G(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC6452k.m12181e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: H */
    public static List m12112H(Iterable iterable) {
        AbstractC6452k.m12181e(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C6313u c6313u = C6313u.f24338s;
        if (!z) {
            List listM12113I = m12113I(iterable);
            ArrayList arrayList = (ArrayList) listM12113I;
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? listM12113I : AbstractC0846b.m1752k(arrayList.get(0));
            }
            return c6313u;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c6313u;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC0846b.m1752k(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: I */
    public static final List m12113I(Iterable iterable) {
        AbstractC6452k.m12181e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m12111G(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public static Set m12114J(Iterable iterable) {
        AbstractC6452k.m12181e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6318z.m12126t(collection.size()));
                    m12111G(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                AbstractC6452k.m12180d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m12111G(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                AbstractC6452k.m12180d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return C6315w.f24340s;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m12115w(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC6452k.m12181e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i2 = 0;
            for (Object obj2 : iterable) {
                if (i2 < 0) {
                    AbstractC6306n.m12122t();
                    throw null;
                }
                if (AbstractC6452k.m12177a(obj, obj2)) {
                    iIndexOf = i2;
                } else {
                    i2++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    /* JADX INFO: renamed from: x */
    public static Object m12116x(List list) {
        AbstractC6452k.m12181e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: y */
    public static Object m12117y(MeasuredPolygon measuredPolygon, int i2) {
        AbstractC6452k.m12181e(measuredPolygon, "<this>");
        if (i2 < 0 || i2 >= measuredPolygon.size()) {
            return null;
        }
        return measuredPolygon.get(i2);
    }

    /* JADX INFO: renamed from: z */
    public static final void m12118z(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(iterable, "<this>");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            AbstractC0243G.m366d(sb, obj, interfaceC6498l);
        }
        sb.append(charSequence3);
    }
}
