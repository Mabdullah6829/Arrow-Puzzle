package kotlin.jvm.internal;

import p088w0.InterfaceC6547b;
import p088w0.InterfaceC6551f;
import p088w0.InterfaceC6552g;
import p088w0.InterfaceC6553h;

/* JADX INFO: renamed from: kotlin.jvm.internal.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6455n extends AbstractC6458q implements InterfaceC6553h {
    @Override // kotlin.jvm.internal.AbstractC6444c
    public InterfaceC6547b computeReflected() {
        AbstractC6463v.f24637a.getClass();
        return this;
    }

    @Override // p088w0.InterfaceC6553h
    public Object getDelegate(Object obj) {
        return ((InterfaceC6553h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ InterfaceC6551f getGetter() {
        mo12365getGetter();
        return null;
    }

    @Override // p078p0.InterfaceC6498l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p088w0.InterfaceC6553h
    /* JADX INFO: renamed from: getGetter, reason: collision with other method in class */
    public InterfaceC6552g mo12365getGetter() {
        ((InterfaceC6553h) getReflected()).mo12365getGetter();
        return null;
    }
}
