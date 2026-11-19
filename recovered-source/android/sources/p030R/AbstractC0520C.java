package p030R;

import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0520C extends AbstractC0562j {
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(delegate(), "delegate");
        return c0087mM143s.toString();
    }

    @Override // p030R.AbstractC0562j
    public void cancel(String str, Throwable th) {
        delegate().cancel(str, th);
    }

    public abstract AbstractC0562j delegate();

    @Override // p030R.AbstractC0562j
    public C0546b getAttributes() {
        return delegate().getAttributes();
    }

    @Override // p030R.AbstractC0562j
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // p030R.AbstractC0562j
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // p030R.AbstractC0562j
    public void request(int i2) {
        delegate().request(i2);
    }

    @Override // p030R.AbstractC0562j
    public void sendMessage(Object obj) {
        delegate().sendMessage(obj);
    }

    @Override // p030R.AbstractC0562j
    public void setMessageCompression(boolean z) {
        delegate().setMessageCompression(z);
    }

    @Override // p030R.AbstractC0562j
    public void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        delegate().start(abstractC0560i, c0559h0);
    }
}
