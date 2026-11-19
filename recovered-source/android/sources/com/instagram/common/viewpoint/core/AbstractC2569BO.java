package com.instagram.common.viewpoint.core;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2569BO<E> extends AbstractC4947oO<E> implements Set<E> {
    public static byte[] A01 = null;
    public static String[] A02 = {"tpMJzZrhhsrMkwhOFEYR9GbFlaKVIskH", "YlBA8T7Fro2", "USXGP8OuBAzNSq5CbRyfQ0SKNWZdvns1", "IwkjEd2x85ogj6Hkpqc", "vhSxYEQIRpWfy1n6I2fIJfhoZxh6fLOY", "PMh9AUA5ndLdUxX8KVZJ5S1GU2oeFGKJ", "nfsou9g6KKUnvuudu0UQjvY", "janJ9NtfQ2imEKBo1ypA"};
    public static final long serialVersionUID = 912559;

    @CheckForNull
    @LazyInit
    public transient AbstractC2570BP<E> A00;

    public static String A0B(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A01 = new byte[]{-55, -25, -39, -108, -57, -39, -26, -35, -43, -32, -35, -18, -39, -40, -70, -29, -26, -31, -67, -55, -58, -58, -65, -67, -50, -61, -55, -56, 122, -50, -55, -55, 122, -58, -69, -52, -63, -65};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC4947oO
    public AbstractC2570BP<E> A0J() {
        AbstractC2570BP<E> abstractC2570BP = this.A00;
        if (abstractC2570BP != null) {
            return abstractC2570BP;
        }
        AbstractC2570BP<E> abstractC2570BPA0M = A0M();
        this.A00 = abstractC2570BPA0M;
        return abstractC2570BPA0M;
    }

    /* JADX INFO: renamed from: A0N */
    public abstract AbstractC21414C<E> iterator();

    static {
        A0C();
    }

    public static int A03(int setSize) {
        int iMax = Math.max(setSize, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
            return iHighestOneBit;
        }
        AbstractC4734ki.A0E(iMax < 1073741824, A0B(18, 20, 20));
        return BasicMeasure.EXACTLY;
    }

    public static <E> AbstractC2569BO<E> A04(int n2, Object... elements) {
        Object[] objArrCopyOf = elements;
        switch (n2) {
            case 0:
                C201929 c201929A09 = A09();
                if (A02[1].length() == 11) {
                    A02[6] = "xMSzqHeYX9fl0z6G3xaNHOB";
                    return c201929A09;
                }
                break;
            case 1:
                return A0A(Objects.requireNonNull(objArrCopyOf[0]));
            default:
                int iA03 = A03(n2);
                Object[] objArr = new Object[iA03];
                int i2 = iA03 - 1;
                int uniques = 0;
                int i3 = 0;
                for (int j2 = 0; j2 < n2; j2++) {
                    Object objA00 = AbstractC5062qG.A00(objArrCopyOf[j2], j2);
                    int iHashCode = objA00.hashCode();
                    int tableSize = AbstractC4941oI.A00(iHashCode);
                    while (true) {
                        int i4 = tableSize & i2;
                        Object obj = objArr[i4];
                        if (obj == null) {
                            int index = i3 + 1;
                            int tableSize2 = A02[3].length();
                            if (tableSize2 != 32) {
                                String[] strArr = A02;
                                strArr[0] = "Zw143axrDatzvvuiLOoxXPNJBQDLOllI";
                                strArr[2] = "imRh362HWPXwfaqxgHfljoqeqcFI5Kex";
                                objArrCopyOf[i3] = objA00;
                                objArr[i4] = objA00;
                                uniques += iHashCode;
                                i3 = index;
                            }
                        } else {
                            if (obj.equals(objA00)) {
                            }
                            tableSize++;
                        }
                        break;
                    }
                }
                Arrays.fill(objArrCopyOf, i3, n2, (Object) null);
                if (i3 == 1) {
                    return new C201525(Objects.requireNonNull(objArrCopyOf[0]));
                }
                int tableSize3 = A03(i3);
                if (tableSize3 < iA03 / 2) {
                    return A04(i3, objArrCopyOf);
                }
                if (A0D(i3, objArrCopyOf.length)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                return new C201929(objArrCopyOf, uniques, objArr, i2, i3);
        }
        throw new RuntimeException();
    }

    public static <E> AbstractC2569BO<E> A05(E e1, E e2) {
        return A04(2, e1, e2);
    }

    public static <E> AbstractC2569BO<E> A06(E e1, E e2, E e3) {
        return A04(3, e1, e2, e3);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    public static <E> AbstractC2569BO<E> A07(Collection<? extends E> elements) {
        if ((elements instanceof AbstractC2569BO) && !(elements instanceof SortedSet)) {
            AbstractC2569BO<E> abstractC2569BO = (AbstractC2569BO) elements;
            if (!abstractC2569BO.A0K()) {
                return abstractC2569BO;
            }
        }
        Object[] array = elements.toArray();
        int length = array.length;
        if (A02[3].length() == 32) {
            throw new RuntimeException();
        }
        A02[4] = "vJyPhnBCGNruVJXdAMH0mrO2J76B9Swt";
        return A04(length, array);
    }

    public static <E> AbstractC2569BO<E> A08(E[] elements) {
        switch (elements.length) {
            case 0:
                return A09();
            case 1:
                C201525 c201525A0A = A0A(elements[0]);
                if (A02[3].length() == 32) {
                    throw new RuntimeException();
                }
                A02[7] = "14gyZ0VPjhYiFYlwFK2N";
                return c201525A0A;
            default:
                return A04(elements.length, (Object[]) elements.clone());
        }
    }

    public static <E> AbstractC2569BO<E> A09() {
        return C201929.A05;
    }

    public static <E> AbstractC2569BO<E> A0A(E e1) {
        return new C201525(e1);
    }

    public static boolean A0D(int actualUnique, int expectedUnique) {
        return actualUnique < (expectedUnique >> 1) + (expectedUnique >> 2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    public AbstractC2570BP<E> A0M() {
        return AbstractC2570BP.A06(toArray());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    public boolean A0O() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if ((object instanceof AbstractC2569BO) && A0O() && ((AbstractC2569BO) object).A0O() && hashCode() != object.hashCode()) {
            return false;
        }
        return AbstractC5087qj.A09(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC5087qj.A00(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BO != com.google.common.collect.ImmutableSet<E> */
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException(A0B(0, 18, 46));
    }
}
