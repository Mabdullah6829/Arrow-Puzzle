package p001B;

/* JADX INFO: renamed from: B.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0077c extends AbstractC0076b {

    /* JADX INFO: renamed from: a */
    public final char f102a;

    public C0077c(char c) {
        this.f102a = c;
    }

    @Override // p001B.AbstractC0076b
    /* JADX INFO: renamed from: q */
    public final boolean mo145q(char c) {
        return c == this.f102a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f102a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
