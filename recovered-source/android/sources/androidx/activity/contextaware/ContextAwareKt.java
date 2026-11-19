package androidx.activity.contextaware;

import android.content.Context;
import p000A0.C0039h;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC6498l.invoke(contextPeekAvailableContext);
        }
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c0039h, interfaceC6498l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c0039h.m88t(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC6498l.invoke(contextPeekAvailableContext);
        }
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c0039h, interfaceC6498l);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c0039h.m88t(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }
}
