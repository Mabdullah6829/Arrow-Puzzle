package p004C0;

import p000A0.C0039h;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: renamed from: C0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0150o implements InterfaceC6498l {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C0039h f268s;

    public C0150o(C0039h c0039h) {
        this.f268s = c0039h;
    }

    @Override // p078p0.InterfaceC6498l
    public final Object invoke(Object obj) {
        C0039h c0039h = this.f268s;
        C6289k c6289k = C6289k.f24318a;
        c0039h.resumeWith(c6289k);
        return c6289k;
    }
}
