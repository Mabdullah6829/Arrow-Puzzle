package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgte extends zzgtc {

    /* JADX INFO: renamed from: t */
    public static final int f18171t = Integer.numberOfLeadingZeros(31);

    /* JADX INFO: renamed from: u */
    public static final zzgtf f18172u = new zzgte();

    public zzgte() {
        super("CharMatcher.whitespace()");
    }

    @Override // com.google.android.gms.internal.ads.zzgtf
    /* JADX INFO: renamed from: a */
    public final boolean mo7123a(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f18171t) == c;
    }
}
