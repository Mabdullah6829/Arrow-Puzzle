package p058e0;

import java.util.AbstractList;
import java.util.List;
import p080q0.InterfaceC6520a;

/* JADX INFO: renamed from: e0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6299g extends AbstractList implements List, InterfaceC6520a {
    /* JADX INFO: renamed from: a */
    public abstract int mo12081a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo12082b(int i2);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i2) {
        return mo12082b(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo12081a();
    }
}
