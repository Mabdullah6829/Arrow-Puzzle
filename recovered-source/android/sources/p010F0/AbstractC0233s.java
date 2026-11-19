package p010F0;

import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.AbstractC6285g;
import p066i0.AbstractC6371a;

/* JADX INFO: renamed from: F0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f467a = 0;

    static {
        Object objM372j;
        Object objM372j2;
        Exception exc = new Exception();
        String simpleName = AbstractC0878a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objM372j = AbstractC6371a.class.getCanonicalName();
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        if (AbstractC6285g.m12075a(objM372j) != null) {
            objM372j = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objM372j2 = AbstractC0233s.class.getCanonicalName();
        } catch (Throwable th2) {
            objM372j2 = AbstractC0243G.m372j(th2);
        }
        if (AbstractC6285g.m12075a(objM372j2) != null) {
            objM372j2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
