package practs_koshynskyi.pract9_koshynskyi;

public class TicketService {
    public Long buildTicketId(String base){
        class IdBuilder{
            public Long build(String base){
                return (long) (base.hashCode() * 15L +22);
            }
        }
        return new IdBuilder().build(base);
    }
}
