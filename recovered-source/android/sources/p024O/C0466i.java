package p024O;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6452k;
import p029Q0.AbstractC0501a;
import p029Q0.C0502b;

/* JADX INFO: renamed from: O.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0466i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f814a;

    /* JADX INFO: renamed from: b */
    public int f815b;

    /* JADX INFO: renamed from: c */
    public Object f816c;

    /* JADX INFO: renamed from: a */
    public int m991a(int i2) {
        CharSequence charSequence = (CharSequence) this.f816c;
        return AbstractC0475r.m1164a((i2 <= 0 || i2 > charSequence.length()) ? -1 : Character.codePointBefore(charSequence, i2), i2 < charSequence.length() ? Character.codePointAt(charSequence, i2) : -1);
    }

    /* JADX INFO: renamed from: b */
    public void m992b(int i2, int i3) {
        int i4 = i3 + i2;
        char[] cArr = (char[]) this.f816c;
        if (cArr.length <= i4) {
            int i5 = i2 * 2;
            if (i4 < i5) {
                i4 = i5;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i4);
            AbstractC6452k.m12180d(cArrCopyOf, "copyOf(...)");
            this.f816c = cArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m993c(int i2) {
        return ((String) this.f816c).substring(i2, this.f815b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m994d(char c) {
        return ((String) this.f816c).charAt(this.f815b) == c;
    }

    /* JADX INFO: renamed from: e */
    public boolean m995e(String str) {
        return m1000j().startsWith(str);
    }

    /* JADX INFO: renamed from: f */
    public boolean m996f() {
        return this.f815b < ((String) this.f816c).length();
    }

    /* JADX INFO: renamed from: g */
    public int m997g() {
        return ((String) this.f816c).codePointAt(this.f815b);
    }

    /* JADX INFO: renamed from: h */
    public int m998h() {
        int iCodePointAt = ((String) this.f816c).codePointAt(this.f815b);
        this.f815b = Character.charCount(iCodePointAt) + this.f815b;
        return iCodePointAt;
    }

    /* JADX INFO: renamed from: i */
    public void m999i() {
        C0502b c0502b = C0502b.f1054c;
        char[] array = (char[]) this.f816c;
        c0502b.getClass();
        AbstractC6452k.m12181e(array, "array");
        synchronized (c0502b) {
            int i2 = c0502b.f1056b;
            if (array.length + i2 < AbstractC0501a.f1053a) {
                c0502b.f1056b = i2 + array.length;
                c0502b.f1055a.addLast(array);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public String m1000j() {
        return ((String) this.f816c).substring(this.f815b);
    }

    /* JADX INFO: renamed from: k */
    public void m1001k(int i2) {
        this.f815b += i2;
    }

    /* JADX INFO: renamed from: l */
    public int m1002l(int i2) {
        if (i2 >= this.f815b) {
            return -8;
        }
        int iCodePointAt = Character.codePointAt((CharSequence) this.f816c, i2);
        return Character.charCount(iCodePointAt) | (iCodePointAt << 3);
    }

    /* JADX INFO: renamed from: m */
    public void m1003m(String text) {
        AbstractC6452k.m12181e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m992b(this.f815b, length);
        text.getChars(0, text.length(), (char[]) this.f816c, this.f815b);
        this.f815b += length;
    }

    public String toString() {
        switch (this.f814a) {
            case 1:
                return m1000j();
            case 2:
                return new String((char[]) this.f816c, 0, this.f815b);
            default:
                return super.toString();
        }
    }

    public C0466i(CharSequence charSequence, int i2) {
        this.f814a = 0;
        this.f816c = charSequence;
        this.f815b = i2;
    }

    public C0466i(String str) {
        this.f814a = 1;
        this.f815b = 0;
        this.f816c = str;
    }
}
