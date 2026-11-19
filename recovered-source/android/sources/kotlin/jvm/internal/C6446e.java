package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p011H.AbstractC0243G;
import p057d0.C6283e;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6318z;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6488b;
import p078p0.InterfaceC6489c;
import p078p0.InterfaceC6490d;
import p078p0.InterfaceC6491e;
import p078p0.InterfaceC6492f;
import p078p0.InterfaceC6493g;
import p078p0.InterfaceC6494h;
import p078p0.InterfaceC6495i;
import p078p0.InterfaceC6496j;
import p078p0.InterfaceC6497k;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6499m;
import p078p0.InterfaceC6500n;
import p078p0.InterfaceC6501o;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p078p0.InterfaceC6504r;
import p078p0.InterfaceC6505s;
import p078p0.InterfaceC6506t;
import p078p0.InterfaceC6507u;
import p078p0.InterfaceC6508v;
import p078p0.InterfaceC6509w;
import p088w0.InterfaceC6548c;
import p091y0.AbstractC6574d;

/* JADX INFO: renamed from: kotlin.jvm.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6446e implements InterfaceC6548c, InterfaceC6445d {

    /* JADX INFO: renamed from: t */
    public static final Map f24628t;

    /* JADX INFO: renamed from: u */
    public static final LinkedHashMap f24629u;

    /* JADX INFO: renamed from: s */
    public final Class f24630s;

    static {
        List listM12120r = AbstractC6306n.m12120r(InterfaceC6487a.class, InterfaceC6498l.class, InterfaceC6502p.class, InterfaceC6503q.class, InterfaceC6504r.class, InterfaceC6505s.class, InterfaceC6506t.class, InterfaceC6507u.class, InterfaceC6508v.class, InterfaceC6509w.class, InterfaceC6488b.class, InterfaceC6489c.class, InterfaceC6490d.class, InterfaceC6491e.class, InterfaceC6492f.class, InterfaceC6493g.class, InterfaceC6494h.class, InterfaceC6495i.class, InterfaceC6496j.class, InterfaceC6497k.class, InterfaceC6499m.class, InterfaceC6500n.class, InterfaceC6501o.class);
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(listM12120r, 10));
        int i2 = 0;
        for (Object obj : listM12120r) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6306n.m12122t();
                throw null;
            }
            arrayList.add(new C6283e((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f24628t = AbstractC6318z.m12130x(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC6452k.m12180d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC6452k.m12178b(str);
            sb.append(AbstractC6574d.m12225D(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f24628t.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC6452k.m12178b(str2);
            linkedHashMap.put(key, AbstractC6574d.m12225D(str2, str2));
        }
        f24629u = linkedHashMap;
    }

    public C6446e(Class jClass) {
        AbstractC6452k.m12181e(jClass, "jClass");
        this.f24630s = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC6445d
    /* JADX INFO: renamed from: a */
    public final Class mo12175a() {
        return this.f24630s;
    }

    /* JADX INFO: renamed from: b */
    public final String m12176b() {
        String str;
        Class jClass = this.f24630s;
        AbstractC6452k.m12181e(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f24629u;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC6574d.m12224C(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return AbstractC6574d.m12224C(simpleName, enclosingConstructor.getName() + '$');
        }
        int iM12229y = AbstractC6574d.m12229y(simpleName, '$', 0, 6);
        if (iM12229y == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iM12229y + 1, simpleName.length());
        AbstractC6452k.m12180d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6446e) && AbstractC0243G.m374l(this).equals(AbstractC0243G.m374l((InterfaceC6548c) obj));
    }

    public final int hashCode() {
        return AbstractC0243G.m374l(this).hashCode();
    }

    public final String toString() {
        return this.f24630s + " (Kotlin reflection is not available)";
    }
}
