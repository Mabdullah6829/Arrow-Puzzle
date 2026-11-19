package p063h;

/* JADX INFO: renamed from: h.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6355a {

    /* JADX INFO: renamed from: a */
    public final Object f24410a;

    /* JADX INFO: renamed from: b */
    public final EnumC6358d f24411b;

    /* JADX INFO: renamed from: c */
    public final C6356b f24412c;

    public C6355a(Object obj, EnumC6358d enumC6358d, C6356b c6356b) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f24410a = obj;
        this.f24411b = enumC6358d;
        this.f24412c = c6356b;
    }

    public final boolean equals(Object obj) {
        C6356b c6356b;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6355a) {
            C6355a c6355a = (C6355a) obj;
            c6355a.getClass();
            Object obj2 = c6355a.f24410a;
            C6356b c6356b2 = c6355a.f24412c;
            if (this.f24410a.equals(obj2) && this.f24411b.equals(c6355a.f24411b) && ((c6356b = this.f24412c) != null ? c6356b.equals(c6356b2) : c6356b2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f24410a.hashCode()) * 1000003) ^ this.f24411b.hashCode()) * 1000003;
        C6356b c6356b = this.f24412c;
        return (iHashCode ^ (c6356b == null ? 0 : c6356b.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f24410a + ", priority=" + this.f24411b + ", productData=" + this.f24412c + ", eventContext=null}";
    }
}
