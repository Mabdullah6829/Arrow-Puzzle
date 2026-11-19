package p069k;

import com.google.firebase.crashlytics.internal.metadata.RunnableC5661a;
import java.util.HashMap;
import p063h.C6355a;
import p063h.C6356b;
import p063h.C6357c;
import p063h.InterfaceC6359e;
import p063h.InterfaceC6360f;
import p063h.InterfaceC6362h;
import p077p.C6484a;
import p077p.InterfaceC6486c;

/* JADX INFO: renamed from: k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C6439t implements InterfaceC6360f {

    /* JADX INFO: renamed from: a */
    public final C6430k f24616a;

    /* JADX INFO: renamed from: b */
    public final String f24617b;

    /* JADX INFO: renamed from: c */
    public final C6357c f24618c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6359e f24619d;

    /* JADX INFO: renamed from: e */
    public final C6440u f24620e;

    public C6439t(C6430k c6430k, String str, C6357c c6357c, InterfaceC6359e interfaceC6359e, C6440u c6440u) {
        this.f24616a = c6430k;
        this.f24617b = str;
        this.f24618c = c6357c;
        this.f24619d = interfaceC6359e;
        this.f24620e = c6440u;
    }

    /* JADX INFO: renamed from: a */
    public final void m12171a(C6355a c6355a, InterfaceC6362h interfaceC6362h) {
        InterfaceC6359e interfaceC6359e = this.f24619d;
        if (interfaceC6359e == null) {
            throw new NullPointerException("Null transformer");
        }
        C6440u c6440u = this.f24620e;
        InterfaceC6486c interfaceC6486c = c6440u.f24624c;
        C6430k c6430kM12169a = this.f24616a.m12169a(c6355a.f24411b);
        C6428i c6428i = new C6428i();
        c6428i.f24583f = new HashMap();
        c6428i.f24581d = Long.valueOf(c6440u.f24622a.m2719f());
        c6428i.f24582e = Long.valueOf(c6440u.f24623b.m2719f());
        c6428i.f24578a = this.f24617b;
        c6428i.f24580c = new C6433n(this.f24618c, (byte[]) interfaceC6359e.apply(c6355a.f24410a));
        c6428i.f24579b = null;
        C6356b c6356b = c6355a.f24412c;
        if (c6356b != null) {
            c6428i.f24584g = c6356b.f24413a;
        }
        C6484a c6484a = (C6484a) interfaceC6486c;
        c6484a.f24686b.execute(new RunnableC5661a(c6484a, c6430kM12169a, interfaceC6362h, c6428i.m12165b(), 2));
    }
}
