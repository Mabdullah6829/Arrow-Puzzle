package p092z0;

import java.util.concurrent.TimeUnit;
import p011H.AbstractC0243G;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 z0.c[], still in use, count: 1, list:
  (r0v1 z0.c[]) from 0x0058: INVOKE (r0v1 z0.c[]) STATIC call: H.G.k(java.lang.Enum[]):j0.b A[MD:(java.lang.Enum[]):j0.b (m)] (LINE:89)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: z0.c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6585c {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: s */
    public final TimeUnit f24818s;

    static {
        AbstractC0243G.m373k(enumC6585cArr);
    }

    public EnumC6585c(TimeUnit timeUnit) {
        super(str, i);
        this.f24818s = timeUnit;
    }

    public static EnumC6585c valueOf(String str) {
        return (EnumC6585c) Enum.valueOf(EnumC6585c.class, str);
    }

    public static EnumC6585c[] values() {
        return (EnumC6585c[]) f24817z.clone();
    }
}
