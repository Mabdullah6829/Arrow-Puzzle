package androidx.datastore.migrations;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6318z;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        AbstractC6452k.m12181e(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(AbstractC0271e0.m398f("Can't access key outside migration: ", str).toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String key) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        AbstractC6452k.m12180d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC6318z.m12126t(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC6305m.m12114J((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String key, boolean z) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.getBoolean(checkKey(key), z);
    }

    public final float getFloat(String key, float f2) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.getFloat(checkKey(key), f2);
    }

    public final int getInt(String key, int i2) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.getInt(checkKey(key), i2);
    }

    public final long getLong(String key, long j2) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.getLong(checkKey(key), j2);
    }

    public final String getString(String key, String str) {
        AbstractC6452k.m12181e(key, "key");
        return this.prefs.getString(checkKey(key), str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        AbstractC6452k.m12181e(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            return new LinkedHashSet(stringSet);
        }
        return null;
    }
}
