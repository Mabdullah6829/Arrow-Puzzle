package p011H;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.InterfaceC6445d;
import p000A0.C0039h;
import p000A0.C0065u;
import p004C0.C0149n;
import p004C0.C0150o;
import p004C0.C0151p;
import p004C0.InterfaceC0152q;
import p043a.AbstractC0878a;
import p057d0.C6284f;
import p057d0.C6289k;
import p058e0.AbstractC6299g;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p068j0.C6419b;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6498l;
import p088w0.InterfaceC6548c;

/* JADX INFO: renamed from: H.G */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0243G {
    /* JADX INFO: renamed from: a */
    public static Object m363a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m364b(Parcel parcel, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m365c(Object[] objArr, int i2, int i3, AbstractC6299g abstractC6299g) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == abstractC6299g) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: d */
    public static void m366d(StringBuilder sb, Object obj, InterfaceC6498l interfaceC6498l) {
        if (interfaceC6498l != null) {
            sb.append((CharSequence) interfaceC6498l.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m367e(InterfaceC0152q interfaceC0152q, InterfaceC6487a interfaceC6487a, AbstractC6373c abstractC6373c) throws Throwable {
        C0149n c0149n;
        if (abstractC6373c instanceof C0149n) {
            c0149n = (C0149n) abstractC6373c;
            int i2 = c0149n.f267u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0149n.f267u = i2 - Integer.MIN_VALUE;
            } else {
                c0149n = new C0149n(abstractC6373c);
            }
        } else {
            c0149n = new C0149n(abstractC6373c);
        }
        Object obj = c0149n.f266t;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i3 = c0149n.f267u;
        try {
            if (i3 == 0) {
                m377o(obj);
                if (c0149n.getContext().get(C0065u.f80t) != interfaceC0152q) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                c0149n.f265s = interfaceC6487a;
                c0149n.f267u = 1;
                C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(c0149n));
                c0039h.m86r();
                ((C0151p) interfaceC0152q).m253T(new C0150o(c0039h));
                if (c0039h.m85q() == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC6487a = c0149n.f265s;
                m377o(obj);
            }
            interfaceC6487a.invoke();
            return C6289k.f24318a;
        } catch (Throwable th) {
            interfaceC6487a.invoke();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m368f(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(AbstractC0271e0.m396d(i3, "at index "));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m369g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: h */
    public static void m370h(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j2 + ", " + j3 + ")");
    }

    /* JADX INFO: renamed from: i */
    public static void m371i(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    /* JADX INFO: renamed from: j */
    public static final C6284f m372j(Throwable exception) {
        AbstractC6452k.m12181e(exception, "exception");
        return new C6284f(exception);
    }

    /* JADX INFO: renamed from: k */
    public static final C6419b m373k(Enum[] entries) {
        AbstractC6452k.m12181e(entries, "entries");
        return new C6419b(entries);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    public static final Class m374l(InterfaceC6548c interfaceC6548c) {
        AbstractC6452k.m12181e(interfaceC6548c, "<this>");
        Class clsMo12175a = ((InterfaceC6445d) interfaceC6548c).mo12175a();
        if (clsMo12175a.isPrimitive()) {
            String name = clsMo12175a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals(TypedValues.Custom.S_FLOAT)) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo12175a;
    }

    /* JADX INFO: renamed from: m */
    public static Executor m375m(Executor executor, AbstractC0248L abstractC0248L) {
        executor.getClass();
        return executor == EnumC0244H.f483s ? executor : new ExecutorC0261Z(executor, abstractC0248L);
    }

    /* JADX INFO: renamed from: n */
    public static final void m376n(Object[] objArr, int i2, int i3) {
        AbstractC6452k.m12181e(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m377o(Object obj) throws Throwable {
        if (obj instanceof C6284f) {
            throw ((C6284f) obj).f24310s;
        }
    }
}
