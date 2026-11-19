package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.utils.C1110a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FieldPath;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.AbstractC6251n;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.SortedSet;
import p001B.C0099y;
import p011H.AbstractC0242F;
import p030R.C0589w0;

/* JADX INFO: loaded from: classes2.dex */
public class Util {
    private static final String AUTO_ID_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int AUTO_ID_LENGTH = 20;
    private static final Random rand = new SecureRandom();
    private static final Continuation<Void, Void> VOID_ERROR_TRANSFORMER = new C0099y(25);

    @Nullable
    private static <T> T advanceIterator(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String autoId() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 20; i2++) {
            sb.append(AUTO_ID_ALPHABET.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    public static List<Object> collectUpdateArguments(int i2, Object obj, Object obj2, Object... objArr) {
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        arrayList.add(obj2);
        Collections.addAll(arrayList, objArr);
        for (int i3 = 0; i3 < arrayList.size(); i3 += 2) {
            Object obj3 = arrayList.get(i3);
            if (!(obj3 instanceof String) && !(obj3 instanceof FieldPath)) {
                throw new IllegalArgumentException("Excepted field name at argument position " + (i3 + i2 + 1) + " but got " + obj3 + " in call to update.  The arguments to update should alternate between field names and values");
            }
        }
        return arrayList;
    }

    public static int compareBooleans(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = bArr2[i2] & 255;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
        }
        return Integer.compare(bArr.length, bArr2.length);
    }

    public static int compareByteStrings(AbstractC6251n abstractC6251n, AbstractC6251n abstractC6251n2) {
        int iMin = Math.min(abstractC6251n.size(), abstractC6251n2.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            int iMo11719d = abstractC6251n.mo11719d(i2) & 255;
            int iMo11719d2 = abstractC6251n2.mo11719d(i2) & 255;
            if (iMo11719d < iMo11719d2) {
                return -1;
            }
            if (iMo11719d > iMo11719d2) {
                return 1;
            }
        }
        return Integer.compare(abstractC6251n.size(), abstractC6251n2.size());
    }

    public static int compareDoubles(double d, double d2) {
        return AbstractC0242F.m354k(d, d2);
    }

    public static int compareMixed(double d, long j2) {
        return AbstractC0242F.m353j(d, j2);
    }

    public static int compareUtf8Strings(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        int iMin = Math.min(str.length(), str2.length());
        for (int i2 = 0; i2 < iMin; i2++) {
            char cCharAt = str.charAt(i2);
            char cCharAt2 = str2.charAt(i2);
            if (cCharAt != cCharAt2) {
                if (Character.isSurrogate(cCharAt) == Character.isSurrogate(cCharAt2)) {
                    return Character.compare(cCharAt, cCharAt2);
                }
                return Character.isSurrogate(cCharAt) ? 1 : -1;
            }
        }
        return Integer.compare(str.length(), str2.length());
    }

    private static Exception convertStatusException(Exception exc) {
        if (exc instanceof StatusException) {
            return exceptionFromStatus(((StatusException) exc).f24446s);
        }
        return exc instanceof StatusRuntimeException ? exceptionFromStatus(((StatusRuntimeException) exc).f24448s) : exc;
    }

    public static void crashMainThread(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(new RunnableC5977b(runtimeException, 2));
    }

    public static <T> void diffCollections(Collection<T> collection, Collection<T> collection2, Comparator<T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList(collection2);
        Collections.sort(arrayList2, comparator);
        diffCollections(arrayList.iterator(), arrayList2.iterator(), comparator, consumer, consumer2);
    }

    public static FirebaseFirestoreException exceptionFromStatus(C0589w0 c0589w0) {
        c0589w0.getClass();
        StatusException statusException = new StatusException(c0589w0);
        return new FirebaseFirestoreException(statusException.getMessage(), FirebaseFirestoreException.Code.fromValue(c0589w0.f1287a.f1265s), statusException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> firstNEntries(Map<K, V> map, int i2, final Comparator<V> comparator) {
        if (map.size() <= i2) {
            return map;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.firestore.util.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Util.lambda$firstNEntries$4(comparator, (Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        HashMap map2 = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            map2.put(((Map.Entry) arrayList.get(i3)).getKey(), ((Map.Entry) arrayList.get(i3)).getValue());
        }
        return map2;
    }

    private static String getUtf8SafeBytes(String str, int i2) {
        return str.substring(i2, Character.charCount(str.codePointAt(i2)) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$firstNEntries$4(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        return comparator.compare(entry.getValue(), entry2.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$static$0(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Void) task.getResult();
        }
        Exception excConvertStatusException = convertStatusException(task.getException());
        if (excConvertStatusException instanceof FirebaseFirestoreException) {
            throw excConvertStatusException;
        }
        throw new FirebaseFirestoreException(excConvertStatusException.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, excConvertStatusException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator lambda$values$3(Iterable iterable) {
        final Iterator it = iterable.iterator();
        return new Iterator<V>() { // from class: com.google.firebase.firestore.util.Util.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return (V) ((Map.Entry) it.next()).getValue();
            }
        };
    }

    public static StringBuilder repeatSequence(CharSequence charSequence, int i2, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder();
        if (i2 != 0) {
            sb.append(charSequence);
            for (int i3 = 1; i3 < i2; i3++) {
                sb.append(charSequence2);
                sb.append(charSequence);
            }
        }
        return sb;
    }

    public static String toDebugString(AbstractC6251n abstractC6251n) {
        int size = abstractC6251n.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i2 = 0; i2 < size; i2++) {
            byte bMo11719d = abstractC6251n.mo11719d(i2);
            sb.append(Character.forDigit((bMo11719d & 255) >>> 4, 16));
            sb.append(Character.forDigit(bMo11719d & 15, 16));
        }
        return sb.toString();
    }

    public static String typeName(@Nullable Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }

    public static <K, V> Iterable<V> values(final Iterable<Map.Entry<K, V>> iterable) {
        return new Iterable() { // from class: com.google.firebase.firestore.util.g
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return Util.lambda$values$3(iterable);
            }
        };
    }

    public static Continuation<Void, Void> voidErrorTransformer() {
        return VOID_ERROR_TRANSFORMER;
    }

    public static <T extends Comparable<T>> void diffCollections(SortedSet<T> sortedSet, SortedSet<T> sortedSet2, Consumer<T> consumer, Consumer<T> consumer2) {
        diffCollections(sortedSet.iterator(), sortedSet2.iterator(), sortedSet.comparator() != null ? sortedSet.comparator() : new C1110a(10), consumer, consumer2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    private static <T> void diffCollections(Iterator<T> it, Iterator<T> it2, Comparator<? super T> comparator, Consumer<T> consumer, Consumer<T> consumer2) {
        T t = (Object) advanceIterator(it);
        T t2 = (Object) advanceIterator(it2);
        while (true) {
            if (t == null && t2 == null) {
                return;
            }
            boolean z = false;
            boolean z2 = true;
            if (t != null && t2 != null) {
                int iCompare = comparator.compare(t, t2);
                if (iCompare >= 0) {
                    if (iCompare > 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z2 = false;
                    }
                }
            } else if (t == null) {
                z2 = false;
                z = true;
            }
            if (z) {
                consumer.accept(t2);
                t2 = (Object) advanceIterator(it2);
            } else if (z2) {
                consumer2.accept(t);
                t = (Object) advanceIterator(it);
            } else {
                t = (Object) advanceIterator(it);
                t2 = (Object) advanceIterator(it2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crashMainThread$1(RuntimeException runtimeException) {
        throw runtimeException;
    }
}
