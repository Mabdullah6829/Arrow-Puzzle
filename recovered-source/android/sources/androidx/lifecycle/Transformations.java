package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import kotlin.jvm.internal.C6459r;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations {

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$distinctUntilChanged$1 */
    public static final class C15751 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ C6459r $firstTime;
        final /* synthetic */ MediatorLiveData<X> $outputLiveData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15751(MediatorLiveData<X> mediatorLiveData, C6459r c6459r) {
            super(1);
            this.$outputLiveData = mediatorLiveData;
            this.$firstTime = c6459r;
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12322invoke(obj);
            return C6289k.f24318a;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12322invoke(X x) {
            Object value = this.$outputLiveData.getValue();
            if (this.$firstTime.f24633s || ((value == null && x != 0) || !(value == null || value.equals(x)))) {
                this.$firstTime.f24633s = false;
                this.$outputLiveData.setValue(x);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$1 */
    public static final class C15761 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ MediatorLiveData<Y> $result;
        final /* synthetic */ InterfaceC6498l $transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15761(MediatorLiveData<Y> mediatorLiveData, InterfaceC6498l interfaceC6498l) {
            super(1);
            this.$result = mediatorLiveData;
            this.$transform = interfaceC6498l;
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12323invoke(obj);
            return C6289k.f24318a;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12323invoke(X x) {
            this.$result.setValue((Y) this.$transform.invoke(x));
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.Transformations$map$2 */
    public static final class C15772 extends AbstractC6453l implements InterfaceC6498l {
        final /* synthetic */ Function $mapFunction;
        final /* synthetic */ MediatorLiveData $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15772(MediatorLiveData mediatorLiveData, Function function) {
            super(1);
            this.$result = mediatorLiveData;
            this.$mapFunction = function;
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12324invoke(obj);
            return C6289k.f24318a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m12324invoke(Object obj) {
            this.$result.setValue(this.$mapFunction.apply(obj));
        }
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        AbstractC6452k.m12181e(liveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        C6459r c6459r = new C6459r();
        c6459r.f24633s = true;
        if (liveData.isInitialized()) {
            mediatorLiveData.setValue(liveData.getValue());
            c6459r.f24633s = false;
        }
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C15751(mediatorLiveData, c6459r)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, InterfaceC6498l transform) {
        AbstractC6452k.m12181e(liveData, "<this>");
        AbstractC6452k.m12181e(transform, "transform");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C15761(mediatorLiveData, transform)));
        return mediatorLiveData;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final InterfaceC6498l transform) {
        AbstractC6452k.m12181e(liveData, "<this>");
        AbstractC6452k.m12181e(transform, "transform");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer<X>() { // from class: androidx.lifecycle.Transformations.switchMap.1
            private LiveData<Y> liveData;

            public final LiveData<Y> getLiveData() {
                return this.liveData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.lifecycle.Observer
            public void onChanged(X x) {
                LiveData<Y> liveData2 = (LiveData) transform.invoke(x);
                Object obj = this.liveData;
                if (obj == liveData2) {
                    return;
                }
                if (obj != null) {
                    MediatorLiveData<Y> mediatorLiveData2 = mediatorLiveData;
                    AbstractC6452k.m12178b(obj);
                    mediatorLiveData2.removeSource(obj);
                }
                this.liveData = liveData2;
                if (liveData2 != 0) {
                    MediatorLiveData<Y> mediatorLiveData3 = mediatorLiveData;
                    AbstractC6452k.m12178b(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$1$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(LiveData<Y> liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }

    public static final /* synthetic */ LiveData map(LiveData liveData, Function mapFunction) {
        AbstractC6452k.m12181e(liveData, "<this>");
        AbstractC6452k.m12181e(mapFunction, "mapFunction");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new C15772(mediatorLiveData, mapFunction)));
        return mediatorLiveData;
    }

    public static final /* synthetic */ LiveData switchMap(LiveData liveData, final Function switchMapFunction) {
        AbstractC6452k.m12181e(liveData, "<this>");
        AbstractC6452k.m12181e(switchMapFunction, "switchMapFunction");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(liveData, new Observer() { // from class: androidx.lifecycle.Transformations.switchMap.2
            private LiveData liveData;

            public final LiveData getLiveData() {
                return this.liveData;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(Object obj) {
                LiveData liveData2 = (LiveData) switchMapFunction.apply(obj);
                LiveData liveData3 = this.liveData;
                if (liveData3 == liveData2) {
                    return;
                }
                if (liveData3 != null) {
                    MediatorLiveData mediatorLiveData2 = mediatorLiveData;
                    AbstractC6452k.m12178b(liveData3);
                    mediatorLiveData2.removeSource(liveData3);
                }
                this.liveData = liveData2;
                if (liveData2 != null) {
                    MediatorLiveData mediatorLiveData3 = mediatorLiveData;
                    AbstractC6452k.m12178b(liveData2);
                    mediatorLiveData3.addSource(liveData2, new Transformations$sam$androidx_lifecycle_Observer$0(new Transformations$switchMap$2$onChanged$1(mediatorLiveData)));
                }
            }

            public final void setLiveData(LiveData liveData2) {
                this.liveData = liveData2;
            }
        });
        return mediatorLiveData;
    }
}
