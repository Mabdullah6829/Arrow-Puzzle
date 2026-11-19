package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6401j implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6401j f24496a = new C6401j();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24497b = FieldDescriptor.m11237of("requestTimeMs");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24498c = FieldDescriptor.m11237of("requestUptimeMs");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f24499d = FieldDescriptor.m11237of("clientInfo");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f24500e = FieldDescriptor.m11237of("logSource");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f24501f = FieldDescriptor.m11237of("logSourceName");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f24502g = FieldDescriptor.m11237of("logEvent");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f24503h = FieldDescriptor.m11237of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6413v c6413v = (C6413v) ((AbstractC6387H) obj);
        objectEncoderContext2.add(f24497b, c6413v.f24545a);
        objectEncoderContext2.add(f24498c, c6413v.f24546b);
        objectEncoderContext2.add(f24499d, c6413v.f24547c);
        objectEncoderContext2.add(f24500e, c6413v.f24548d);
        objectEncoderContext2.add(f24501f, c6413v.f24549e);
        objectEncoderContext2.add(f24502g, c6413v.f24550f);
        objectEncoderContext2.add(f24503h, EnumC6391L.f24456s);
    }
}
