package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6393b implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6393b f24458a = new C6393b();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24459b = FieldDescriptor.m11237of("sdkVersion");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24460c = FieldDescriptor.m11237of("model");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f24461d = FieldDescriptor.m11237of("hardware");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f24462e = FieldDescriptor.m11237of("device");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f24463f = FieldDescriptor.m11237of("product");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f24464g = FieldDescriptor.m11237of("osBuild");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f24465h = FieldDescriptor.m11237of("manufacturer");

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f24466i = FieldDescriptor.m11237of("fingerprint");

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f24467j = FieldDescriptor.m11237of("locale");

    /* JADX INFO: renamed from: k */
    public static final FieldDescriptor f24468k = FieldDescriptor.m11237of("country");

    /* JADX INFO: renamed from: l */
    public static final FieldDescriptor f24469l = FieldDescriptor.m11237of("mccMnc");

    /* JADX INFO: renamed from: m */
    public static final FieldDescriptor f24470m = FieldDescriptor.m11237of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6404m c6404m = (C6404m) ((AbstractC6392a) obj);
        objectEncoderContext2.add(f24459b, c6404m.f24508a);
        objectEncoderContext2.add(f24460c, c6404m.f24509b);
        objectEncoderContext2.add(f24461d, c6404m.f24510c);
        objectEncoderContext2.add(f24462e, c6404m.f24511d);
        objectEncoderContext2.add(f24463f, c6404m.f24512e);
        objectEncoderContext2.add(f24464g, c6404m.f24513f);
        objectEncoderContext2.add(f24465h, c6404m.f24514g);
        objectEncoderContext2.add(f24466i, c6404m.f24515h);
        objectEncoderContext2.add(f24467j, c6404m.f24516i);
        objectEncoderContext2.add(f24468k, c6404m.f24517j);
        objectEncoderContext2.add(f24469l, c6404m.f24518k);
        objectEncoderContext2.add(f24470m, c6404m.f24519l);
    }
}
