package p030R;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: R.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0582t {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0584u f1243a;

    static {
        AbstractC0584u c0519b0;
        AtomicReference atomicReference = new AtomicReference();
        try {
            c0519b0 = (AbstractC0584u) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC0584u.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            c0519b0 = new C0519B0();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        f1243a = c0519b0;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C0586v.f1245a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}
