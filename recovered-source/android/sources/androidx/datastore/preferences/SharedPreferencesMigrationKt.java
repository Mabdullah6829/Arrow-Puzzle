package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p058e0.AbstractC6307o;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigrationKt {
    private static final Set<String> MIGRATE_ALL_KEYS = new LinkedHashSet();

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13581 extends AbstractC6379i implements InterfaceC6503q {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C13581(InterfaceC6348c interfaceC6348c) {
            super(3, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6503q
        public final Object invoke(SharedPreferencesView sharedPreferencesView, Preferences preferences, InterfaceC6348c interfaceC6348c) {
            C13581 c13581 = new C13581(interfaceC6348c);
            c13581.L$0 = sharedPreferencesView;
            c13581.L$1 = preferences;
            return c13581.invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
            Preferences preferences = (Preferences) this.L$1;
            Set<Preferences.Key<?>> setKeySet = preferences.asMap().keySet();
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            Map<String, Object> all = sharedPreferencesView.getAll();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : all.entrySet()) {
                if (!arrayList.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    mutablePreferences.set(PreferencesKeys.booleanKey(str), value);
                } else if (value instanceof Float) {
                    mutablePreferences.set(PreferencesKeys.floatKey(str), value);
                } else if (value instanceof Integer) {
                    mutablePreferences.set(PreferencesKeys.intKey(str), value);
                } else if (value instanceof Long) {
                    mutablePreferences.set(PreferencesKeys.longKey(str), value);
                } else if (value instanceof String) {
                    mutablePreferences.set(PreferencesKeys.stringKey(str), value);
                } else if (value instanceof Set) {
                    Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                    AbstractC6452k.m12179c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    mutablePreferences.set(keyStringSetKey, (Set) value);
                }
            }
            return mutablePreferences.toPreferences();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13591 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ Set<String> $keysToMigrate;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13591(Set<String> set, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$keysToMigrate = set;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C13591 c13591 = new C13591(this.$keysToMigrate, interfaceC6348c);
            c13591.L$0 = obj;
            return c13591;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(Preferences preferences, InterfaceC6348c interfaceC6348c) {
            return ((C13591) create(preferences, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            Set<Preferences.Key<?>> setKeySet = ((Preferences) this.L$0).asMap().keySet();
            ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((Preferences.Key) it.next()).getName());
            }
            boolean z = true;
            if (this.$keysToMigrate != SharedPreferencesMigrationKt.getMIGRATE_ALL_KEYS()) {
                Set<String> set = this.$keysToMigrate;
                if (set == null || !set.isEmpty()) {
                    Iterator<T> it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(sharedPreferencesName, "sharedPreferencesName");
        return SharedPreferencesMigration$default(context, sharedPreferencesName, null, 4, null);
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(InterfaceC6487a interfaceC6487a, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(interfaceC6487a, (Set<String>) set);
    }

    public static final Set<String> getMIGRATE_ALL_KEYS() {
        return MIGRATE_ALL_KEYS;
    }

    private static final InterfaceC6503q getMigrationFunction() {
        return new C13581(null);
    }

    private static final InterfaceC6502p getShouldRunMigration(Set<String> set) {
        return new C13591(set, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(InterfaceC6487a produceSharedPreferences) {
        AbstractC6452k.m12181e(produceSharedPreferences, "produceSharedPreferences");
        return SharedPreferencesMigration$default(produceSharedPreferences, null, 2, null);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(InterfaceC6487a produceSharedPreferences, Set<String> keysToMigrate) {
        AbstractC6452k.m12181e(produceSharedPreferences, "produceSharedPreferences");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(produceSharedPreferences, (Set) null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 2, (AbstractC6447f) null);
        }
        return new SharedPreferencesMigration<>(produceSharedPreferences, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }

    public static /* synthetic */ SharedPreferencesMigration SharedPreferencesMigration$default(Context context, String str, Set set, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            set = MIGRATE_ALL_KEYS;
        }
        return SharedPreferencesMigration(context, str, set);
    }

    public static final SharedPreferencesMigration<Preferences> SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        if (keysToMigrate == MIGRATE_ALL_KEYS) {
            return new SharedPreferencesMigration<>(context, sharedPreferencesName, null, getShouldRunMigration(keysToMigrate), getMigrationFunction(), 4, null);
        }
        return new SharedPreferencesMigration<>(context, sharedPreferencesName, keysToMigrate, getShouldRunMigration(keysToMigrate), getMigrationFunction());
    }
}
