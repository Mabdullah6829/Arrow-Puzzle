package p025O0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p018K0.InterfaceC0325a;
import p021M0.AbstractC0338c;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;
import p029Q0.C0511k;
import p029Q0.C0512l;
import p058e0.AbstractC6318z;

/* JADX INFO: renamed from: O0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0483h implements InterfaceC0325a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0325a f1014a;

    /* JADX INFO: renamed from: b */
    public final C0482g f1015b;

    public C0483h(InterfaceC0325a vSerializer) {
        C0492q c0492q = C0492q.f1040a;
        AbstractC6452k.m12181e(vSerializer, "vSerializer");
        this.f1014a = vSerializer;
        this.f1015b = new C0482g(C0492q.f1041b, vSerializer.getDescriptor());
    }

    @Override // p018K0.InterfaceC0325a
    public Object deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        AbstractC6452k.m12181e(decoder, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC6452k.m12181e(linkedHashMap, "<this>");
        int size = linkedHashMap.size() * 2;
        C0511k c0511kMo950a = decoder.mo950a(getDescriptor());
        while (true) {
            int iM1203i = c0511kMo950a.m1203i(getDescriptor());
            if (iM1203i == -1) {
                c0511kMo950a.m1209o(getDescriptor());
                AbstractC6452k.m12181e(linkedHashMap, "<this>");
                return linkedHashMap;
            }
            int i2 = iM1203i + size;
            LinkedHashMap builder = linkedHashMap;
            AbstractC6452k.m12181e(builder, "builder");
            C0492q c0492q = C0492q.f1040a;
            C0482g c0482g = this.f1015b;
            Object objM1207m = c0511kMo950a.m1207m(c0482g, i2, c0492q, null);
            int iM1203i2 = c0511kMo950a.m1203i(c0482g);
            if (iM1203i2 != i2 + 1) {
                throw new IllegalArgumentException(AbstractC1456a.m2443j(i2, iM1203i2, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
            }
            boolean zContainsKey = builder.containsKey(objM1207m);
            InterfaceC0325a interfaceC0325a = this.f1014a;
            builder.put(objM1207m, (!zContainsKey || (interfaceC0325a.getDescriptor().getKind() instanceof AbstractC0338c)) ? c0511kMo950a.m1207m(c0482g, iM1203i2, interfaceC0325a, null) : c0511kMo950a.m1207m(c0482g, iM1203i2, interfaceC0325a, AbstractC6318z.m12125s(objM1207m, builder)));
        }
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return this.f1015b;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c interfaceC0457c, Object obj) {
        Map map = (Map) obj;
        AbstractC6452k.m12181e(map, "<this>");
        map.size();
        C0482g descriptor = this.f1015b;
        AbstractC6452k.m12181e(descriptor, "descriptor");
        InterfaceC0455a interfaceC0455aMo958a = ((C0512l) interfaceC0457c).mo958a(descriptor);
        Map map2 = (Map) obj;
        AbstractC6452k.m12181e(map2, "<this>");
        int i2 = 0;
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i3 = i2 + 1;
            C0512l c0512l = (C0512l) interfaceC0455aMo958a;
            c0512l.m1212n(descriptor, i2, C0492q.f1040a, key);
            i2 += 2;
            c0512l.m1212n(descriptor, i3, this.f1014a, value);
        }
        interfaceC0455aMo958a.mo948f(descriptor);
    }
}
