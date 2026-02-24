package practs_koshynskyi.pract7_koshynskyi;

import java.io.IOException;

public class ReceiptWriter implements AutoCloseable {
    private static final Logger log = LoggerFactory.getLogger(ReceiptWriter.class);

    public void generate(){
            try{
                throw new IOException("card deny");
            }catch (IOException e){
                log.warn(e.getMessage());
                throw new ReceiptGenerationException(e.getMessage());
            }
    }
    @Override
    public void close(){
        System.out.println("Closing ReceiptWriter");
    }
}
