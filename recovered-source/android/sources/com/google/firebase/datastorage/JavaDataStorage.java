package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6444c;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6463v;
import kotlin.jvm.internal.C6457p;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0066v;
import p006D0.AbstractC0163C;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p058e0.C6314v;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p083s0.InterfaceC6535a;
import p088w0.InterfaceC6555j;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDataStorage {
    static final /* synthetic */ InterfaceC6555j[] $$delegatedProperties;
    private final Context context;
    private final DataStore<Preferences> dataStore;
    private final InterfaceC6535a dataStore$delegate;
    private final ThreadLocal<Boolean> editLock;
    private final String name;

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$contains$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$contains$1", m12159f = "JavaDataStorage.kt", m12160l = {124}, m12161m = "invokeSuspend")
    public static final class C57051 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ Preferences.Key<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57051(Preferences.Key<T> key, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$key = key;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return JavaDataStorage.this.new C57051(this.$key, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C57051) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0170e data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = AbstractC0163C.m263e(data, this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            Preferences preferences = (Preferences) obj;
            return Boolean.valueOf(preferences != null ? preferences.contains(this.$key) : false);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1", m12159f = "JavaDataStorage.kt", m12160l = {220}, m12161m = "invokeSuspend")
    public static final class C57061 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6498l $transform;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$editSync$1$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$editSync$1$1", m12159f = "JavaDataStorage.kt", m12160l = {}, m12161m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC6379i implements InterfaceC6502p {
            final /* synthetic */ InterfaceC6498l $transform;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
                super(2, interfaceC6348c);
                this.$transform = interfaceC6498l;
            }

            @Override // p066i0.AbstractC6371a
            public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, interfaceC6348c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p078p0.InterfaceC6502p
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC6348c interfaceC6348c) {
                return ((AnonymousClass1) create(mutablePreferences, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                this.$transform.invoke((MutablePreferences) this.L$0);
                return C6289k.f24318a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57061(InterfaceC6498l interfaceC6498l, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$transform = interfaceC6498l;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return JavaDataStorage.this.new C57061(this.$transform, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C57061) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    AbstractC0243G.m377o(obj);
                    Object obj2 = JavaDataStorage.this.editLock.get();
                    Boolean bool = Boolean.TRUE;
                    if (AbstractC6452k.m12177a(obj2, bool)) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    JavaDataStorage.this.editLock.set(bool);
                    DataStore dataStore = JavaDataStorage.this.dataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, null);
                    this.label = 1;
                    obj = PreferencesKt.edit(dataStore, anonymousClass1, this);
                    if (obj == enumC6363a) {
                        return enumC6363a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0243G.m377o(obj);
                }
                Preferences preferences = (Preferences) obj;
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                return preferences;
            } catch (Throwable th) {
                JavaDataStorage.this.editLock.set(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getAllSync$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$getAllSync$1", m12159f = "JavaDataStorage.kt", m12160l = {170}, m12161m = "invokeSuspend")
    public static final class C57071 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        public C57071(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return JavaDataStorage.this.new C57071(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C57071) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map<Preferences.Key<?>, Object> mapAsMap;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0170e data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = AbstractC0163C.m263e(data, this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (mapAsMap = preferences.asMap()) == null) ? C6314v.f24339s : mapAsMap;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$getSync$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$getSync$1", m12159f = "JavaDataStorage.kt", m12160l = {104}, m12161m = "invokeSuspend")
    public static final class C57081 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ T $defaultValue;
        final /* synthetic */ Preferences.Key<T> $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57081(Preferences.Key<T> key, T t, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$key = key;
            this.$defaultValue = t;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return JavaDataStorage.this.new C57081(this.$key, this.$defaultValue, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C57081) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0170e data = JavaDataStorage.this.dataStore.getData();
                this.label = 1;
                obj = AbstractC0163C.m263e(data, this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            Preferences preferences = (Preferences) obj;
            return (preferences == null || (obj2 = preferences.get(this.$key)) == null) ? this.$defaultValue : obj2;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1 */
    @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1", m12159f = "JavaDataStorage.kt", m12160l = {145}, m12161m = "invokeSuspend")
    public static final class C57091 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.google.firebase.datastorage.JavaDataStorage$putSync$1$1, reason: invalid class name */
        @InterfaceC6375e(m12158c = "com.google.firebase.datastorage.JavaDataStorage$putSync$1$1", m12159f = "JavaDataStorage.kt", m12160l = {}, m12161m = "invokeSuspend")
        public static final class AnonymousClass1 extends AbstractC6379i implements InterfaceC6502p {
            final /* synthetic */ Preferences.Key<T> $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<T> key, T t, InterfaceC6348c interfaceC6348c) {
                super(2, interfaceC6348c);
                this.$key = key;
                this.$value = t;
            }

            @Override // p066i0.AbstractC6371a
            public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, interfaceC6348c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p078p0.InterfaceC6502p
            public final Object invoke(MutablePreferences mutablePreferences, InterfaceC6348c interfaceC6348c) {
                return ((AnonymousClass1) create(mutablePreferences, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
            }

            @Override // p066i0.AbstractC6371a
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                ((MutablePreferences) this.L$0).set(this.$key, this.$value);
                return C6289k.f24318a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C57091(Preferences.Key<T> key, T t, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$key = key;
            this.$value = t;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return JavaDataStorage.this.new C57091(this.$key, this.$value, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C57091) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
                return obj;
            }
            AbstractC0243G.m377o(obj);
            DataStore dataStore = JavaDataStorage.this.dataStore;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, null);
            this.label = 1;
            Object objEdit = PreferencesKt.edit(dataStore, anonymousClass1, this);
            return objEdit == enumC6363a ? enumC6363a : objEdit;
        }
    }

    static {
        C6457p c6457p = new C6457p(AbstractC6444c.NO_RECEIVER, JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        AbstractC6463v.f24637a.getClass();
        $$delegatedProperties = new InterfaceC6555j[]{c6457p};
    }

    public JavaDataStorage(Context context, String name) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(name, "name");
        this.context = context;
        this.name = name;
        this.editLock = new ThreadLocal<>();
        final int i2 = 0;
        final int i3 = 1;
        this.dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(name, new ReplaceFileCorruptionHandler(new InterfaceC6498l(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ JavaDataStorage f23641t;

            {
                this.f23641t = this;
            }

            @Override // p078p0.InterfaceC6498l
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f23641t, (CorruptionException) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f23641t, (Context) obj);
                }
            }
        }), new InterfaceC6498l(this) { // from class: com.google.firebase.datastorage.a

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ JavaDataStorage f23641t;

            {
                this.f23641t = this;
            }

            @Override // p078p0.InterfaceC6498l
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        return JavaDataStorage.dataStore_delegate$lambda$0(this.f23641t, (CorruptionException) obj);
                    default:
                        return JavaDataStorage.dataStore_delegate$lambda$1(this.f23641t, (Context) obj);
                }
            }
        }, null, 8, null);
        this.dataStore = getDataStore(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences dataStore_delegate$lambda$0(JavaDataStorage javaDataStorage, CorruptionException ex) {
        AbstractC6452k.m12181e(ex, "ex");
        Log.w(AbstractC6463v.m12189a(JavaDataStorage.class).m12176b(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), ex);
        return PreferencesFactory.createEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List dataStore_delegate$lambda$1(JavaDataStorage javaDataStorage, Context it) {
        AbstractC6452k.m12181e(it, "it");
        return AbstractC0846b.m1752k(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(it, javaDataStorage.name, null, 4, null));
    }

    private final DataStore<Preferences> getDataStore(Context context) {
        return (DataStore) this.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public final <T> boolean contains(Preferences.Key<T> key) {
        AbstractC6452k.m12181e(key, "key");
        return ((Boolean) AbstractC0069y.m115n(new C57051(key, null))).booleanValue();
    }

    public final Preferences editSync(InterfaceC6498l transform) {
        AbstractC6452k.m12181e(transform, "transform");
        return (Preferences) AbstractC0069y.m115n(new C57061(transform, null));
    }

    public final Map<Preferences.Key<?>, Object> getAllSync() {
        return (Map) AbstractC0069y.m115n(new C57071(null));
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    public final <T> T getSync(Preferences.Key<T> key, T t) {
        AbstractC6452k.m12181e(key, "key");
        return (T) AbstractC0069y.m115n(new C57081(key, t, null));
    }

    public final <T> Preferences putSync(Preferences.Key<T> key, T t) {
        AbstractC6452k.m12181e(key, "key");
        return (Preferences) AbstractC0069y.m115n(new C57091(key, t, null));
    }
}
