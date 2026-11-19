package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;
import p043a.AbstractC0878a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class CloseableKt {
    public static final <T extends Closeable, R> R use(T t, InterfaceC6498l block) throws Throwable {
        AbstractC6452k.m12181e(t, "<this>");
        AbstractC6452k.m12181e(block, "block");
        try {
            R r2 = (R) block.invoke(t);
            try {
                t.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                return r2;
            }
            throw th;
        } catch (Throwable th2) {
            try {
                t.close();
            } catch (Throwable th3) {
                AbstractC0878a.m1796b(th2, th3);
            }
            throw th2;
        }
    }
}
