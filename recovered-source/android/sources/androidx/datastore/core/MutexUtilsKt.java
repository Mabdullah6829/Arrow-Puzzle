package androidx.datastore.core;

import kotlin.jvm.internal.AbstractC6452k;
import p014I0.C0315d;
import p014I0.InterfaceC0312a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(InterfaceC0312a interfaceC0312a, Object obj, InterfaceC6498l block) {
        AbstractC6452k.m12181e(interfaceC0312a, "<this>");
        AbstractC6452k.m12181e(block, "block");
        C0315d c0315d = (C0315d) interfaceC0312a;
        boolean zM463e = c0315d.m463e(obj);
        try {
            return (R) block.invoke(Boolean.valueOf(zM463e));
        } finally {
            if (zM463e) {
                c0315d.m464f(obj);
            }
        }
    }

    public static /* synthetic */ Object withTryLock$default(InterfaceC0312a interfaceC0312a, Object obj, InterfaceC6498l block, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        AbstractC6452k.m12181e(interfaceC0312a, "<this>");
        AbstractC6452k.m12181e(block, "block");
        C0315d c0315d = (C0315d) interfaceC0312a;
        boolean zM463e = c0315d.m463e(obj);
        try {
            return block.invoke(Boolean.valueOf(zM463e));
        } finally {
            if (zM463e) {
                c0315d.m464f(obj);
            }
        }
    }
}
