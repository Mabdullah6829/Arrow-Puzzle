package p067j;

/* JADX INFO: renamed from: j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6406o extends AbstractC6380A {

    /* JADX INFO: renamed from: a */
    public final C6404m f24521a;

    public C6406o(C6404m c6404m) {
        this.f24521a = c6404m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6380A)) {
            return false;
        }
        AbstractC6380A abstractC6380A = (AbstractC6380A) obj;
        ((C6406o) abstractC6380A).getClass();
        Object obj2 = EnumC6417z.f24554s;
        if (obj2.equals(obj2)) {
            return this.f24521a.equals(((C6406o) abstractC6380A).f24521a);
        }
        return false;
    }

    public final int hashCode() {
        return ((EnumC6417z.f24554s.hashCode() ^ 1000003) * 1000003) ^ this.f24521a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC6417z.f24554s + ", androidClientInfo=" + this.f24521a + "}";
    }
}
