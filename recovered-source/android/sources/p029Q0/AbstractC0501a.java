package p029Q0;

import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6284f;
import p091y0.AbstractC6581k;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0501a {

    /* JADX INFO: renamed from: a */
    public static final int f1053a;

    static {
        Object objM372j;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC6452k.m12180d(property, "getProperty(...)");
            objM372j = AbstractC6581k.m12231p(property);
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        if (objM372j instanceof C6284f) {
            objM372j = null;
        }
        Integer num = (Integer) objM372j;
        f1053a = num != null ? num.intValue() : 2097152;
    }
}
