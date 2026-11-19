package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
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
public final class DataStoreDelegateKt {

    /* JADX INFO: renamed from: androidx.datastore.DataStoreDelegateKt$dataStore$1 */
    public static final class C12981 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12981 INSTANCE = new C12981();

        public C12981() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final List invoke(Context it) {
            AbstractC6452k.m12181e(it, "it");
            return C6313u.f24338s;
        }
    }

    public static final <T> InterfaceC6535a dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC6498l produceMigrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(fileName, "fileName");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(produceMigrations, "produceMigrations");
        AbstractC6452k.m12181e(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static InterfaceC6535a dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, InterfaceC6498l interfaceC6498l, InterfaceC0066v interfaceC0066v, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC6498l = C12981.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            C0302e c0302e = AbstractC0007H.f4a;
            interfaceC0066v = AbstractC0069y.m102a(ExecutorC0301d.f608s.plus(new C0050m0()));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, interfaceC6498l, interfaceC0066v);
    }
}
