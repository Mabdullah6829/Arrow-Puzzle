package androidx.work.impl.model;

/* JADX INFO: loaded from: classes.dex */
public class Preference {
    public String mKey;
    public Long mValue;

    public Preference(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        if (!this.mKey.equals(preference.mKey)) {
            return false;
        }
        Long l2 = this.mValue;
        Long l3 = preference.mValue;
        if (l2 != null) {
            return l2.equals(l3);
        }
        return l3 == null;
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l2 = this.mValue;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public Preference(String str, long j2) {
        this.mKey = str;
        this.mValue = Long.valueOf(j2);
    }
}
