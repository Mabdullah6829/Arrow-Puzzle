package p030R;

import p001B.AbstractC0076b;
import p001B.C0087m;
import p034T.C0733f2;
import p034T.C0778r;
import p034T.ExecutorC0690T0;
import p034T.ScheduledExecutorServiceC0712a1;

/* JADX INFO: renamed from: R.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0569m0 {

    /* JADX INFO: renamed from: a */
    public final int f1209a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0579r0 f1210b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC0517A0 f1211c;

    /* JADX INFO: renamed from: d */
    public final C0733f2 f1212d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorServiceC0712a1 f1213e;

    /* JADX INFO: renamed from: f */
    public final C0778r f1214f;

    /* JADX INFO: renamed from: g */
    public final ExecutorC0690T0 f1215g;

    public C0569m0(Integer num, InterfaceC0579r0 interfaceC0579r0, ExecutorC0517A0 executorC0517A0, C0733f2 c0733f2, ScheduledExecutorServiceC0712a1 scheduledExecutorServiceC0712a1, C0778r c0778r, ExecutorC0690T0 executorC0690T0) {
        this.f1209a = num.intValue();
        AbstractC0076b.m133h(interfaceC0579r0, "proxyDetector not set");
        this.f1210b = interfaceC0579r0;
        this.f1211c = executorC0517A0;
        this.f1212d = c0733f2;
        this.f1213e = scheduledExecutorServiceC0712a1;
        this.f1214f = c0778r;
        this.f1215g = executorC0690T0;
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m160d("defaultPort", String.valueOf(this.f1209a));
        c0087mM143s.m158b(this.f1210b, "proxyDetector");
        c0087mM143s.m158b(this.f1211c, "syncContext");
        c0087mM143s.m158b(this.f1212d, "serviceConfigParser");
        c0087mM143s.m158b(this.f1213e, "scheduledExecutorService");
        c0087mM143s.m158b(this.f1214f, "channelLogger");
        c0087mM143s.m158b(this.f1215g, "executor");
        c0087mM143s.m158b(null, "overrideAuthority");
        return c0087mM143s.toString();
    }
}
