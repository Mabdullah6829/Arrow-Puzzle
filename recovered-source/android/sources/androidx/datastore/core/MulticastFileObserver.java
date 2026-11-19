package androidx.datastore.core;

import android.os.FileObserver;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.InterfaceC0008I;
import p004C0.EnumC0136a;
import p006D0.C0169d;
import p006D0.InterfaceC0170e;
import p062g0.C6354i;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class MulticastFileObserver extends FileObserver {
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final Map<String, MulticastFileObserver> fileObservers = new LinkedHashMap();
    private final CopyOnWriteArrayList<InterfaceC6498l> delegates;
    private final String path;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void observe$lambda$4(String str, InterfaceC6498l observer) {
            AbstractC6452k.m12181e(observer, "$observer");
            synchronized (MulticastFileObserver.LOCK) {
                Companion companion = MulticastFileObserver.Companion;
                MulticastFileObserver multicastFileObserver = companion.getFileObservers$datastore_core_release().get(str);
                if (multicastFileObserver != null) {
                    multicastFileObserver.delegates.remove(observer);
                    if (multicastFileObserver.delegates.isEmpty()) {
                        companion.getFileObservers$datastore_core_release().remove(str);
                        multicastFileObserver.stopWatching();
                    }
                }
            }
        }

        public final Map<String, MulticastFileObserver> getFileObservers$datastore_core_release() {
            return MulticastFileObserver.fileObservers;
        }

        public final InterfaceC0170e observe(File file) {
            AbstractC6452k.m12181e(file, "file");
            return new C0169d(new MulticastFileObserver$Companion$observe$1(file, null), C6354i.f24409s, -2, EnumC0136a.f215s);
        }

        public final void removeAllObservers$datastore_core_release() {
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Iterator<T> it = MulticastFileObserver.Companion.getFileObservers$datastore_core_release().values().iterator();
                    while (it.hasNext()) {
                        ((MulticastFileObserver) it.next()).stopWatching();
                    }
                    MulticastFileObserver.Companion.getFileObservers$datastore_core_release().clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC0008I observe(File file, final InterfaceC6498l interfaceC6498l) {
            final String key = file.getCanonicalFile().getPath();
            synchronized (MulticastFileObserver.LOCK) {
                try {
                    Map<String, MulticastFileObserver> fileObservers$datastore_core_release = MulticastFileObserver.Companion.getFileObservers$datastore_core_release();
                    AbstractC6452k.m12180d(key, "key");
                    MulticastFileObserver multicastFileObserver = fileObservers$datastore_core_release.get(key);
                    if (multicastFileObserver == null) {
                        multicastFileObserver = new MulticastFileObserver(key, null);
                        fileObservers$datastore_core_release.put(key, multicastFileObserver);
                    }
                    MulticastFileObserver multicastFileObserver2 = multicastFileObserver;
                    multicastFileObserver2.delegates.add(interfaceC6498l);
                    if (multicastFileObserver2.delegates.size() == 1) {
                        multicastFileObserver2.startWatching();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new InterfaceC0008I() { // from class: androidx.datastore.core.a
                @Override // p000A0.InterfaceC0008I
                public final void dispose() {
                    MulticastFileObserver.Companion.observe$lambda$4(key, interfaceC6498l);
                }
            };
        }
    }

    public /* synthetic */ MulticastFileObserver(String str, AbstractC6447f abstractC6447f) {
        this(str);
    }

    public final String getPath() {
        return this.path;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) {
        Iterator<T> it = this.delegates.iterator();
        while (it.hasNext()) {
            ((InterfaceC6498l) it.next()).invoke(str);
        }
    }

    private MulticastFileObserver(String str) {
        super(str, 128);
        this.path = str;
        this.delegates = new CopyOnWriteArrayList<>();
    }
}
