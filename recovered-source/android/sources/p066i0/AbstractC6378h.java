package p066i0;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6463v;
import kotlin.jvm.internal.C6464w;
import kotlin.jvm.internal.InterfaceC6449h;
import p062g0.InterfaceC6348c;

/* JADX INFO: renamed from: i0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6378h extends AbstractC6377g implements InterfaceC6449h {
    private final int arity;

    public AbstractC6378h(int i2, InterfaceC6348c interfaceC6348c) {
        super(interfaceC6348c);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.InterfaceC6449h
    public int getArity() {
        return this.arity;
    }

    @Override // p066i0.AbstractC6371a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        AbstractC6463v.f24637a.getClass();
        String strM12190a = C6464w.m12190a(this);
        AbstractC6452k.m12180d(strM12190a, "renderLambdaToString(...)");
        return strM12190a;
    }
}
