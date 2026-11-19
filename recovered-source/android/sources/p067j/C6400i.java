package p067j;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6400i implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final C6400i f24486a = new C6400i();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f24487b = FieldDescriptor.m11237of("eventTimeMs");

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f24488c = FieldDescriptor.m11237of("eventCode");

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f24489d = FieldDescriptor.m11237of("complianceData");

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f24490e = FieldDescriptor.m11237of("eventUptimeMs");

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f24491f = FieldDescriptor.m11237of("sourceExtension");

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f24492g = FieldDescriptor.m11237of("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f24493h = FieldDescriptor.m11237of("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f24494i = FieldDescriptor.m11237of("networkConnectionInfo");

    /* JADX INFO: renamed from: j */
    public static final FieldDescriptor f24495j = FieldDescriptor.m11237of("experimentIds");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        C6412u c6412u = (C6412u) ((AbstractC6386G) obj);
        objectEncoderContext2.add(f24487b, c6412u.f24536a);
        objectEncoderContext2.add(f24488c, c6412u.f24537b);
        objectEncoderContext2.add(f24489d, c6412u.f24538c);
        objectEncoderContext2.add(f24490e, c6412u.f24539d);
        objectEncoderContext2.add(f24491f, c6412u.f24540e);
        objectEncoderContext2.add(f24492g, c6412u.f24541f);
        objectEncoderContext2.add(f24493h, c6412u.f24542g);
        objectEncoderContext2.add(f24494i, c6412u.f24543h);
        objectEncoderContext2.add(f24495j, c6412u.f24544i);
    }
}
