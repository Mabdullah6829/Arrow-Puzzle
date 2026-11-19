package p030R;

import java.util.Map;
import p001B.AbstractC0076b;
import p001B.C0087m;

/* JADX INFO: renamed from: R.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0539V {
    /* JADX INFO: renamed from: a */
    public abstract String mo1270a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC0538U mo1271b(AbstractC0558h abstractC0558h);

    /* JADX INFO: renamed from: c */
    public abstract C0571n0 mo1272c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(mo1270a(), "policy");
        c0087mM143s.m160d("priority", String.valueOf(5));
        c0087mM143s.m159c("available", true);
        return c0087mM143s.toString();
    }
}
