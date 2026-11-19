package p065i;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p011H.AbstractC0242F;
import p063h.C6357c;
import p069k.InterfaceC6432m;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6368a implements InterfaceC6432m {

    /* JADX INFO: renamed from: c */
    public static final String f24427c;

    /* JADX INFO: renamed from: d */
    public static final Set f24428d;

    /* JADX INFO: renamed from: e */
    public static final C6368a f24429e;

    /* JADX INFO: renamed from: f */
    public static final C6368a f24430f;

    /* JADX INFO: renamed from: a */
    public final String f24431a;

    /* JADX INFO: renamed from: b */
    public final String f24432b;

    static {
        String strM358o = AbstractC0242F.m358o("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f24427c = strM358o;
        String strM358o2 = AbstractC0242F.m358o("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strM358o3 = AbstractC0242F.m358o("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f24428d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6357c("proto"), new C6357c("json"))));
        f24429e = new C6368a(strM358o, null);
        f24430f = new C6368a(strM358o2, strM358o3);
    }

    public C6368a(String str, String str2) {
        this.f24431a = str;
        this.f24432b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C6368a m12155a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C6368a(str2, str3);
    }
}
