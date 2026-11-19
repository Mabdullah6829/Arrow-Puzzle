package p030R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0533O {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1131a = 0;

    /* JADX INFO: renamed from: b */
    public List f1132b;

    /* JADX INFO: renamed from: c */
    public C0546b f1133c;

    /* JADX INFO: renamed from: d */
    public Object[][] f1134d;

    public /* synthetic */ C0533O() {
    }

    /* JADX INFO: renamed from: c */
    public static C0533O m1256c() {
        C0533O c0533o = new C0533O();
        c0533o.f1133c = C0546b.f1154b;
        c0533o.f1134d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        return c0533o;
    }

    /* JADX INFO: renamed from: a */
    public void m1257a(InterfaceC0537T interfaceC0537T) {
        C0572o c0572o;
        int length = 0;
        while (true) {
            Object[][] objArr = this.f1134d;
            int length2 = objArr.length;
            c0572o = AbstractC0538U.f1144c;
            if (length >= length2) {
                length = -1;
                break;
            } else if (c0572o.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f1134d.length + 1, 2);
            Object[][] objArr3 = this.f1134d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1134d = objArr2;
            length = objArr2.length - 1;
        }
        this.f1134d[length] = new Object[]{c0572o, interfaceC0537T};
    }

    /* JADX INFO: renamed from: b */
    public Object m1258b() {
        Object[][] objArr = this.f1134d;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (AbstractC0538U.f1144c.equals(objArr[i2][0])) {
                return objArr[i2][1];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m1259d(List list) {
        AbstractC0076b.m131f(!list.isEmpty(), "addrs is empty");
        this.f1132b = Collections.unmodifiableList(new ArrayList(list));
    }

    public String toString() {
        switch (this.f1131a) {
            case 1:
                C0087m c0087mM143s = AbstractC0076b.m143s(this);
                c0087mM143s.m158b(this.f1132b, "addrs");
                c0087mM143s.m158b(this.f1133c, "attrs");
                c0087mM143s.m158b(Arrays.deepToString(this.f1134d), "customOptions");
                return c0087mM143s.toString();
            default:
                return super.toString();
        }
    }

    public C0533O(List list, C0546b c0546b, Object[][] objArr) {
        AbstractC0076b.m133h(list, "addresses are not set");
        this.f1132b = list;
        AbstractC0076b.m133h(c0546b, "attrs");
        this.f1133c = c0546b;
        AbstractC0076b.m133h(objArr, "customOptions");
        this.f1134d = objArr;
    }
}
