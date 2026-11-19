package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0066v;
import p078p0.InterfaceC6498l;
import p083s0.InterfaceC6535a;
import p088w0.InterfaceC6555j;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements InterfaceC6535a {
    private volatile DataStore<Preferences> INSTANCE;
    private final ReplaceFileCorruptionHandler<Preferences> corruptionHandler;
    private final Object lock;
    private final String name;
    private final InterfaceC6498l produceMigrations;
    private final InterfaceC0066v scope;

    public PreferenceDataStoreSingletonDelegate(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, InterfaceC6498l produceMigrations, InterfaceC0066v scope) {
        AbstractC6452k.m12181e(name, "name");
        AbstractC6452k.m12181e(produceMigrations, "produceMigrations");
        AbstractC6452k.m12181e(scope, "scope");
        this.name = name;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // p083s0.InterfaceC6535a
    public DataStore<Preferences> getValue(Context thisRef, InterfaceC6555j property) {
        DataStore<Preferences> dataStore;
        AbstractC6452k.m12181e(thisRef, "thisRef");
        AbstractC6452k.m12181e(property, "property");
        DataStore<Preferences> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    PreferenceDataStoreFactory preferenceDataStoreFactory = PreferenceDataStoreFactory.INSTANCE;
                    ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler = this.corruptionHandler;
                    InterfaceC6498l interfaceC6498l = this.produceMigrations;
                    AbstractC6452k.m12180d(applicationContext, "applicationContext");
                    this.INSTANCE = preferenceDataStoreFactory.create(replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) interfaceC6498l.invoke(applicationContext), this.scope, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
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
