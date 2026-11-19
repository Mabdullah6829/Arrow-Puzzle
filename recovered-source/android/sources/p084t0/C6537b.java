package p084t0;

import java.util.Random;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6537b extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}
