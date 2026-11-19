package androidx.datastore.core;

import kotlin.jvm.internal.C6460s;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.datastore.core.DataStoreImpl$writeData$2", m12159f = "DataStoreImpl.kt", m12160l = {352, 353}, m12161m = "invokeSuspend")
public final class DataStoreImpl$writeData$2 extends AbstractC6379i implements InterfaceC6502p {
    final /* synthetic */ T $newData;
    final /* synthetic */ C6460s $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeData$2(C6460s c6460s, DataStoreImpl<T> dataStoreImpl, T t, boolean z, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.$newVersion = c6460s;
        this.this$0 = dataStoreImpl;
        this.$newData = t;
        this.$updateCache = z;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(this.$newVersion, this.this$0, this.$newData, this.$updateCache, interfaceC6348c);
        dataStoreImpl$writeData$2.L$0 = obj;
        return dataStoreImpl$writeData$2;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(WriteScope<T> writeScope, InterfaceC6348c interfaceC6348c) {
        return ((DataStoreImpl$writeData$2) create(writeScope, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r3.writeData(r7, r6) == r0) goto L16;
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
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p011H.AbstractC0243G.m377o(r7)
            goto L5b
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$1
            kotlin.jvm.internal.s r1 = (kotlin.jvm.internal.C6460s) r1
            java.lang.Object r3 = r6.L$0
            androidx.datastore.core.WriteScope r3 = (androidx.datastore.core.WriteScope) r3
            p011H.AbstractC0243G.m377o(r7)
            goto L43
        L24:
            p011H.AbstractC0243G.m377o(r7)
            java.lang.Object r7 = r6.L$0
            androidx.datastore.core.WriteScope r7 = (androidx.datastore.core.WriteScope) r7
            kotlin.jvm.internal.s r1 = r6.$newVersion
            androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
            androidx.datastore.core.InterProcessCoordinator r4 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r4)
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r3
            java.lang.Object r3 = r4.incrementAndGetVersion(r6)
            if (r3 != r0) goto L40
            goto L5a
        L40:
            r5 = r3
            r3 = r7
            r7 = r5
        L43:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r1.f24634s = r7
            T r7 = r6.$newData
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r3.writeData(r7, r6)
            if (r7 != r0) goto L5b
        L5a:
            return r0
        L5b:
            boolean r7 = r6.$updateCache
            if (r7 == 0) goto L7b
            androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
            androidx.datastore.core.DataStoreInMemoryCache r7 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r7)
            androidx.datastore.core.Data r0 = new androidx.datastore.core.Data
            T r1 = r6.$newData
            if (r1 == 0) goto L70
            int r2 = r1.hashCode()
            goto L71
        L70:
            r2 = 0
        L71:
            kotlin.jvm.internal.s r3 = r6.$newVersion
            int r3 = r3.f24634s
            r0.<init>(r1, r2, r3)
            r7.tryUpdate(r0)
        L7b:
            d0.k r7 = p057d0.C6289k.f24318a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$writeData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
