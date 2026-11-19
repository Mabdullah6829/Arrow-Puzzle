package kotlin.jvm.internal;

import p011H.AbstractC0271e0;
import p057d0.InterfaceC6279a;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p078p0.InterfaceC6504r;

/* JADX INFO: renamed from: kotlin.jvm.internal.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6465x {
    /* JADX INFO: renamed from: a */
    public static void m12191a(int i2, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof InterfaceC6279a) {
                if (obj instanceof InterfaceC6449h) {
                    arity = ((InterfaceC6449h) obj).getArity();
                } else if (obj instanceof InterfaceC6487a) {
                    arity = 0;
                } else if (obj instanceof InterfaceC6498l) {
                    arity = 1;
                } else if (obj instanceof InterfaceC6502p) {
                    arity = 2;
                } else if (obj instanceof InterfaceC6503q) {
                    arity = 3;
                } else {
                    arity = obj instanceof InterfaceC6504r ? 4 : -1;
                }
                if (arity == i2) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(AbstractC0271e0.m415w(obj.getClass().getName(), " cannot be cast to ", AbstractC0271e0.m396d(i2, "kotlin.jvm.functions.Function")));
            AbstractC6452k.m12183g(classCastException, AbstractC6465x.class.getName());
            throw classCastException;
        }
    }
}
