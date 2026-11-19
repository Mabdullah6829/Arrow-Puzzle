package p063h;

/* JADX INFO: renamed from: h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6356b {

    /* JADX INFO: renamed from: a */
    public final Integer f24413a;

    public C6356b(Integer num) {
        this.f24413a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6356b)) {
            return false;
        }
        C6356b c6356b = (C6356b) obj;
        Integer num = this.f24413a;
        if (num == null) {
            return c6356b.f24413a == null;
        }
        return num.equals(c6356b.f24413a);
    }

    public final int hashCode() {
        Integer num = this.f24413a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f24413a + "}";
    }
}
