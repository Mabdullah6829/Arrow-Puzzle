package androidx.datastore.core;

import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class StorageConnectionKt {

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$readData$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.StorageConnectionKt$readData$2", m12159f = "StorageConnection.kt", m12160l = {74}, m12161m = "invokeSuspend")
    public static final class C13392 extends AbstractC6379i implements InterfaceC6503q {
        private /* synthetic */ Object L$0;
        int label;

        public C13392(InterfaceC6348c interfaceC6348c) {
            super(3, interfaceC6348c);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z, InterfaceC6348c interfaceC6348c) {
            C13392 c13392 = new C13392(interfaceC6348c);
            c13392.L$0 = readScope;
            return c13392.invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == enumC6363a ? enumC6363a : data;
        }

        @Override // p078p0.InterfaceC6503q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (InterfaceC6348c) obj3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.StorageConnectionKt$writeData$2", m12159f = "StorageConnection.kt", m12160l = {77}, m12161m = "invokeSuspend")
    public static final class C13402 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ T $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13402(T t, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$value = t;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13402 c13402 = new C13402(this.$value, interfaceC6348c);
            c13402.L$0 = obj;
            return c13402;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(WriteScope<T> writeScope, InterfaceC6348c interfaceC6348c) {
            return ((C13402) create(writeScope, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t = this.$value;
                this.label = 1;
                if (writeScope.writeData(t, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    public static final <T> Object readData(StorageConnection<T> storageConnection, InterfaceC6348c interfaceC6348c) {
        return storageConnection.readScope(new C13392(null), interfaceC6348c);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, InterfaceC6348c interfaceC6348c) {
        Object objWriteScope = storageConnection.writeScope(new C13402(t, null), interfaceC6348c);
        return objWriteScope == EnumC6363a.f24419s ? objWriteScope : C6289k.f24318a;
    }
}
