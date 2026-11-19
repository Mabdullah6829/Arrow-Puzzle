package p000A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: A0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0041i extends C0055p {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f54c = AtomicIntegerFieldUpdater.newUpdater(C0041i.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C0041i(C0039h c0039h, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0039h + " was cancelled normally");
        }
        super(z, th);
        this._resumed$volatile = 0;
    }
}
