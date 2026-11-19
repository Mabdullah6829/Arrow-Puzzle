package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import kotlin.jvm.internal.InterfaceC6445d;
import p057d0.InterfaceC6281c;
import p078p0.InterfaceC6487a;
import p088w0.InterfaceC6548c;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC6281c {
    private VM cached;
    private final InterfaceC6487a extrasProducer;
    private final InterfaceC6487a factoryProducer;
    private final InterfaceC6487a storeProducer;
    private final InterfaceC6548c viewModelClass;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1 */
    public static final class C15801 extends AbstractC6453l implements InterfaceC6487a {
        public static final C15801 INSTANCE = new C15801();

        public C15801() {
            super(0);
        }

        @Override // p078p0.InterfaceC6487a
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(InterfaceC6548c viewModelClass, InterfaceC6487a storeProducer, InterfaceC6487a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        AbstractC6452k.m12181e(viewModelClass, "viewModelClass");
        AbstractC6452k.m12181e(storeProducer, "storeProducer");
        AbstractC6452k.m12181e(factoryProducer, "factoryProducer");
    }

    @Override // p057d0.InterfaceC6281c
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(InterfaceC6548c viewModelClass, InterfaceC6487a storeProducer, InterfaceC6487a factoryProducer, InterfaceC6487a extrasProducer) {
        AbstractC6452k.m12181e(viewModelClass, "viewModelClass");
        AbstractC6452k.m12181e(storeProducer, "storeProducer");
        AbstractC6452k.m12181e(factoryProducer, "factoryProducer");
        AbstractC6452k.m12181e(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // p057d0.InterfaceC6281c
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        ViewModelProvider viewModelProvider = new ViewModelProvider((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke());
        InterfaceC6548c interfaceC6548c = this.viewModelClass;
        AbstractC6452k.m12181e(interfaceC6548c, "<this>");
        Class clsMo12175a = ((InterfaceC6445d) interfaceC6548c).mo12175a();
        AbstractC6452k.m12179c(clsMo12175a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        VM vm2 = (VM) viewModelProvider.get(clsMo12175a);
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC6548c interfaceC6548c, InterfaceC6487a interfaceC6487a, InterfaceC6487a interfaceC6487a2, InterfaceC6487a interfaceC6487a3, int i2, AbstractC6447f abstractC6447f) {
        this(interfaceC6548c, interfaceC6487a, interfaceC6487a2, (i2 & 8) != 0 ? C15801.INSTANCE : interfaceC6487a3);
    }
}
