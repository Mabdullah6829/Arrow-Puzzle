package p034T;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p030R.AbstractC0558h;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0571n0;
import p030R.C0573o0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0725d2 extends AbstractC0558h {

    /* JADX INFO: renamed from: d */
    public final AbstractC0558h f1832d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0729e2 f1833e;

    public C0725d2(C0729e2 c0729e2, AbstractC0558h abstractC0558h) {
        this.f1833e = c0729e2;
        this.f1832d = abstractC0558h;
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: h */
    public final void mo1301h(C0589w0 c0589w0) {
        this.f1832d.mo1301h(c0589w0);
        this.f1833e.f1852c.execute(new RunnableC0758m(this, 2));
    }

    @Override // p030R.AbstractC0558h
    /* JADX INFO: renamed from: i */
    public final void mo1302i(C0573o0 c0573o0) {
        C0546b c0546b = c0573o0.f1223b;
        IdentityHashMap identityHashMap = c0546b.f1155a;
        C0544a c0544a = C0729e2.f1849d;
        if (identityHashMap.get(c0544a) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        List list = Collections.EMPTY_LIST;
        C0546b c0546b2 = C0546b.f1154b;
        List list2 = c0573o0.f1222a;
        C0571n0 c0571n0 = c0573o0.f1224c;
        c0546b.getClass();
        C0721c2 c0721c2 = new C0721c2(this.f1833e);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(c0544a, c0721c2);
        for (Map.Entry entry : c0546b.f1155a.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((C0544a) entry.getKey(), entry.getValue());
            }
        }
        this.f1832d.mo1302i(new C0573o0(list2, new C0546b(identityHashMap2), c0571n0));
    }
}
