package p044a0;

import java.util.IdentityHashMap;
import java.util.Map;
import p001B.AbstractC0076b;
import p030R.AbstractC0522D;
import p030R.AbstractC0538U;
import p030R.C0544a;
import p030R.C0546b;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0885g extends AbstractC0880b {

    /* JADX INFO: renamed from: a */
    public final AbstractC0522D f2477a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0537T f2478b;

    public C0885g(AbstractC0522D abstractC0522D, InterfaceC0537T interfaceC0537T) {
        AbstractC0076b.m133h(abstractC0522D, "delegate");
        this.f2477a = abstractC0522D;
        AbstractC0076b.m133h(interfaceC0537T, "healthListener");
        this.f2478b = interfaceC0537T;
    }

    @Override // p030R.AbstractC0522D
    public final C0546b getAttributes() {
        C0546b attributes = this.f2477a.getAttributes();
        attributes.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(AbstractC0538U.f1145d, bool);
        for (Map.Entry entry : attributes.f1155a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0544a) entry.getKey(), entry.getValue());
            }
        }
        return new C0546b(identityHashMap);
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: p */
    public final void mo1250p(InterfaceC0537T interfaceC0537T) {
        this.f2477a.mo1250p(new C0884f(this, interfaceC0537T, 0));
    }

    @Override // p044a0.AbstractC0880b
    /* JADX INFO: renamed from: r */
    public final AbstractC0522D mo1807r() {
        return this.f2477a;
    }
}
