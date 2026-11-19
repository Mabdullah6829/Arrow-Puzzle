package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6447f;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p087v0.C6545d;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatList {
    public int _size;
    public float[] content;

    public /* synthetic */ FloatList(int i2, AbstractC6447f abstractC6447f) {
        this(i2);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i3 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i3 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return floatList.joinToString(charSequence, charSequence2, charSequence6, i2, charSequence5);
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean contains(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (fArr[i3] == f2) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(FloatList elements) {
        AbstractC6452k.m12181e(elements, "elements");
        C6545d c6545dM1757p = AbstractC0846b.m1757p(0, elements._size);
        int i2 = c6545dM1757p.f24767s;
        int i3 = c6545dM1757p.f24768t;
        if (i2 > i3) {
            return true;
        }
        while (contains(elements.get(i2))) {
            if (i2 == i3) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final float elementAt(int i2) {
        if (i2 >= 0 && i2 < this._size) {
            return this.content[i2];
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final float elementAtOrElse(int i2, InterfaceC6498l defaultValue) {
        AbstractC6452k.m12181e(defaultValue, "defaultValue");
        return (i2 < 0 || i2 >= this._size) ? ((Number) defaultValue.invoke(Integer.valueOf(i2))).floatValue() : this.content[i2];
    }

    public boolean equals(Object obj) {
        if (obj instanceof FloatList) {
            FloatList floatList = (FloatList) obj;
            int i2 = floatList._size;
            int i3 = this._size;
            if (i2 == i3) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                C6545d c6545dM1757p = AbstractC0846b.m1757p(0, i3);
                int i4 = c6545dM1757p.f24767s;
                int i5 = c6545dM1757p.f24768t;
                if (i4 > i5) {
                    return true;
                }
                while (fArr[i4] == fArr2[i4]) {
                    if (i4 == i5) {
                        return true;
                    }
                    i4++;
                }
                return false;
            }
        }
        return false;
    }

    public final float first() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            r2 = (R) operation.invoke(r2, Float.valueOf(fArr[i3]));
        }
        return r2;
    }

    public final <R> R foldIndexed(R r2, InterfaceC6503q operation) {
        AbstractC6452k.m12181e(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            R r3 = r2;
            r2 = (R) operation.invoke(Integer.valueOf(i3), r3, Float.valueOf(fArr[i3]));
        }
        return r2;
    }

    public final <R> R foldRight(R r2, InterfaceC6502p operation) {
        AbstractC6452k.m12181e(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return r2;
            }
            r2 = (R) operation.invoke(Float.valueOf(fArr[i2]), r2);
        }
    }

    public final <R> R foldRightIndexed(R r2, InterfaceC6503q operation) {
        AbstractC6452k.m12181e(operation, "operation");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return r2;
            }
            r2 = (R) operation.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]), r2);
        }
    }

    public final void forEach(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachIndexed(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            block.invoke(Integer.valueOf(i3), Float.valueOf(fArr[i3]));
        }
    }

    public final void forEachReversed(InterfaceC6498l block) {
        AbstractC6452k.m12181e(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i2]));
            }
        }
    }

    public final void forEachReversedIndexed(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        float[] fArr = this.content;
        int i2 = this._size;
        while (true) {
            i2--;
            if (-1 >= i2) {
                return;
            } else {
                block.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
            }
        }
    }

    public final float get(int i2) {
        if (i2 >= 0 && i2 < this._size) {
            return this.content[i2];
        }
        StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "Index ", " must be in 0..");
        sbM404l.append(this._size - 1);
        throw new IndexOutOfBoundsException(sbM404l.toString());
    }

    public final C6545d getIndices() {
        return AbstractC0846b.m1757p(0, this._size);
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i2 = this._size;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += Float.hashCode(fArr[i3]) * 31;
        }
        return iHashCode;
    }

    public final int indexOf(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (f2 == fArr[i3]) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfFirst(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i3]))).booleanValue()) {
                return i3;
            }
        }
        return -1;
    }

    public final int indexOfLast(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
        } while (!((Boolean) predicate.invoke(Float.valueOf(fArr[i2]))).booleanValue());
        return i2;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final float last() {
        if (isEmpty()) {
            throw new NoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(float f2) {
        float[] fArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 >= i2) {
                return -1;
            }
        } while (fArr[i2] != f2);
        return i2;
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean reversedAny(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        for (int i2 = this._size - 1; -1 < i2; i2--) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i2]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    private FloatList(int i2) {
        this.content = i2 == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i2];
    }

    public final boolean any(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i3]))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int count(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (((Boolean) predicate.invoke(Float.valueOf(fArr[i4]))).booleanValue()) {
                i3++;
            }
        }
        return i3;
    }

    public final String joinToString(CharSequence separator) {
        AbstractC6452k.m12181e(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final float first(InterfaceC6498l predicate) {
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (((Boolean) predicate.invoke(Float.valueOf(f2))).booleanValue()) {
                return f2;
            }
        }
        throw new NoSuchElementException("FloatList contains no element matching the predicate.");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence charSequence, InterfaceC6498l interfaceC6498l, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                separator = ", ";
            }
            if ((i3 & 2) != 0) {
                prefix = "";
            }
            if ((i3 & 4) != 0) {
                postfix = "";
            }
            if ((i3 & 8) != 0) {
                i2 = -1;
            }
            if ((i3 & 16) != 0) {
                charSequence = "...";
            }
            AbstractC6452k.m12181e(separator, "separator");
            AbstractC6452k.m12181e(prefix, "prefix");
            AbstractC6452k.m12181e(postfix, "postfix");
            StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "truncated", interfaceC6498l, "transform", prefix);
            float[] fArr = floatList.content;
            int i4 = floatList._size;
            for (int i5 = 0; i5 < i4; i5++) {
                float f2 = fArr[i5];
                if (i5 == i2) {
                    sbM406n.append(charSequence);
                    String string = sbM406n.toString();
                    AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                    return string;
                }
                if (i5 != 0) {
                    sbM406n.append(separator);
                }
                sbM406n.append((CharSequence) interfaceC6498l.invoke(Float.valueOf(f2)));
            }
            sbM406n.append(postfix);
            String string2 = sbM406n.toString();
            AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
            return string2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, 16, null);
    }

    public final float last(InterfaceC6498l predicate) {
        float f2;
        AbstractC6452k.m12181e(predicate, "predicate");
        float[] fArr = this.content;
        int i2 = this._size;
        do {
            i2--;
            if (-1 < i2) {
                f2 = fArr[i2];
            } else {
                throw new NoSuchElementException("FloatList contains no element matching the predicate.");
            }
        } while (!((Boolean) predicate.invoke(Float.valueOf(f2))).booleanValue());
        return f2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, CharSequence charSequence2) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM405m = AbstractC0271e0.m405m(charSequence, "postfix", charSequence2, "truncated", prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            float f2 = fArr[i4];
            if (i4 == i2) {
                sbM405m.append(charSequence2);
                String string = sbM405m.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i4 != 0) {
                sbM405m.append(separator);
            }
            sbM405m.append(f2);
        }
        sbM405m.append(charSequence);
        String string2 = sbM405m.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        AbstractC6452k.m12181e(postfix, "postfix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "truncated", interfaceC6498l, "transform", prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            float f2 = fArr[i4];
            if (i4 == i2) {
                sbM406n.append(charSequence);
                String string = sbM406n.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i4 != 0) {
                sbM406n.append(separator);
            }
            sbM406n.append((CharSequence) interfaceC6498l.invoke(Float.valueOf(f2)));
        }
        sbM406n.append(postfix);
        String string2 = sbM406n.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, int i2, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "postfix", interfaceC6498l, "transform", prefix);
        float[] fArr = this.content;
        int i3 = this._size;
        for (int i4 = 0; i4 < i3; i4++) {
            float f2 = fArr[i4];
            if (i4 == i2) {
                sbM406n.append((CharSequence) "...");
                String string = sbM406n.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i4 != 0) {
                sbM406n.append(separator);
            }
            sbM406n.append((CharSequence) interfaceC6498l.invoke(Float.valueOf(f2)));
        }
        sbM406n.append(charSequence);
        String string2 = sbM406n.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(prefix, "prefix");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "postfix", interfaceC6498l, "transform", prefix);
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (i3 == -1) {
                sbM406n.append((CharSequence) "...");
                String string = sbM406n.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i3 != 0) {
                sbM406n.append(separator);
            }
            sbM406n.append((CharSequence) interfaceC6498l.invoke(Float.valueOf(f2)));
        }
        sbM406n.append(charSequence);
        String string2 = sbM406n.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(CharSequence separator, CharSequence charSequence, InterfaceC6498l interfaceC6498l) {
        AbstractC6452k.m12181e(separator, "separator");
        StringBuilder sbM406n = AbstractC0271e0.m406n(charSequence, "prefix", interfaceC6498l, "transform", charSequence);
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (i3 == -1) {
                sbM406n.append((CharSequence) "...");
                String string = sbM406n.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i3 != 0) {
                sbM406n.append(separator);
            }
            sbM406n.append((CharSequence) interfaceC6498l.invoke(Float.valueOf(f2)));
        }
        sbM406n.append((CharSequence) "");
        String string2 = sbM406n.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(CharSequence separator, InterfaceC6498l transform) {
        AbstractC6452k.m12181e(separator, "separator");
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i3 != 0) {
                sb.append(separator);
            }
            sb.append((CharSequence) transform.invoke(Float.valueOf(f2)));
        }
        sb.append((CharSequence) "");
        String string2 = sb.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final String joinToString(InterfaceC6498l transform) {
        AbstractC6452k.m12181e(transform, "transform");
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.content;
        int i2 = this._size;
        for (int i3 = 0; i3 < i2; i3++) {
            float f2 = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                String string = sb.toString();
                AbstractC6452k.m12180d(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) transform.invoke(Float.valueOf(f2)));
        }
        sb.append((CharSequence) "");
        String string2 = sb.toString();
        AbstractC6452k.m12180d(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }
}
