package p029Q0;

import p011H.AbstractC0243G;
import p068j0.C6419b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 Q0.o[], still in use, count: 1, list:
  (r0v1 Q0.o[]) from 0x0036: INVOKE (r0v1 Q0.o[]) STATIC call: H.G.k(java.lang.Enum[]):j0.b A[MD:(java.lang.Enum[]):j0.b (m), WRAPPED] (LINE:55)
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
/* JADX INFO: renamed from: Q0.o */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0515o {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C6419b f1093z;

    /* JADX INFO: renamed from: s */
    public final char f1094s;

    /* JADX INFO: renamed from: t */
    public final char f1095t;

    static {
        f1093z = AbstractC0243G.m373k(enumC0515oArr);
    }

    public EnumC0515o(char c, char c2) {
        super(str, i);
        this.f1094s = c;
        this.f1095t = c2;
    }

    public static EnumC0515o valueOf(String str) {
        return (EnumC0515o) Enum.valueOf(EnumC0515o.class, str);
    }

    public static EnumC0515o[] values() {
        return (EnumC0515o[]) f1092y.clone();
    }
}
