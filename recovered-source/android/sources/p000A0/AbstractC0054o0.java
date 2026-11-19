package p000A0;

/* JADX INFO: renamed from: A0.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0054o0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f66a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static AbstractC0014O m97a() {
        ThreadLocal threadLocal = f66a;
        AbstractC0014O abstractC0014O = (AbstractC0014O) threadLocal.get();
        if (abstractC0014O != null) {
            return abstractC0014O;
        }
        C0031d c0031d = new C0031d(Thread.currentThread());
        threadLocal.set(c0031d);
        return c0031d;
    }
}
