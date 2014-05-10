package final8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Book extends Media {

    private boolean ebook;

    public boolean isEbook() {
        return ebook;
    }

    public void setEbook(boolean ebook) throws Exception {
        this.ebook = ebook;
        {
            try {
                this.ebook = ebook;
            } catch (Exception ex) {
                throw new Exception(ex.getCause());
            }
        }
    }

    public Book(double price, String title, boolean ebook) throws IllegalAccessException, Exception {
        super(price, title);
        setEbook(ebook);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String ebookStatus = isOnlineOrNo();
        result.append(String.format("%d - %.2f - %s - %s \n", getId(), getPrice(), getTitle(), isOnlineOrNo()));
        return result.toString();
    }

    public String isOnlineOrNo() {
        if (this.ebook == true) {
            return "online";
        } else {
            return "offline";
        }
    }
}
