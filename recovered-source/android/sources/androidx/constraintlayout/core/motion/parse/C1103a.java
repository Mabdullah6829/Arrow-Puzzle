package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.parse.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1103a implements KeyParser.Ids, KeyParser.DataType {
    @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
    public int get(int i2) {
        return TypedValues.AttributesType.getType(i2);
    }

    @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
    public int get(String str) {
        return TypedValues.AttributesType.getId(str);
    }
}
