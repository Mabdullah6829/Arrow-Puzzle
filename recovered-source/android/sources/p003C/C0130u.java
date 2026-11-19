package p003C;

import java.util.AbstractMap;
import java.util.Objects;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: C.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C0130u extends AbstractC0116g {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0131v f195u;

    public C0130u(C0131v c0131v) {
        this.f195u = c0131v;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        C0131v c0131v = this.f195u;
        AbstractC0076b.m132g(i2, c0131v.f198x);
        Object[] objArr = c0131v.f197w;
        int i3 = i2 * 2;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // p003C.AbstractC0111b
    /* JADX INFO: renamed from: j */
    public final boolean mo179j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f195u.f198x;
    }
}
