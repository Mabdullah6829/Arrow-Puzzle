package p000A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: A0.Y */
/* JADX INFO: loaded from: classes.dex */
public class C0023Y extends C0034e0 {

    /* JADX INFO: renamed from: u */
    public final boolean f25u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0023Y() {
        super(true);
        boolean z = true;
        m47B(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0034e0.f44t;
        InterfaceC0045k interfaceC0045k = (InterfaceC0045k) atomicReferenceFieldUpdater.get(this);
        C0047l c0047l = interfaceC0045k instanceof C0047l ? (C0047l) interfaceC0045k : null;
        if (c0047l == null) {
            z = false;
            break;
        }
        C0034e0 c0034e0M38i = c0047l.m38i();
        while (!c0034e0M38i.mo30w()) {
            InterfaceC0045k interfaceC0045k2 = (InterfaceC0045k) atomicReferenceFieldUpdater.get(c0034e0M38i);
            C0047l c0047l2 = interfaceC0045k2 instanceof C0047l ? (C0047l) interfaceC0045k2 : null;
            if (c0047l2 == null) {
                z = false;
                break;
            }
            c0034e0M38i = c0047l2.m38i();
        }
        this.f25u = z;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: w */
    public final boolean mo30w() {
        return this.f25u;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: x */
    public final boolean mo31x() {
        return true;
    }
}
