package androidx.datastore.preferences.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.AbstractC6318z;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.MutablePreferences$toString$1 */
    public static final class C13601 extends AbstractC6453l implements InterfaceC6498l {
        public static final C13601 INSTANCE = new C13601();

        public C13601() {
            super(1);
        }

        @Override // p078p0.InterfaceC6498l
        public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
            String strValueOf;
            AbstractC6452k.m12181e(entry, "entry");
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                AbstractC6452k.m12181e(bArr, "<this>");
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "[");
                int i2 = 0;
                for (byte b : bArr) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    sb.append((CharSequence) String.valueOf((int) b));
                }
                sb.append((CharSequence) "]");
                strValueOf = sb.toString();
            } else {
                strValueOf = String.valueOf(entry.getValue());
            }
            return "  " + entry.getKey().getName() + " = " + strValueOf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public Map<Preferences.Key<?>, Object> asMap() {
        C6283e c6283e;
        Set<Map.Entry<Preferences.Key<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        int iM12126t = AbstractC6318z.m12126t(AbstractC6307o.m12123u(setEntrySet, 10));
        if (iM12126t < 16) {
            iM12126t = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM12126t);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC6452k.m12180d(bArrCopyOf, "copyOf(this, size)");
                c6283e = new C6283e(key, bArrCopyOf);
            } else {
                c6283e = new C6283e(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c6283e.f24308s, c6283e.f24309t);
        }
        return Actual_jvmAndroidKt.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(Preferences.Key<T> key) {
        AbstractC6452k.m12181e(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object obj) {
        boolean zM12177a;
        if (!(obj instanceof MutablePreferences)) {
            return false;
        }
        MutablePreferences mutablePreferences = (MutablePreferences) obj;
        Map<Preferences.Key<?>, Object> map = mutablePreferences.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<Preferences.Key<?>, Object> map2 = mutablePreferences.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<Preferences.Key<?>, Object> entry : map2.entrySet()) {
            Object obj2 = this.preferencesMap.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zM12177a = AbstractC6452k.m12177a(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zM12177a = true;
                } else {
                    zM12177a = false;
                }
            } else {
                zM12177a = false;
            }
            if (!zM12177a) {
                return false;
            }
        }
        return true;
    }

    public final void freeze$datastore_preferences_core_release() {
        this.frozen.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(Preferences.Key<T> key) {
        AbstractC6452k.m12181e(key, "key");
        T t = (T) this.preferencesMap.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        AbstractC6452k.m12180d(t2, "copyOf(this, size)");
        return t2;
    }

    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core_release() {
        return this.preferencesMap;
    }

    public int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void minusAssign(Preferences.Key<?> key) {
        AbstractC6452k.m12181e(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        remove(key);
    }

    public final void plusAssign(Preferences prefs) {
        AbstractC6452k.m12181e(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(Preferences.Pair<?>... pairs) {
        AbstractC6452k.m12181e(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core_release();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core_release(pair.getKey$datastore_preferences_core_release(), pair.getValue$datastore_preferences_core_release());
        }
    }

    public final <T> T remove(Preferences.Key<T> key) {
        AbstractC6452k.m12181e(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(Preferences.Key<T> key, T t) {
        AbstractC6452k.m12181e(key, "key");
        setUnchecked$datastore_preferences_core_release(key, t);
    }

    public final void setUnchecked$datastore_preferences_core_release(Preferences.Key<?> key, Object obj) {
        AbstractC6452k.m12181e(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        if (obj == null) {
            remove(key);
            return;
        }
        if (obj instanceof Set) {
            this.preferencesMap.put(key, Actual_jvmAndroidKt.immutableCopyOfSet((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.preferencesMap.put(key, obj);
            return;
        }
        Map<Preferences.Key<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6452k.m12180d(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return AbstractC6305m.m12105A(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", C13601.INSTANCE, 24);
    }

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i2, AbstractC6447f abstractC6447f) {
        this((i2 & 1) != 0 ? new LinkedHashMap() : map, (i2 & 2) != 0 ? true : z);
    }

    public final void plusAssign(Preferences.Pair<?> pair) {
        AbstractC6452k.m12181e(pair, "pair");
        checkNotFrozen$datastore_preferences_core_release();
        putAll(pair);
    }

    public MutablePreferences(Map<Preferences.Key<?>, Object> preferencesMap, boolean z) {
        AbstractC6452k.m12181e(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new AtomicBoolean(z);
    }
}
