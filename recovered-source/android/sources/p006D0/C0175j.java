package p006D0;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import p008E0.C0206i;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: D0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0175j implements InterfaceC0170e {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 f323s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC6503q f324t;

    public C0175j(DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, InterfaceC6503q interfaceC6503q) {
        this.f323s = dataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
        this.f324t = interfaceC6503q;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p006D0.InterfaceC0170e
    public final Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0174i c0174i;
        C0175j c0175j;
        C0165E c0165e;
        InterfaceC6503q interfaceC6503q;
        C0206i c0206i;
        Throwable th;
        C0206i c0206i2;
        InterfaceC6503q interfaceC6503q2;
        if (interfaceC6348c instanceof C0174i) {
            c0174i = (C0174i) interfaceC6348c;
            int i2 = c0174i.f319t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0174i.f319t = i2 - Integer.MIN_VALUE;
            } else {
                c0174i = new C0174i(this, interfaceC6348c);
            }
        } else {
            c0174i = new C0174i(this, interfaceC6348c);
        }
        Object obj = c0174i.f318s;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c0174i.f319t;
        if (i3 == 0) {
            AbstractC0243G.m377o(obj);
            try {
                DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = this.f323s;
                c0174i.f321v = this;
                c0174i.f322w = interfaceC0171f;
                c0174i.f319t = 1;
                if (dataStoreImpl$data$1$invokeSuspend$$inlined$map$1.collect(interfaceC0171f, c0174i) != enumC6363a) {
                    c0175j = this;
                    c0206i = new C0206i(interfaceC0171f, c0174i.getContext());
                    interfaceC6503q2 = c0175j.f324t;
                    c0174i.f321v = c0206i;
                    c0174i.f322w = null;
                    c0174i.f319t = 3;
                    if (interfaceC6503q2.invoke(c0206i, null, c0174i) != enumC6363a) {
                        c0206i2 = c0206i;
                        c0206i2.releaseIntercepted();
                        return C6289k.f24318a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                c0175j = this;
                c0165e = new C0165E(th);
                interfaceC6503q = c0175j.f324t;
                c0174i.f321v = th;
                c0174i.f322w = null;
                c0174i.f319t = 2;
                if (AbstractC0163C.m259a(c0165e, interfaceC6503q, th, c0174i) == enumC6363a) {
                    throw th;
                }
            }
            return enumC6363a;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                Throwable th3 = (Throwable) c0174i.f321v;
                AbstractC0243G.m377o(obj);
                throw th3;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0206i2 = (C0206i) c0174i.f321v;
            try {
                AbstractC0243G.m377o(obj);
                c0206i2.releaseIntercepted();
                return C6289k.f24318a;
            } catch (Throwable th4) {
                th = th4;
                c0206i2.releaseIntercepted();
                throw th;
            }
        }
        interfaceC0171f = c0174i.f322w;
        c0175j = (C0175j) c0174i.f321v;
        try {
            AbstractC0243G.m377o(obj);
            c0206i = new C0206i(interfaceC0171f, c0174i.getContext());
            try {
                interfaceC6503q2 = c0175j.f324t;
                c0174i.f321v = c0206i;
                c0174i.f322w = null;
                c0174i.f319t = 3;
                if (interfaceC6503q2.invoke(c0206i, null, c0174i) != enumC6363a) {
                    c0206i2 = c0206i;
                    c0206i2.releaseIntercepted();
                    return C6289k.f24318a;
                }
            } catch (Throwable th5) {
                th = th5;
                c0206i2 = c0206i;
                c0206i2.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            c0165e = new C0165E(th);
            interfaceC6503q = c0175j.f324t;
            c0174i.f321v = th;
            c0174i.f322w = null;
            c0174i.f319t = 2;
            if (AbstractC0163C.m259a(c0165e, interfaceC6503q, th, c0174i) == enumC6363a) {
                throw th;
            }
        }
        return enumC6363a;
    }
}
