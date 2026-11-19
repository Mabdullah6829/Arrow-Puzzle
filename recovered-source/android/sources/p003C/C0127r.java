package p003C;

import java.io.Serializable;

/* JADX INFO: renamed from: C.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0127r extends AbstractC0128s implements Serializable {

    /* JADX INFO: renamed from: s */
    public static final C0127r f191s = new C0127r();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
