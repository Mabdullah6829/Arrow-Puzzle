package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p033S0.AbstractC0620n;
import p078p0.InterfaceC6498l;
import p083s0.InterfaceC6535a;
import p088w0.InterfaceC6555j;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreSingletonDelegate<T> implements InterfaceC6535a {
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final InterfaceC6498l produceMigrations;
    private final InterfaceC0066v scope;
    private final OkioSerializer<T> serializer;

    public DataStoreSingletonDelegate(String fileName, OkioSerializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC6498l produceMigrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(fileName, "fileName");
        AbstractC6452k.m12181e(serializer, "serializer");
        AbstractC6452k.m12181e(produceMigrations, "produceMigrations");
        AbstractC6452k.m12181e(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // p083s0.InterfaceC6535a
    public DataStore<T> getValue(Context thisRef, InterfaceC6555j property) {
        DataStore<T> dataStore;
        AbstractC6452k.m12181e(thisRef, "thisRef");
        AbstractC6452k.m12181e(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(AbstractC0620n.f1360a, this.serializer, null, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this), 4, null);
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    InterfaceC6498l interfaceC6498l = this.produceMigrations;
                    AbstractC6452k.m12180d(applicationContext, "applicationContext");
                    this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, (List) interfaceC6498l.invoke(applicationContext), this.scope);
                }
                dataStore = this.INSTANCE;
                AbstractC6452k.m12178b(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
