package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.jvm.internal.AbstractC6452k;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m12159f = "PreferenceDataStoreFactory.kt", m12160l = {94}, m12161m = "invokeSuspend")
    public static final class C13612 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13612(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$transform = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13612 c13612 = new C13612(this.$transform, interfaceC6348c);
            c13612.L$0 = obj;
            return c13612;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(Preferences preferences, InterfaceC6348c interfaceC6348c) {
            return ((C13612) create(preferences, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                Preferences preferences = (Preferences) this.L$0;
                InterfaceC6502p interfaceC6502p = this.$transform;
                this.label = 1;
                obj = interfaceC6502p.invoke(preferences, this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            Preferences preferences2 = (Preferences) obj;
            AbstractC6452k.m12179c(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
            return preferences2;
        }
    }

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC0170e getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return this.delegate.updateData(new C13612(interfaceC6502p, null), interfaceC6348c);
    }
}
