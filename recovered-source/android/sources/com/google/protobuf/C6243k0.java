package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6243k0 {

    /* JADX INFO: renamed from: b */
    public static final C6173G f24192b = new C6173G(1);

    /* JADX INFO: renamed from: a */
    public final Object f24193a;

    public C6243k0(AbstractC6269w abstractC6269w) {
        AbstractC6213a0.m11832a(abstractC6269w, "output");
        this.f24193a = abstractC6269w;
        abstractC6269w.f24291c = this;
    }

    /* JADX INFO: renamed from: a */
    public void m11889a(AbstractC6251n abstractC6251n) {
        if (!abstractC6251n.mo11723q()) {
            if (!(abstractC6251n instanceof C6176H0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC6251n.getClass());
            }
            C6176H0 c6176h0 = (C6176H0) abstractC6251n;
            m11889a(c6176h0.f24083w);
            m11889a(c6176h0.f24084x);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(C6176H0.f24081A, abstractC6251n.size());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iM11717B = C6176H0.m11717B(iBinarySearch + 1);
        ArrayDeque arrayDeque = (ArrayDeque) this.f24193a;
        if (arrayDeque.isEmpty() || ((AbstractC6251n) arrayDeque.peek()).size() >= iM11717B) {
            arrayDeque.push(abstractC6251n);
            return;
        }
        int iM11717B2 = C6176H0.m11717B(iBinarySearch);
        AbstractC6251n c6176h1 = (AbstractC6251n) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC6251n) arrayDeque.peek()).size() < iM11717B2) {
            c6176h1 = new C6176H0((AbstractC6251n) arrayDeque.pop(), c6176h1);
        }
        C6176H0 c6176h2 = new C6176H0(c6176h1, abstractC6251n);
        while (!arrayDeque.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(C6176H0.f24081A, c6176h2.f24082v);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC6251n) arrayDeque.peek()).size() >= C6176H0.m11717B(iBinarySearch2 + 1)) {
                break;
            } else {
                c6176h2 = new C6176H0((AbstractC6251n) arrayDeque.pop(), c6176h2);
            }
        }
        arrayDeque.push(c6176h2);
    }

    /* JADX INFO: renamed from: b */
    public void m11890b(int i2, Object obj, InterfaceC6178I0 interfaceC6178I0) {
        AbstractC6269w abstractC6269w = (AbstractC6269w) this.f24193a;
        abstractC6269w.mo12011W(i2, 3);
        interfaceC6178I0.mo11731a((InterfaceC6262s0) obj, abstractC6269w.f24291c);
        abstractC6269w.mo12011W(i2, 4);
    }

    public C6243k0(int i2) {
        InterfaceC6258q0 interfaceC6258q0;
        switch (i2) {
            case 2:
                this.f24193a = new ArrayDeque();
                break;
            default:
                try {
                    interfaceC6258q0 = (InterfaceC6258q0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC6258q0 = f24192b;
                }
                InterfaceC6258q0[] interfaceC6258q0Arr = {C6173G.f24077b, interfaceC6258q0};
                C6240j0 c6240j0 = new C6240j0();
                c6240j0.f24190a = interfaceC6258q0Arr;
                Charset charset = AbstractC6213a0.f24134a;
                this.f24193a = c6240j0;
                break;
        }
    }
}
