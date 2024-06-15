import java.util.ArrayList;
import java.util.List;

public enum SanctionScreenAddressTypesEnum {
    AC,
    BI,
    SH,
    SV;

    private static final List<String> enumNames = new ArrayList();

    static {
        SanctionScreenAddressTypesEnum[] var0 = values();
        int var1 = var0.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            SanctionScreenAddressTypesEnum accountAddressTypesEnum = var0[var2];
            enumNames.add(accountAddressTypesEnum.name().toUpperCase());
        }

    }

    private SanctionScreenAddressTypesEnum() {
    }

    public static boolean containsEnum(String s) {
        return (s == "" || s == null) ? false : enumNames.contains(s.toUpperCase().trim());
    }
}