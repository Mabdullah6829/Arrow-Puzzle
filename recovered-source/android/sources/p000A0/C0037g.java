package p000A0;

import p014I0.C0313b;
import p014I0.C0314c;
import p014I0.C0315d;
import p014I0.C0319h;
import p057d0.C6289k;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: A0.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0037g implements InterfaceC6503q {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f46s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f47t;

    public /* synthetic */ C0037g(C0315d c0315d, C0314c c0314c) {
        this.f46s = 1;
        this.f47t = c0315d;
    }

    @Override // p078p0.InterfaceC6503q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f46s) {
            case 0:
                ((C0313b) this.f47t).invoke((Throwable) obj);
                break;
            case 1:
                C0315d c0315d = (C0315d) this.f47t;
                C0315d.f632g.set(c0315d, null);
                c0315d.m464f(null);
                break;
            default:
                ((C0319h) this.f47t).m467b();
                break;
        }
        return C6289k.f24318a;
    }

    public /* synthetic */ C0037g(Object obj, int i2) {
        this.f46s = i2;
        this.f47t = obj;
    }
}
