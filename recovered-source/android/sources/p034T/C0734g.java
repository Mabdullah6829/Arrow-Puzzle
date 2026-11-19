package p034T;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0734g {

    /* JADX INFO: renamed from: c */
    public static final Logger f1867c = Logger.getLogger(C0734g.class.getName());

    /* JADX INFO: renamed from: a */
    public final String f1868a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f1869b;

    public C0734g(long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f1869b = atomicLong;
        AbstractC0076b.m131f(j2 > 0, "value must be positive");
        this.f1868a = "keepalive time nanos";
        atomicLong.set(j2);
    }
}
