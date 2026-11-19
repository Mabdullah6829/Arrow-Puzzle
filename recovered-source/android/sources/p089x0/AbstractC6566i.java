package p089x0;

import com.google.firebase.firestore.pipeline.C5822a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0059r;
import p037U0.AbstractC0846b;
import p058e0.C6313u;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: x0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6566i extends AbstractC6567j {
    /* JADX INFO: renamed from: s */
    public static Object m12217s(C6561d c6561d) {
        C6560c c6560c = new C6560c(c6561d);
        if (c6560c.hasNext()) {
            return c6560c.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static InterfaceC6563f m12218t(Object obj, InterfaceC6498l nextFunction) {
        AbstractC6452k.m12181e(nextFunction, "nextFunction");
        return obj == null ? C6559b.f24777a : new C6561d(new C5822a(obj, 1), nextFunction);
    }

    /* JADX INFO: renamed from: u */
    public static C6561d m12219u(InterfaceC6563f interfaceC6563f, InterfaceC6498l transform) {
        AbstractC6452k.m12181e(transform, "transform");
        return new C6561d(interfaceC6563f, transform);
    }

    /* JADX INFO: renamed from: v */
    public static C6561d m12220v(InterfaceC6563f interfaceC6563f, InterfaceC6498l transform) {
        AbstractC6452k.m12181e(transform, "transform");
        return new C6561d(new C6561d(interfaceC6563f, transform), new C0059r(26));
    }

    /* JADX INFO: renamed from: w */
    public static List m12221w(InterfaceC6563f interfaceC6563f) {
        Iterator it = interfaceC6563f.iterator();
        if (!it.hasNext()) {
            return C6313u.f24338s;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0846b.m1752k(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
