package p067j;

/* JADX INFO: renamed from: j.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6415x extends AbstractC6390K {

    /* JADX INFO: renamed from: a */
    public final EnumC6389J f24552a;

    /* JADX INFO: renamed from: b */
    public final EnumC6388I f24553b;

    public C6415x(EnumC6389J enumC6389J, EnumC6388I enumC6388I) {
        this.f24552a = enumC6389J;
        this.f24553b = enumC6388I;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6390K) {
            AbstractC6390K abstractC6390K = (AbstractC6390K) obj;
            EnumC6389J enumC6389J = this.f24552a;
            if (enumC6389J != null ? enumC6389J.equals(((C6415x) abstractC6390K).f24552a) : ((C6415x) abstractC6390K).f24552a == null) {
                EnumC6388I enumC6388I = this.f24553b;
                if (enumC6388I != null ? enumC6388I.equals(((C6415x) abstractC6390K).f24553b) : ((C6415x) abstractC6390K).f24553b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC6389J enumC6389J = this.f24552a;
        int iHashCode = ((enumC6389J == null ? 0 : enumC6389J.hashCode()) ^ 1000003) * 1000003;
        EnumC6388I enumC6388I = this.f24553b;
        return (enumC6388I != null ? enumC6388I.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f24552a + ", mobileSubtype=" + this.f24553b + "}";
    }
}
