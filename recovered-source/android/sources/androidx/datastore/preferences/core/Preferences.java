package androidx.datastore.preferences.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public abstract class Preferences {

    public static final class Key<T> {
        private final String name;

        public Key(String name) {
            AbstractC6452k.m12181e(name, "name");
            this.name = name;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return AbstractC6452k.m12177a(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        /* JADX INFO: renamed from: to */
        public final Pair<T> m2422to(T t) {
            return new Pair<>(this, t);
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t) {
            AbstractC6452k.m12181e(key, "key");
            this.key = key;
            this.value = t;
        }

        public final Key<T> getKey$datastore_preferences_core_release() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core_release() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        Map<Key<?>, Object> mapAsMap = asMap();
        AbstractC6452k.m12181e(mapAsMap, "<this>");
        return new MutablePreferences(new LinkedHashMap(mapAsMap), false);
    }

    public final Preferences toPreferences() {
        Map<Key<?>, Object> mapAsMap = asMap();
        AbstractC6452k.m12181e(mapAsMap, "<this>");
        return new MutablePreferences(new LinkedHashMap(mapAsMap), true);
    }
}
