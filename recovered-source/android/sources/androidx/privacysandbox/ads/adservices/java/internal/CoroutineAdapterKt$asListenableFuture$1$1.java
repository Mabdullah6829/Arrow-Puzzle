package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6453l;
import p000A0.InterfaceC0001B;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends AbstractC6453l implements InterfaceC6498l {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ InterfaceC0001B $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, InterfaceC0001B interfaceC0001B) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = interfaceC0001B;
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C6289k.f24318a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void invoke(Throwable th) {
        if (th == null) {
            this.$completer.set((T) this.$this_asListenableFuture.m0h());
        } else if (th instanceof CancellationException) {
            this.$completer.setCancelled();
        } else {
            this.$completer.setException(th);
        }
    }
}
