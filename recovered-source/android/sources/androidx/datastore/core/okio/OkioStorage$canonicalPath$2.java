package androidx.datastore.core.okio;

import kotlin.jvm.internal.AbstractC6453l;
import p033S0.C0627u;
import p035T0.AbstractC0811c;
import p049b0.C1887c;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorage$canonicalPath$2 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ OkioStorage<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioStorage$canonicalPath$2(OkioStorage<T> okioStorage) {
        super(0);
        this.this$0 = okioStorage;
    }

    @Override // p078p0.InterfaceC6487a
    public final C0627u invoke() {
        C0627u c0627u = (C0627u) ((OkioStorage) this.this$0).producePath.invoke();
        c0627u.getClass();
        boolean z = AbstractC0811c.m1689a(c0627u) != -1;
        OkioStorage<T> okioStorage = this.this$0;
        if (z) {
            return C1887c.m2718e(c0627u.f1372s.m1415t(), true);
        }
        throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + ((OkioStorage) okioStorage).producePath + ", instead got " + c0627u).toString());
    }
}
