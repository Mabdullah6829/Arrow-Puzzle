package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataMigration;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p011H.AbstractC0242F;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p057d0.C6289k;
import p057d0.InterfaceC6281c;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    private final Context context;
    private final Set<String> keySet;
    private final InterfaceC6503q migrate;
    private final String name;
    private final InterfaceC6281c sharedPrefs$delegate;
    private final InterfaceC6502p shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13501 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        public C13501(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13501(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(T t, InterfaceC6348c interfaceC6348c) {
            return ((C13501) create(t, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    @InterfaceC6375e(m12158c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13512 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        public C13512(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13512(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(T t, InterfaceC6348c interfaceC6348c) {
            return ((C13512) create(t, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    @InterfaceC6375e(m12158c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C13523 extends AbstractC6379i implements InterfaceC6502p {
        int label;

        public C13523(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return new C13523(interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(T t, InterfaceC6348c interfaceC6348c) {
            return ((C13523) create(t, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4 */
    public static final class C13534 extends AbstractC6453l implements InterfaceC6487a {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $sharedPreferencesName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13534(Context context, String str) {
            super(0);
            this.$context = context;
            this.$sharedPreferencesName = str;
        }

        @Override // p078p0.InterfaceC6487a
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.$context.getSharedPreferences(this.$sharedPreferencesName, 0);
            AbstractC6452k.m12180d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final boolean deleteSharedPreferences(Context context, String name) {
            AbstractC6452k.m12181e(context, "context");
            AbstractC6452k.m12181e(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 */
    @InterfaceC6375e(m12158c = "androidx.datastore.migrations.SharedPreferencesMigration", m12159f = "SharedPreferencesMigration.android.kt", m12160l = {151}, m12161m = "shouldMigrate")
    public static final class C13541 extends AbstractC6373c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13541(SharedPreferencesMigration<T> sharedPreferencesMigration, InterfaceC6348c interfaceC6348c) {
            super(interfaceC6348c);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC6503q migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        AbstractC6452k.m12181e(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String str) {
        Api24Impl.deleteSharedPreferences(context, str);
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs$delegate.getValue();
    }

    private final File getSharedPrefsBackup(File file) {
        return new File(file.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String str) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), AbstractC0271e0.m414v(str, ".xml"));
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(InterfaceC6348c interfaceC6348c) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
            deleteSharedPreferences(context, str);
        }
        Set<String> set2 = this.keySet;
        if (set2 != null) {
            set2.clear();
        }
        return C6289k.f24318a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(T t, InterfaceC6348c interfaceC6348c) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t, interfaceC6348c);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(T t, InterfaceC6348c interfaceC6348c) throws Throwable {
        C13541 c13541;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (interfaceC6348c instanceof C13541) {
            c13541 = (C13541) interfaceC6348c;
            int i2 = c13541.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c13541.label = i2 - Integer.MIN_VALUE;
            } else {
                c13541 = new C13541(this, interfaceC6348c);
            }
        } else {
            c13541 = new C13541(this, interfaceC6348c);
        }
        Object objInvoke = c13541.result;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c13541.label;
        boolean z = true;
        if (i3 == 0) {
            AbstractC0243G.m377o(objInvoke);
            InterfaceC6502p interfaceC6502p = this.shouldRunMigration;
            c13541.L$0 = this;
            c13541.label = 1;
            objInvoke = interfaceC6502p.invoke(t, c13541);
            if (objInvoke == enumC6363a) {
                return enumC6363a;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (SharedPreferencesMigration) c13541.L$0;
            AbstractC0243G.m377o(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set<String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            Map<String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
            AbstractC6452k.m12180d(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
            if (set == null || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPrefs.contains((String) it.next())) {
                    }
                }
                z = false;
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, InterfaceC6503q migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6452k.m12181e(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC6487a produceSharedPreferences, Set<String> keysToMigrate, InterfaceC6503q migrate) {
        this(produceSharedPreferences, keysToMigrate, (InterfaceC6502p) null, migrate, 4, (AbstractC6447f) null);
        AbstractC6452k.m12181e(produceSharedPreferences, "produceSharedPreferences");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        AbstractC6452k.m12181e(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC6487a produceSharedPreferences, InterfaceC6503q migrate) {
        this(produceSharedPreferences, (Set) null, (InterfaceC6502p) null, migrate, 6, (AbstractC6447f) null);
        AbstractC6452k.m12181e(produceSharedPreferences, "produceSharedPreferences");
        AbstractC6452k.m12181e(migrate, "migrate");
    }

    private SharedPreferencesMigration(InterfaceC6487a interfaceC6487a, Set<String> set, InterfaceC6502p interfaceC6502p, InterfaceC6503q interfaceC6503q, Context context, String str) {
        LinkedHashSet linkedHashSet;
        this.shouldRunMigration = interfaceC6502p;
        this.migrate = interfaceC6503q;
        this.context = context;
        this.name = str;
        this.sharedPrefs$delegate = AbstractC0242F.m357n(interfaceC6487a);
        if (set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS()) {
            linkedHashSet = null;
        } else {
            AbstractC6452k.m12181e(set, "<this>");
            linkedHashSet = new LinkedHashSet(set);
        }
        this.keySet = linkedHashSet;
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC6487a interfaceC6487a, Set set, InterfaceC6502p interfaceC6502p, InterfaceC6503q interfaceC6503q, Context context, String str, int i2, AbstractC6447f abstractC6447f) {
        this(interfaceC6487a, (Set<String>) set, (i2 & 4) != 0 ? new C13501(null) : interfaceC6502p, interfaceC6503q, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(InterfaceC6487a interfaceC6487a, Set set, InterfaceC6502p interfaceC6502p, InterfaceC6503q interfaceC6503q, int i2, AbstractC6447f abstractC6447f) {
        this(interfaceC6487a, (Set<String>) ((i2 & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i2 & 4) != 0 ? new C13512(null) : interfaceC6502p, interfaceC6503q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(InterfaceC6487a produceSharedPreferences, Set<String> keysToMigrate, InterfaceC6502p shouldRunMigration, InterfaceC6503q migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        AbstractC6452k.m12181e(produceSharedPreferences, "produceSharedPreferences");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        AbstractC6452k.m12181e(shouldRunMigration, "shouldRunMigration");
        AbstractC6452k.m12181e(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, InterfaceC6502p interfaceC6502p, InterfaceC6503q interfaceC6503q, int i2, AbstractC6447f abstractC6447f) {
        this(context, str, (i2 & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i2 & 8) != 0 ? new C13523(null) : interfaceC6502p, interfaceC6503q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration(Context context, String sharedPreferencesName, Set<String> keysToMigrate, InterfaceC6502p shouldRunMigration, InterfaceC6503q migrate) {
        this(new C13534(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(sharedPreferencesName, "sharedPreferencesName");
        AbstractC6452k.m12181e(keysToMigrate, "keysToMigrate");
        AbstractC6452k.m12181e(shouldRunMigration, "shouldRunMigration");
        AbstractC6452k.m12181e(migrate, "migrate");
    }
}
