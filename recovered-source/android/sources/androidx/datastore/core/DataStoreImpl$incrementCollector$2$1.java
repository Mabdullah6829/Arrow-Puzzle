package androidx.datastore.core;

import p000A0.InterfaceC0066v;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m12159f = "DataStoreImpl.kt", m12160l = {134, 135}, m12161m = "invokeSuspend")
public final class DataStoreImpl$incrementCollector$2$1 extends AbstractC6379i implements InterfaceC6502p {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$2$1(DataStoreImpl<T> dataStoreImpl, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.this$0 = dataStoreImpl;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        return new DataStoreImpl$incrementCollector$2$1(this.this$0, interfaceC6348c);
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
        return ((DataStoreImpl$incrementCollector$2$1) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r7.collect(r1, r6) == r0) goto L19;
     */
    @Override // p066i0.AbstractC6371a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            h0.a r0 = p064h0.EnumC6363a.f24419s
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p011H.AbstractC0243G.m377o(r7)
            goto L60
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            p011H.AbstractC0243G.m377o(r7)
            goto L2e
        L1c:
            p011H.AbstractC0243G.m377o(r7)
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.DataStoreImpl$InitDataStore r7 = androidx.datastore.core.DataStoreImpl.access$getReadAndInit$p(r7)
            r6.label = r3
            java.lang.Object r7 = r7.awaitComplete(r6)
            if (r7 != r0) goto L2e
            goto L5f
        L2e:
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
            D0.e r7 = r7.getUpdateNotifications()
            C0.a r1 = p004C0.EnumC0136a.f215s
            C0.a r1 = p004C0.EnumC0136a.f216t
            boolean r3 = r7 instanceof p008E0.InterfaceC0203f
            g0.i r4 = p062g0.C6354i.f24409s
            r5 = 0
            if (r3 == 0) goto L4a
            E0.f r7 = (p008E0.InterfaceC0203f) r7
            D0.e r7 = r7.mo258b(r4, r5, r1)
            goto L50
        L4a:
            D0.d r3 = new D0.d
            r3.<init>(r7, r4, r5, r1)
            r7 = r3
        L50:
            androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$1 r1 = new androidx.datastore.core.DataStoreImpl$incrementCollector$2$1$1
            androidx.datastore.core.DataStoreImpl<T> r3 = r6.this$0
            r1.<init>()
            r6.label = r2
            java.lang.Object r7 = r7.collect(r1, r6)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            d0.k r7 = p057d0.C6289k.f24318a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$incrementCollector$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
