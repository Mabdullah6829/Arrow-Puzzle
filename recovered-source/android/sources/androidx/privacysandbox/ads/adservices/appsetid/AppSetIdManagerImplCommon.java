package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.arch.core.executor.ExecutorC1058a;
import androidx.core.os.OutcomeReceiverKt;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0039h;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6375e;

/* JADX INFO: loaded from: classes.dex */
public class AppSetIdManagerImplCommon extends AppSetIdManager {
    private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 */
    @InterfaceC6375e(m12158c = "androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon", m12159f = "AppSetIdManagerImplCommon.kt", m12160l = {38}, m12161m = "getAppSetId$suspendImpl")
    public static final class C16111 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16111(InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdManagerImplCommon.getAppSetId$suspendImpl(AppSetIdManagerImplCommon.this, this);
        }
    }

    public AppSetIdManagerImplCommon(android.adservices.appsetid.AppSetIdManager mAppSetIdManager) {
        AbstractC6452k.m12181e(mAppSetIdManager, "mAppSetIdManager");
        this.mAppSetIdManager = mAppSetIdManager;
    }

    private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
        if (appSetId.getScope() == 1) {
            String id = appSetId.getId();
            AbstractC6452k.m12180d(id, "response.id");
            return new AppSetId(id, 1);
        }
        String id2 = appSetId.getId();
        AbstractC6452k.m12180d(id2, "response.id");
        return new AppSetId(id2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object getAppSetId$suspendImpl(AppSetIdManagerImplCommon appSetIdManagerImplCommon, InterfaceC6348c interfaceC6348c) throws Throwable {
        C16111 c16111;
        if (interfaceC6348c instanceof C16111) {
            c16111 = (C16111) interfaceC6348c;
            int i2 = c16111.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16111.label = i2 - Integer.MIN_VALUE;
            } else {
                c16111 = appSetIdManagerImplCommon.new C16111(interfaceC6348c);
            }
        } else {
            c16111 = appSetIdManagerImplCommon.new C16111(interfaceC6348c);
        }
        Object appSetIdAsyncInternal = c16111.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c16111.label;
        if (i3 == 0) {
            AbstractC0243G.m377o(appSetIdAsyncInternal);
            c16111.L$0 = appSetIdManagerImplCommon;
            c16111.label = 1;
            appSetIdAsyncInternal = appSetIdManagerImplCommon.getAppSetIdAsyncInternal(c16111);
            if (appSetIdAsyncInternal == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSetIdManagerImplCommon = (AppSetIdManagerImplCommon) c16111.L$0;
            AbstractC0243G.m377o(appSetIdAsyncInternal);
        }
        return appSetIdManagerImplCommon.convertResponse(AbstractC1612a.m2527b(appSetIdAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAppSetIdAsyncInternal(InterfaceC6348c interfaceC6348c) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        this.mAppSetIdManager.getAppSetId(new ExecutorC1058a(2), OutcomeReceiverKt.asOutcomeReceiver(c0039h));
        Object objM85q = c0039h.m85q();
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM85q;
    }

    @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
    public Object getAppSetId(InterfaceC6348c interfaceC6348c) {
        return getAppSetId$suspendImpl(this, interfaceC6348c);
    }
}
