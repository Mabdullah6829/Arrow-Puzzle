package p000A0;

import p010F0.AbstractC0215a;
import p010F0.C0228n;
import p058e0.C6301i;

/* JADX INFO: renamed from: A0.O */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0014O extends AbstractC0063t {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f14v = 0;

    /* JADX INFO: renamed from: s */
    public long f15s;

    /* JADX INFO: renamed from: t */
    public boolean f16t;

    /* JADX INFO: renamed from: u */
    public C6301i f17u;

    /* JADX INFO: renamed from: j */
    public final void m20j(boolean z) {
        long j2 = this.f15s - (z ? 4294967296L : 1L);
        this.f15s = j2;
        if (j2 <= 0 && this.f16t) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract Thread mo21l();

    @Override // p000A0.AbstractC0063t
    public final AbstractC0063t limitedParallelism(int i2, String str) {
        AbstractC0215a.m295a(i2);
        return str != null ? new C0228n(this, str) : this;
    }

    /* JADX INFO: renamed from: n */
    public final void m22n(boolean z) {
        this.f15s = (z ? 4294967296L : 1L) + this.f15s;
        if (z) {
            return;
        }
        this.f16t = true;
    }

    /* JADX INFO: renamed from: o */
    public abstract long mo17o();

    /* JADX INFO: renamed from: p */
    public final boolean m23p() {
        C6301i c6301i = this.f17u;
        if (c6301i == null) {
            return false;
        }
        AbstractC0005F abstractC0005F = (AbstractC0005F) (c6301i.isEmpty() ? null : c6301i.removeFirst());
        if (abstractC0005F == null) {
            return false;
        }
        abstractC0005F.run();
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo24r(long j2, AbstractRunnableC0011L abstractRunnableC0011L) {
        RunnableC0070z.f97z.m16I(j2, abstractRunnableC0011L);
    }

    public abstract void shutdown();
}
