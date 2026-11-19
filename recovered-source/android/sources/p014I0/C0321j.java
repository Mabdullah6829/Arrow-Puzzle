package p014I0;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p010F0.AbstractC0232r;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: I0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0321j extends AbstractC0232r {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f648e;

    public C0321j(long j2, C0321j c0321j, int i2) {
        super(j2, c0321j, i2);
        this.f648e = new AtomicReferenceArray(AbstractC0320i.f647f);
    }

    @Override // p010F0.AbstractC0232r
    /* JADX INFO: renamed from: f */
    public final int mo245f() {
        return AbstractC0320i.f647f;
    }

    @Override // p010F0.AbstractC0232r
    /* JADX INFO: renamed from: g */
    public final void mo246g(int i2, InterfaceC6353h interfaceC6353h) {
        this.f648e.set(i2, AbstractC0320i.f646e);
        m329h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f466c + ", hashCode=" + hashCode() + ']';
    }
}
