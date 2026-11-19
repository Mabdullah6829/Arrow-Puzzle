package androidx.datastore.core;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.FileWriteScope$writeData$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.core.FileWriteScope", m12159f = "FileStorage.kt", m12160l = {201}, m12161m = "writeData")
    public static final class C13241 extends AbstractC6373c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ FileWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13241(FileWriteScope<T> fileWriteScope, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = fileWriteScope;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        AbstractC6452k.m12181e(file, "file");
        AbstractC6452k.m12181e(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13241 c13241;
        java.io.Closeable closeable;
        FileOutputStream fileOutputStream;
        if (interfaceC6348c instanceof C13241) {
            c13241 = (C13241) interfaceC6348c;
            int i2 = c13241.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13241.label = i2 - Integer.MIN_VALUE;
            } else {
                c13241 = new C13241(this, interfaceC6348c);
            }
        } else {
            c13241 = new C13241(this, interfaceC6348c);
        }
        Object obj = c13241.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13241.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            checkNotClosed();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                Serializer<T> serializer = getSerializer();
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream2);
                c13241.L$0 = fileOutputStream2;
                c13241.L$1 = fileOutputStream2;
                c13241.label = 1;
                if (serializer.writeTo(t, uncloseableOutputStream, c13241) == enumC6363a) {
                    return enumC6363a;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) c13241.L$1;
            closeable = (java.io.Closeable) c13241.L$0;
            try {
                AbstractC0243G.m377o(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    AbstractC0878a.m1797f(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        AbstractC0878a.m1797f(closeable, null);
        return C6289k.f24318a;
    }
}
