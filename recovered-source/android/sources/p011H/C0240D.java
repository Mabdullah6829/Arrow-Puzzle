package p011H;

import com.google.android.gms.internal.measurement.zzwx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: H.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0240D extends AbstractRunnableC0259X {

    /* JADX INFO: renamed from: u */
    public final Executor f473u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0241E f474v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f475w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0241E f476x;

    /* JADX INFO: renamed from: y */
    public final Object f477y;

    public C0240D(C0241E c0241e, Executor executor) {
        this.f474v = c0241e;
        executor.getClass();
        this.f473u = executor;
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: a */
    public final void mo335a(Throwable th) {
        C0241E c0241e = this.f474v;
        c0241e.f481F = null;
        if (th instanceof ExecutionException) {
            c0241e.m438m(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c0241e.cancel(false);
        } else {
            c0241e.m438m(th);
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: b */
    public final void mo336b(Object obj) {
        this.f474v.f481F = null;
        switch (this.f475w) {
            case 0:
                this.f476x.m439n((ListenableFuture) obj);
                break;
            default:
                this.f476x.m437l(obj);
                break;
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: d */
    public final boolean mo337d() {
        return this.f474v.isDone();
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: e */
    public final Object mo338e() {
        switch (this.f475w) {
            case 0:
                return ((zzwx) this.f477y).call();
            default:
                return ((Callable) this.f477y).call();
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: f */
    public final String mo339f() {
        switch (this.f475w) {
            case 0:
                return ((zzwx) this.f477y).toString();
            default:
                return ((Callable) this.f477y).toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0240D(C0241E c0241e, zzwx zzwxVar, Executor executor) {
        this(c0241e, executor);
        this.f475w = 0;
        this.f476x = c0241e;
        this.f477y = zzwxVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0240D(C0241E c0241e, Callable callable) {
        this(c0241e, EnumC0244H.f483s);
        this.f475w = 1;
        this.f476x = c0241e;
        this.f477y = callable;
    }
}
