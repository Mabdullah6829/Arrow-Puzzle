package androidx.activity.contextaware;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0035f;
import p011H.AbstractC0243G;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC0035f $co;
    final /* synthetic */ InterfaceC6498l $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC0035f interfaceC0035f, InterfaceC6498l interfaceC6498l) {
        this.$co = interfaceC0035f;
        this.$onContextAvailable = interfaceC6498l;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM372j;
        AbstractC6452k.m12181e(context, "context");
        InterfaceC0035f interfaceC0035f = this.$co;
        try {
            objM372j = this.$onContextAvailable.invoke(context);
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        interfaceC0035f.resumeWith(objM372j);
    }
}
