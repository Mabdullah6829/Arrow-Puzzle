package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;
import p000A0.C0050m0;
import p000A0.InterfaceC0066v;
import p012H0.C0302e;
import p012H0.ExecutorC0301d;
import p058e0.C6313u;
import p078p0.InterfaceC6498l;
import p083s0.InterfaceC6535a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1 */
    public static final class C13551 extends AbstractC6453l implements InterfaceC6498l {
        public static final C13551 INSTANCE = new C13551();

        public C13551() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final List<DataMigration<Preferences>> invoke(Context it) {
            AbstractC6452k.m12181e(it, "it");
            return C6313u.f24338s;
        }
    }

    public static final InterfaceC6535a preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC6498l produceMigrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(produceMigrations, "produceMigrations");
        AbstractC6452k.m12181e(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static InterfaceC6535a preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, InterfaceC6498l interfaceC6498l, InterfaceC0066v interfaceC0066v, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 4) != 0) {
            interfaceC6498l = C13551.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            C0302e c0302e = AbstractC0007H.f4a;
            interfaceC0066v = AbstractC0069y.m102a(ExecutorC0301d.f608s.plus(new C0050m0()));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, interfaceC6498l, interfaceC0066v);
    }
}
