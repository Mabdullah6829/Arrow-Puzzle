package p030R;

/* JADX INFO: renamed from: R.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0562j {
    public abstract void cancel(String str, Throwable th);

    public C0546b getAttributes() {
        return C0546b.f1154b;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return !(this instanceof AbstractC0564k);
    }

    public abstract void request(int i2);

    public abstract void sendMessage(Object obj);

    public abstract void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0);

    public void setMessageCompression(boolean z) {
    }
}
