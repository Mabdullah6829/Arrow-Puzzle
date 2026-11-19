package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0034e0;
import p000A0.C0043j;
import p000A0.InterfaceC0001B;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineAdapterKt {
    public static final <T> ListenableFuture asListenableFuture(InterfaceC0001B interfaceC0001B, Object obj) {
        AbstractC6452k.m12181e(interfaceC0001B, "<this>");
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new C1622a(0, interfaceC0001B, obj));
        AbstractC6452k.m12180d(future, "getFuture { completer ->…      }\n        tag\n    }");
        return future;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(InterfaceC0001B interfaceC0001B, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(interfaceC0001B, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object asListenableFuture$lambda$0(InterfaceC0001B this_asListenableFuture, Object obj, CallbackToFutureAdapter.Completer completer) {
        AbstractC6452k.m12181e(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC6452k.m12181e(completer, "completer");
        ((C0034e0) this_asListenableFuture).m48C(true, new C0043j(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture), 1));
        return obj;
    }
}
