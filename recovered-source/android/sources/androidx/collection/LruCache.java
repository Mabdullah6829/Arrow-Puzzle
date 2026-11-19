package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i2) {
        this.maxSize = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k2, V v) {
        int iSizeOf = sizeOf(k2, v);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        throw new IllegalStateException(("Negative size: " + k2 + '=' + v).toString());
    }

    public V create(K key) {
        AbstractC6452k.m12181e(key, "key");
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean z, K key, V oldValue, V v) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final V get(K key) {
        V v;
        AbstractC6452k.m12181e(key, "key");
        synchronized (this.lock) {
            V v2 = this.map.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.put(key, vCreate);
                    if (v != null) {
                        this.map.put(key, v);
                    } else {
                        this.size += safeSizeOf(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final V put(K key, V value) {
        V vPut;
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            vPut = this.map.put(key, value);
            if (vPut != null) {
                this.size -= safeSizeOf(key, vPut);
            }
        }
        if (vPut != null) {
            entryRemoved(false, key, vPut, value);
        }
        trimToSize(this.maxSize);
        return vPut;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final V remove(K key) {
        V vRemove;
        AbstractC6452k.m12181e(key, "key");
        synchronized (this.lock) {
            vRemove = this.map.remove(key);
            if (vRemove != null) {
                this.size -= safeSizeOf(key, vRemove);
            }
        }
        if (vRemove != null) {
            entryRemoved(false, key, vRemove, null);
        }
        return vRemove;
    }

    public void resize(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i2;
        }
        trimToSize(i2);
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(K key, V value) {
        AbstractC6452k.m12181e(key, "key");
        AbstractC6452k.m12181e(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i2 = this.hitCount;
                int i3 = this.missCount + i2;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void trimToSize(int i2) {
        Object next;
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (this.size < 0 || (this.map.isEmpty() && this.size != 0)) {
                        break;
                    }
                    if (this.size > i2 && !this.map.isEmpty()) {
                        Set<Map.Entry<K, V>> entries = this.map.getEntries();
                        AbstractC6452k.m12181e(entries, "<this>");
                        if (entries instanceof List) {
                            List list = (List) entries;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator<T> it = entries.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.map.remove((K) key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }
}
