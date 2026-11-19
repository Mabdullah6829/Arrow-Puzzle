package p034T;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: T.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0783s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2032a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2033b;

    public C0783s0(int i2) {
        this.f2032a = 2;
        this.f2033b = new ArrayList(i2);
    }

    /* JADX INFO: renamed from: a */
    public void m1657a(Object obj) {
        this.f2033b.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public void m1658b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f2033b;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1659c(Object obj, String str) {
        this.f2033b.add(str + "=" + obj);
    }

    public String toString() {
        switch (this.f2032a) {
            case 0:
                return this.f2033b.toString();
            default:
                return super.toString();
        }
    }

    public C0783s0(int i2, byte b) {
        this.f2032a = i2;
        switch (i2) {
            case 1:
                this.f2033b = new ArrayList(20);
                break;
            default:
                this.f2033b = new ArrayList();
                break;
        }
    }
}
