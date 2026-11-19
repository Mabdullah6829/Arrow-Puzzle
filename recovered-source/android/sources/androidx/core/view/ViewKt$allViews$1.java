package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6378h;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;
import p089x0.AbstractC6565h;
import p089x0.C6564g;
import p089x0.InterfaceC6563f;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6375e(m12158c = "androidx.core.view.ViewKt$allViews$1", m12159f = "View.kt", m12160l = {410, 412}, m12161m = "invokeSuspend")
public final class ViewKt$allViews$1 extends AbstractC6378h implements InterfaceC6502p {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.$this_allViews = view;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC6348c);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            AbstractC6565h abstractC6565h = (AbstractC6565h) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC6565h;
            this.label = 1;
            abstractC6565h.mo12215a(view, this);
            return enumC6363a;
        }
        C6289k c6289k = C6289k.f24318a;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return c6289k;
        }
        AbstractC6565h abstractC6565h2 = (AbstractC6565h) this.L$0;
        AbstractC0243G.m377o(obj);
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            InterfaceC6563f descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            abstractC6565h2.getClass();
            Iterator it = descendants.iterator();
            C6564g c6564g = (C6564g) abstractC6565h2;
            if (it.hasNext()) {
                c6564g.f24790u = it;
                c6564g.f24788s = 2;
                c6564g.f24791v = this;
                obj2 = enumC6363a;
            } else {
                obj2 = c6289k;
            }
            if (obj2 != enumC6363a) {
                obj2 = c6289k;
            }
            if (obj2 == enumC6363a) {
                return enumC6363a;
            }
        }
        return c6289k;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(AbstractC6565h abstractC6565h, InterfaceC6348c interfaceC6348c) {
        return ((ViewKt$allViews$1) create(abstractC6565h, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
    }
}
