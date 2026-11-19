package p024O;

import androidx.constraintlayout.widget.C1137R;
import java.util.HashMap;

/* JADX INFO: renamed from: O.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0459b {

    /* JADX INFO: renamed from: c */
    public static final HashMap f785c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f786d;

    /* JADX INFO: renamed from: a */
    public final int f787a;

    /* JADX INFO: renamed from: b */
    public final int[] f788b;

    static {
        int[] iArr = {48, 57};
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, C1137R.styleable.ConstraintSet_transitionPathRotate};
        HashMap map = new HashMap();
        f785c = map;
        map.put("\\d", new C0459b(1, iArr));
        map.put("\\D", new C0459b(-1, iArr));
        map.put("\\s", new C0459b(1, iArr2));
        map.put("\\S", new C0459b(-1, iArr2));
        map.put("\\w", new C0459b(1, iArr3));
        map.put("\\W", new C0459b(-1, iArr3));
        int[] iArr4 = {48, 57, 65, 90, 97, C1137R.styleable.ConstraintSet_transitionPathRotate};
        int[] iArr5 = {65, 90, 97, C1137R.styleable.ConstraintSet_transitionPathRotate};
        int[] iArr6 = {0, 127};
        int[] iArr7 = {9, 9, 32, 32};
        int[] iArr8 = {0, 31, 127, 127};
        int[] iArr9 = {48, 57};
        int[] iArr10 = {33, 126};
        int[] iArr11 = {97, C1137R.styleable.ConstraintSet_transitionPathRotate};
        int[] iArr12 = {32, 126};
        int[] iArr13 = {33, 47, 58, 64, 91, 96, 123, 126};
        int[] iArr14 = {9, 13, 32, 32};
        int[] iArr15 = {65, 90};
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, C1137R.styleable.ConstraintSet_transitionPathRotate};
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        HashMap map2 = new HashMap();
        f786d = map2;
        map2.put("[:alnum:]", new C0459b(1, iArr4));
        map2.put("[:^alnum:]", new C0459b(-1, iArr4));
        map2.put("[:alpha:]", new C0459b(1, iArr5));
        map2.put("[:^alpha:]", new C0459b(-1, iArr5));
        map2.put("[:ascii:]", new C0459b(1, iArr6));
        map2.put("[:^ascii:]", new C0459b(-1, iArr6));
        map2.put("[:blank:]", new C0459b(1, iArr7));
        map2.put("[:^blank:]", new C0459b(-1, iArr7));
        map2.put("[:cntrl:]", new C0459b(1, iArr8));
        map2.put("[:^cntrl:]", new C0459b(-1, iArr8));
        map2.put("[:digit:]", new C0459b(1, iArr9));
        map2.put("[:^digit:]", new C0459b(-1, iArr9));
        map2.put("[:graph:]", new C0459b(1, iArr10));
        map2.put("[:^graph:]", new C0459b(-1, iArr10));
        map2.put("[:lower:]", new C0459b(1, iArr11));
        map2.put("[:^lower:]", new C0459b(-1, iArr11));
        map2.put("[:print:]", new C0459b(1, iArr12));
        map2.put("[:^print:]", new C0459b(-1, iArr12));
        map2.put("[:punct:]", new C0459b(1, iArr13));
        map2.put("[:^punct:]", new C0459b(-1, iArr13));
        map2.put("[:space:]", new C0459b(1, iArr14));
        map2.put("[:^space:]", new C0459b(-1, iArr14));
        map2.put("[:upper:]", new C0459b(1, iArr15));
        map2.put("[:^upper:]", new C0459b(-1, iArr15));
        map2.put("[:word:]", new C0459b(1, iArr16));
        map2.put("[:^word:]", new C0459b(-1, iArr16));
        map2.put("[:xdigit:]", new C0459b(1, iArr17));
        map2.put("[:^xdigit:]", new C0459b(-1, iArr17));
    }

    public C0459b(int i2, int[] iArr) {
        this.f787a = i2;
        this.f788b = iArr;
    }
}
