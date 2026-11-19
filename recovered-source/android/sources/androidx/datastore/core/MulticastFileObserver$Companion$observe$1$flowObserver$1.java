package androidx.datastore.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p004C0.InterfaceC0152q;
import p011H.AbstractC0242F;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastFileObserver$Companion$observe$1$flowObserver$1 extends AbstractC6453l implements InterfaceC6498l {
    final /* synthetic */ InterfaceC0152q $$this$channelFlow;
    final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MulticastFileObserver$Companion$observe$1$flowObserver$1(File file, InterfaceC0152q interfaceC0152q) {
        super(1);
        this.$file = file;
        this.$$this$channelFlow = interfaceC0152q;
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C6289k.f24318a;
    }

    public final void invoke(String str) {
        if (AbstractC6452k.m12177a(str, this.$file.getName())) {
            AbstractC0242F.m360q(this.$$this$channelFlow, C6289k.f24318a);
        }
    }
}
