package p086u0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.AbstractC6452k;
import p084t0.AbstractC6536a;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6541a extends AbstractC6536a {
    @Override // p084t0.AbstractC6536a
    /* JADX INFO: renamed from: b */
    public final Random mo12210b() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC6452k.m12180d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
