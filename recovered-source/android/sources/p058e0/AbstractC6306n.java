package p058e0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;

/* JADX INFO: renamed from: e0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6306n extends AbstractC0846b {
    /* JADX INFO: renamed from: q */
    public static int m12119q(List list) {
        AbstractC6452k.m12181e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: r */
    public static List m12120r(Object... elements) {
        AbstractC6452k.m12181e(elements, "elements");
        return elements.length > 0 ? AbstractC6302j.m12095q(elements) : C6313u.f24338s;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m12121s(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C6300h(objArr, true));
    }

    /* JADX INFO: renamed from: t */
    public static void m12122t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
