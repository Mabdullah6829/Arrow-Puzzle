package androidx.graphics.shapes;

import androidx.collection.FloatList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import p037U0.AbstractC0846b;
import p058e0.AbstractC6316x;

/* JADX INFO: loaded from: classes.dex */
public final class FloatMappingKt {
    public static final float linearMap(FloatList xValues, FloatList yValues, float f2) {
        AbstractC6452k.m12181e(xValues, "xValues");
        AbstractC6452k.m12181e(yValues, "yValues");
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("Invalid progress: " + f2).toString());
        }
        Iterator it = AbstractC0846b.m1757p(0, xValues._size).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC6316x) it).nextInt();
            int i2 = iNextInt + 1;
            if (progressInRange(f2, xValues.get(iNextInt), xValues.get(i2 % xValues.getSize()))) {
                int size = i2 % xValues.getSize();
                float fPositiveModulo = Utils.positiveModulo(xValues.get(size) - xValues.get(iNextInt), 1.0f);
                return Utils.positiveModulo((Utils.positiveModulo(yValues.get(size) - yValues.get(iNextInt), 1.0f) * (fPositiveModulo < 0.001f ? 0.5f : Utils.positiveModulo(f2 - xValues.get(iNextInt), 1.0f) / fPositiveModulo)) + yValues.get(iNextInt), 1.0f);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final boolean progressInRange(float f2, float f3, float f4) {
        if (f4 >= f3) {
            return f3 <= f2 && f2 <= f4;
        }
        return f2 >= f3 || f2 <= f4;
    }

    public static final void validateProgress(FloatList p2) {
        int i2;
        AbstractC6452k.m12181e(p2, "p");
        Boolean boolValueOf = Boolean.TRUE;
        float[] fArr = p2.content;
        int i3 = p2._size;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 >= i3) {
                break;
            }
            float f2 = fArr[i4];
            if (!boolValueOf.booleanValue() || 0.0f > f2 || f2 > 1.0f) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            i4++;
        }
        if (!boolValueOf.booleanValue()) {
            throw new IllegalArgumentException(("FloatMapping - Progress outside of range: " + FloatList.joinToString$default(p2, null, null, null, 0, null, 31, null)).toString());
        }
        Iterable iterableM1757p = AbstractC0846b.m1757p(1, p2.getSize());
        if ((iterableM1757p instanceof Collection) && ((Collection) iterableM1757p).isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = iterableM1757p.iterator();
            i2 = 0;
            while (it.hasNext()) {
                int iNextInt = ((AbstractC6316x) it).nextInt();
                if (p2.get(iNextInt) < p2.get(iNextInt - 1) && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (i2 <= 1) {
            return;
        }
        throw new IllegalArgumentException(("FloatMapping - Progress wraps more than once: " + FloatList.joinToString$default(p2, null, null, null, 0, null, 31, null)).toString());
    }
}
