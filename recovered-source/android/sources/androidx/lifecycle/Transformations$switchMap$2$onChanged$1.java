package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$switchMap$2$onChanged$1 extends AbstractC6453l implements InterfaceC6498l {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // p078p0.InterfaceC6498l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m12326invoke(obj);
        return C6289k.f24318a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m12326invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
