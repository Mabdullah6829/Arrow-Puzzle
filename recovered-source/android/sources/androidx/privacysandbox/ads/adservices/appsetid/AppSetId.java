package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class AppSetId {
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;

    /* JADX INFO: renamed from: id */
    private final String f2818id;
    private final int scope;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6447f abstractC6447f) {
            this();
        }

        private Companion() {
        }
    }

    public AppSetId(String id, int i2) {
        AbstractC6452k.m12181e(id, "id");
        this.f2818id = id;
        this.scope = i2;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return AbstractC6452k.m12177a(this.f2818id, appSetId.f2818id) && this.scope == appSetId.scope;
    }

    public final String getId() {
        return this.f2818id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return Integer.hashCode(this.scope) + (this.f2818id.hashCode() * 31);
    }

    public String toString() {
        return AbstractC1456a.m2450q(new StringBuilder("AppSetId: id="), this.f2818id, ", scope=", this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
