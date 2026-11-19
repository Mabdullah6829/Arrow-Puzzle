package p069k;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p001B.C0092r;
import p034T.RunnableC0758m;
import p049b0.C1887c;
import p063h.C6357c;
import p063h.EnumC6358d;
import p065i.C6368a;
import p077p.InterfaceC6486c;
import p079q.C6517h;
import p079q.C6519j;

/* JADX INFO: renamed from: k.u */
/* JADX INFO: loaded from: classes.dex */
public final class C6440u {

    /* JADX INFO: renamed from: e */
    public static volatile C6431l f24621e;

    /* JADX INFO: renamed from: a */
    public final C1887c f24622a;

    /* JADX INFO: renamed from: b */
    public final C1887c f24623b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6486c f24624c;

    /* JADX INFO: renamed from: d */
    public final C6517h f24625d;

    public C6440u(C1887c c1887c, C1887c c1887c2, InterfaceC6486c interfaceC6486c, C6517h c6517h, C6519j c6519j) {
        this.f24622a = c1887c;
        this.f24623b = c1887c2;
        this.f24624c = interfaceC6486c;
        this.f24625d = c6517h;
        c6519j.f24732a.execute(new RunnableC0758m(c6519j, 14));
    }

    /* JADX INFO: renamed from: a */
    public static C6440u m12172a() {
        C6431l c6431l = f24621e;
        if (c6431l != null) {
            return (C6440u) c6431l.f24607y.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: b */
    public static void m12173b(Context context) {
        if (f24621e == null) {
            synchronized (C6440u.class) {
                try {
                    if (f24621e == null) {
                        C0092r c0092r = new C0092r(15);
                        context.getClass();
                        c0092r.f130t = context;
                        f24621e = c0092r.m163c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C6438s m12174c(InterfaceC6432m interfaceC6432m) {
        byte[] bytes;
        Set setUnmodifiableSet = interfaceC6432m != null ? Collections.unmodifiableSet(C6368a.f24428d) : Collections.singleton(new C6357c("proto"));
        interfaceC6432m.getClass();
        C6368a c6368a = (C6368a) interfaceC6432m;
        String str = c6368a.f24431a;
        String str2 = c6368a.f24432b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        return new C6438s(setUnmodifiableSet, new C6430k("cct", bytes, EnumC6358d.f24415s), this);
    }
}
