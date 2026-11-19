package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: com.google.protobuf.C0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6166C0 {

    /* JADX INFO: renamed from: c */
    public static final C6166C0 f24055c = new C6166C0();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f24057b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C6243k0 f24056a = new C6243k0(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC6178I0 m11705a(Class cls) {
        InterfaceC6178I0 interfaceC6178I0M12035w;
        Class cls2;
        AbstractC6213a0.m11832a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f24057b;
        InterfaceC6178I0 interfaceC6178I0 = (InterfaceC6178I0) concurrentHashMap.get(cls);
        if (interfaceC6178I0 != null) {
            return interfaceC6178I0;
        }
        C6243k0 c6243k0 = this.f24056a;
        c6243k0.getClass();
        Class cls3 = AbstractC6180J0.f24092a;
        if (!AbstractC6185M.class.isAssignableFrom(cls) && (cls2 = AbstractC6180J0.f24092a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        C6170E0 c6170e0MessageInfoFor = ((C6240j0) c6243k0.f24193a).messageInfoFor(cls);
        int i2 = c6170e0MessageInfoFor.f24071d;
        InterfaceC6262s0 interfaceC6262s0 = c6170e0MessageInfoFor.f24068a;
        if ((i2 & 2) == 2) {
            if (AbstractC6185M.class.isAssignableFrom(cls)) {
                interfaceC6178I0M12035w = new C6270w0(AbstractC6180J0.f24094c, AbstractC6165C.f24053a, interfaceC6262s0);
            } else {
                AbstractC6199T0 abstractC6199T0 = AbstractC6180J0.f24093b;
                C6163B c6163b = AbstractC6165C.f24054b;
                if (c6163b == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC6178I0M12035w = new C6270w0(abstractC6199T0, c6163b, interfaceC6262s0);
            }
        } else if (AbstractC6185M.class.isAssignableFrom(cls)) {
            interfaceC6178I0M12035w = AbstractC6468c.m12193b(c6170e0MessageInfoFor.m11713a()) != 1 ? C6268v0.m12035w(c6170e0MessageInfoFor, AbstractC6274y0.f24299b, AbstractC6234h0.f24183b, AbstractC6180J0.f24094c, AbstractC6165C.f24053a, AbstractC6256p0.f24242b) : C6268v0.m12035w(c6170e0MessageInfoFor, AbstractC6274y0.f24299b, AbstractC6234h0.f24183b, AbstractC6180J0.f24094c, null, AbstractC6256p0.f24242b);
        } else if (AbstractC6468c.m12193b(c6170e0MessageInfoFor.m11713a()) != 1) {
            C6272x0 c6272x0 = AbstractC6274y0.f24298a;
            C6228f0 c6228f0 = AbstractC6234h0.f24182a;
            AbstractC6199T0 abstractC6199T1 = AbstractC6180J0.f24093b;
            C6163B c6163b2 = AbstractC6165C.f24054b;
            if (c6163b2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            interfaceC6178I0M12035w = C6268v0.m12035w(c6170e0MessageInfoFor, c6272x0, c6228f0, abstractC6199T1, c6163b2, AbstractC6256p0.f24241a);
        } else {
            interfaceC6178I0M12035w = C6268v0.m12035w(c6170e0MessageInfoFor, AbstractC6274y0.f24298a, AbstractC6234h0.f24182a, AbstractC6180J0.f24093b, null, AbstractC6256p0.f24241a);
        }
        InterfaceC6178I0 interfaceC6178I1 = (InterfaceC6178I0) concurrentHashMap.putIfAbsent(cls, interfaceC6178I0M12035w);
        return interfaceC6178I1 != null ? interfaceC6178I1 : interfaceC6178I0M12035w;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6178I0 m11706b(Object obj) {
        return m11705a(obj.getClass());
    }
}
