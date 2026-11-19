package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: renamed from: kotlin.jvm.internal.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6453l implements InterfaceC6449h, Serializable {
    private final int arity;

    public AbstractC6453l(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.InterfaceC6449h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC6463v.f24637a.getClass();
        String strM12190a = C6464w.m12190a(this);
        AbstractC6452k.m12180d(strM12190a, "renderLambdaToString(...)");
        return strM12190a;
    }
}
