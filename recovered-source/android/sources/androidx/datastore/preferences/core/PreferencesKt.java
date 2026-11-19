package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferencesKt$edit$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m12159f = "Preferences.kt", m12160l = {358}, m12161m = "invokeSuspend")
    public static final class C13632 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $transform;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13632(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$transform = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13632 c13632 = new C13632(this.$transform, interfaceC6348c);
            c13632.L$0 = obj;
            return c13632;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(Preferences preferences, InterfaceC6348c interfaceC6348c) {
            return ((C13632) create(preferences, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                AbstractC0243G.m377o(obj);
                return mutablePreferences;
            }
            AbstractC0243G.m377o(obj);
            MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
            InterfaceC6502p interfaceC6502p = this.$transform;
            this.L$0 = mutablePreferences2;
            this.label = 1;
            return interfaceC6502p.invoke(mutablePreferences2, this) == enumC6363a ? enumC6363a : mutablePreferences2;
        }
    }

    public static final Object edit(DataStore<Preferences> dataStore, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return dataStore.updateData(new C13632(interfaceC6502p, null), interfaceC6348c);
    }
}
