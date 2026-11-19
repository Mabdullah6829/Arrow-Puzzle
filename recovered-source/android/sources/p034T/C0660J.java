package p034T;

import java.util.ArrayList;
import p001B.AbstractC0076b;
import p030R.AbstractC0536S;
import p030R.EnumC0578r;

/* JADX INFO: renamed from: T.J */
/* JADX INFO: loaded from: classes.dex */
public final class C0660J {

    /* JADX INFO: renamed from: a */
    public volatile Object f1472a;

    /* JADX INFO: renamed from: b */
    public Object f1473b;

    /* JADX INFO: renamed from: a */
    public InterfaceC0639C m1517a(C0641C1 c0641c1) {
        AbstractC0536S abstractC0536S = ((C0720c1) this.f1473b).f1797y;
        if (((C0720c1) this.f1473b).f1750G.get()) {
            return ((C0720c1) this.f1473b).f1748E;
        }
        if (abstractC0536S == null) {
            ((C0720c1) this.f1473b).f1785m.execute(new RunnableC0681Q(this, 3));
            return ((C0720c1) this.f1473b).f1748E;
        }
        InterfaceC0639C interfaceC0639CM1625f = AbstractC0759m0.m1625f(abstractC0536S.mo1262a(c0641c1), Boolean.TRUE.equals(c0641c1.f1406a.f1180f));
        return interfaceC0639CM1625f != null ? interfaceC0639CM1625f : ((C0720c1) this.f1473b).f1748E;
    }

    /* JADX INFO: renamed from: b */
    public void m1518b(EnumC0578r enumC0578r) {
        AbstractC0076b.m133h(enumC0578r, "newState");
        if (((EnumC0578r) this.f1472a) == enumC0578r || ((EnumC0578r) this.f1472a) == EnumC0578r.f1236w) {
            return;
        }
        this.f1472a = enumC0578r;
        if (((ArrayList) this.f1473b).isEmpty()) {
            return;
        }
        ArrayList arrayList = (ArrayList) this.f1473b;
        this.f1473b = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C0657I c0657i = (C0657I) obj;
            c0657i.f1467b.execute(c0657i.f1466a);
        }
    }
}
