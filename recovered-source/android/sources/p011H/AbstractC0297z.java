package p011H;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: H.z */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0297z extends AbstractC0283l {

    /* JADX INFO: renamed from: B */
    public static final AbstractC0242F f578B;

    /* JADX INFO: renamed from: C */
    public static final Logger f579C = Logger.getLogger(AbstractC0297z.class.getName());

    /* JADX INFO: renamed from: A */
    public volatile int f580A;

    /* JADX INFO: renamed from: z */
    public volatile Set f581z;

    static {
        AbstractC0242F c0296y;
        try {
            c0296y = new C0295x(AtomicReferenceFieldUpdater.newUpdater(AbstractC0297z.class, Set.class, "z"), AtomicIntegerFieldUpdater.newUpdater(AbstractC0297z.class, "A"));
            e = null;
        } catch (Error | RuntimeException e) {
            e = e;
            c0296y = new C0296y(5);
        }
        f578B = c0296y;
        if (e != null) {
            f579C.log(Level.SEVERE, "SafeAtomicHelper is broken!", e);
        }
    }
}
