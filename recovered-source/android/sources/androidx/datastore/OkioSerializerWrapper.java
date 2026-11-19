package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.AbstractC6452k;
import p033S0.InterfaceC0614h;
import p033S0.InterfaceC0615i;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: loaded from: classes.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(InterfaceC0615i interfaceC0615i, InterfaceC6348c interfaceC6348c) {
        return this.delegate.readFrom(interfaceC0615i.mo1379G(), interfaceC6348c);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t, InterfaceC0614h interfaceC0614h, InterfaceC6348c interfaceC6348c) {
        Object objWriteTo = this.delegate.writeTo(t, interfaceC0614h.mo1378E(), interfaceC6348c);
        return objWriteTo == EnumC6363a.f24419s ? objWriteTo : C6289k.f24318a;
    }
}
