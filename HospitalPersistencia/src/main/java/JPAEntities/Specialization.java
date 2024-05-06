package JPAEntities;

/**
 *
 * @author TeLesheo
 */
public enum Specialization {

    PEDIATRIC,
    SURGERY,
    PSYCHIATRY,
    ANESTHIOLOGY,
    FAMILY,
    CARDIOLOGY,
    NONE;

    public Specialization StringToEnum(String name) {

        return switch (name) {
            case "PEDIATRIC" ->
                PEDIATRIC;
            case "SURGERY" ->
                SURGERY;
            case "PSYCHIATRY" ->
                PSYCHIATRY;
            case "ANESTHIOLOGY" ->
                ANESTHIOLOGY;
            case "FAMILY" ->
                FAMILY;
            case "CARDIOLOGY" ->
                CARDIOLOGY;
            default ->
                null;
        };

    }
    
    
}
