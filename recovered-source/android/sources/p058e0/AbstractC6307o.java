package p058e0;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: e0.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6307o extends AbstractC6306n {
    /* JADX INFO: renamed from: u */
    public static int m12123u(Iterable iterable, int i2) {
        AbstractC6452k.m12181e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
