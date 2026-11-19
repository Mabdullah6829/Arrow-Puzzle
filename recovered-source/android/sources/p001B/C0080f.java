package p001B;

/* JADX INFO: renamed from: B.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0080f extends AbstractC0078d {

    /* JADX INFO: renamed from: b */
    public static final int f105b = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: c */
    public static final C0080f f106c = new C0080f("CharMatcher.whitespace()");

    @Override // p001B.AbstractC0076b
    /* JADX INFO: renamed from: q */
    public final boolean mo145q(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f105b) == c;
    }
}
