package p057d0;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: d0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6287i implements InterfaceC6281c, Serializable {

    /* JADX INFO: renamed from: s */
    public InterfaceC6487a f24314s;

    /* JADX INFO: renamed from: t */
    public volatile Object f24315t;

    /* JADX INFO: renamed from: u */
    public final Object f24316u;

    public C6287i(InterfaceC6487a initializer) {
        AbstractC6452k.m12181e(initializer, "initializer");
        this.f24314s = initializer;
        this.f24315t = C6288j.f24317a;
        this.f24316u = this;
    }

    @Override // p057d0.InterfaceC6281c
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f24315t;
        C6288j c6288j = C6288j.f24317a;
        if (obj != c6288j) {
            return obj;
        }
        synchronized (this.f24316u) {
            objInvoke = this.f24315t;
            if (objInvoke == c6288j) {
                InterfaceC6487a interfaceC6487a = this.f24314s;
                AbstractC6452k.m12178b(interfaceC6487a);
                objInvoke = interfaceC6487a.invoke();
                this.f24315t = objInvoke;
                this.f24314s = null;
            }
        }
        return objInvoke;
    }

    @Override // p057d0.InterfaceC6281c
    public final boolean isInitialized() {
        return this.f24315t != C6288j.f24317a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
