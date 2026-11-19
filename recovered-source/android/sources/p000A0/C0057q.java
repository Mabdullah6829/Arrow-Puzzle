package p000A0;

import com.google.firebase.firestore.pipeline.evaluation.ArrayKt;
import kotlin.jvm.internal.AbstractC6452k;
import p010F0.C0236v;
import p022N.C0393Z0;
import p062g0.C6347b;
import p062g0.C6349d;
import p062g0.C6354i;
import p062g0.InterfaceC6350e;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0057q implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f72s;

    public /* synthetic */ C0057q(int i2) {
        this.f72s = i2;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        C6347b c6347b;
        switch (this.f72s) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC6353h) obj).plus((InterfaceC6351f) obj2);
            case 2:
                return ((InterfaceC6353h) obj).plus((InterfaceC6351f) obj2);
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC6351f interfaceC6351f = (InterfaceC6351f) obj2;
                if (!(interfaceC6351f instanceof InterfaceC0052n0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC6351f : Integer.valueOf(iIntValue + 1);
            case 5:
                InterfaceC0052n0 interfaceC0052n0 = (InterfaceC0052n0) obj;
                InterfaceC6351f interfaceC6351f2 = (InterfaceC6351f) obj2;
                if (interfaceC0052n0 != null) {
                    return interfaceC0052n0;
                }
                if (interfaceC6351f2 instanceof InterfaceC0052n0) {
                    return (InterfaceC0052n0) interfaceC6351f2;
                }
                return null;
            case 6:
                return (C0236v) obj;
            case 7:
                return Integer.valueOf(ArrayKt.evaluateArrayMinimumN$lambda$22$lambda$21$lambda$19((C0393Z0) obj, (C0393Z0) obj2));
            case 8:
                return Integer.valueOf(ArrayKt.evaluateArrayMaximumN$lambda$26$lambda$25$lambda$23((C0393Z0) obj, (C0393Z0) obj2));
            case 9:
                String acc = (String) obj;
                InterfaceC6351f element = (InterfaceC6351f) obj2;
                AbstractC6452k.m12181e(acc, "acc");
                AbstractC6452k.m12181e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                InterfaceC6353h acc2 = (InterfaceC6353h) obj;
                InterfaceC6351f element2 = (InterfaceC6351f) obj2;
                AbstractC6452k.m12181e(acc2, "acc");
                AbstractC6452k.m12181e(element2, "element");
                InterfaceC6353h interfaceC6353hMinusKey = acc2.minusKey(element2.getKey());
                C6354i c6354i = C6354i.f24409s;
                if (interfaceC6353hMinusKey == c6354i) {
                    return element2;
                }
                C6349d c6349d = C6349d.f24408s;
                InterfaceC6350e interfaceC6350e = (InterfaceC6350e) interfaceC6353hMinusKey.get(c6349d);
                if (interfaceC6350e == null) {
                    c6347b = new C6347b(interfaceC6353hMinusKey, element2);
                } else {
                    InterfaceC6353h interfaceC6353hMinusKey2 = interfaceC6353hMinusKey.minusKey(c6349d);
                    if (interfaceC6353hMinusKey2 == c6354i) {
                        return new C6347b(element2, interfaceC6350e);
                    }
                    c6347b = new C6347b(new C6347b(interfaceC6353hMinusKey2, element2), interfaceC6350e);
                }
                return c6347b;
        }
    }
}
