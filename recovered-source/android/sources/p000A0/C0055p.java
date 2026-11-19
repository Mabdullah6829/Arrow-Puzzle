package p000A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: A0.p */
/* JADX INFO: loaded from: classes.dex */
public class C0055p {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67b = AtomicIntegerFieldUpdater.newUpdater(C0055p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a */
    public final Throwable f68a;

    public C0055p(boolean z, Throwable th) {
        this.f68a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f68a + ']';
    }
}
